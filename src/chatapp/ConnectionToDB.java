package chatapp;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionToDB {
    Connection c;
    Statement s;
    public ConnectionToDB(){
        String url = "jdbc:sqlserver://bitproject.database.windows.net;databaseName=chatapp";
        String user = "bala";
        String password = "nobita@00";
        
        try{
            c = DriverManager.getConnection(url, user, password);
            s = c.createStatement();
        } catch(SQLException e){
            System.out.println(e);
        }
        
        }
    }


//            Statement statement = connection.createStatement();
//            statement.executeUpdate(variable who carru sql query)