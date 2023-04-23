package net.app.app.heirs;

import javax.sql.DataSource;
import java.sql.*;

public class DBConnection {
    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/javafx_app";
    public static final String USER = "postgres";
    public static final String PASS = "root";

    public static Connection connection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static ResultSet query(String sql) throws SQLException, ClassNotFoundException {
        return connection().createStatement().executeQuery(sql);
    }

    public static void update(String sql) throws SQLException, ClassNotFoundException {
        connection().createStatement().executeUpdate(sql);
    }

    public static void close(Statement statement, ResultSet resultSet) throws SQLException {
        try{
            resultSet.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                resultSet.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        try{
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                statement.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
