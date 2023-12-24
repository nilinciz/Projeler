
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nilin
 */
public class ex4 extends javax.swing.JFrame {

    String metin2 = ""; //global değişken 

    public ex4() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chk_mat = new javax.swing.JCheckBox();
        chk_geo = new javax.swing.JCheckBox();
        chk_biyo = new javax.swing.JCheckBox();
        lbl_ekran = new javax.swing.JLabel();
        btn_goruntule = new javax.swing.JButton();
        btn_goruntule2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chk_mat.setText("Matemaitk");

        chk_geo.setText("Geometri");
        chk_geo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_geoActionPerformed(evt);
            }
        });

        chk_biyo.setText("Biyoloji");

        lbl_ekran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_goruntule.setText("Görüntüle");
        btn_goruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goruntuleActionPerformed(evt);
            }
        });

        btn_goruntule2.setText("Görültüle2");
        btn_goruntule2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goruntule2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chk_mat, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(chk_geo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_biyo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(lbl_ekran, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_goruntule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_goruntule2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(chk_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ekran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_geo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_biyo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_goruntule2))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btn_goruntule)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//kodunu yazmak istediğin şeyin üstüne iki kere tıkla

     void metinekle(javax.swing.JCheckBox chk)
    {
        if (chk.isSelected()) {
            metin2 += chk.getText()+" ";
        }
    }
    String metinal(javax.swing.JCheckBox chk) {
        if (chk.isSelected()) {
            return chk.getText();
        } else {

            return "";
        }
    }

    void metinal2(javax.swing.JCheckBox chk) {
        if (chk.isSelected()) {
            metin2 += chk.getText() + " ";
        }
    }
    private void btn_goruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goruntuleActionPerformed
        /*String metin = "";
        if (chk_mat.isSelected()) {
            metin += chk_mat.getText() + " ";
        }
        if (chk_geo.isSelected()) {
            metin += chk_geo.getText() + " ";

        }
        if (chk_biyo.isSelected()) {
            metin += chk_biyo.getText() + " ";
        }
        lbl_ekran.setText(metin);
       */
        metinal2(chk_mat);
        metinal2(chk_geo);
        metinal2(chk_biyo);
        lbl_ekran.setText(metin2);
 
    }//GEN-LAST:event_btn_goruntuleActionPerformed

    private void chk_geoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_geoActionPerformed
    }//GEN-LAST:event_chk_geoActionPerformed

    private void btn_goruntule2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goruntule2ActionPerformed
          metin2="";
        metinekle(chk_mat);
        metinekle(chk_geo);
        metinekle(chk_biyo);
        lbl_ekran.setText(metin2);


    }//GEN-LAST:event_btn_goruntule2ActionPerformed

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
            java.util.logging.Logger.getLogger(ex4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ex4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ex4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ex4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ex4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goruntule;
    private javax.swing.JButton btn_goruntule2;
    private javax.swing.JCheckBox chk_biyo;
    private javax.swing.JCheckBox chk_geo;
    private javax.swing.JCheckBox chk_mat;
    private javax.swing.JLabel lbl_ekran;
    // End of variables declaration//GEN-END:variables
}
