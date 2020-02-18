package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerAdminView {
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
