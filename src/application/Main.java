package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



import java.io.IOException;

public class Main extends Application {
    public static Scene mainScene;
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
            ScrollPane anchorPane = loader.load();

            anchorPane.setFitToHeight(true);
            anchorPane.setFitToWidth(true);

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
