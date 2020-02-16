package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    private static Scene mainScene;
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/sample.fxml"));
            AnchorPane anchorPane = loader.load();


            mainScene = new Scene(anchorPane);

            primaryStage.setTitle("Academic Control");
            primaryStage.setScene(mainScene);
            primaryStage.show();
        }catch(IOException ex){
            System.err.println("Error: " + ex.getMessage());
        }
    }
    public static Scene getMainScene(){return mainScene;}
    public static void main(String[] args) {
        launch(args);
    }
}
