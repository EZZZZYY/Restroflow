/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restro_flow;

/**
 *
 * @author user
 */
public class userSetting extends javax.swing.JFrame {

    /**
     * Creates new form userSetting
     */
    public userSetting() {
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

        CATEGORY = new javax.swing.JLabel();
        back1 = new dashboard.swing.Button();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        button1 = new dashboard.swing.Button();
        button2 = new dashboard.swing.Button();
        button3 = new dashboard.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(505, 200));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(798, 524));
        setSize(new java.awt.Dimension(798, 524));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CATEGORY.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 36)); // NOI18N
        CATEGORY.setForeground(new java.awt.Color(87, 0, 0));
        CATEGORY.setText("USER SETTING");
        getContentPane().add(CATEGORY, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        back1.setBackground(new java.awt.Color(102, 0, 0));
        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/backk.png"))); // NOI18N
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 46, 46));

        jLabel2.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(87, 0, 0));
        jLabel2.setText("Organisation name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 240, -1));

        jLabel6.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(87, 0, 0));
        jLabel6.setText("SECURITY QN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In what city were you born?", "What is the name of your favorite pet?", "What high school did you attend?", "What is your favorite food?" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 240, -1));

        jLabel7.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 0, 0));
        jLabel7.setText("ANSWER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 240, -1));

        btnupdate.setText("ADD");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        button1.setBackground(new java.awt.Color(102, 0, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("CHANGE PASSWORD");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 150, -1));

        button2.setBackground(new java.awt.Color(102, 0, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("CHANGE SECURITY QUESTION");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 260, 190, -1));

        button3.setBackground(new java.awt.Color(102, 0, 0));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("CHANGE ORG NAME");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_back1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

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
            java.util.logging.Logger.getLogger(userSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userSetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CATEGORY;
    private dashboard.swing.Button back1;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnupdate;
    private dashboard.swing.Button button1;
    private dashboard.swing.Button button2;
    private dashboard.swing.Button button3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
