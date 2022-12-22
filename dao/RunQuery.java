/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASADULLAH
 */
public class RunQuery {

    public static void runQuery(String Query, String msg) {
        try {
            Connection con = ConnectionClass.getCon();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ResultSet getData(String Query) {
        try {
            Connection con = ConnectionClass.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);
            return rs;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
