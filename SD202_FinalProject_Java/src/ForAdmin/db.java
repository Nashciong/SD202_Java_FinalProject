/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForAdmin;

//import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Student.admin
 */
public class db {
      public static Connection getconnect(){
         Connection con = null;            
          try{  
                    Class.forName("com.mysql.cj.jdbc.Driver");  
                 
                     con =(Connection)DriverManager.getConnection( "jdbc:mysql://localhost:3306/schedule_java","root","");  
                    //here sonoo is database name, root is username and password  
//                    Statement stmt=con.createStatement();  
//                    ResultSet rs=stmt.executeQuery("select * from emp");  
//                    while(rs.next())  
//                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//                    con.close();  
                    }catch(Exception e){ 
                        System.out.println(e);
                    }  

                    return con;
            }
}
