package bank_sys;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
public class wi_de extends javax.swing.JFrame {
    Connection con;
    int w_id;
    String type;
    public wi_de(){
     initComponents();
        this.setLocationRelativeTo(null);
        
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank2", "root", "root");
             PreparedStatement stmt=con.prepareStatement("select * from client");
            ResultSet res= stmt.executeQuery();
           
            while(res.next())
            {
                if(w_id==res.getInt(1))
                {
                    double bal=res.getDouble(4);
                    tf_wi_de_bal.setText(""+bal);
                }
            }
        } catch (SQLException ex) {
             Logger.getLogger(addclient.class.getName()).log(Level.SEVERE, null, ex);    
        }
        
    }
    public wi_de(int cl_id)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.w_id=cl_id;
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank2", "root", "root");
             PreparedStatement stmt=con.prepareStatement("select * from client");
            ResultSet res= stmt.executeQuery();
           
            while(res.next())
            {
                if(w_id==res.getInt(1))
                {
                    double bal=res.getDouble(4);
                    tf_wi_de_bal.setText(""+bal);
                }
            }
        } catch (SQLException ex) {
             Logger.getLogger(addclient.class.getName()).log(Level.SEVERE, null, ex);    
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_balance = new javax.swing.JLabel();
        rd_de = new javax.swing.JRadioButton();
        rd_wi = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        wi_de_amount = new javax.swing.JTextField();
        wi_de_submit = new javax.swing.JButton();
        lbl_operation = new javax.swing.JLabel();
        tf_wi_de_bal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        lbl_balance.setFont(new java.awt.Font("Segoe UI Black", 3, 20)); // NOI18N
        lbl_balance.setForeground(new java.awt.Color(255, 255, 255));
        lbl_balance.setText("Your balance:");

        buttonGroup1.add(rd_de);
        rd_de.setFont(new java.awt.Font("Sitka Text", 3, 20)); // NOI18N
        rd_de.setForeground(new java.awt.Color(255, 255, 255));
        rd_de.setText("Deposit");

        buttonGroup1.add(rd_wi);
        rd_wi.setFont(new java.awt.Font("Sitka Text", 3, 20)); // NOI18N
        rd_wi.setForeground(new java.awt.Color(255, 255, 255));
        rd_wi.setText("Withdraw");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("The Amount of money");

        wi_de_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wi_de_amountActionPerformed(evt);
            }
        });

        wi_de_submit.setBackground(new java.awt.Color(0, 102, 102));
        wi_de_submit.setFont(new java.awt.Font("Sitka Text", 3, 20)); // NOI18N
        wi_de_submit.setText("Submit");
        wi_de_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wi_de_submitActionPerformed(evt);
            }
        });

        lbl_operation.setFont(new java.awt.Font("Segoe UI Black", 3, 20)); // NOI18N
        lbl_operation.setForeground(new java.awt.Color(255, 255, 255));
        lbl_operation.setText("Operation Type:");

        tf_wi_de_bal.setEditable(false);
        tf_wi_de_bal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_wi_de_balActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("--------------------------------------------------------------------------------------------------------------------------");

        btn_back.setBackground(new java.awt.Color(0, 102, 102));
        btn_back.setFont(new java.awt.Font("Sitka Text", 3, 20)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_operation, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd_wi)
                        .addGap(66, 66, 66)
                        .addComponent(rd_de))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(wi_de_submit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wi_de_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_wi_de_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_wi_de_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_operation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_wi)
                    .addComponent(rd_de))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wi_de_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(wi_de_submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

    private void wi_de_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wi_de_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wi_de_amountActionPerformed

    private void tf_wi_de_balActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_wi_de_balActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_wi_de_balActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new cl_options(w_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void wi_de_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wi_de_submitActionPerformed
        if(rd_wi.isSelected())
        {
            if(!wi_de_amount.getText().isEmpty())
            {try {
                PreparedStatement stmt=con.prepareStatement("select balance from client where cl_id="+w_id);
                ResultSet res=stmt.executeQuery();
                String a=wi_de_amount.getText();
                
                if(is_valid_number(wi_de_amount.getText()))
                {
                   PreparedStatement st;
                    if(Double.parseDouble (a)<=Double.parseDouble(tf_wi_de_bal.getText()))
                    {
                        double result=Double.parseDouble(tf_wi_de_bal.getText())-Double.parseDouble (a);
                         st=con.prepareStatement("update client set balance= ? where cl_id=?");
                        st.setDouble(1, result);
                        st.setInt(2, w_id);
                        st.executeUpdate();
                        tf_wi_de_bal.setText(""+result);
                        st=con.prepareStatement("insert into w_d_action (ac_type,ac_date,amount,reminder,cl_id)values(?,?,?,?,?)");
                        st.setString(1, "Withdrow");
                        Date d=new Date();
                        SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy | hh:mm:ss");
                        st.setString(2, String.valueOf(s.format(d)));
                        
                        st.setDouble(3, Double.parseDouble(wi_de_amount.getText()));
                        st.setDouble(4, result);
                        st.setInt(5, w_id);
                        st.execute();
                        JOptionPane.showMessageDialog(null, "withdraw successfull");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "not enough money in the balance");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "enter a valid number");
                }
            } catch (SQLException ex) {
                Logger.getLogger(wi_de.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "please enter the amount of money you want to witdraw");
            }
        }
        else if(rd_de.isSelected())
        {
            if(!wi_de_amount.getText().isEmpty())
            {
            try {
                PreparedStatement stmt=con.prepareStatement("select balance from client where cl_id="+w_id);
                ResultSet res=stmt.executeQuery();
                String a=wi_de_amount.getText();
                
                if(is_valid_number(wi_de_amount.getText()))
                {
                        double result=Double.parseDouble(tf_wi_de_bal.getText())+Double.parseDouble (a);
                        PreparedStatement st=con.prepareStatement("update client set balance= ? where cl_id=?");
                        st.setDouble(1, result);
                        st.setInt(2, w_id);
                        st.executeUpdate();
                        tf_wi_de_bal.setText(""+result);
                        st=con.prepareStatement("insert into w_d_action (ac_type,ac_date,amount,reminder,cl_id)values(?,?,?,?,?)");
                        st.setString(1, "Deposit");
                        Date d=new Date();
                        SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy | hh:mm:ss");
                        st.setString(2, String.valueOf(s.format(d)));
                        
                        st.setDouble(3, Double.parseDouble(wi_de_amount.getText()));
                        st.setDouble(4, result);
                        st.setInt(5, w_id);
                        st.execute();
                    JOptionPane.showMessageDialog(null, "deposit successfull");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "enter a valid number");
                }
            } catch (SQLException ex) {
                Logger.getLogger(wi_de.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "please enter the amount of money you want to deposit");
            }
            
        }
            
        else 
        {
            JOptionPane.showMessageDialog(null, "please choose the operation");
        }
    }//GEN-LAST:event_wi_de_submitActionPerformed

  public boolean is_valid_number(String s)
    {
        try {
         
         Double doub = Double.parseDouble(s);
         
      }
        catch (NumberFormatException ex) {
         return false;
      }
        return true;
    }

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
            java.util.logging.Logger.getLogger(wi_de.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wi_de.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wi_de.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wi_de.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wi_de().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_balance;
    private javax.swing.JLabel lbl_operation;
    private javax.swing.JRadioButton rd_de;
    private javax.swing.JRadioButton rd_wi;
    private javax.swing.JTextField tf_wi_de_bal;
    private javax.swing.JTextField wi_de_amount;
    private javax.swing.JButton wi_de_submit;
    // End of variables declaration//GEN-END:variables

    private String toString(int bal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
