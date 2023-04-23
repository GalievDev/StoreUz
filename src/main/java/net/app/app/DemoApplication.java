package net.app.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DemoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DemoApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 703, 570);
        stage.setResizable(false);
        stage.setTitle("Magazinchik.uz");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}