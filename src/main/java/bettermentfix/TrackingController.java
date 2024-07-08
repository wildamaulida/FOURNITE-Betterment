package bettermentfix;

import java.net.URL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class TrackingController implements Initializable {
    
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Text textPengeluaran;

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

    private CSVReader csvReader = new CSVReader();

    private Tracking1CompanyController trackingCompany;

    private DecimalFormat decimalFormat = new DecimalFormat("#,###");

    private BerandaController berandaController;

    public void setBerandaController(BerandaController berandaController) {
        this.berandaController = berandaController;
    }
   
    @FXML
    private void toTracking2(ActionEvent event) {
        if (berandaController != null) {
            berandaController.loadPage("tracking2.fxml");
        }
    }
    
    @FXML
    private void beliInvestasi(ActionEvent event){
        System.out.println("beli investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Investasi.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnBeli.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
            e.printStackTrace();
    }
    }
    @FXML
    public void updatePengeluaranLabel() {
    List<Tracking1> trackingData = csvReader.getTrackingData();
    
    if (!trackingData.isEmpty()) {
        Tracking1 latestData = trackingData.get(trackingData.size() - 1);
        
        textPengeluaran.setText("Rp" + decimalFormat.format(latestData.getPengeluaran()) + ".-");
        textPemasukan.setText("Rp" + decimalFormat.format(latestData.getPemasukan()) + ".-");
    } else {
        textPengeluaran.setText("Rp0.-");
        textPemasukan.setText("Rp0.-");
    }
    }
    public void setBusinessData(String namaBisnis, String namaPerusahaan, String deskripsi, String dana) {
        textNamaBisnis.setText(namaBisnis + " - " + namaPerusahaan);
        textDeskripsi.setText(deskripsi);
        textDana.setText(dana);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updatePengeluaranLabel();
        
            Tracking1CompanyController trackingCompanyController = new Tracking1CompanyController();
            List<XYChart.Data<String, Number>> data = trackingCompanyController.bacaDataDariCSV("src/main/java/bettermentfix/LineChart.csv");
    
            XYChart.Series<String, Number> series = new XYChart.Series<>();
            for (XYChart.Data<String, Number> entry : data) {
                series.getData().add(entry);
            }
            lineChart.getData().add(series);

    }
    }

