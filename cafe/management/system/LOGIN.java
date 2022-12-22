/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

/*@author ASADULLAH*/
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        loginPass = new javax.swing.JTextField();
        CreateAccNav = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginEmail = new javax.swing.JTextField();
        CreateAccNav1 = new javax.swing.JButton();
        AdminBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(242, 200, 242));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 227, 86, -1));

        loginPass.setBackground(new java.awt.Color(255, 255, 230));
        loginPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(loginPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 230, 176, 25));

        CreateAccNav.setBackground(new java.awt.Color(51, 255, 204));
        CreateAccNav.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CreateAccNav.setText("Create Account");
        CreateAccNav.setBorder(new javax.swing.border.MatteBorder(null));
        CreateAccNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccNavActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 434, 151, 39));

        loginBtn.setBackground(new java.awt.Color(51, 255, 204));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 322, 90, 38));

        jLabel8.setBackground(new java.awt.Color(84, 255, 232));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/logo.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 6, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN FORM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 107, 196, 56));

        jLabel3.setBackground(new java.awt.Color(242, 200, 242));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 181, 86, -1));

        loginEmail.setBackground(new java.awt.Color(255, 255, 230));
        loginEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginEmailActionPerformed(evt);
            }
        });
        getContentPane().add(loginEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 184, 176, 25));

        CreateAccNav1.setBackground(new java.awt.Color(51, 255, 204));
        CreateAccNav1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CreateAccNav1.setText("Forgot Password?");
        CreateAccNav1.setBorder(new javax.swing.border.MatteBorder(null));
        CreateAccNav1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccNav1ActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccNav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 366, 261, -1));

        AdminBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdminBox.setText("Login As Admin?");
        AdminBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBoxActionPerformed(evt);
            }
        });
        getContentPane().add(AdminBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 272, 176, 32));

        jLabel7.setBackground(new java.awt.Color(242, 200, 242));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Admin");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 267, 86, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/images/coffee-logo-design-creative-idea-logo-elements-2.png"))); // NOI18N
        jLabel9.setFocusTraversalPolicyProvider(true);
        jLabel9.setFocusable(false);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setIconTextGap(1);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-490, -100, 1540, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        Signin currentUser = new Signin();
        currentUser.logInToAcc(loginEmail.getText(), loginPass.getText(), AdminBox.isSelected());
        loginEmail.setText("");
        loginPass.setText("");
        AdminBox.setSelected(false);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginEmailActionPerformed

    private void AdminBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminBoxActionPerformed

    private void CreateAccNav1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccNav1ActionPerformed
        new ForgotPassword().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_CreateAccNav1ActionPerformed

    private void CreateAccNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccNavActionPerformed
        new Signup().setVisible(true);        // TODO add your handling code here:
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CreateAccNavActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the loginEmaillt look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AdminBox;
    private javax.swing.JButton CreateAccNav;
    private javax.swing.JButton CreateAccNav1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField loginEmail;
    private javax.swing.JTextField loginPass;
    // End of variables declaration//GEN-END:variables
}