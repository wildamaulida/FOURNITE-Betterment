package bettermentfix;
import java.io.IOException;
import java.net.URL;
import java.util.PrimitiveIterator;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class BerandaController implements Initializable {
    @FXML
    private AnchorPane mainPane;
    @FXML
    private BorderPane borderPane;
    @FXML
    private ImageView logo;
    @FXML
    private ImageView beranda;

    @FXML
    private ImageView profil;

    @FXML
    private Button btnPusatBantuan;

    @FXML
    private Button btnProfil;

    @FXML
    public void toEdukasi(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Edukasi.fxml"));
            Pane nextPage = loader.load();
            borderPane.setCenter(nextPage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void toEdukasiPublic(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EdukasiPublik.fxml"));
            Pane nextPage = loader.load();
            borderPane.setCenter(nextPage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void toEdukasiCompany(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EdukasiCompany.fxml"));
            Pane nextPage = loader.load();
            borderPane.setCenter(nextPage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void toProposal(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Proposal.fxml"));
            Pane nextPage = loader.load();
            borderPane.setCenter(nextPage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void toProposalPublicDanInvestor(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Proposal.fxml"));
            Pane nextPage = loader.load();
            borderPane.setCenter(nextPage);
            ProposalController proposalController = loader.getController();
            proposalController.applyBlurAndShowAlert();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void toBeranda(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("beranda2.fxml"));
            Pane nextPage = loader.load();
            borderPane.setCenter(nextPage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void toProfil(ActionEvent event){
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
    public void toProfilPublik(ActionEvent event){
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
    @FXML
    public void toProfilCOmpany(ActionEvent event){
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
    public void toProfilCOmpany2(ActionEvent event){
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
    public void toProfilCOmpany3(ActionEvent event){
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
    public void toUnduh(ActionEvent event){
        showAlertMobileAppUnavailable();
    }

    @FXML
    public void toTrackingPublic() {
        loadPage("tracking.fxml");
        applyBlurAndShowAlert();
    }
    @FXML
    public void toTrackingInvestor() {
        loadPage("tracking.fxml");
    }
    @FXML void toTracking2() {
        loadPage("tracking2.fxml");
    }
    @FXML void toTracking3() {
        loadPage("tracking3.fxml");
    }
    @FXML
    public void toTracking1Company() {
        loadPage("trackingCompany1.fxml");
    }
    @FXML
    public void toTracking2Company() {
        loadPage("trackingCompany2.fxml");
    }
    @FXML
    public void toTracking3Company() {
        loadPage("trackingCompany3.fxml");
    }
    public void loadPage(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            AnchorPane pane = loader.load();
            borderPane.setCenter(pane);
            Object controller = loader.getController();
            if (controller instanceof TrackingController) {
                ((TrackingController) controller).setBerandaController(this);
            } else if (controller instanceof Tracking2Controller) {
                ((Tracking2Controller) controller).setBerandaController(this);
            }else if (controller instanceof Tracking3Controller) {
                ((Tracking3Controller) controller).setBerandaController(this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void applyBlurAndShowAlert() {
        // Apply blur effect to the center of the BorderPane
        Node centerNode = borderPane.getCenter();
        if (centerNode != null) {
            GaussianBlur blur = new GaussianBlur(10);
            centerNode.setEffect(blur);
        }
    
        // Show alert
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Access Denied");
        alert.setHeaderText(null);
        alert.setContentText("Halaman ini tidak bisa diakses oleh publik, login sebagai investor atau perusahaan untuk mengakses halaman ini");
        alert.showAndWait();

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
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void showAlertMobileAppUnavailable() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informasi");
        alert.setHeaderText(null);
        alert.setContentText("Aplikasi mobile belum tersedia.");
        alert.showAndWait();
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }
}

