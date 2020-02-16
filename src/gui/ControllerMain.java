package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerMain {
    @FXML
    private Button btnStudent;

    @FXML
    public void onButtonStudent(){
        loadView("/gui/StudentView.fxml");
    }

    private synchronized void loadView(String absolutePath){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutePath));
            GridPane newPane = loader.load();

            Scene mainScene = Main.getMainScene();

            GridPane mainPane = (GridPane) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainPane.getChildren().get(0);

            mainPane.getChildren().clear();

            mainPane.getChildren().add(mainMenu);
            mainPane.getChildren().addAll(newPane.getChildren());


        }catch (IOException ex){
            System.err.println("Error " + ex.getMessage());
        }
    }
}
