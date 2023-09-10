package bank_sys;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pody
 */


public class cl_options extends javax.swing.JFrame {
int cl_id;
    /**
     * Creates new form cl_options
     */
    public cl_options(int id) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cl_id=id;
    }

    public cl_options() {
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_options = new javax.swing.JLabel();
        btn_w_d_cl = new javax.swing.JButton();
        btn_transfer = new javax.swing.JButton();
        btn_show = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        lbl_options.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        lbl_options.setForeground(new java.awt.Color(255, 255, 255));
        lbl_options.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_options.setText("Options");

        btn_w_d_cl.setBackground(new java.awt.Color(0, 102, 102));
        btn_w_d_cl.setFont(new java.awt.Font("Georgia", 3, 20)); // NOI18N
        btn_w_d_cl.setForeground(new java.awt.Color(255, 255, 255));
        btn_w_d_cl.setText("Withdraw/Deposit");
        btn_w_d_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_w_d_clActionPerformed(evt);
            }
        });

        btn_transfer.setBackground(new java.awt.Color(0, 102, 102));
        btn_transfer.setFont(btn_w_d_cl.getFont());
        btn_transfer.setForeground(new java.awt.Color(255, 255, 255));
        btn_transfer.setText("Transfer Money");
        btn_transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transferActionPerformed(evt);
            }
        });

        btn_show.setBackground(new java.awt.Color(0, 102, 102));
        btn_show.setFont(btn_w_d_cl.getFont());
        btn_show.setForeground(new java.awt.Color(255, 255, 255));
        btn_show.setText("Show My Account");
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(0, 102, 102));
        btn_back.setFont(btn_w_d_cl.getFont());
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_options, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_w_d_cl)
                    .addComponent(btn_show, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_options)
                .addGap(74, 74, 74)
                .addComponent(btn_w_d_cl)
                .addGap(64, 64, 64)
                .addComponent(btn_transfer)
                .addGap(68, 68, 68)
                .addComponent(btn_show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_w_d_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_w_d_clActionPerformed
        // TODO add your handling code here:
        new wi_de(cl_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_w_d_clActionPerformed

    private void btn_transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferActionPerformed
        // TODO add your handling code here:
        new transfer(cl_id).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_transferActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        // TODO add your handling code here:
        new view_data(cl_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_showActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new cl_login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
                    break;}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cl_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cl_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cl_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cl_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cl_options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_show;
    private javax.swing.JButton btn_transfer;
    private javax.swing.JButton btn_w_d_cl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_options;
    // End of variables declaration//GEN-END:variables
}
