module net.app.app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;


    opens net.app.app to javafx.fxml;
    exports net.app.app;
    exports net.app.app.controllers;
    opens net.app.app.controllers to javafx.fxml;
}