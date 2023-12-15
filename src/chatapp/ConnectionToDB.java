package chatapp;

import java.sql.*;
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
    public PreparedStatement ps(String sql) throws SQLException {
          // Creating and returning a PreparedStatement for the provided SQL query
        return c.prepareStatement(sql);
    }
}