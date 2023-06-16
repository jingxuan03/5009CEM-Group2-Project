/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Software_Development;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class databaseConnection {
    
    final static String url = "jdbc:mysql://localhost:3306/aps";
    final static String username = "root";
    final static String dbpassword = "";
    
    public static Connection connection(){
        try{
            
            Connection connection = DriverManager.getConnection(url, username, dbpassword);
            
            return connection;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
