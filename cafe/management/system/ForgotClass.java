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
class ForgotClass {

    public String generateQuestion(String Email) {
        String Question = "";
        try {
            //Admin login
            if (Email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email Cannot be Empty.");
            } else {
                String query = "Select * from Customer where Email = '" + Email + "';";
                ResultSet rs = RunQuery.getData(query);

                if (rs.next()) {
                    Question = rs.getString("SecQues");
                    JOptionPane.showMessageDialog(null, "Generated Successfully.");                 
                    return Question;
                } else {
                    JOptionPane.showMessageDialog(null, "Email Not Found.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Question;
    }

    public void checkAnswer(String Email, String Answer, String Question, String Password) {
        if (Email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Email.");
        } else if (Question.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Generate Security Question.");
        } else if (Password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Password.");
        } else if (Password.length()<6) {
            JOptionPane.showMessageDialog(null, "Enter Password more than 6 characters.");
        } else {

            try {
                //Admin login
                if (Email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Email Cannot be Empty.");
                } else {
                    String query = "Select * from Customer where Email = '" + Email + "'AND SecAns = '" + Answer + "';";
                    ResultSet rs = RunQuery.getData(query);
                    if (rs.next()) {
                        try {
                            String query2 = "UPDATE Customer SET Password= '" + Password + "'WHERE Email='" + Email + "'AND SecQues='" + Question + "';";
                            RunQuery.runQuery(query2, "Updated Password Successfully.");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Answer.");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

}
