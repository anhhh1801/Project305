/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viet Anh
 */
public class DBConnection {
    
    public static Connection getConnection(){
            String url="jdbc:mysql://localhost:3306/project_cse305";
            String user ="root";
            String password = "anh18012003";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                return DriverManager.getConnection(url,user,password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

            return null;
        }
//        public static void main(String[] args) {
//        Connection con = DBConnection.getConnection();
//        
//            System.out.println(con);
//            
//    }
}
