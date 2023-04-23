/*
package net.app.app.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import net.app.app.heirs.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonalAreaController{

    @FXML
    public Button personalArea;
    @FXML
    public Label name;
    @FXML
    public Label login;
    @FXML
    public Label age;

    @FXML
    void initialize(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DBConnection.url, DBConnection.username, DBConnection.password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

                if (resultSet.next()){
                    name.setText("Имя: " + resultSet.getString(5));
                    login.setText("Логин: " + resultSet.getString(2));
                    age.setText("Возвраст: " + resultSet.getString(6));
                }
            }
        }
        catch(Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    @FXML
    public void openPersonalArea() {
    }

    @FXML
    public void openAllProducts() {
    }

    @FXML
    public void openElectrical() {
    }

    @FXML
    public void openProducts() {
    }

    @FXML
    public void openStationery() {
    }
}
*/
