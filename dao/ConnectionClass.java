/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author ASADULLAH
 */
public class ConnectionClass {

    public static Connection getCon() {
        try {
            String jdbcUrl = "jdbc:mysql://mysql.db.server:3306/my_database?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "root";
//            String url = "jdbc:mysql://localhost/test";
//Class.forName ("com.mysql.jdbc.Driver").newInstance ();
//Connection conn = DriverManager.getConnection (url, "username", "password");

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
