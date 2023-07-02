package restro_flow;

import javax.swing.JOptionPane;
import adminpanel.usermanagement;

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
            btnverifyuser.setVisible(false);
        }

        setResizable(false);
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
        billings1 = new dashboard.form.billings();
        additional1 = new dashboard.form.additional();
        jLabel7 = new javax.swing.JLabel();
        btnverifyuser = new dashboard.swing.Button();
        jLabel8 = new javax.swing.JLabel();
        foodmenu1 = new dashboard.form.foodmenu();
        order1 = new dashboard.form.order();
        pendingorder1 = new dashboard.form.pendingorder();
        tableinfo1 = new dashboard.form.tableinfo();
        bg = new javax.swing.JLayeredPane();
        menupanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button3 = new dashboard.swing.Button();
        button6 = new dashboard.swing.Button();
        adminpanel1 = new dashboard.swing.Button();
        button7 = new dashboard.swing.Button();
        button8 = new dashboard.swing.Button();
        jPanel2 = new javax.swing.JPanel();
        button10 = new dashboard.swing.Button();
        button9 = new dashboard.swing.Button();
        paneldashboard = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnverifyuser1 = new dashboard.swing.Button();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        productbutton = new javax.swing.JButton();
        productbutton1 = new javax.swing.JButton();
        productbutton2 = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/component/WHITEE.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2023 ALL RIGHT RESERVED |RESTRO FLOW");

        button1.setBackground(new java.awt.Color(153, 0, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("BILLINGS");
        button1.setEffectColor(new java.awt.Color(204, 204, 204));
        button1.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N

        button2.setBackground(new java.awt.Color(153, 0, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("DASHBOARD");
        button2.setEffectColor(new java.awt.Color(153, 0, 0));
        button2.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N

        adminpanel.setBackground(new java.awt.Color(153, 0, 0));
        adminpanel.setForeground(new java.awt.Color(255, 255, 255));
        adminpanel.setText("ADMIN PANEL");
        adminpanel.setEffectColor(new java.awt.Color(204, 204, 204));
        adminpanel.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N

        button4.setBackground(new java.awt.Color(153, 0, 0));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("CALENDER");
        button4.setEffectColor(new java.awt.Color(204, 204, 204));
        button4.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N

        button5.setBackground(new java.awt.Color(153, 0, 0));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("ABOUT US");
        button5.setEffectColor(new java.awt.Color(204, 204, 204));
        button5.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Neue Plak Bold", 1, 18)); // NOI18N
        jLabel7.setText("SERVING YOU THE PERFECTION");

        btnverifyuser.setBackground(new java.awt.Color(102, 0, 0));
        btnverifyuser.setForeground(new java.awt.Color(255, 255, 255));
        btnverifyuser.setText("VERIFY USERS");
        btnverifyuser.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N

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

        button3.setBackground(new java.awt.Color(153, 0, 0));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("BILLINGS");
        button3.setEffectColor(new java.awt.Color(204, 204, 204));
        button3.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(153, 0, 0));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("DASHBOARD");
        button6.setEffectColor(new java.awt.Color(153, 0, 0));
        button6.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        adminpanel1.setBackground(new java.awt.Color(153, 0, 0));
        adminpanel1.setForeground(new java.awt.Color(255, 255, 255));
        adminpanel1.setText("ADMIN PANEL");
        adminpanel1.setEffectColor(new java.awt.Color(204, 204, 204));
        adminpanel1.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        adminpanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminpanel1ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(153, 0, 0));
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("SALES");
        button7.setEffectColor(new java.awt.Color(204, 204, 204));
        button7.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(153, 0, 0));
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("ABOUT US");
        button8.setEffectColor(new java.awt.Color(204, 204, 204));
        button8.setFont(new java.awt.Font("Neue Plak Bold", 1, 24)); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menupanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menupanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel3))
                        .addComponent(adminpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(menupanelLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(menupanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menupanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(adminpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 84, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        button10.setBackground(new java.awt.Color(102, 0, 0));
        button10.setForeground(new java.awt.Color(255, 255, 255));
        button10.setText("LOG-OUT");
        button10.setFont(new java.awt.Font("Neotoxic Light", 1, 14)); // NOI18N
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/menu.png"))); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        paneldashboard.setPreferredSize(new java.awt.Dimension(800, 526));

        jLabel9.setFont(new java.awt.Font("Neue Plak Bold", 1, 18)); // NOI18N
        jLabel9.setText("SERVING YOU THE PERFECTION");

        btnverifyuser1.setBackground(new java.awt.Color(102, 0, 0));
        btnverifyuser1.setForeground(new java.awt.Color(255, 255, 255));
        btnverifyuser1.setText("VERIFY USERS");
        btnverifyuser1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Neue Plak Text Bold", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(87, 0, 0));
        jLabel10.setText("DASHBOARD");

        jButton4.setBackground(new java.awt.Color(125, 0, 0));
        jButton4.setFont(new java.awt.Font("Neue Plak Bold", 1, 25)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CATEGORY");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        productbutton.setBackground(new java.awt.Color(125, 0, 0));
        productbutton.setFont(new java.awt.Font("Neue Plak Bold", 1, 25)); // NOI18N
        productbutton.setForeground(new java.awt.Color(255, 255, 255));
        productbutton.setText("PRODUCT");
        productbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        productbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productbuttonActionPerformed(evt);
            }
        });

        productbutton1.setBackground(new java.awt.Color(125, 0, 0));
        productbutton1.setFont(new java.awt.Font("Neue Plak Bold", 1, 25)); // NOI18N
        productbutton1.setForeground(new java.awt.Color(255, 255, 255));
        productbutton1.setText("PLACE ORDER");
        productbutton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        productbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productbutton1ActionPerformed(evt);
            }
        });

        productbutton2.setBackground(new java.awt.Color(125, 0, 0));
        productbutton2.setFont(new java.awt.Font("Neue Plak Bold", 1, 25)); // NOI18N
        productbutton2.setForeground(new java.awt.Color(255, 255, 255));
        productbutton2.setText("VED PROD");
        productbutton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        productbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productbutton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneldashboardLayout = new javax.swing.GroupLayout(paneldashboard);
        paneldashboard.setLayout(paneldashboardLayout);
        paneldashboardLayout.setHorizontalGroup(
            paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneldashboardLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(productbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(productbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnverifyuser1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(53, 53, 53))
        );
        paneldashboardLayout.setVerticalGroup(
            paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(productbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnverifyuser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
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
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneldashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneldashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        paneldashboard.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void adminpanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminpanel1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_adminpanel1ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        new billAndOrder().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new addcategory().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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

    private void productbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productbuttonActionPerformed
        new productpage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_productbuttonActionPerformed

    private void productbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productbutton1ActionPerformed
        new placeorder(email).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_productbutton1ActionPerformed

    private void productbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productbutton2ActionPerformed
        new ved().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_productbutton2ActionPerformed

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
    private dashboard.form.additional additional1;
    private dashboard.swing.Button adminpanel;
    private dashboard.swing.Button adminpanel1;
    private javax.swing.JLayeredPane bg;
    private dashboard.form.billings billings1;
    private dashboard.swing.Button btnverifyuser;
    private dashboard.swing.Button btnverifyuser1;
    private dashboard.swing.Button button1;
    private dashboard.swing.Button button10;
    private dashboard.swing.Button button2;
    private dashboard.swing.Button button3;
    private dashboard.swing.Button button4;
    private dashboard.swing.Button button5;
    private dashboard.swing.Button button6;
    private dashboard.swing.Button button7;
    private dashboard.swing.Button button8;
    private dashboard.swing.Button button9;
    private dashboard.form.foodmenu foodmenu1;
    private javax.swing.JButton jButton4;
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
    private dashboard.form.order order1;
    private javax.swing.JPanel paneldashboard;
    private dashboard.form.pendingorder pendingorder1;
    private javax.swing.JButton productbutton;
    private javax.swing.JButton productbutton1;
    private javax.swing.JButton productbutton2;
    private dashboard.form.tableinfo tableinfo1;
    // End of variables declaration//GEN-END:variables
}
