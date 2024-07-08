package bettermentfix;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

public class InvestasiController3 implements Initializable {
     @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField investasiField;

    @FXML
    private Label textPengeluaran;

    private DecimalFormat decimalFormat = new DecimalFormat("#,###");

    private CSVReader csvReader = new CSVReader();

    @FXML
    private void toTracking(ActionEvent event) {
        System.out.println("Kembali ke Tracking");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("beranda.fxml"));
            Parent root = loader.load();
            BerandaController berandaController = loader.getController();
            berandaController.toTracking3();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            Stage presentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            presentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBeliButton(ActionEvent event) {
        double jumlahInvestasi = Double.parseDouble(investasiField.getText());
        String tanggalInvestasi = LocalDate.now().toString();
        double pengeluaran = Tracking3.getPengeluaran();
        Tracking3.setPengeluaran(pengeluaran - jumlahInvestasi);
        double pemasukan = Tracking3.getPemasukan();
        Tracking3.setPemasukan(pemasukan + jumlahInvestasi);
        csvReader.addInvestasiToCSV3(tanggalInvestasi, jumlahInvestasi);
        csvReader.addTransactionToCSV3(Tracking3.getPengeluaran(),Tracking3.getPemasukan());
        showAlert("Berhasil", "Anda telah berhasil berinvestasi sebesar " + jumlahInvestasi);
        investasiField.clear();
        updatePengeluaranLabel();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    @FXML
    public void updatePengeluaranLabel() {
        textPengeluaran.setText("Rp" + decimalFormat.format(Tracking3.getPengeluaran())+ ".-");
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        updatePengeluaranLabel();
    }
    
}