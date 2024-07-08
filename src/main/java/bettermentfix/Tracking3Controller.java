package bettermentfix;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class Tracking3Controller implements Initializable {
    
    XYChart.Series <String, Integer> bulan = new XYChart.Series();

    private BerandaController berandaController;

    private CSVReader csvReader = new CSVReader();

    public void setBerandaController(BerandaController berandaController) {
        this.berandaController = berandaController;
    }

    @FXML
    private Text textPengeluaran;

    @FXML
    private Text textPemasukan;

    @FXML
    private LineChart diagramTracking;

    @FXML
    private Button btnBeli;

    private DecimalFormat decimalFormat = new DecimalFormat("#,###");

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Investasi3.fxml"));
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
    List<Tracking3> trackingData = csvReader.getTrackingData3();

    if (!trackingData.isEmpty()) {
        Tracking3 latestData = trackingData.get(trackingData.size() - 1);

        textPengeluaran.setText("Rp" + decimalFormat.format(latestData.getPengeluaran()) + ".-");
        textPemasukan.setText("Rp" + decimalFormat.format(latestData.getPemasukan()) + ".-");
    } else {
        textPengeluaran.setText("Rp0.-");
        textPemasukan.setText("Rp0.-");
    }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        updatePengeluaranLabel();
        Tracking3CompanyController trackingCompanyController = new Tracking3CompanyController();
            List<XYChart.Data<String, Number>> data = trackingCompanyController.bacaDataDariCSV("src/main/java/bettermentfix/LineChart3.csv");
    
            XYChart.Series<String, Number> series = new XYChart.Series<>();
            for (XYChart.Data<String, Number> entry : data) {
                series.getData().add(entry);
            }
            diagramTracking.getData().add(series);

    }
    }    
    

