/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

/**
 *
 * @author ASADULLAH
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
    }

    public String sendEmail() {
        return ResetEmail.getText();
    }

    public String sendSecurityQ() {
        if (ResetEmail.getText() != "") {
            String email = ResetEmail.getText();
        }
        return GetSecurityQuestion.getText();
    }

    public String sendAnswer() {
        return AnswerReset.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GetSecurityQuestion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AnswerReset = new javax.swing.JTextField();
        loginNav2 = new javax.swing.JButton();
        GetQuestion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ResetEmail = new javax.swing.JTextField();
        resetPassBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        newPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(84, 255, 232));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/logo.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 6, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORGOT PASSWORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 107, 273, 56));

        jLabel2.setBackground(new java.awt.Color(242, 200, 242));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Security Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 215, -1, -1));

        GetSecurityQuestion.setEditable(false);
        GetSecurityQuestion.setBackground(new java.awt.Color(255, 255, 230));
        GetSecurityQuestion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GetSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetSecurityQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(GetSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 218, 176, 25));

        jLabel3.setBackground(new java.awt.Color(242, 200, 242));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Answer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 261, 86, -1));

        AnswerReset.setBackground(new java.awt.Color(255, 255, 230));
        AnswerReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(AnswerReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 264, 176, 25));

        loginNav2.setBackground(new java.awt.Color(51, 255, 204));
        loginNav2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        loginNav2.setText("LOGIN");
        loginNav2.setBorder(new javax.swing.border.MatteBorder(null));
        loginNav2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginNav2ActionPerformed(evt);
            }
        });
        getContentPane().add(loginNav2, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 403, 116, 39));

        GetQuestion.setBackground(new java.awt.Color(51, 255, 255));
        GetQuestion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        GetQuestion.setText("Get Security Question");
        GetQuestion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GetQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(GetQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 169, 224, 28));

        jLabel7.setBackground(new java.awt.Color(242, 200, 242));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 169, 86, -1));

        ResetEmail.setBackground(new java.awt.Color(255, 255, 230));
        ResetEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ResetEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 172, 176, 25));

        resetPassBtn.setBackground(new java.awt.Color(51, 255, 204));
        resetPassBtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        resetPassBtn.setText("Reset Password");
        resetPassBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resetPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 349, 158, 42));

        jLabel4.setBackground(new java.awt.Color(242, 200, 242));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 303, 144, -1));

        newPass.setBackground(new java.awt.Color(255, 255, 230));
        newPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 306, 176, 25));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/images/coffee-logo-design-creative-idea-logo-elements-2.png"))); // NOI18N
        jLabel5.setFocusTraversalPolicyProvider(true);
        jLabel5.setFocusable(false);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setIconTextGap(1);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, -120, 1540, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetQuestionActionPerformed
        ForgotClass forgot = new ForgotClass();
        GetSecurityQuestion.setText(forgot.generateQuestion(ResetEmail.getText()));
    }//GEN-LAST:event_GetQuestionActionPerformed

    private void loginNav2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginNav2ActionPerformed
        new LOGIN().setVisible(true);        // TODO add your handling code here:
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_loginNav2ActionPerformed

    private void resetPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPassBtnActionPerformed
        ForgotClass forgot = new ForgotClass();
        forgot.checkAnswer(ResetEmail.getText(), AnswerReset.getText(), GetSecurityQuestion.getText(), newPass.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_resetPassBtnActionPerformed

    private void GetSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetSecurityQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetSecurityQuestionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerReset;
    private javax.swing.JButton GetQuestion;
    private javax.swing.JTextField GetSecurityQuestion;
    private javax.swing.JTextField ResetEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton loginNav2;
    private javax.swing.JTextField newPass;
    private javax.swing.JButton resetPassBtn;
    // End of variables declaration//GEN-END:variables
}