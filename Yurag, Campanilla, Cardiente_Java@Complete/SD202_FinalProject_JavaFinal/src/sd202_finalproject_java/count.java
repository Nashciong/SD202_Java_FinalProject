/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd202_finalproject_java;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student.admin
 */
public class count {
     public static int  countData(String table) throws ClassNotFoundException, SQLException{
    int total = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");  
       Connection conn =(Connection)DriverManager.getConnection( "jdbc:mysql://localhost:3306/sport_scheduler","root","");  
                    //here sonoo is database name, root is username and password 
            Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs;
            
        rs = st.executeQuery( "SELECT COUNT(*) AS total FROM "+table+" where Status = \"pending\";");
            
            while(rs.next()){
            
            total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(count.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    return total;
    }
    public static int  countdata(String table) throws SQLException, ClassNotFoundException{
    int total = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");  
       Connection conn =(Connection)DriverManager.getConnection( "jdbc:mysql://localhost:3306/sport_scheduler","root","");  
                    //here sonoo is database name, root is username and password  
            Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs;
            
        rs = st.executeQuery( "SELECT COUNT(*) AS total FROM "+table+" where Status = \"Approve\";");
            
            while(rs.next()){
            
            total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(count.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    return total;
    }
     public static int  admin(String table) throws ClassNotFoundException, SQLException{
    int total = 0;
         Class.forName("com.mysql.cj.jdbc.Driver");  
       Connection conn =(Connection)DriverManager.getConnection( "jdbc:mysql://localhost:3306/sport_scheduler","root","");  
                    //here sonoo is database name, root is username and password 
            Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs;
            
        rs = st.executeQuery( "SELECT COUNT(*) AS total FROM "+table+" ");
            
            while(rs.next()){
            
            total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(count.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    return total;
    }
}
