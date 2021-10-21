/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package enchere.vue;

import enchere.controler.GestionMembresControler;
import enchere.model.Membre;
import enchere.model.MembreServiceCommercial;
import java.util.ArrayList;

/**
 *
 * @author joohyunann
 */
public class Index extends javax.swing.JFrame {
    private GestionMembresControler membreControler;
    private Membre membre;
    private javax.swing.JLabel jLabelPrenom;
    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
        membreControler = new GestionMembresControler();
        jButtonStats.setVisible(false);
    }
    
    public Index(Membre membre){
        initComponents();
        jButtonConnexion.setVisible(false);
        jButtonSinscrire.setVisible(false);
        this.membre = membre;
        jButtonStats.setVisible(false);
        
        if(membre instanceof MembreServiceCommercial){
            System.out.println("fff");
            jButtonStats.setVisible(true);
        }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelAccueil = new javax.swing.JPanel();
        jButtonConnexion = new javax.swing.JButton();
        jButtonSinscrire = new javax.swing.JButton();
        jButtonConsulteEncheres = new javax.swing.JButton();
        jButtonStats = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonConnexion.setText("Connexion");
        jButtonConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnexionActionPerformed(evt);
            }
        });

        jButtonSinscrire.setText("S'inscrire");
        jButtonSinscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSinscrireActionPerformed(evt);
            }
        });

        jButtonConsulteEncheres.setText("Consulter toutes les encheres en cours");
        jButtonConsulteEncheres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulteEncheresActionPerformed(evt);
            }
        });

        jButtonStats.setText("Consulter les statistiques");
        jButtonStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAccueilLayout = new javax.swing.GroupLayout(jPanelAccueil);
        jPanelAccueil.setLayout(jPanelAccueilLayout);
        jPanelAccueilLayout.setHorizontalGroup(
            jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccueilLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButtonConsulteEncheres)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccueilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccueilLayout.createSequentialGroup()
                        .addGroup(jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAccueilLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonSinscrire))
                            .addComponent(jButtonConnexion))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccueilLayout.createSequentialGroup()
                        .addComponent(jButtonStats)
                        .addGap(79, 79, 79))))
        );
        jPanelAccueilLayout.setVerticalGroup(
            jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccueilLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButtonConnexion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSinscrire)
                .addGap(37, 37, 37)
                .addComponent(jButtonConsulteEncheres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonStats)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsulteEncheresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulteEncheresActionPerformed
        ConsulterEncheres consulterEncheres;
        if(membre!=null){
            consulterEncheres = new ConsulterEncheres(membre);
        }else{
            consulterEncheres = new ConsulterEncheres();
        }
        consulterEncheres.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonConsulteEncheresActionPerformed

    private void jButtonConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnexionActionPerformed

        Connexion c = new Connexion();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonConnexionActionPerformed

    private void jButtonSinscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSinscrireActionPerformed
        Inscription inscription = new Inscription();
        inscription.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSinscrireActionPerformed

    private void jButtonStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStatsActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnexion;
    private javax.swing.JButton jButtonConsulteEncheres;
    private javax.swing.JButton jButtonSinscrire;
    private javax.swing.JButton jButtonStats;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAccueil;
    // End of variables declaration//GEN-END:variables
}

