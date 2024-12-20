/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import DAO.IOFile;
import DAO.User;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nhanv
 */
public class LoginFrame extends javax.swing.JFrame {

    private ArrayList<User> list = new ArrayList<>();
    IOFile iofile = new IOFile();

    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblUsernameError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();
        lblLoginError = new javax.swing.JLabel();
        btnForgotPass = new javax.swing.JButton();

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(51, 0, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 220, -1));

        txtPass.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 220, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 26));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        btnLogin.setBackground(new java.awt.Color(102, 0, 102));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 70, 35));

        btnRegister.setBackground(new java.awt.Color(102, 0, 102));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Sign Up");
        btnRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 80, 35));

        lblUsernameError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblUsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 180, 14));

        lblPasswordError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 183, 13));

        lblLoginError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblLoginError, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 183, 16));

        btnForgotPass.setBackground(new java.awt.Color(102, 0, 102));
        btnForgotPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnForgotPass.setForeground(new java.awt.Color(255, 255, 255));
        btnForgotPass.setText("Forgot Password");
        btnForgotPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnForgotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPassActionPerformed(evt);
            }
        });
        jPanel1.add(btnForgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 130, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        boolean noError = true;
        if (txtName.getText().equals("")) {
            this.lblUsernameError.setText("Fill in Username please");
            noError = false;
        } else {
            this.lblUsernameError.setText("");
            noError = true;
        }

        if (txtPass.getPassword().length==0) {
            this.lblPasswordError.setText("Fill in Password please");
            noError = false;
        } else {
            this.lblPasswordError.setText("");
            noError = true;
        }

        if (noError) {
            String name = txtName.getText();
            String pass = new String(txtPass.getPassword());
            if(name.equals("admin")&pass.equals("123")){
                AdminPage ad = new AdminPage();
                ad.setLocationRelativeTo(null);
                ad.setVisible(true);
                this.dispose();
            }
            try {
                File file = new File("User.DAT");
                Scanner sc = new Scanner(file);
                boolean n = false;
                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    String[] info = data.split(";");
                    
                    if (info[0].equals(name) && info[1].equals(pass)) {
                        n = true;
                        this.lblLoginError.setText("");
                        JOptionPane.showMessageDialog(this, "Log In Successful");
                        MainPage hf = new MainPage(name);
                        hf.setLocationRelativeTo(null);
                        hf.setVisible(true);
                        this.dispose();
                        break;
                    }
                    if(n==false)
                    {
                         this.lblLoginError.setText("Account is not match");
                    }
                }
                sc.close();
            } catch (Exception e) {
//                this.lblLoginError.setText("Information is not correct");
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    public boolean turnOFf() {
        this.dispose();
        return true;
    }
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        SignUpFrame suf = new SignUpFrame();
        this.dispose();
        suf.setLocationRelativeTo(null);
        suf.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnForgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPassActionPerformed
        // TODO add your handling code here:
        ForgotPasswordFrame fgf = new ForgotPasswordFrame();
        fgf.setLocationRelativeTo(null);
        fgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnForgotPassActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPass;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblLoginError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
