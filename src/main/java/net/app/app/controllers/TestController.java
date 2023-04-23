/*
package net.app.app.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import net.app.app.DemoApplication;
import net.app.app.heirs.DBConnection;

import java.io.IOException;
import java.sql.*;

public class TestController {
    @FXML
    Label welcome;

    @FXML
    TextField name;

    @FXML
    TextField age;

    @FXML
    TextField position;

    @FXML
    TextField login;

    @FXML
    PasswordField pass;

    @FXML
    TextField lLogin;

    @FXML
    PasswordField lPass;

    @FXML
    protected void onRegButton(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DBConnection.url, DBConnection.username, DBConnection.password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE Login=\'" +login.getText()+ "\'");

                if(!resultSet.next()) {
                    statement.executeUpdate("INSERT INTO users (Login, Password, Position, Name, Age) " +
                            "VALUES(\'" + login.getText() + "\', \'"+pass.getText()+"\', \'"+position.getText()+"\', \'"+name.getText()+"\', \'"+age.getText()+"\')");
                    welcome.setText("Добавлено в базу");
                    setScene();
                } else {
                    welcome.setText("Логин уже занят");
                }
            }
        }
        catch(Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    @FXML
    protected void onLogButton() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DBConnection.url, DBConnection.username, DBConnection.password)){

                Statement statement = conn.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

                while(resultSet.next()){
                    String userlog = resultSet.getString(2);
                    String userpass = resultSet.getString(3);

                    if(lLogin.getText().equals(userlog) && lPass.getText().equals(userpass)){
                        welcome.setText("Добро пожаловать " + resultSet.getString(5));
                        setScene();
                    } else {
                        welcome.setText("Неверный логин или пароль");
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    static void setScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DemoApplication.class.getResource("shop-view.fxml"));
        Stage stage =new Stage();
        Scene shop = new Scene(fxmlLoader.load(), 1200, 700);
        stage.setScene(shop);
        stage.show();
    }
}


*/
