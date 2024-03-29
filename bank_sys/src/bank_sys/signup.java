package bank_sys;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class signup extends javax.swing.JFrame {
Connection con;
    public signup() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank2", "root", "root");
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

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        btn_Signup = new javax.swing.JButton();
        lbl_email = new javax.swing.JLabel();
        lbl_conf_pass = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        tf_pass1 = new javax.swing.JPasswordField();
        tf_pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        lbl_acc = new javax.swing.JLabel();
        lbl_Login = new javax.swing.JButton();
        tf_email = new javax.swing.JTextField();

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
            .addGap(0, 592, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 196, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        lbl_user.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("Username:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        btn_Signup.setBackground(new java.awt.Color(0, 102, 102));
        btn_Signup.setFont(lbl_user.getFont());
        btn_Signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_Signup.setText("Sign up");
        btn_Signup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignupActionPerformed(evt);
            }
        });

        lbl_email.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email.setText("Email:");

        lbl_conf_pass.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_conf_pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_conf_pass.setText("Confirm password:");

        lbl_pass.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pass.setText("password:");

        lbl_acc.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_acc.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acc.setText("Already have an account?");

        lbl_Login.setBackground(new java.awt.Color(0, 102, 102));
        lbl_Login.setFont(lbl_conf_pass.getFont());
        lbl_Login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Login.setText("Login");
        lbl_Login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_username, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                        .addComponent(lbl_user)
                        .addComponent(lbl_email)
                        .addComponent(lbl_pass)
                        .addComponent(tf_pass)
                        .addComponent(tf_email))
                    .addComponent(lbl_conf_pass)
                    .addComponent(tf_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_acc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btn_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbl_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_pass)
                .addGap(18, 18, 18)
                .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_conf_pass)
                .addGap(18, 18, 18)
                .addComponent(tf_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_acc)
                    .addComponent(lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(161, 161, 161))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignupActionPerformed
        String user=tf_username.getText();
        String pass=tf_pass.getText();
        String email=tf_email.getText();
        String pass1=tf_pass1.getText();
        if(user.isEmpty()||pass.isEmpty()||pass1.isEmpty()||email.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "you must fill all the cells");
        }
        else if(!pass.equals(pass1))
        {
            JOptionPane.showMessageDialog(null, "the two passwords are not equal");
        }
        else
        {
            boolean f=true;
            for(int i=0;i<user.length();i++)
            {
                if(!Character.isAlphabetic(user.charAt(i)))
                {
                    JOptionPane.showMessageDialog(null, "invalid username");
                    f=false;
                    break;
                }
            }
            if(!email.contains("@"))
            {
                JOptionPane.showMessageDialog(null, "invalid email");
                f=false;
            }
            Boolean exi=false;
            if(f)
            {
                PreparedStatement smm;
                try {
                    smm = con.prepareStatement("select * from employee");
                    ResultSet rrr=smm.executeQuery();
                
                while(rrr.next())
                {
                    if(rrr.getString(2).equals(user))
                    {
                        exi=true;
                        break;
                    }
                }
                } catch (SQLException ex) {
                    Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(!exi)
                {
                try {
                    PreparedStatement stmt=con.prepareStatement("insert into employee (emp_username,emp_email,emp_pass) values(?,?,?)");
                    stmt.setString(1, user);
                    stmt.setString(2, email);
                    stmt.setString(3, pass);
                    stmt.executeUpdate();
                } 
                catch (SQLException ex) {
                    Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "signup successfull");
                int id=0;
                try {
                    PreparedStatement s=con.prepareStatement("select emp_id from employee");
                    ResultSet res=s.executeQuery();
                    
                    while(res.next())
                    {
                        id=res.getInt(1);
                    }
                } 
                catch (SQLException ex) {
                    Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "your id is:"+id );
                EmployeeL e=new EmployeeL();
                this.dispose();
                e.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "this username is already taken");
                }
            }
        }
    }//GEN-LAST:event_btn_SignupActionPerformed

    private void lbl_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_LoginActionPerformed
        // TODO add your handling code here:
        EmployeeL e=new EmployeeL();
        this.dispose();
        e.setVisible(true);  
    }//GEN-LAST:event_lbl_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Signup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton lbl_Login;
    private javax.swing.JLabel lbl_acc;
    private javax.swing.JLabel lbl_conf_pass;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextField tf_email;
    private javax.swing.JPasswordField tf_pass;
    private javax.swing.JPasswordField tf_pass1;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
