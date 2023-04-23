
package net.app.app.controllers;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import net.app.app.heirs.DBConnection;

import java.sql.*;
import java.util.ArrayList;

import static net.app.app.heirs.DBConnection.query;

public class ShopController {
    @FXML
    public Label name;
    @FXML
    public Label login;
    @FXML
    public Label age;
    @FXML
    public Label balance;
    @FXML
    public Button topUpBalance;
    @FXML
    public DialogPane topUpPane;
    @FXML
    public TextField topUpValue;
    @FXML
    public Button ready;
    @FXML
    public Button allShopProducts;
    @FXML
    public Button products;
    @FXML
    public Button stationery;
    @FXML
    public Button personalArea;
    @FXML
    public Button electrical;
    @FXML
    public AnchorPane anchorPArea;
    @FXML
    public VBox anchorAllProducts;

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {

        ArrayList<String> testProducts = new ArrayList<>();

        testProducts.add("Iphone");
        testProducts.add("Iphone");
        testProducts.add("Iphone");
        testProducts.add("Iphone");
        testProducts.add("Iphone");
        testProducts.add("Iphone");

        double rowCount = Math.ceil(testProducts.size()/3f);

//        ============================
        allShopProducts.setOnAction(event -> {
            anchorAllProducts.setVisible(true);
            personalArea.setStyle("-fx-background-color: #ededed;");
            allShopProducts.setStyle("-fx-background-color: #dedcdc;");
            electrical.setStyle("-fx-background-color: #ededed;");
            products.setStyle("-fx-background-color: #ededed;");
            stationery.setStyle("-fx-background-color: #ededed;");
            anchorPArea.setVisible(false);
/*            Button sale = null;
            for (int i = 0; i < rowCount; i++) {
                HBox hBox = new HBox();
                Label allProducts = new Label("Все товары");
                allProducts.setFont(Font.font("beer gear Regular"));
                anchorAllProducts.getChildren().add(allProducts);
                for (int j = 0; j < 3; j++) {
                    VBox productCard = new VBox();
                    Label goods = new Label(testProducts.get(j));
                    sale = new Button("Купить");
                    productCard.setStyle("-fx-pref-width:207; -fx-pref-height:297; -fx-background-color: #ededed; -fx-border-radius: 5px; -fx-border-color: #4cc26b;");
                    ImageView imageView = new ImageView("net/app/app/assets/images/product.png");
                    imageView.setFocusTraversable(true);
                    imageView.setFitWidth(207);
                    imageView.setFitHeight(138);
                    goods.setFont(Font.font("beer gear Regular"));
                    sale.setFont(Font.font("beer gear Regular"));
                    sale.setStyle("-fx-background-color: #fafafa; -fx-border-radius: 5px; -fx-border-color: #4cc26b;");
                    goods.setAlignment(Pos.CENTER);
                    HBox.setMargin(productCard, new Insets(20, 30, 0, 0));
                    HBox.setHgrow(productCard, Priority.ALWAYS);

                    productCard.getChildren().add(imageView);
                    productCard.getChildren().add(goods);
                    productCard.getChildren().add(sale);

                    hBox.getChildren().add(productCard);
                }

                anchorAllProducts.getChildren().add(hBox);
            }*/
        });
//        ==========================


        personalArea.setStyle("-fx-background-color: #dedcdc;");
        topUpPane.setVisible(false);
        anchorAllProducts.setVisible(false);

        ResultSet resultSet = query("SELECT * FROM users");
        if (resultSet.next()){
            login.setText("Логин: " + resultSet.getString(2));
        }

/*        try{

            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DBConnection.url, DBConnection.username, DBConnection.password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");


                if (resultSet.next()){
                    name.setText("Имя: " + resultSet.getString(5));
                    login.setText("Логин: " + resultSet.getString(2));
                    age.setText("Возвраст: " + resultSet.getString(6));
                    balance.setText(resultSet.getString(8));
                }
            }
        }
        catch(Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }*/

        topUpBalance.setOnAction(event -> {
            topUpPane.setVisible(true);
        });

        ready.setOnAction(event -> {
/*            try{

                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                try (Connection conn = DriverManager.getConnection(DBConnection.url, DBConnection.username, DBConnection.password)){
                    Statement statement = conn.createStatement();

                    int totalBalance = Integer.parseInt(topUpValue.getText()) + Integer.parseInt(balance.getText());
                    statement.executeUpdate("UPDATE users SET Balance = "+totalBalance+"");
                    balance.setText(String.valueOf(totalBalance));
                }
            }
            catch(Exception ex) {
                System.out.println("Connection failed...");
                System.out.println(ex);
            }
            topUpPane.setVisible(false);*/
        });

        personalArea.setOnAction(event -> {
            personalArea.setStyle("-fx-background-color: #dedcdc;");
            allShopProducts.setStyle("-fx-background-color: #ededed;");
            electrical.setStyle("-fx-background-color: #ededed;");
            products.setStyle("-fx-background-color: #ededed;");
            stationery.setStyle("-fx-background-color: #ededed;");
            if (!anchorPArea.isVisible()) {
                anchorPArea.setVisible(true);
            }
            anchorAllProducts.setVisible(false);
        });
        electrical.setOnAction(event -> {
            personalArea.setStyle("-fx-background-color: #ededed;");
            allShopProducts.setStyle("-fx-background-color: #ededed;");
            electrical.setStyle("-fx-background-color: #dedcdc;");
            products.setStyle("-fx-background-color: #ededed;");
            stationery.setStyle("-fx-background-color: #ededed;");
            anchorPArea.setVisible(false);
            anchorAllProducts.setVisible(false);
        });

        products.setOnAction(event -> {
            personalArea.setStyle("-fx-background-color: #ededed;");
            allShopProducts.setStyle("-fx-background-color: #ededed;");
            electrical.setStyle("-fx-background-color: #ededed;");
            products.setStyle("-fx-background-color: #dedcdc;");
            stationery.setStyle("-fx-background-color: #ededed;");
            anchorPArea.setVisible(false);
            anchorAllProducts.setVisible(false);
        });

        stationery.setOnAction(event -> {
            personalArea.setStyle("-fx-background-color: #ededed;");
            allShopProducts.setStyle("-fx-background-color: #ededed;");
            electrical.setStyle("-fx-background-color: #ededed;");
            products.setStyle("-fx-background-color: #ededed;");
            stationery.setStyle("-fx-background-color: #dedcdc;");
            anchorPArea.setVisible(false);
            anchorAllProducts.setVisible(false);
        });
    }
}

