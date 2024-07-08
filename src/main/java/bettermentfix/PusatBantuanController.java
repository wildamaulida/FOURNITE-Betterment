package bettermentfix;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class PusatBantuanController {

    @FXML
    private Button btnProfil;

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
    @FXML
    private void toBearandaLagi(ActionEvent event) {
        System.out.println("Kembali ke Beranda");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("beranda.fxml"));
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
    private void toBearandaLagiCompany(ActionEvent event) {
        System.out.println("Kembali ke Beranda");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany.fxml"));
            Parent root = loader.load();
            System.out.println("Loaded BerandaCompany.fxml");
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
    private void toBearandaLagiCompany2(ActionEvent event) {
        System.out.println("Kembali ke Beranda");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany2.fxml"));
            Parent root = loader.load();
            System.out.println("Loaded BerandaCompany.fxml");
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
    private void toBearandaLagiCompany3(ActionEvent event) {
        System.out.println("Kembali ke Beranda");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany3.fxml"));
            Parent root = loader.load();
            System.out.println("Loaded BerandaCompany.fxml");
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
    private void toBearandaLagiPublic(ActionEvent event) {
        System.out.println("Kembali ke Beranda");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaPublic.fxml"));
            Parent root = loader.load();
            System.out.println("Loaded BerandaCompany.fxml");
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
    private void toProfil(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profil1.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnProfil.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void toProfilCompany(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilCompany.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnProfil.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void toProfilCompany2(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilCompany2.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnProfil.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void toProfilCompany3(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilCOmpany3.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnProfil.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void toProfilPublic(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilPublic.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnProfil.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
}
