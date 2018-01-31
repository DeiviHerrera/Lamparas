
package gui;

import controladoras.LamparasDAO;
import javax.swing.JOptionPane;


public class FrmDescuentos extends javax.swing.JFrame {

  
    public FrmDescuentos() {
        initComponents();
        
          txt_1a5lamaparas.setText((int)LamparasDAO.porcentaje1+"");
          txt_5a10lamaparas.setText(LamparasDAO.porcentaje2+"");
          txt_11a15lamaparas.setText(LamparasDAO.porcentaje3+"");
          txt_15amaslamaparas.setText(LamparasDAO.porcentaje4+"");
        
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_1a5lamaparas = new javax.swing.JTextField();
        txt_5a10lamaparas = new javax.swing.JTextField();
        txt_11a15lamaparas = new javax.swing.JTextField();
        txt_15amaslamaparas = new javax.swing.JTextField();
        btn_grabar = new javax.swing.JButton();
        btn_cerar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("6 a 10 lamparas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("11 a 15 lamparas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("15 a mas lamparas");

        txt_1a5lamaparas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txt_5a10lamaparas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txt_11a15lamaparas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txt_15amaslamaparas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btn_grabar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_grabar.setText("Grabar");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        btn_cerar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_cerar.setText("Cerrar");
        btn_cerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("1 a 5 lamparas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_5a10lamaparas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_1a5lamaparas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_11a15lamaparas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_15amaslamaparas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cerar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_1a5lamaparas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_5a10lamaparas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_11a15lamaparas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cerar)
                        .addGap(32, 32, 32)
                        .addComponent(btn_grabar)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_15amaslamaparas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed

        LamparasDAO.porcentaje1=Double.parseDouble(txt_1a5lamaparas.getText());
        LamparasDAO.porcentaje2=Double.parseDouble(txt_5a10lamaparas.getText());
        LamparasDAO.porcentaje3=Double.parseDouble(txt_11a15lamaparas.getText());
        LamparasDAO.porcentaje4=Double.parseDouble(txt_15amaslamaparas.getText());
        
        JOptionPane.showMessageDialog(this,"Grabo con exito");
   
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void btn_cerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_cerarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDescuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDescuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDescuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDescuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDescuentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerar;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_11a15lamaparas;
    private javax.swing.JTextField txt_15amaslamaparas;
    private javax.swing.JTextField txt_1a5lamaparas;
    private javax.swing.JTextField txt_5a10lamaparas;
    // End of variables declaration//GEN-END:variables
}
