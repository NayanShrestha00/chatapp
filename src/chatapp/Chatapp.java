/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapp;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chakchakey Nayan 123
 */
public class Chatapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:sqlserver://bitproject.database.windows.net;databaseName=chatapp";
    String user = "bala";
    String password = "nobita@00";
    try{
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connected Successfully");
//        String sql = "CREATE TABLE demo(name VARCHAR(50))";
//        String sql= "insert into new " + "Values('kala')"; 
        String sql = "insert into Ouruser(user_name, user_email, user_mobile)" + "values('kala','C','D')";
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(sql);
        if (row > 0){
            System.out.println("Import sucess");
        }
         
        connection.close();
    } catch(SQLException e){
        System.out.println("Opps!");
    }
    }
    
}
