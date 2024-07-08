package bettermentfix;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginCompanyController {
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private Rectangle rectangle;

    @FXML
    private Text betterment;

    @FXML
    private Text motto;

    @FXML
    private Text selamatDatang;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfPassword;

    @FXML
    private CheckBox ingatSaya;

    @FXML
    private Hyperlink hLupaSandi;

    @FXML
    private Hyperlink hDaftar;

    @FXML
    private Text pertanyaan;

    @FXML
    private HBox hbox1;

    @FXML
    private HBox hbox2;

    @FXML
    private Label welcomeLabel;

    @FXML
    private Stage stage;

    @FXML
    private ImageView imageView;

    @FXML
    private ImageView gEmail;

    @FXML
    private ImageView gPassword;

    private CSVReader csvReader = new CSVReader();

    @FXML
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    private void login(){
    String username = tfEmail.getText();
    String password = tfPassword.getText();

    ArrayList<Pengguna> penggunaList = csvReader.getBukuCSVData2();
        boolean loginSuccess = false;

        for (Pengguna pengguna : penggunaList) {
            if (pengguna.getEmail().equals(username) && pengguna.getKataSandi().equals(password)) {
                loginSuccess = true;
                if(username.equals("setlapowerwall@company.co.id")){
                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany2.fxml"));
                        AnchorPane nextScenePane = loader.load();
                        anchorPane.getChildren().setAll(nextScenePane);
                        }
                        catch (IOException e) {
                        e.printStackTrace();}
                        break;
                }else if (username.equals("fourgroup@company.co.id")) {
                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany3.fxml"));
                        AnchorPane nextScenePane = loader.load();
                        anchorPane.getChildren().setAll(nextScenePane);
                        }
                        catch (IOException e) {
                        e.printStackTrace();}
                        break;
                }else {
                try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("BerandaCompany.fxml"));
                AnchorPane nextScenePane = loader.load();
                anchorPane.getChildren().setAll(nextScenePane);
                }
                catch (IOException e) {
                e.printStackTrace();}
                break;
                }
            }
        }

        if (loginSuccess) {
            showAlert("Login Berhasil", "Selamat datang!");
        } else {
            showAlert("Login Gagal", "Email atau kata sandi salah.");
        }
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    @FXML
    private void handleNextLink(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("registerCompany.fxml"));
            AnchorPane nextScenePane = loader.load();
            anchorPane.getChildren().setAll(nextScenePane);
            }
            catch (IOException e) {
            e.printStackTrace();
            }
    }
    @FXML
    private void handleNextLink2(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("lupaSandiCompany.fxml"));
            AnchorPane nextScenePane = loader.load();
            anchorPane.getChildren().setAll(nextScenePane);
            }
            catch (IOException e) {
            e.printStackTrace();
            }
    }
}
