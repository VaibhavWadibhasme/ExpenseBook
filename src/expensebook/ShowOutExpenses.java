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
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author softpoint
 */
public class ShowOutExpenses extends javax.swing.JFrame {

    /**
     * Creates new form ShowNetExpenses
     */
    public ShowOutExpenses() {
        initComponents();
//        cbCategory.addItem("--Select--");
//        cbCategory.addItem("Food");
//        cbCategory.addItem("Entertainment");
//        cbCategory.addItem("Travel");
//        cbCategory.addItem("Medical");
//        cbCategory.addItem("Education");
//        cbCategory.addItem("Rent");
//        cbCategory.addItem("Bills");
//        cbCategory.addItem("Recharge");
//        cbCategory.addItem("Shopping");
//        cbCategory.addItem("Personal Care");
//        cbCategory.addItem("Other");
//        cbCategory.addItem("All");
//        cbCategory.setEditable(true);

        txtTotal.setEditable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/expenses_book", "root", "");
            String sql = "select * from category_table";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                cbCategory.addItem(rs.getString("category"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getTableInfo(ResultSet rs, ResultSet rsSum, String dba) {
        db = dba;
        try {
            while (rsSum.next()) {
                txtTotal.setText("Rs " + rsSum.getDouble(1));
            }
        } catch (Exception e) {
        }
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dobStart = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dobEnd = new com.toedter.calendar.JDateChooser();
        btnPrint = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRemark = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Category");

        btnCheck.setText("CHECK");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel2.setText("Start Date");

        jLabel3.setText("To");

        jLabel4.setText("End Date");

        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel5.setText("Remark");

        txtRemark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemarkActionPerformed(evt);
            }
        });
        txtRemark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemarkKeyTyped(evt);
            }
        });

        jLabel6.setText("Total");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobStart, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPrint))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRemark, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, 146, Short.MAX_VALUE)
                            .addComponent(dobEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(btnCheck)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrint)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        try {
            Date dateS = dobStart.getDate();
            java.sql.Date ds = new java.sql.Date(dateS.getTime());
            Date dateE = dobEnd.getDate();
            java.sql.Date de = new java.sql.Date(dateE.getTime());

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/expenses_book", "root", "");
            String sql = "";
            String sqlSum = "";
            if ((cbCategory.getSelectedItem().equals("--Select--"))||cbCategory.getSelectedItem().equals("All")) {
                sql = "select * from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit'";
                sqlSum = "select sum(amount) from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit'";
            } else {
                sql = "select * from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and source_category='" + cbCategory.getSelectedItem() + "'";
                sqlSum = "select sum(amount) from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and source_category='" + cbCategory.getSelectedItem() + "'";
            }
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            PreparedStatement pstSum = con.prepareStatement(sqlSum);
            ResultSet rsSum = pstSum.executeQuery();
            while (rsSum.next()) {
                txtTotal.setText("Rs " + rsSum.getDouble(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:

        if (dobStart.getDate() == null || dobEnd.getDate() == null) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expenses_book", "root", "");
                //JasperDesign jasperDesign = JRXmlLoader.add ("report3.jrmxl");
                JasperDesign jasperDesign = JRXmlLoader.load("G:\\JAVA Program\\Project\\expensebook\\src\\expensebook\\CashOutEx.jrxml");
                String sql = "";
                if ((cbCategory.getSelectedItem().equals("--Select--"))||(cbCategory.getSelectedItem().equals("All"))) {
                    sql = "select * from " + db + " where credit_debit='Debit'";
                } else {
                    sql = "select * from " + db + " where credit_debit='Debit' and source_category='" + cbCategory.getSelectedItem() + "'";
                }
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jasperDesign.setQuery(newQuery);
                JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, con);
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            Date dateS = dobStart.getDate();
            java.sql.Date ds = new java.sql.Date(dateS.getTime());
            Date dateE = dobEnd.getDate();
            java.sql.Date de = new java.sql.Date(dateE.getTime());

            if (txtRemark.getText().isEmpty()) {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expenses_book", "root", "");
                    //JasperDesign jasperDesign = JRXmlLoader.add ("report3.jrmxl");
                    JasperDesign jasperDesign = JRXmlLoader.load("G:\\JAVA Program\\Project\\expensebook\\src\\expensebook\\CashOutEx.jrxml");
                    String sql = "";
                    if ((cbCategory.getSelectedItem().equals("--Select--"))||cbCategory.getSelectedItem().equals("All")) {
                        sql = "select * from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit'";
                    } else {
                        sql = "select * from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and source_category='" + cbCategory.getSelectedItem() + "'";
                    }
                    JRDesignQuery newQuery = new JRDesignQuery();
                    newQuery.setText(sql);
                    jasperDesign.setQuery(newQuery);
                    JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, con);
                    JasperViewer.viewReport(jasperPrint, false);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expenses_book", "root", "");
                    //JasperDesign jasperDesign = JRXmlLoader.add ("report3.jrmxl");
                    JasperDesign jasperDesign = JRXmlLoader.load("G:\\JAVA Program\\Project\\expensebook\\src\\expensebook\\CashOutEx.jrxml");
                    String sql = "";
                    if (cbCategory.getSelectedItem().equals("All")) {
                        sql = "select * from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and remark like '%" + txtRemark.getText() + "%'";
                    } else {
                        sql = "select * from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and source_category='" + cbCategory.getSelectedItem() + "'and remark like '%" + txtRemark.getText() + "%'";
                    }
                    JRDesignQuery newQuery = new JRDesignQuery();
                    newQuery.setText(sql);
                    jasperDesign.setQuery(newQuery);
                    JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, con);
                    JasperViewer.viewReport(jasperPrint, false);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtRemarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarkActionPerformed

    private void txtRemarkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemarkKeyTyped
        // TODO add your handling code here:
        Date dateS = dobStart.getDate();
        java.sql.Date ds = new java.sql.Date(dateS.getTime());
        Date dateE = dobEnd.getDate();
        java.sql.Date de = new java.sql.Date(dateE.getTime());

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/expenses_book", "root", "");
            String sql = "";
            String sqlSum = "";
            if ((cbCategory.getSelectedItem().equals("--Select--"))||cbCategory.getSelectedItem().equals("All")) {
                sql = "select * from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and remark like '%" + txtRemark.getText() + "%'";
                sqlSum = "select sum(amount) from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and remark like '%" + txtRemark.getText() + "%'";

            } else {
                sql = "select * from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and source_category='" + cbCategory.getSelectedItem() + "' and remark like '%" + txtRemark.getText() + "%'";
                sqlSum = "select sum(amount) from " + db + " where date between '" + ds + "' and '" + de + "' and credit_debit='Debit' and source_category='" + cbCategory.getSelectedItem() + "' and remark like '%" + txtRemark.getText() + "%'";

            }
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            PreparedStatement pstSum = con.prepareStatement(sqlSum);
            ResultSet rsSum = pstSum.executeQuery();
            while (rsSum.next()) {
                txtTotal.setText("Rs " + rsSum.getDouble(1));
            }
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }//GEN-LAST:event_txtRemarkKeyTyped

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

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
//            java.util.logging.Logger.getLogger(ShowOutExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ShowOutExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ShowOutExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ShowOutExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowOutExpenses().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> cbCategory;
    private com.toedter.calendar.JDateChooser dobEnd;
    private com.toedter.calendar.JDateChooser dobStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtRemark;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    String db;
}