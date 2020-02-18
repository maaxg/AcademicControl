package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerStudentView {
    @FXML
    private Button btnBackToMain;
    @FXML
    private void onBtnBack(){
        loadViewMaibn();
    }
    @FXML
    private synchronized void loadViewMaibn(){
        Stage primary = new Stage();
        Main main = new Main();
        main.start(primary);

    }
}
