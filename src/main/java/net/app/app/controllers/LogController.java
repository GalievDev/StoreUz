package net.app.app.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import net.app.app.DemoApplication;

import java.io.IOException;
import java.sql.*;

import static net.app.app.heirs.DBConnection.*;

public class LogController {
    @FXML
    public TextField login;

    @FXML
    public PasswordField password;

    @FXML
    public Label welcome;
    @FXML
    protected void onLogButton() throws SQLException, IOException, ClassNotFoundException {

        Statement statement = connection().createStatement();
        ResultSet resultSet = query("SELECT * FROM users");
        while (resultSet.next()){
            String userlog = resultSet.getString(2);
            String userpass = resultSet.getString(3);

            if(login.getText().equals(userlog) && password.getText().equals(userpass)){
                welcome.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(DemoApplication.class.getResource("shop-view.fxml"));
                Stage stage = new Stage();
                Scene shop = new Scene(fxmlLoader.load(), 1000, 900);
                stage.setTitle("Magazinchik.uz");
                stage.setResizable(false);
                stage.setScene(shop);
                stage.show();
                close(statement, resultSet);
            } else {
                welcome.setText("Неверный логин или пароль");
            }
        }
    }
}
