package bank_sys;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
 class Employeef extends javax.swing.JFrame {

     DefaultTableModel dtm;
     
     String edt_id;
     String edt_name;
        String edt_pass;
        String edt_street;
        String edt_city;
        String edt_phone;
     
     Connection con;
     int del_id;
     int emp_id; 
     
     
     
     
     ArrayList<Integer> cl_ids=new ArrayList<>();
         
    public Employeef() {  
        initComponents();
        this.setLocationRelativeTo(null);
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank2", "root", "root");
         } catch (SQLException ex) {
             Logger.getLogger(addclient.class.getName()).log(Level.SEVERE, null, ex);
             
         }
  
        dtm=new DefaultTableModel();
        dtm.addColumn("id");
        dtm.addColumn("name");
        dtm.addColumn("password");
        dtm.addColumn("street");
        dtm.addColumn("city");
        dtm.addColumn("phone");
        fill_table_model();
    }

   public Employeef(int id) {
       initComponents();
 this.emp_id=id;
 
        this.setLocationRelativeTo(null);
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank2", "root", "root");
         } catch (SQLException ex) {
             Logger.getLogger(addclient.class.getName()).log(Level.SEVERE, null, ex);
             
         }
  
        dtm=new DefaultTableModel();
        dtm.addColumn("id");
        dtm.addColumn("name");
        dtm.addColumn("password");
        dtm.addColumn("street");
        dtm.addColumn("city");
        dtm.addColumn("phone");
        fill_table_model();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_add_client = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        btn_edit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_show = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 130, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        btn_add_client.setBackground(new java.awt.Color(0, 102, 102));
        btn_add_client.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btn_add_client.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_client.setText("Add Client");
        btn_add_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_clientActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(0, 102, 102));
        btn_back.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(0, 102, 102));
        btn_delete.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.setAlignmentX(10.0F);
        btn_delete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        tf_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf_search.setForeground(new java.awt.Color(153, 153, 153));
        tf_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_search.setText("Search for client");
        tf_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_searchMouseClicked(evt);
            }
        });
        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_searchKeyTyped(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(0, 102, 102));
        btn_edit.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.setAlignmentX(10.0F);
        btn_edit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        tbl_show.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_showMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_show);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(694, 694, 694)
                        .addComponent(jLabel1)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_add_client, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_clientActionPerformed
        addclient a=new addclient(emp_id);
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_btn_add_clientActionPerformed

    
    private void fill_table_model()
    {
        dtm.setRowCount(0);
        try{
          PreparedStatement stmt= con.prepareStatement("select * from client ");
          ResultSet res=stmt.executeQuery();
          while(res.next())
          {
              //cl_ids.add(res.getInt());
              dtm.addRow(new Object[]{res.getInt(1),res.getString(2),res.getString(3),res.getString(7),res.getString(6),res.getString(5)});
              tbl_show.setModel(dtm);
          }
        }
        catch (SQLException ex) {
             Logger.getLogger(addclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /////////////////////////////////
    
    
      private void search(String x)
    {
        dtm.setRowCount(0);
        try{
          PreparedStatement stmt= con.prepareStatement("select * from client where cl_name like  \""+x+"%\"");
          ResultSet res=stmt.executeQuery();
          while(res.next())
          {
              //cl_ids.add(res.getInt());
              dtm.addRow(new Object[]{res.getInt(1),res.getString(2),res.getString(3),res.getString(7),res.getString(6),res.getString(5)});
              tbl_show.setModel(dtm);
          }
        }
        catch (SQLException ex) {
          //   Logger.getLogger(addclient.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
    }
    
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
          EmployeeL e=new EmployeeL();
        this.dispose();
        e.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        int s=tbl_show.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(null, "please select a row");
        }
        else {
            try {DefaultTableModel obj=(DefaultTableModel) tbl_show.getModel();
             edt_id= obj.getValueAt(tbl_show.getSelectedRow(), 0).toString();
             PreparedStatement stmt=con.prepareStatement("delete from client where cl_id=?");
             stmt.setInt(1, Integer.parseInt(edt_id));
             stmt.executeUpdate();
             fill_table_model();
         } catch (SQLException ex) {
             Logger.getLogger(Employeef.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        
        DefaultTableModel obj=(DefaultTableModel) tbl_show.getModel();
        int s=tbl_show.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(null, "please select a row");
        }
        else
        {
            edt_id= obj.getValueAt(tbl_show.getSelectedRow(), 0).toString();
            edt_name=obj.getValueAt(tbl_show.getSelectedRow(), 1).toString();
            edt_pass=obj.getValueAt(tbl_show.getSelectedRow(), 2).toString();
            edt_street=obj.getValueAt(tbl_show.getSelectedRow(), 3).toString();
            edt_city=obj.getValueAt(tbl_show.getSelectedRow(), 4).toString();
            edt_phone=obj.getValueAt(tbl_show.getSelectedRow(), 5).toString();
            new edit_inf(edt_name,edt_id,edt_city,edt_pass,edt_phone,edt_street).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        // TODO add your handling code here:
        search(tf_search.getText().toString());
        
    }//GEN-LAST:event_tf_searchKeyReleased

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_searchActionPerformed

    private void tf_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_searchMouseClicked
        // TODO add your handling code here:
        tf_search.setText("");
    }//GEN-LAST:event_tf_searchMouseClicked

    private void tbl_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_showMouseClicked
        // TODO add your handling code here:
        
        //del_id=(int) tbl_show.getValueAt(tbl_show.getSelectedRow(), 1);
        //JOptionPane.showInputDialog(null, evt)
    }//GEN-LAST:event_tbl_showMouseClicked

    private void tf_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyTyped
        // TODO add your handling code here:
        
        String s=tf_search.getText().toString();
        search(s);
        
    }//GEN-LAST:event_tf_searchKeyTyped
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
            java.util.logging.Logger.getLogger(Employeef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employeef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employeef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employeef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeef().setVisible(true);
            }
        });
    }
    
    public void update_table()
    {
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_client;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_show;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
