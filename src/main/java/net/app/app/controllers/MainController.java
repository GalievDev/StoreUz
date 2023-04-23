package net.app.app.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import net.app.app.DemoApplication;

import java.io.IOException;

public class MainController {
    @FXML
    public Button logButton;
    @FXML
    public Button regButton;

    @FXML
    void init() {
    }
    @FXML
    protected void reg() throws IOException {
        regButton.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(DemoApplication.class.getResource("reg-view.fxml"));
        Stage stage = new Stage();
        Scene reg = new Scene(fxmlLoader.load(), 703, 570);
        stage.setScene(reg);
        stage.showAndWait();
        stage.setResizable(false);
    }
    @FXML
    protected void log() throws IOException {
        logButton.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(DemoApplication.class.getResource("log-view.fxml"));
        Stage stage = new Stage();
        Scene log = new Scene(fxmlLoader.load(), 703, 570);
        stage.setScene(log);
        stage.show();
        stage.setResizable(false);
    }
}

