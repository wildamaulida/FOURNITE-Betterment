package bettermentfix;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ProposalController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField namaBisnis;

    @FXML
    private TextField namaPerusahaan;

    @FXML
    private TextField deskripsi;

    @FXML
    private TextField danaField;

    private CSVReader csvReader = new CSVReader();

    public void applyBlurAndShowAlert() {
        GaussianBlur blur = new GaussianBlur();
        blur.setRadius(10);
        anchorPane.setEffect(blur);

        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Akses Ditolak");
        alert.setHeaderText(null);
        alert.setContentText("Halaman ini tidak bisa diakses oleh publik, login sebagai perusahaan untuk mengkases halaman ini");
        alert.showAndWait();

        namaPerusahaan.setDisable(true);
        namaBisnis.setDisable(true);
        deskripsi.setDisable(true);
        danaField.setDisable(true);
    }
    public void applyBlurAndShowAlertCompany() {
        GaussianBlur blur = new GaussianBlur();
        blur.setRadius(10);
        anchorPane.setEffect(blur);

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Fitur Proposal Maintenance");
        alert.setHeaderText(null);
        alert.setContentText("Fitur Proposal saat ini sedang dalam tahap maintenance.");
        alert.showAndWait();

        namaPerusahaan.setDisable(true);
        namaBisnis.setDisable(true);
        deskripsi.setDisable(true);
        danaField.setDisable(true);
    }

    @FXML
    void handleUploadFile(ActionEvent event) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.getExtensionFilters().addAll(
        new FileChooser.ExtensionFilter("Text Files", "*.txt", "*.pdf"),
        new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
        new FileChooser.ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
        new FileChooser.ExtensionFilter("All Files", "*.*")
    );
    File selectedFile = fileChooser.showOpenDialog((Stage) ((Node) event.getSource()).getScene().getWindow());
    if (selectedFile != null) {
        Button uploadFile = new Button();
        showSlowAlert("berhasil unggah file");
        return;
    }
}


    @FXML
    private void handleProposalSubmit(ActionEvent event) {
        String namaBisnis2 = namaBisnis.getText();
        String namaPerusahaan2 = namaPerusahaan.getText();
        String deskripsi2 = deskripsi.getText();
        String dana = danaField.getText();

        if (namaBisnis2.isEmpty() || namaPerusahaan2.isEmpty() || deskripsi2.isEmpty() || dana.isEmpty()) {
            showAlert("Error", "Semua field harus diisi.");
            return;
        }

        try {
            double danaDouble = Double.parseDouble(dana);
        } catch (NumberFormatException e) {
            showAlert("Error", "Field 'dana' harus berupa angka (double).");
            return;
        }

        Proposal proposal = new Proposal(namaPerusahaan2, namaBisnis2, deskripsi2, dana);
        csvReader.addProposalToCSV(proposal);

        namaBisnis.clear();
        namaPerusahaan.clear();
        deskripsi.clear();
        danaField.clear();

        showSlowAlert("Proposal Anda berhasil diajukan dan sedang ditinjau oleh sistem.");
    }

    private void showSlowAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informasi");
        alert.setHeaderText(null);
        alert.setContentText(message);

        // Delay before closing the alert
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(3), e -> alert.close())
        );
        timeline.play();

        alert.showAndWait();
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }
    
}