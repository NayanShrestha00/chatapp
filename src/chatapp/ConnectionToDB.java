package chatapp;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

   Connection c;


    public ConnectionToDB() {
        String url = "jdbc:sqlserver://bitproject.database.windows.net;databaseName=chatapp";
        String user = "bala";
        String password = "nobita@00";

        try {
            c = DriverManager.getConnection(url, user, password);
//     
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     public PreparedStatement psr(String sql) throws SQLException {
          // Creating and returning a PreparedStatement for the provided SQL query
        return c.prepareStatement(sql);
    }

    public Connection getConnection() {
        // Returning the established database connection
        return c;
    }

}
