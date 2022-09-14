package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import static java.sql.DriverManager.drivers;
import static java.sql.DriverManager.getConnection;

public class Util {
    public static void main(String[] args) throws SQLException{
        Util util = new Util();
        util.getConnection();

    }

    private static final String url = "jdbc:mysql://localhost:3306/test1";
    private static final String username = "root";
    private static final String password = "mpati036";
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
          //  System.out.println("Успешное соединение с БД");
        } catch (SQLException e ) {
            e.printStackTrace();
            System.out.println("Соединение не установлено");
        }
        return conn;
    }
}

// реализуйте настройку соеденения с БД
