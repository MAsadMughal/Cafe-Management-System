/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.management.system;

import dao.RunQuery;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ASADULLAH
 */
public class NewUser {

    public int createacc(String Name, String Email, String Phone, String Address, String Pass, String Question, String Answer) {
        try {
            if (!Email.contains("@") || (!Email.contains(".com") && !Email.contains(".COM"))) {
                JOptionPane.showMessageDialog(null, "Enter a Valid Email.");
                return 0;
            } else if (Name.isEmpty() || Email.isEmpty() || Phone.isEmpty() || Address.isEmpty() || Pass.isEmpty() || Question.isEmpty() || Answer.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Complete Information.");
                return 0;
            } else if (Pass.length() < 6) {
                JOptionPane.showMessageDialog(null, "Password should be 6 characters long.");
                return 0;
            } else if (Phone.length() < 10) {
                JOptionPane.showMessageDialog(null, "Phone Number should be at least 10 characters long.");
                return 0;
            } else {
                String query = "INSERT INTO Customer (Name, Email, Phone, Address,SecQues,SecAns,Password) VALUES ('" + Name + "','" + Email + "','" + Phone + "','" + Address + "','" + Question + "','" + Answer + "','" + Pass + "');";
                RunQuery.runQuery(query, "Account Created Successsfully");
                new LOGIN().setVisible(true);
                new Signup().clear();
                return 1;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter a valid Integer for the required field.");
            return 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }

}
