
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


public class Tekrar_bi extends javax.swing.JFrame {

    /**
     * Creates new form Tekrar_bi
     */
    public Tekrar_bi() {
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

        lb_sayi1 = new javax.swing.JLabel();
        lb_sayi2 = new javax.swing.JLabel();
        txt_sayi1 = new javax.swing.JTextField();
        txt_sayi2 = new javax.swing.JTextField();
        btn_hesapla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_sayi1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lb_sayi1.setText("Sayı 1: ");

        lb_sayi2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lb_sayi2.setText("Sayı 2 :");

        txt_sayi1.setText(" ");
        txt_sayi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sayi1ActionPerformed(evt);
            }
        });

        txt_sayi2.setText(" ");

        btn_hesapla.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_hesapla.setText("Hesapla");
        btn_hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hesaplaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_sayi2)
                            .addComponent(lb_sayi1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sayi2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(txt_sayi1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btn_hesapla)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_sayi1)
                    .addComponent(txt_sayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_sayi2)
                    .addComponent(txt_sayi2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btn_hesapla)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sayi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sayi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sayi1ActionPerformed

    private void btn_hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hesaplaActionPerformed
        int sayi1= Integer.parseInt(txt_sayi1.getText()); //normalde integeer parseint olmasa 
       //int olarak alamadığmız için bu ifade gerekli
       int sayi2=Integer.parseInt(txt_sayi2.getText());
       int toplam = sayi1 + sayi2;
        JOptionPane.showMessageDialog(null, toplam);
    }//GEN-LAST:event_btn_hesaplaActionPerformed

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
            java.util.logging.Logger.getLogger(Tekrar_bi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tekrar_bi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tekrar_bi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tekrar_bi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tekrar_bi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hesapla;
    private javax.swing.JLabel lb_sayi1;
    private javax.swing.JLabel lb_sayi2;
    private javax.swing.JTextField txt_sayi1;
    private javax.swing.JTextField txt_sayi2;
    // End of variables declaration//GEN-END:variables
}