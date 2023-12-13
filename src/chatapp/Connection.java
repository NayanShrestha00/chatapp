/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Bishal Rajbanshi
 */
public class Connection {
    public Connection(){
         String url = "jdbc:sqlserver://bitproject.database.windows.net;databaseName=chatapp";
        String user = "bala";
        String password = "nobita@00";

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
        } catch(SQLException e){
            System.out.println(e);
        }
    }
}
