/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockmarketinvestinggame;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mankaran
 */
public class Login extends javax.swing.JFrame {

    // instance variables
    private InvestGame investGame = new InvestGame();
    private User user;
    
    // store user data
    private String userName;
    private String passWord;
    private double balance;

    /**
     * Creates new form Game
     * @throws java.io.IOException
     */
    public Login() throws IOException {
        initComponents();
        // initialize invest game
        this.investGame = new InvestGame();
        // make some components not visible upon startup
        this.setResizable(false);
        this.newUsername.setVisible(false);
        this.newPassword.setVisible(false);
        this.twentyThousand.setVisible(false);
        this.fiftyThousand.setVisible(false);
        this.hundredThousand.setVisible(false);
        this.enter.setVisible(false);
        this.investGame = new InvestGame();
        this.getContentPane().setBackground(Color.black);
    }

    // method to show visibility of components
    public void balance() {
        this.fiftyThousand.setVisible(true);
        this.twentyThousand.setVisible(true);
        this.hundredThousand.setVisible(true);
    }

    // method to show visibility of components
    public void enter() {
        this.enter.setVisible(false);
        this.newUsername.setVisible(false);
        this.newPassword.setVisible(false);
        this.twentyThousand.setVisible(true);
        this.fiftyThousand.setVisible(true);
        this.hundredThousand.setVisible(true);
        // change text
        this.loginText.setText("Please select a balance to start your account with.");
    }

   // method to show visibility of components
    public void login() throws IOException {
        this.username.setVisible(false);
        this.password.setVisible(false);
        this.login.setVisible(false);
        this.signup.setVisible(false);
        this.or.setVisible(false);
        this.setVisible(false);
        // create a new stock screen and show it 
        StockScreen stockScreen = new StockScreen(this, this.investGame, this.user);
        stockScreen.setVisible(true);
    }
    
    // method to show visibility of components
    public void signUp() {
        this.or.setVisible(false);
        this.signup.setVisible(false);
        this.username.setVisible(false);
        this.password.setVisible(false);
        this.login.setVisible(false);
        this.newUsername.setVisible(true);
        this.newPassword.setVisible(true);
        this.enter.setVisible(true);
        // change text
        this.loginText.setText("Please enter a username and password.");
    }
    
    // method to add a new user to the arraylist in investgame
    public void newUser(double balance) {
        // catch errors if there are any 
        try {
            this.investGame.addUser(this.userName, this.passWord, balance);
            this.user = new User(this.userName, this.passWord, balance);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Please start the application again and login!");
            this.dispose(); 
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        newUsername = new javax.swing.JTextField();
        or = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        newPassword = new javax.swing.JPasswordField();
        twentyThousand = new javax.swing.JButton();
        fiftyThousand = new javax.swing.JButton();
        hundredThousand = new javax.swing.JButton();
        loginText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        login.setBackground(new java.awt.Color(255, 102, 0));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        signup.setBackground(new java.awt.Color(255, 102, 0));
        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        newUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUsernameActionPerformed(evt);
            }
        });

        or.setText("or");

        enter.setBackground(new java.awt.Color(255, 102, 0));
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        twentyThousand.setBackground(new java.awt.Color(255, 102, 0));
        twentyThousand.setText("$20 000");
        twentyThousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentyThousandActionPerformed(evt);
            }
        });

        fiftyThousand.setBackground(new java.awt.Color(255, 102, 0));
        fiftyThousand.setText("$50 000");
        fiftyThousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiftyThousandActionPerformed(evt);
            }
        });

        hundredThousand.setBackground(new java.awt.Color(255, 102, 0));
        hundredThousand.setText("$100 000");
        hundredThousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundredThousandActionPerformed(evt);
            }
        });

        loginText.setForeground(new java.awt.Color(255, 255, 255));
        loginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginText.setText("Please enter you username and password or click Sign Up.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(or)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(twentyThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiftyThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hundredThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(loginText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twentyThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiftyThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hundredThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(loginText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(or)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed
   
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        // set instance variables equal to username and password entered by player
        this.userName = this.username.getText();
        this.passWord = this.password.getText();
        
        // check if the user exists,
        if (this.investGame.checkUser(this.userName, this.passWord) != null) {
            // set user to user obtained
            this.user = this.investGame.checkUser(this.userName, this.passWord);
            // method that sets screen
            try {
                login();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        // if no user is found, tell player that it's an invalid login
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Login.");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        //call sign up method
        signUp();
    }//GEN-LAST:event_signupActionPerformed

    private void newUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUsernameActionPerformed

    }//GEN-LAST:event_newUsernameActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // store new username and password
        this.userName = this.newUsername.getText();
        this.passWord = this.newPassword.getText();
        
        // check to see if nothing is enterd in textfields
        if (this.userName.equals("") || this.passWord.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter information.");
        // otherwise, check to see if username already exists
        } else if (this.investGame.checkUsername(this.userName)) {
            JOptionPane.showMessageDialog(null, "This username already exists. Please choose another one.");
        // if no user exists, show next screen
        } else {
            this.enter();
        }
        
    }//GEN-LAST:event_enterActionPerformed

    private void twentyThousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentyThousandActionPerformed
        // set balance to twenty thousand dollars
        this.balance = 20000.0;
        
        // create a new user
        this.newUser(this.balance);
        
    }//GEN-LAST:event_twentyThousandActionPerformed

    private void fiftyThousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiftyThousandActionPerformed
        // set balance to fifty thousand dollars
        this.balance = 50000.0;
        
        // create a new user
        this.newUser(this.balance);
        
    }//GEN-LAST:event_fiftyThousandActionPerformed

    private void hundredThousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundredThousandActionPerformed
        // set balance to hundred thousand dollars
        this.balance = 100000.0;
        
        // create a new user
        this.newUser(this.balance);
        
    }//GEN-LAST:event_hundredThousandActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enter;
    private javax.swing.JButton fiftyThousand;
    private javax.swing.JButton hundredThousand;
    private javax.swing.JButton login;
    private javax.swing.JLabel loginText;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JTextField newUsername;
    private javax.swing.JLabel or;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup;
    private javax.swing.JButton twentyThousand;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
