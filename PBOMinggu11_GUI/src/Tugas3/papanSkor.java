package Tugas3;

/**
 * 
 * @author Greggy Gianini Firmansyah (1741720088 / TI-2F / 10)
 */

public class papanSkor extends javax.swing.JFrame 
{   
    int angkaSkorA;
    int angkaSkorB;
    
    public papanSkor() 
    {
        initComponents();
    }
    
    public void cariKedudukan(int skorA, int skorB)
    {
        this.angkaSkorA = Integer.parseInt(skorTimA.getText()); 
        this.angkaSkorB = Integer.parseInt(skorTimB.getText());
        
        skorA = this.angkaSkorA;
        skorB = this.angkaSkorB;
        
        if(skorA < skorB)
        {
            hasil.setText("Tim B Unggul");
        }
        else if(skorA == skorB)
        {
            hasil.setText("Imbang");
        }
        else if(skorA > skorB)
        {
            hasil.setText("Tim A Unggul");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTimA = new javax.swing.JLabel();
        labelTimB = new javax.swing.JLabel();
        tigaPoinA = new javax.swing.JButton();
        duaPoinA = new javax.swing.JButton();
        satuPoinA = new javax.swing.JButton();
        tigaPoinB = new javax.swing.JButton();
        duaPoinB = new javax.swing.JButton();
        satuPoinB = new javax.swing.JButton();
        hasil = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        skorTimA = new javax.swing.JTextField();
        skorTimB = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTimA.setText("Tim A");

        labelTimB.setText("Tim B");

        tigaPoinA.setBackground(new java.awt.Color(0, 102, 204));
        tigaPoinA.setForeground(new java.awt.Color(255, 255, 255));
        tigaPoinA.setText("3 POIN");
        tigaPoinA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaPoinAActionPerformed(evt);
            }
        });

        duaPoinA.setBackground(new java.awt.Color(0, 153, 0));
        duaPoinA.setForeground(new java.awt.Color(255, 255, 255));
        duaPoinA.setText("2 POIN");
        duaPoinA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaPoinAActionPerformed(evt);
            }
        });

        satuPoinA.setBackground(new java.awt.Color(204, 204, 0));
        satuPoinA.setForeground(new java.awt.Color(0, 0, 0));
        satuPoinA.setText("1 POIN");
        satuPoinA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuPoinAActionPerformed(evt);
            }
        });

        tigaPoinB.setBackground(new java.awt.Color(0, 102, 204));
        tigaPoinB.setForeground(new java.awt.Color(255, 255, 255));
        tigaPoinB.setText("3 POIN");
        tigaPoinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaPoinBActionPerformed(evt);
            }
        });

        duaPoinB.setBackground(new java.awt.Color(0, 153, 0));
        duaPoinB.setForeground(new java.awt.Color(255, 255, 255));
        duaPoinB.setText("2 POIN");
        duaPoinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaPoinBActionPerformed(evt);
            }
        });

        satuPoinB.setBackground(new java.awt.Color(204, 204, 0));
        satuPoinB.setForeground(new java.awt.Color(0, 0, 0));
        satuPoinB.setText("1 POIN");
        satuPoinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuPoinBActionPerformed(evt);
            }
        });

        hasil.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasil.setText("Imbang");

        reset.setBackground(new java.awt.Color(255, 0, 0));
        reset.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        reset.setText("RESET");
        reset.setBorderPainted(false);
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        skorTimA.setEditable(false);
        skorTimA.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        skorTimA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        skorTimA.setText("0");
        skorTimA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skorTimAActionPerformed(evt);
            }
        });

        skorTimB.setEditable(false);
        skorTimB.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        skorTimB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        skorTimB.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(satuPoinA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(satuPoinB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(duaPoinA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(duaPoinB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tigaPoinA)
                            .addComponent(skorTimA, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(skorTimB)
                            .addComponent(tigaPoinB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelTimA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTimB)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTimA)
                    .addComponent(labelTimB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(skorTimB, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(skorTimA))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tigaPoinA)
                    .addComponent(tigaPoinB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duaPoinA)
                    .addComponent(duaPoinB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(satuPoinA)
                    .addComponent(satuPoinB))
                .addGap(18, 18, 18)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tigaPoinAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaPoinAActionPerformed
        
        this.angkaSkorA += 3;
        
        skorTimA.setText("" + this.angkaSkorA);
        
        cariKedudukan(this.angkaSkorA,this.angkaSkorB);
        
    }//GEN-LAST:event_tigaPoinAActionPerformed

    private void skorTimAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skorTimAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skorTimAActionPerformed

    private void duaPoinAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaPoinAActionPerformed
        this.angkaSkorA += 2;
        
        skorTimA.setText("" + this.angkaSkorA);
        
        cariKedudukan(this.angkaSkorA,this.angkaSkorB);
    }//GEN-LAST:event_duaPoinAActionPerformed

    private void satuPoinAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuPoinAActionPerformed
        this.angkaSkorA += 1;
        
        skorTimA.setText("" + this.angkaSkorA);
        
        cariKedudukan(this.angkaSkorA,this.angkaSkorB);
    }//GEN-LAST:event_satuPoinAActionPerformed

    private void tigaPoinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaPoinBActionPerformed
        this.angkaSkorB += 3;
        
        skorTimB.setText("" + this.angkaSkorB);
        
        cariKedudukan(this.angkaSkorA,this.angkaSkorB);
    }//GEN-LAST:event_tigaPoinBActionPerformed

    private void duaPoinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaPoinBActionPerformed
        this.angkaSkorB += 2;
        
        skorTimB.setText("" + this.angkaSkorB);
        
        cariKedudukan(this.angkaSkorA,this.angkaSkorB);
    }//GEN-LAST:event_duaPoinBActionPerformed

    private void satuPoinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuPoinBActionPerformed
        this.angkaSkorB += 1;
        
        skorTimB.setText("" + this.angkaSkorB);
        
        cariKedudukan(this.angkaSkorA,this.angkaSkorB);
    }//GEN-LAST:event_satuPoinBActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        this.angkaSkorA = 0;
        this.angkaSkorB = 0;
        skorTimA.setText("0");
        skorTimB.setText("0");
        hasil.setText("Imbang");
    }//GEN-LAST:event_resetActionPerformed
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
            java.util.logging.Logger.getLogger(papanSkor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(papanSkor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(papanSkor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(papanSkor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new papanSkor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton duaPoinA;
    private javax.swing.JButton duaPoinB;
    private javax.swing.JLabel hasil;
    private javax.swing.JLabel labelTimA;
    private javax.swing.JLabel labelTimB;
    private javax.swing.JButton reset;
    private javax.swing.JButton satuPoinA;
    private javax.swing.JButton satuPoinB;
    private javax.swing.JTextField skorTimA;
    private javax.swing.JTextField skorTimB;
    private javax.swing.JButton tigaPoinA;
    private javax.swing.JButton tigaPoinB;
    // End of variables declaration//GEN-END:variables
}
