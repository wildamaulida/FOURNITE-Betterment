package bettermentfix;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Node;

public class BettermentController {

    @FXML
    private Button btnPublic;

    @FXML
    private Button btnInvestor;

    @FXML
    private Button btnPerusahaan;

    private Stage stage;

    @FXML
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void handlePublicButton(ActionEvent event) {
        navigateTo("BerandaPublic.fxml", event);
    }

    @FXML
    private void handleInvestorButton(ActionEvent event) {
        navigateTo("loginInvestor.fxml", event);
    }

    @FXML
    private void handleCompanyButton(ActionEvent event) {
        navigateTo("loginCompany.fxml", event);
    }
    @FXML
    private void handleNextLink(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginCompany.fxml"));
            Parent registerPage = loader.load();

            Scene scene = new Scene(registerPage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void navigateTo(String fxmlFile, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(root);
            
            // Mengambil stage dari event
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
