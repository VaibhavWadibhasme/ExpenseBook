/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensebook;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author softpoint
 */
public class DashMenu extends javax.swing.JFrame {

    /**
     * Creates new form DashMenu
     */
    public DashMenu() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnupdateUser = new javax.swing.JButton();
        btnDeleteOnline = new javax.swing.JButton();
        btnOfflineDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnupdateUser.setText("Update Username & Password");
        btnupdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateUserActionPerformed(evt);
            }
        });

        btnDeleteOnline.setText("Delete Online Expenses");
        btnDeleteOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOnlineActionPerformed(evt);
            }
        });

        btnOfflineDelete.setText("Delete Offline Expenses");
        btnOfflineDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfflineDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOfflineDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnupdateUser, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(btnDeleteOnline, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnupdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnDeleteOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnOfflineDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateUserActionPerformed
        // TODO add your handling code here:
        
        UpdateUser frm=new UpdateUser();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnupdateUserActionPerformed

    private void btnDeleteOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOnlineActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Are you sure to Delete");
        if (i == 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/expenses_book", "root", "");
                String sql = "delete from online_expenses";
                PreparedStatement pst = con.prepareStatement(sql);
                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(this, "All record clear");
                }
            } catch (Exception e) {
                System.out.println("Exception :" + e);
            }
        }
        DashboardPage frm=new DashboardPage();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeleteOnlineActionPerformed

    private void btnOfflineDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfflineDeleteActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Are you sure to Delete");
        if (i == 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/expenses_book", "root", "");
                String sql = "delete from offline_expenses";
                PreparedStatement pst = con.prepareStatement(sql);
                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(this, "All record clear");
                }
            } catch (Exception e) {
                System.out.println("Exception :" + e);
            }
        }
        DashboardPage frm=new DashboardPage();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOfflineDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DashMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DashMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DashMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DashMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DashMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteOnline;
    private javax.swing.JButton btnOfflineDelete;
    private javax.swing.JButton btnupdateUser;
    // End of variables declaration//GEN-END:variables
}
