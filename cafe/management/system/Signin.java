/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.management.system;

import dao.ConnectionClass;
import dao.RunQuery;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASADULLAH
 */
public class Signin {

    public String userID;

    public void setID(String id) {
        this.userID = id;
    }

    public String getID() {
        return this.userID;
    }

    Signin() {
        setID("");
    }

    public void logInToAcc(String Email, String Password, Boolean Admin) {

        try {
            if (Email.isEmpty() || Password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email or Password Cannot be Empty.");
            } else {
                //Admin login
                if (Admin.equals(true)) {
                    String query = "Select * from Admin where username= '" + Email + "'AND Password = '" + Password + "';";
                    ResultSet rs = RunQuery.getData(query);
                    if (rs.next()) {
                        // print the results
                        String LoggedInUser = rs.getString("username");
                        setID("Admin");
                        new ADMINHome(userID).setVisible(true);
                        new CurrentUser(userID);

                        JOptionPane.showMessageDialog(null, "Logged In Successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Email or Password.");
                    }
                } else {
                    //Not Admin
                    String query = "Select * from Customer where Email = '" + Email + "'AND Password = '" + Password + "';";
                    ResultSet rs = RunQuery.getData(query);
                    if (rs.next()) {
                        // print the results
                        String LoggedInUser = rs.getString("Email");
                        setID(LoggedInUser);
                        JOptionPane.showMessageDialog(null, "Logged In Successfully.");
                        new CustomerHome(userID).setVisible(true);
                        new CurrentUser(userID);

                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Email or Password.");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
