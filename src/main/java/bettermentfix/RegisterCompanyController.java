package bettermentfix;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.io.IOException;

public class RegisterCompanyController {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField namaPerusahaan;

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginCompany.fxml"));
            AnchorPane nextScenePane = loader.load();
            anchorPane.getChildren().setAll(nextScenePane);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

    private boolean isInputValid() {
        String username = namaPerusahaan.getText();
        String password = kataSandi.getText();
        String email = namaEmail.getText();
        String phone = noTelepon.getText();
        boolean agreed = checkBox.isSelected();
    
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty() || !agreed) {
            label.setText("Harap lengkapi semua kolom dan setujui ketentuan!");
            return false;
        }
        if (!email.endsWith(".co.id")) {
            label.setText("Alamat email tidak valid!");
            return false;
        }
        if (password.length() < 8) {
            label.setText("Kata sandi harus terdiri dari minimal 8 karakter!!");
            return false;
        }
        
    
        Pengguna penggunaBaru = new Pengguna(username, email, phone, password);
        csvReader.addPenggunaToCSV2(penggunaBaru);
    
        return true;
    }
}
