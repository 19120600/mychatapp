/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mychatapp;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author NguyenNghiaBui
 */
public class ChatRegisterForm extends javax.swing.JFrame {
    public static List<MyAcc> list = new ArrayList<MyAcc>();
    public static String fileName = "src/mychatapp/myacc.txt";
    /**
     * Creates new form ChatRegisterForm
     */
    public ChatRegisterForm() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Register Form");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        btnRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegisterKeyPressed(evt);
            }
        });

        btnLogin.setText("I had an account! Login here.");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel6.setText("Port");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(378, 378, 378))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(txtPort))))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegister)
                        .addGap(149, 149, 149))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        int dem = 0;
        for (MyAcc i : list)
        {
            if (i.getPort().equals(txtPort.getText())|| i.getUser().equals(txtUser.getText()))
            {
                dem = dem+1;
            }
        }
        
        if (dem == 0){
            MyAcc a = new MyAcc(txtUser.getText(),txtPass.getText(),txtPort.getText());
            try{
                list.add(a);
                BufferedWriter fileO = new BufferedWriter(new FileWriter(fileName));
                fileO.write(Integer.toString(list.size()));
                for (int i = 0; i < list.size(); i++)
                {
                    String line = list.get(i).getUser()+";"+list.get(i).getPass()+";"+list.get(i).getPort();
                    fileO.newLine();
                    fileO.write(line);
                }
                fileO.close();
                JOptionPane.showMessageDialog(this, "Successful!");
                txtUser.setText("");
                txtPort.setText("");
                txtPass.setText("");
            }catch(Exception e){
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Existed Account: Username or Port was already existed!");
        }  
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegisterKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER){
        int dem = 0;
        for (MyAcc i : list)
        {
            if (i.getPort().equals(txtPort.getText())|| i.getUser().equals(txtUser.getText()))
            {
                dem = dem+1;
            }
        }
        
        if (dem == 0){
            MyAcc a = new MyAcc(txtUser.getText(),txtPass.getText(),txtPort.getText());
            try{
                list.add(a);
                BufferedWriter fileO = new BufferedWriter(new FileWriter(fileName));
                fileO.write(Integer.toString(list.size()));
                for (int i = 0; i < list.size(); i++)
                {
                    String line = list.get(i).getUser()+";"+list.get(i).getPass()+";"+list.get(i).getPort();
                    fileO.newLine();
                    fileO.write(line);
                }
                fileO.close();
                new ChatRegisterForm().setVisible(false);
            }catch(Exception e){
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Existed Account: Username or Port was already existed!");
        }  
    }
    }//GEN-LAST:event_btnRegisterKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        ChatLogin li = null;
        try {
            li = new ChatLogin();
        } catch (IOException ex) {
            Logger.getLogger(ChatRegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        li.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() throws IOException {
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
            java.util.logging.Logger.getLogger(ChatRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        int n = Integer.parseInt(file.readLine());
        for (int i = 0; i < n; i++)
        {
            String std = file.readLine();
            String[] in4 = std.split(";");
            MyAcc acc = new MyAcc(in4[0], in4[1], in4[2]);
            list.add(acc);
        }
        file.close();
        for (MyAcc a:list){
            System.out.println(a.getUser());
        }
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatRegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
