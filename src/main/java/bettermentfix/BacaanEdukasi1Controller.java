package bettermentfix;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class BacaanEdukasi1Controller {

    @FXML
    private Button btnBack;

    @FXML
    private void toEdukasi(ActionEvent event) {
        System.out.println("Kembali ke Edukasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("beranda.fxml"));
            Parent root = loader.load();
            BerandaController berandaController = loader.getController();
            berandaController.toEdukasi();
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
    private void toEdukasiCompany(ActionEvent event) {
        System.out.println("Kembali ke Edukasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany.fxml"));
            Parent root = loader.load();
            BerandaController berandaController = loader.getController();
            berandaController.toEdukasi();
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
    private void toEdukasiPublic(ActionEvent event) {
        System.out.println("Kembali ke Edukasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaPublic.fxml"));
            Parent root = loader.load();
            BerandaController berandaController = loader.getController();
            berandaController.toEdukasi();
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
