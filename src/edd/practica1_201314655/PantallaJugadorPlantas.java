/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd.practica1_201314655;

/**
 *
 * @author Personal
 */
public class PantallaJugadorPlantas extends javax.swing.JFrame {

    /**
     * Creates new form PantallaJugadorPlantas
     */
    public PantallaJugadorPlantas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("PanelJugadorPlantas"); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/practica1_201314655/Images/planta-4.png"))); // NOI18N
        jLabel1.setName("lblPlanta"); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 222, 300);
        jLabel1.getAccessibleContext().setAccessibleName("lblPlanta");

        jLabel2.setFont(new java.awt.Font("Aharoni", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jugador Plantas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 30, 180, 30);

        jLabel3.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jLabel3.setName("lblNombre"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 80, 90, 15);
        jLabel3.getAccessibleContext().setAccessibleName("lblNombre");

        jLabel4.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de Plantas:");
        jLabel4.setName("lblCantidad"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 140, 150, 15);
        jLabel4.getAccessibleContext().setAccessibleName("lblCantidad");

        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextField1.setName("txtNombre"); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 100, 200, 30);
        jTextField1.getAccessibleContext().setAccessibleName("txtNombre");

        jTextField3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextField3.setName("txtCantidadPlantas"); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(250, 160, 200, 30);
        jTextField3.getAccessibleContext().setAccessibleName("txtCantidadPlantas");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.setName("btnNextPlantas"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 250, 90, 30);
        jButton1.getAccessibleContext().setAccessibleName("btnNextPlantas");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Aharoni", 0, 13)); // NOI18N
        jButton2.setText("Agregar Campo");
        jButton2.setName("btnAgregarCampoPlanta"); // NOI18N
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 200, 140, 30);
        jButton2.getAccessibleContext().setAccessibleName("btnAgregarCampoPlanta");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 300));
        jPanel1.getAccessibleContext().setAccessibleName("PanelJugadorPlantas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new AgregarPlantas().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaJugadorPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaJugadorPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaJugadorPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaJugadorPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaJugadorPlantas().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
