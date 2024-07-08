package bettermentfix;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class RegisterController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ImageView logo;

    @FXML
    private TextField namaLengkap;

    @FXML
    private TextField namaEmail;

    @FXML
    private TextField noTelepon;

    @FXML
    private TextField kataSandi;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Button btnDaftar;

    @FXML
    private Text label;

    private CSVReader csvReader = new CSVReader();

    @FXML
    private void register(ActionEvent event) {
        if (isInputValid()) {
            
             try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginInvestor.fxml"));
            AnchorPane nextScenePane = loader.load();
            anchorPane.getChildren().setAll(nextScenePane);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

    private boolean isInputValid() {
        String username = namaLengkap.getText();
        String password = kataSandi.getText();
        String email = namaEmail.getText();
        String phone = noTelepon.getText();
        boolean agreed = checkBox.isSelected();
    
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty() || !agreed) {
            label.setText("Harap lengkapi semua kolom dan setujui ketentuan!");
            return false;
        }
        if (!email.endsWith("@gmail.com")) {
            label.setText("Alamat email tidak valid!");
            return false;
        }
        if (password.length() < 8) {
            label.setText("Kata sandi harus terdiri dari minimal 8 karakter!!");
            return false;
        }
        
    
        Pengguna penggunaBaru = new Pengguna(username, email, phone, password);
        csvReader.addPenggunaToCSV(penggunaBaru);
    
        return true;
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
}
}