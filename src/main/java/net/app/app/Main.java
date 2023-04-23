package net.app.app;

import java.sql.SQLException;

import static net.app.app.heirs.DBConnection.update;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        update("INSERT INTO users(login, password) VALUES ('Kaleb', '12345')");
    }
}
