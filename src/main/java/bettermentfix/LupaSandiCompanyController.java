package bettermentfix;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.io.IOException;

public class LupaSandiCompanyController {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField email;

    @FXML
    private TextField kataSandi;

    @FXML
    private TextField kataSandi2;

    @FXML
    private Text text;

    private CSVReader csvReader = new CSVReader();

    private boolean isInputValid() {
        String email2 = email.getText();
        String password = kataSandi.getText();
        String password2 = kataSandi2.getText();

        if (email2.isEmpty()) {
            text.setText("Email tidak boleh kosong!");
            return false;
        }
        if (password.isEmpty()) {
            text.setText("Kata sandi tidak boleh kosong!");
            return false;
        }
        if (password.length() < 8) {
            text.setText("Kata sandi harus terdiri dari minimal 8 karakter!");
            return false;
        }
        if (!password.equals(password2)) {
            text.setText("Konfirmasi ulang kata sandi tidak cocok!");
            return false;
        }
        return true;
    }

     @FXML
    private void lupaSandi(ActionEvent event) {
        if (isInputValid()) {
            String email2 = email.getText();
            String password = kataSandi.getText();

            boolean success = csvReader.updatePasswordCompany(email2, password);
            if (success) {
                showAlert(AlertType.INFORMATION, "Berhasil", "Kata sandi berhasil diubah. Anda akan diarahkan ke halaman login.");
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("loginCompany.fxml"));
                    AnchorPane nextScenePane = loader.load();
                    anchorPane.getChildren().setAll(nextScenePane);
                } catch (IOException e) {
                    e.printStackTrace();
                    text.setText("Gagal memuat halaman login!");
                }
            } else {
                showAlert(AlertType.ERROR, "Gagal", "Email tidak ditemukan!");
            }
        }
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
