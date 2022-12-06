/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForAdmin;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student.admin
 */
public class count {
     public static int  countData(String table){
    int total = 0;
        Connection con = db.getconnect();
            Statement st;
        try {
            st = con.createStatement();
            ResultSet rs;
            
        rs = st.executeQuery( "SELECT COUNT(*) AS total FROM "+table+" where Status = \"Disapprove\";");
            
            while(rs.next()){
            
            total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(count.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    return total;
    }
    public static int  countdata(String table){
    int total = 0;
        Connection conn = db.getconnect();
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
}
