
package dashboard.component;
import dashboard.form.adminpanel;

public class Menu extends javax.swing.JPanel {


    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new dashboard.swing.Button();
        button2 = new dashboard.swing.Button();
        adminpanel = new dashboard.swing.Button();
        button4 = new dashboard.swing.Button();
        button5 = new dashboard.swing.Button();

        setBackground(new java.awt.Color(153, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/component/WHITEE.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 265));

        jLabel2.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2023 ALL RIGHT RESERVED |RESTRO FLOW");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 592, -1, -1));

        button1.setBackground(new java.awt.Color(153, 0, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("BILLINGS");
        button1.setEffectColor(new java.awt.Color(204, 204, 204));
        button1.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 389, -1, -1));

        button2.setBackground(new java.awt.Color(153, 0, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("DASHBOARD");
        button2.setEffectColor(new java.awt.Color(153, 0, 0));
        button2.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 289, -1, -1));

        adminpanel.setBackground(new java.awt.Color(153, 0, 0));
        adminpanel.setForeground(new java.awt.Color(255, 255, 255));
        adminpanel.setText("ADMIN PANEL");
        adminpanel.setEffectColor(new java.awt.Color(204, 204, 204));
        adminpanel.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        adminpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminpanelActionPerformed(evt);
            }
        });
        add(adminpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 439, 255, 42));

        button4.setBackground(new java.awt.Color(153, 0, 0));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("CALENDER");
        button4.setEffectColor(new java.awt.Color(204, 204, 204));
        button4.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 339, -1, -1));

        button5.setBackground(new java.awt.Color(153, 0, 0));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("ABOUT US");
        button5.setEffectColor(new java.awt.Color(204, 204, 204));
        button5.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 487, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void adminpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminpanelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminpanel().setVisible(true);
    }//GEN-LAST:event_adminpanelActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dashboard.swing.Button adminpanel;
    private dashboard.swing.Button button1;
    private dashboard.swing.Button button2;
    private dashboard.swing.Button button4;
    private dashboard.swing.Button button5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
