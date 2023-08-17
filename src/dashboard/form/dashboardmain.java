package dashboard.form;

import javax.swing.JOptionPane;

public class dashboardmain extends javax.swing.JFrame {

    public String email;

    public dashboardmain() {
        initComponents();
        this.setTitle("RESTRO FLOW");
        this.setResizable(false);
    }

    public dashboardmain(String useremail) {
        initComponents();
        email = useremail;
        if (email.equals("admin@restroflow.com")) {
            
        }

        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bg = new javax.swing.JLayeredPane();
        menupanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btndashboard = new dashboard.swing.Button();
        btnbillings = new dashboard.swing.Button();
        btnaboutus = new dashboard.swing.Button();
        jPanel2 = new javax.swing.JPanel();
        btnlogout = new dashboard.swing.ButtonBadges();
        paneldashboard = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btncategory = new javax.swing.JButton();
        btnproduct = new javax.swing.JButton();
        btnplaceorder = new javax.swing.JButton();
        btnvedprod = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/component/WHITEE.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2023 ALL RIGHT RESERVED |RESTRO FLOW");

        jLabel7.setFont(new java.awt.Font("Neue Plak Bold", 1, 18)); // NOI18N
        jLabel7.setText("SERVING YOU THE PERFECTION");

        jLabel8.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(87, 0, 0));
        jLabel8.setText("DASHBOARD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setOpaque(true);

        menupanel.setBackground(new java.awt.Color(153, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/component/WHITEE.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2023 ALL RIGHT RESERVED |RESTRO FLOW");

        btndashboard.setBackground(new java.awt.Color(153, 0, 0));
        btndashboard.setForeground(new java.awt.Color(255, 255, 255));
        btndashboard.setText("DASHBOARD");
        btndashboard.setEffectColor(new java.awt.Color(153, 0, 0));
        btndashboard.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        btndashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboardActionPerformed(evt);
            }
        });

        btnbillings.setBackground(new java.awt.Color(153, 0, 0));
        btnbillings.setForeground(new java.awt.Color(255, 255, 255));
        btnbillings.setText("BILLINGS");
        btnbillings.setEffectColor(new java.awt.Color(204, 204, 204));
        btnbillings.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        btnbillings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbillingsActionPerformed(evt);
            }
        });

        btnaboutus.setBackground(new java.awt.Color(153, 0, 0));
        btnaboutus.setForeground(new java.awt.Color(255, 255, 255));
        btnaboutus.setText("ABOUT US");
        btnaboutus.setEffectColor(new java.awt.Color(204, 204, 204));
        btnaboutus.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        btnaboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(btnbillings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnaboutus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btndashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnbillings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnaboutus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnlogout.setForeground(new java.awt.Color(102, 0, 51));
        btnlogout.setText("LOG OUT");
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Neue Plak Bold", 1, 18)); // NOI18N
        jLabel9.setText("SERVING YOU THE PERFECTION");

        jLabel10.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(87, 0, 0));
        jLabel10.setText("DASHBOARD");

        btncategory.setBackground(new java.awt.Color(125, 0, 0));
        btncategory.setFont(new java.awt.Font("Neue Plak Bold", 1, 25)); // NOI18N
        btncategory.setForeground(new java.awt.Color(255, 255, 255));
        btncategory.setText("CATEGORY");
        btncategory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btncategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoryActionPerformed(evt);
            }
        });

        btnproduct.setBackground(new java.awt.Color(125, 0, 0));
        btnproduct.setFont(new java.awt.Font("Neue Plak Bold", 1, 25)); // NOI18N
        btnproduct.setForeground(new java.awt.Color(255, 255, 255));
        btnproduct.setText("PRODUCT");
        btnproduct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductActionPerformed(evt);
            }
        });

        btnplaceorder.setBackground(new java.awt.Color(125, 0, 0));
        btnplaceorder.setFont(new java.awt.Font("Neue Plak Bold", 1, 25)); // NOI18N
        btnplaceorder.setForeground(new java.awt.Color(255, 255, 255));
        btnplaceorder.setText("PLACE ORDER");
        btnplaceorder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnplaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplaceorderActionPerformed(evt);
            }
        });

        btnvedprod.setBackground(new java.awt.Color(125, 0, 0));
        btnvedprod.setFont(new java.awt.Font("Neue Plak Bold", 1, 25)); // NOI18N
        btnvedprod.setForeground(new java.awt.Color(255, 255, 255));
        btnvedprod.setText("VED PROD");
        btnvedprod.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnvedprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvedprodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneldashboardLayout = new javax.swing.GroupLayout(paneldashboard);
        paneldashboard.setLayout(paneldashboardLayout);
        paneldashboardLayout.setHorizontalGroup(
            paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(paneldashboardLayout.createSequentialGroup()
                            .addGroup(paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnplaceorder, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(paneldashboardLayout.createSequentialGroup()
                                    .addComponent(btncategory, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(btnvedprod, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        paneldashboardLayout.setVerticalGroup(
            paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addGroup(paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvedprod, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncategory, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnplaceorder, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(64, 64, 64))
        );

        bg.setLayer(menupanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(paneldashboard, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneldashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneldashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutusActionPerformed
     // TODO add your handling code here:
     new aboutus().setVisible(true);
    }//GEN-LAST:event_btnaboutusActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void adminpanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminpanel1ActionPerformed
        // TODO add your handling code here:
        new userSetting().setVisible(true); 
       
    }//GEN-LAST:event_adminpanel1ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        new billAndOrder().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void btncategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoryActionPerformed
        new addcategory().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_btncategoryActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "DO YOU REALLY WANNA LOGOUT?", "SELECT", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new login().setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

    private void btnproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductActionPerformed
        new productpage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnproductActionPerformed

    private void btnplaceorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplaceorderActionPerformed
        new placeorder(email).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnplaceorderActionPerformed

    private void btnvedprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvedprodActionPerformed
        new ved().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnvedprodActionPerformed

    private void btnverifyuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverifyuser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnverifyuser1ActionPerformed

    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndashboardActionPerformed

    private void btnbillingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbillingsActionPerformed
        // TODO add your handling code here:
        new billAndOrder().setVisible(true);
    }//GEN-LAST:event_btnbillingsActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(dashboardmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    private dashboard.swing.Button btnaboutus;
    private dashboard.swing.Button btnbillings;
    private javax.swing.JButton btncategory;
    private dashboard.swing.Button btndashboard;
    private dashboard.swing.ButtonBadges btnlogout;
    private javax.swing.JButton btnplaceorder;
    private javax.swing.JButton btnproduct;
    private javax.swing.JButton btnvedprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel paneldashboard;
    // End of variables declaration//GEN-END:variables
}
