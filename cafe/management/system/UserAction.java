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
public class UserAction extends CurrentUser {

    public static int newStock = -1;

    public int CalculateBill(int ProductID, int Quantity) {
        int price = -1;
        try {
            String Query = "Select * from product where itemID= '" + ProductID + "';";
            ResultSet rs = RunQuery.getData(Query);
            if (rs.next()) {
                // print the results
                int unitprice = rs.getInt("price");
                int stock = rs.getInt("Stock");
                System.out.print(stock);
                if (stock > Quantity) {
                    newStock = stock - Quantity;
                    System.out.print(newStock);

                    JOptionPane.showMessageDialog(null, "Product is in Stock.");
                    price = unitprice * Quantity;
                } else if (stock < Quantity) {
                    JOptionPane.showMessageDialog(null, "Sorry. Product is out of Stock.");
                }
                return price;
            } else {
                JOptionPane.showMessageDialog(null, "Product Not Found.");
                return price;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return price * Quantity;
        }

    }

    public void createOrder(int ProductID, int Quantity, int Price) {
        System.out.print(newStock);

        try {
            String query = "INSERT INTO Orders(ProductID, Customerid, quantity,totalPrice) VALUES ('" + ProductID + "','" + id + "','" + Quantity + "','" + Price + "');";
            RunQuery.runQuery(query, "Order Created Successsfully");
            if (newStock != -1) {
                String query2 = "UPDATE Product SET Stock= '" + newStock + "'WHERE itemid='" + ProductID + "';";
                RunQuery.runQuery(query2, "Updated Stock Successfully.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
