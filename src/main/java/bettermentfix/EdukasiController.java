package bettermentfix;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EdukasiController {

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button btnJenis;

    @FXML 
    private Button btnManfaat;

    @FXML 
    private Button btnDampak;

    @FXML 
    private Button btnTips;

    @FXML 
    private Button btnPemula;

    @FXML 
    private Button btnHijau;

    @FXML
    private void jenisInvestasi(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi1.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
    
            // Mengakses stage dari objek window milik button
            Stage stage = (Stage) btnJenis.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
            }
    }
    @FXML
    private void jenisInvestasiCompany(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi1Company.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
    
            // Mengakses stage dari objek window milik button
            Stage stage = (Stage) btnJenis.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
            }
    }
    @FXML
    private void jenisInvestasiPublic(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi1Public.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
    
            // Mengakses stage dari objek window milik button
            Stage stage = (Stage) btnJenis.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
            }
    }
    @FXML
    private void dampakInvestasi(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi2.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnDampak.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
}   
@FXML
private void dampakInvestasiPublic(ActionEvent event){
    System.out.println("Jenis Investasi");
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi2Public.fxml"));
        Parent halaman1 = loader.load();
        Scene scene = new Scene(halaman1);
        Stage stage = (Stage) btnDampak.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
} catch (IOException e) {
            e.printStackTrace();
}
}
@FXML
    private void dampakInvestasiCompany(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi2Company.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnDampak.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
}
    @FXML
    private void manfaatInvestasi(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi3.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnManfaat.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void manfaatInvestasiCompany(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi3Company.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnManfaat.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void manfaatInvestasiPublic(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi3Public.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnManfaat.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void InvestasiHijau(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi6.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnHijau.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void InvestasiHijauCompany(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi6Company.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnHijau.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void InvestasiHijauPublic(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi6Public.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnHijau.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void InvestasiPemula(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi5.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnPemula.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void InvestasiPemulaCompany(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi5Company.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnPemula.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void InvestasiPemulaPublic(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi5Public.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnPemula.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void tipsInvestasi(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi4.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnTips.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void tipsInvestasiCompany(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi4Company.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnTips.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
    @FXML
    private void tipsInvestasiPublic(ActionEvent event){
        System.out.println("Jenis Investasi");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BacaanEdukasi4Public.fxml"));
            Parent halaman1 = loader.load();
            Scene scene = new Scene(halaman1);
            Stage stage = (Stage) btnTips.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    } catch (IOException e) {
                e.printStackTrace();
    }
    }
}
