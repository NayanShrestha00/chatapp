package chatapp;

import java.sql.*;
<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

=======
>>>>>>> 1c7d94b618ca5879d4ae89f549a9b09eb5d71c1c
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
<<<<<<< HEAD
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
=======
        
        }
    public PreparedStatement ps(String sql) throws SQLException {
          // Creating and returning a PreparedStatement for the provided SQL query
        return c.prepareStatement(sql);
    }
}
>>>>>>> 1c7d94b618ca5879d4ae89f549a9b09eb5d71c1c
