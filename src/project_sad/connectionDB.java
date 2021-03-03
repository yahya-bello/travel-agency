/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_sad;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class connectionDB {
   
   public static Connection connectBD(){
       Connection con = null;
       try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
             String url = "jdbc:oracle:thin:@DESKTOP-HTS0GD0:1521:XE";
            con = DriverManager.getConnection(url, "yahya", "bello");
            return con;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error connection","DB",JOptionPane.ERROR_MESSAGE);
           return null;
       }
   }
}
