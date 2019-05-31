package pbominggu12.form;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pbominggu12.dao.IjazahDao;
import pbominggu12.dao.MahasiswaDao;
import pbominggu12.entity.Ijazah;
import pbominggu12.lib.ManajerKoneksi;

public class FormIjazah extends javax.swing.JFrame {

    private DefaultTableModel tableModelIjazah;
    
    public FormIjazah() {
        initComponents();
        
        // Membuat Table Model
        String[] daftarNamaKolom = new String[]{"NIM", "Tanggal Lulus", "Nilai", "Predikat"};
        int jmlhBarisAwal = 0;
        this.tableModelIjazah = new DefaultTableModel(daftarNamaKolom, jmlhBarisAwal);
        
        this.tableIjazah.setModel(this.tableModelIjazah);
        
        ManajerKoneksi.getKoneksi();
        this.tableModelIjazah.setRowCount(0);
        
        IjazahDao id = new IjazahDao();
        
        ArrayList<Ijazah> semuaIjz = null;
        
        try 
        {
            semuaIjz = id.ambilSemuaData();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Ijazah i : semuaIjz)
        {
            Object[] baris = new Object[]
            {
                i.getNim(),
                i.getTanggal_lulus(),
                i.getNilai(),
                i.getPredikat()
            };
            
            this.tableModelIjazah.addRow(baris);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableIjazah = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tglLulus = new javax.swing.JTextField();
        nilai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        predikat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nim = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableIjazah.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableIjazah);

        jLabel1.setText("NIM");

        jLabel2.setText("Tanggal Lulus");

        tglLulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglLulusActionPerformed(evt);
            }
        });

        jLabel3.setText("Nilai");

        jLabel4.setText("Predikat");

        jButton1.setText("Input");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tglLulus)
                            .addComponent(nilai)
                            .addComponent(predikat)
                            .addComponent(nim, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tglLulus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(predikat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tglLulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglLulusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglLulusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ManajerKoneksi.getKoneksi();
        
        IjazahDao id = new IjazahDao();
        
        if(nim.getText().equals("") && tglLulus.getText().equals("") && nilai.getText().equals("") && predikat.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Data kosong!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Integer dapatNim = Integer.parseInt(nim.getText());
            String dapatTgl = tglLulus.getText();
            float dapatNilai = Float.parseFloat(nilai.getText());
            String dapatPredikat = predikat.getText();
            
            Ijazah ijz = new Ijazah();
            
            ijz.setNim(dapatNim);
            ijz.setTanggal_lulus(dapatTgl);
            ijz.setNilai(dapatNilai);
            ijz.setPredikat(dapatPredikat);
            
            try 
            {
                id.insertData(ijz);
                JOptionPane.showMessageDialog(this, "Input Berhasil!", "Message", 
                        JOptionPane.INFORMATION_MESSAGE);
                this.jButton2ActionPerformed(evt);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(this, "input tidak bisa dilakukan!", "Peringatan", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ManajerKoneksi.getKoneksi();
        this.tableModelIjazah.setRowCount(0);
        
        IjazahDao id = new IjazahDao();
        
        ArrayList<Ijazah> semuaIjz = null;
        
        try 
        {
            semuaIjz = id.ambilSemuaData();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Ijazah i : semuaIjz)
        {
            Object[] baris = new Object[]
            {
                i.getNim(),
                i.getTanggal_lulus(),
                i.getNilai(),
                i.getPredikat()
            };
            
            this.tableModelIjazah.addRow(baris);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormIjazah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIjazah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIjazah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIjazah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIjazah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nilai;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField predikat;
    private javax.swing.JTable tableIjazah;
    private javax.swing.JTextField tglLulus;
    // End of variables declaration//GEN-END:variables
}
