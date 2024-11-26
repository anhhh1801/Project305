/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import DBConnection.DBConnection;
import java.sql.SQLException;

/**
 *
 * @author Viet Anh
 */
public class UserDAO {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public UserDAO() {
//    }
//    public ArrayList<User> getAllProduct() {
//        ArrayList<User> list = new ArrayList<User>();
//        String query = "SELECT fullname, Date_of_birth, job, monthlyIncome FROM user";
//        try {
//            con = DBConnection.getConnection();
//            ps = con.prepareStatement(query);
//            rs = ps.executeQuery(query);
//            //String imageLocation="resources\\uploadedIMG\\" + imgName + ".jpg";
//            while (rs.next()) {
//                User user = new User(rs.getString(1),
//                        rs.getString(2),
//                        "images\\ProductImages\\"+rs.getString(3)+".jpg",
//                        rs.getDouble(4),
//                        rs.getInt(5),
//                        rs.getInt(6),
//                        rs.getString(7)
//                );
//                list.add(user);
//            }
//            ps.close();
//            con.close();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return list;
    }
}
