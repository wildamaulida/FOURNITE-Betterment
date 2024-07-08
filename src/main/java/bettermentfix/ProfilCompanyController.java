package bettermentfix;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProfilCompanyController {
     @FXML
    private Button btnPusatBantuan;

    @FXML
    private Text nama;

    @FXML
    private Text email1;

    @FXML
    private Text nomorTelepon1;
    @FXML
    private TextField currentEmail;
    @FXML
    private Button btnProfil;
    
     @FXML
    private void toPusatBantuan(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PusatBantuanCompany.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnPusatBantuan.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    

    @FXML
    private void handleLogoutAction(ActionEvent event) {
        showLogoutConfirmation(event);
    }
    
    private void showLogoutConfirmation(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Konfirmasi Logout");
        alert.setHeaderText(null);
        alert.setContentText("Yakin mau keluar?");

        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                try {
                    logout(event);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    @FXML
    private void toBearandaLagi(ActionEvent event) {
        System.out.println("Kembali ke Beranda");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany.fxml"));
            Parent root = loader.load();
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
    private void toBearandaLagi2(ActionEvent event) {
        System.out.println("Kembali ke Beranda");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany2.fxml"));
            Parent root = loader.load();
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
    private void toBearandaLagi3(ActionEvent event) {
        System.out.println("Kembali ke Beranda");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany3.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            Stage presentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            presentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void logout(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Betterment.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            Stage presentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            presentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
