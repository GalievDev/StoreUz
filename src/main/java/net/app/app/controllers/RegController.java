/*
package net.app.app.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import net.app.app.DemoApplication;
import net.app.app.heirs.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegController {

    @FXML
    public TextField login;

    @FXML
    public TextField password;

    @FXML
    public TextField name;

    @FXML
    public TextField age;

    @FXML
    public TextField position;

    @FXML
    public TextField number;

    @FXML
    public Label warn;


    @FXML
    public void onRegButton() {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DBConnection.url, DBConnection.username, DBConnection.password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE Login=\'" +login.getText()+ "\'");

                if(!resultSet.next()) {
                    statement.executeUpdate("INSERT INTO users (Login, Password, Position, Name, Age, Number, Balance) " +
                            "VALUES(\'" + login.getText() + "\', \'"+password.getText()+"\', \'"+position.getText()+"\', \'"+name.getText()+"\', \'"+age.getText()+"\', \'"+number.getText()+"\', "+0+")");
                    warn.getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader(DemoApplication.class.getResource("log-view.fxml"));
                    Stage stage = new Stage();
                    Scene log = new Scene(fxmlLoader.load(), 703, 570);
                    stage.setResizable(false);
                    stage.setScene(log);
                    stage.show();
                } else {
                    warn.setText("Логин уже занят");
                }
            }
        }
        catch(Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}

*/
