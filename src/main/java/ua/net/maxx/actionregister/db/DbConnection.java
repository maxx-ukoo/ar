package ua.net.maxx.actionregister.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            synchronized (DbConnection.class) {
                if (connection == null) {
                    connection  = DriverManager.getConnection("jdbc:sqlite:sqlite-db.sqlite3");
                }
            }
        }
        return connection;
    }
}
