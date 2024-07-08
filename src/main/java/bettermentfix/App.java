package bettermentfix;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * JavaFX App
 */
public class App extends Application {
    private static Stage primaryStage;

    private static Scene scene;
    public void start(Stage primaryStage) {
        try {
            App.primaryStage = primaryStage;

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Betterment.fxml"));
            Parent root = loader.load();
            BettermentController controller = loader.getController();

            controller.setStage(primaryStage);

            Scene scene = new Scene(root, 1290, 650);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Betterment");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Stage getPrimaryStage() {
        return primaryStage;
    }
    public static void main(String[] args) {
        launch();
    }
}