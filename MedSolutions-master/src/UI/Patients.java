/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author emmat
 */
public class Patients extends javax.swing.JFrame {

    /**
     * Creates new form Patients
     */
    public Patients() {
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

        Patients = new javax.swing.JPanel();
        ListePatientPanel = new javax.swing.JScrollPane();
        ListePtable = new javax.swing.JTable();
        AjouterPatient = new javax.swing.JButton();
        LogoMedSolutions = new javax.swing.JLabel();
        LogoCHU = new javax.swing.JLabel();
        RechercherPatient = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        TitrePage = new javax.swing.JLabel();
        Infos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Patients.setBackground(new java.awt.Color(255, 255, 255));
        Patients.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Patients.setToolTipText("");

        ListePtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nom", "Prénom", "Identifiant IPP", "Sexe", "Date de naissance", "Adresse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListePatientPanel.setViewportView(ListePtable);

        AjouterPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AjouterPatient.setText("Ajouter un patient");
        AjouterPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterPatientActionPerformed(evt);
            }
        });

        LogoMedSolutions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_medsolutions.png"))); // NOI18N

        LogoCHU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.PNG"))); // NOI18N

        RechercherPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RechercherPatient.setText("Rechercher un patient");
        RechercherPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercherPatientActionPerformed(evt);
            }
        });

        Retour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Retour.setText("Retour");

        TitrePage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TitrePage.setForeground(new java.awt.Color(178, 12, 25));
        TitrePage.setText("Princeton Plainsboro - Patients");

        Infos.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Infos.setText("Pour consulter une fiche patient veuillez double-cliquer sur un patient dans le tableau");

        javax.swing.GroupLayout PatientsLayout = new javax.swing.GroupLayout(Patients);
        Patients.setLayout(PatientsLayout);
        PatientsLayout.setHorizontalGroup(
            PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientsLayout.createSequentialGroup()
                        .addComponent(LogoCHU)
                        .addGap(44, 44, 44)
                        .addGroup(PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PatientsLayout.createSequentialGroup()
                                .addComponent(AjouterPatient)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientsLayout.createSequentialGroup()
                                .addGroup(PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PatientsLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(RechercherPatient))
                                    .addComponent(Infos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                    .addComponent(ListePatientPanel))
                                .addGap(17, 17, 17)))
                        .addComponent(LogoMedSolutions))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientsLayout.createSequentialGroup()
                        .addComponent(TitrePage, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Retour)
                        .addContainerGap())))
        );
        PatientsLayout.setVerticalGroup(
            PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientsLayout.createSequentialGroup()
                        .addGroup(PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Retour)
                            .addComponent(TitrePage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoMedSolutions))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientsLayout.createSequentialGroup()
                        .addGap(0, 82, Short.MAX_VALUE)
                        .addComponent(RechercherPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PatientsLayout.createSequentialGroup()
                                .addComponent(ListePatientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Infos)
                                .addGap(28, 28, 28)
                                .addComponent(AjouterPatient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                            .addComponent(LogoCHU))
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Patients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Patients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AjouterPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterPatientActionPerformed
        // TODO add your handling code here:
        AjouterPatient ajouterPatient = new AjouterPatient();
        ajouterPatient.setVisible(true);
        this.hide();
    }//GEN-LAST:event_AjouterPatientActionPerformed

    private void RechercherPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherPatientActionPerformed
        // TODO add your handling code here:
        RechercherPatient rechercherPatient = new RechercherPatient();
        rechercherPatient.setVisible(true);
        this.hide();
    }//GEN-LAST:event_RechercherPatientActionPerformed

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
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterPatient;
    private javax.swing.JLabel Infos;
    private javax.swing.JScrollPane ListePatientPanel;
    private javax.swing.JTable ListePtable;
    private javax.swing.JLabel LogoCHU;
    private javax.swing.JLabel LogoMedSolutions;
    private javax.swing.JPanel Patients;
    private javax.swing.JButton RechercherPatient;
    private javax.swing.JButton Retour;
    private javax.swing.JLabel TitrePage;
    // End of variables declaration//GEN-END:variables
}
