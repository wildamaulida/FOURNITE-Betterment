package bettermentfix;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.text.DecimalFormat;


public class Tracking3CompanyController implements Initializable {
    @FXML
    private XYChart.Series<String, Number> bulan;
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private Label textPengeluaran;

    @FXML
    private Text textPemasukan;

    @FXML
    private Text textNamaBisnis;

    @FXML
    private Text textDeskripsi;

    @FXML
    private Text textDana;

    @FXML
    private LineChart<String, Number> lineChart;
    @FXML
    private Button btnBeli;

    @FXML
    private Button btnSelanjutnya;
    @FXML
    private TextField bulanField;
    @FXML
    private TextField nilaiField;

    @FXML
    private TableView<Tracking3> investasiTableView;
    @FXML
    private TableColumn<Tracking3, Double> nominalInvestasiColumn;
    @FXML
    private TableColumn<Tracking3, String> tanggalInvestasiColumn;

    private List<Tracking3> trackingList;

    private CSVReader csvReader = new CSVReader();

    private DecimalFormat decimalFormat = new DecimalFormat("#,###");

    @FXML
    public void updatePengeluaranLabel() {
    List<Tracking3> trackingData = csvReader.getTrackingData3();
    if (!trackingData.isEmpty()) {
        Tracking3 latestData = trackingData.get(trackingData.size() - 1);
        textPengeluaran.setText("Rp" + decimalFormat.format(latestData.getPengeluaran()) + ".-");
    } else {
        textPengeluaran.setText("Rp0.-");
    }
}   
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        CSVReader csvReader = new CSVReader();
        List<Tracking3> dataEntries = csvReader.readInvestasiCSV3();
        ObservableList<Tracking3> dataObservableList = FXCollections.observableArrayList(dataEntries);

        TableColumn<Tracking3, String> tanggalColumn = new TableColumn<>("Tanggal");
        tanggalInvestasiColumn.setCellValueFactory(new PropertyValueFactory<>("tanggal"));

        TableColumn<Tracking3, Double> nominalColumn = new TableColumn<>("Nominal");
        nominalInvestasiColumn.setCellValueFactory(new PropertyValueFactory<>("nominal"));

        investasiTableView.getColumns().add(tanggalColumn);
        investasiTableView.getColumns().add(nominalColumn);

        investasiTableView.setItems(dataObservableList);


        updatePengeluaranLabel();
        bulan = new XYChart.Series<>();
        List<XYChart.Data<String, Number>> data = bacaDataDariCSV("LineChart3.csv");

        for (XYChart.Data<String, Number> entry : data) {
            bulan.getData().add(entry);
        }
        lineChart.getData().add(bulan);
        updatePengeluaranLabel();
    }
        
     public void simpanDataKeCSV(List<XYChart.Data<String, Number>> data, String fileName) {
        try (FileWriter writer = new FileWriter("src/main/java/bettermentfix/LineChart3.csv")) {
            writer.append("Bulan,Nilai\n");
            for (XYChart.Data<String, Number> entry : data) {
                writer.append(entry.getXValue()).append(",").append(entry.getYValue().toString()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<XYChart.Data<String, Number>> bacaDataDariCSV(String fileName) {
        List<XYChart.Data<String, Number>> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/bettermentfix/LineChart3.csv"))) {
            String line;
            reader.readLine(); // Lewati header
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 2) {
                    String bulan = fields[0];
                    Number nilai = Double.parseDouble(fields[1]);
                    data.add(new XYChart.Data<>(bulan, nilai));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    @FXML
    public void simpanDataChart() {
        List<XYChart.Data<String, Number>> data = bulan.getData();
        simpanDataKeCSV(data, "LineChart3.csv");
    }
    @FXML
    public void deleteLastEntry() {
        List<XYChart.Data<String, Number>> data = bulan.getData();
        if (!data.isEmpty()) {
            data.remove(data.size() - 1);
        }
    }
    @FXML
    public void addData() {
        String bulanInput = bulanField.getText();
        String nilaiInput = nilaiField.getText();

        if (!bulanInput.isEmpty() && !nilaiInput.isEmpty()) {
            try {
                Number nilai = Double.parseDouble(nilaiInput);
                XYChart.Data<String, Number> newData = new XYChart.Data<>(bulanInput, nilai);
                bulan.getData().add(newData);

                bulanField.clear();
                nilaiField.clear();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
