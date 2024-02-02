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
public class AjouterPatient extends javax.swing.JFrame {

    /**
     * Creates new form AjouterPatient
     */
    public AjouterPatient() {
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

        AjouterPatient = new javax.swing.JPanel();
        TitrePage = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        NomTextField = new javax.swing.JTextField();
        Prenom = new javax.swing.JLabel();
        PrenomTextField = new javax.swing.JTextField();
        DateNaissance = new javax.swing.JLabel();
        DateNaisanceTextField = new javax.swing.JTextField();
        NumIPP = new javax.swing.JLabel();
        NumIPPTextField = new javax.swing.JTextField();
        Adresse = new javax.swing.JLabel();
        NumTextField = new javax.swing.JTextField();
        Numero = new javax.swing.JLabel();
        CodePostal = new javax.swing.JLabel();
        CodePostalTextField = new javax.swing.JTextField();
        Rue = new javax.swing.JLabel();
        VilleTextField = new javax.swing.JTextField();
        Ville = new javax.swing.JLabel();
        RueTextField = new javax.swing.JTextField();
        Valider = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        LogoMedSolutions = new javax.swing.JLabel();
        LogoCHU = new javax.swing.JLabel();
        Sexe = new javax.swing.JLabel();
        SexeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AjouterPatient.setBackground(new java.awt.Color(255, 255, 255));

        TitrePage.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        TitrePage.setForeground(new java.awt.Color(178, 12, 25));
        TitrePage.setText("Princeton Plainsboro - Ajouter un patient");

        Nom.setText("Nom");

        NomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomTextFieldActionPerformed(evt);
            }
        });

        Prenom.setText("Prénom");

        PrenomTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        PrenomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenomTextFieldActionPerformed(evt);
            }
        });

        DateNaissance.setText("Date de naissance");

        DateNaisanceTextField.setText("JJ/MM/AAAA");
        DateNaisanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateNaisanceTextFieldActionPerformed(evt);
            }
        });

        NumIPP.setText("N° IPP  ");

        NumIPPTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumIPPTextFieldActionPerformed(evt);
            }
        });

        Adresse.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Adresse.setText("Adresse");

        NumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTextFieldActionPerformed(evt);
            }
        });

        Numero.setText("N°");

        CodePostal.setText("Code Postal");

        CodePostalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodePostalTextFieldActionPerformed(evt);
            }
        });

        Rue.setText("Rue");

        VilleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VilleTextFieldActionPerformed(evt);
            }
        });

        Ville.setText("Ville");

        Valider.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        Annuler.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Annuler.setText("Annuler");
        Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnnulerMouseClicked(evt);
            }
        });
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });

        Retour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Retour.setText("Retour");

        LogoMedSolutions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/image/logo_medsolutions.png"))); // NOI18N

        LogoCHU.setIcon(new javax.swing.ImageIcon("C:\\Users\\emmat\\Documents\\TIS4\\Projet\\MedSolutions\\MedSolutions\\src\\images\\logo.PNG")); // NOI18N
        LogoCHU.setPreferredSize(new java.awt.Dimension(250, 414));

        Sexe.setText("Sexe");

        SexeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexeTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AjouterPatientLayout = new javax.swing.GroupLayout(AjouterPatient);
        AjouterPatient.setLayout(AjouterPatientLayout);
        AjouterPatientLayout.setHorizontalGroup(
            AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjouterPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AjouterPatientLayout.createSequentialGroup()
                        .addComponent(LogoMedSolutions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Adresse)
                            .addGroup(AjouterPatientLayout.createSequentialGroup()
                                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumIPP)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPatientLayout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CodePostal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Sexe)
                                        .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumIPPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AjouterPatientLayout.createSequentialGroup()
                                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(NomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CodePostalTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(NumTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(SexeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Annuler, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AjouterPatientLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(AjouterPatientLayout.createSequentialGroup()
                                                            .addComponent(Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(PrenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(AjouterPatientLayout.createSequentialGroup()
                                                            .addComponent(DateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(DateNaisanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(AjouterPatientLayout.createSequentialGroup()
                                                        .addComponent(Rue, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(VilleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(RueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(74, 74, 74)))
                                                .addGap(0, 149, Short.MAX_VALUE))
                                            .addGroup(AjouterPatientLayout.createSequentialGroup()
                                                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(AjouterPatientLayout.createSequentialGroup()
                                                        .addGap(25, 25, 25)
                                                        .addComponent(Ville, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(AjouterPatientLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Valider)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LogoCHU, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPatientLayout.createSequentialGroup()
                        .addComponent(TitrePage, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Retour)))
                .addContainerGap())
        );

        AjouterPatientLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CodePostalTextField, DateNaisanceTextField, NomTextField, NumIPPTextField, PrenomTextField, RueTextField, SexeTextField, VilleTextField});

        AjouterPatientLayout.setVerticalGroup(
            AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjouterPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Retour)
                    .addComponent(TitrePage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Prenom)
                        .addComponent(PrenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Nom, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPatientLayout.createSequentialGroup()
                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateNaissance)
                            .addComponent(DateNaisanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SexeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sexe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumIPP)
                            .addComponent(NumIPPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AjouterPatientLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Numero))
                            .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rue)
                                .addComponent(NumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPatientLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CodePostalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ville)
                                    .addComponent(VilleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AjouterPatientLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodePostal)))
                        .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AjouterPatientLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(AjouterPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Annuler)
                                    .addComponent(Valider))
                                .addContainerGap(100, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPatientLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LogoMedSolutions)
                                .addGap(22, 22, 22))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPatientLayout.createSequentialGroup()
                        .addComponent(LogoCHU, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        AjouterPatientLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CodePostalTextField, DateNaisanceTextField, NomTextField, NumIPPTextField, PrenomTextField, RueTextField, SexeTextField, VilleTextField});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(AjouterPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(AjouterPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomTextFieldActionPerformed

    private void DateNaisanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateNaisanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateNaisanceTextFieldActionPerformed

    private void NumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumTextFieldActionPerformed

    private void VilleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VilleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VilleTextFieldActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        //Vérification que tous les champs sont remplis
    }//GEN-LAST:event_ValiderActionPerformed

    private void AnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnulerMouseClicked

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed

        Patients p = new Patients();
        p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void SexeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexeTextFieldActionPerformed

    private void CodePostalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodePostalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodePostalTextFieldActionPerformed

    private void NumIPPTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumIPPTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumIPPTextFieldActionPerformed

    private void PrenomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AjouterPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adresse;
    private javax.swing.JPanel AjouterPatient;
    private javax.swing.JButton Annuler;
    private javax.swing.JLabel CodePostal;
    private javax.swing.JTextField CodePostalTextField;
    private javax.swing.JTextField DateNaisanceTextField;
    private javax.swing.JLabel DateNaissance;
    private javax.swing.JLabel LogoCHU;
    private javax.swing.JLabel LogoMedSolutions;
    private javax.swing.JLabel Nom;
    private javax.swing.JTextField NomTextField;
    private javax.swing.JLabel NumIPP;
    private javax.swing.JTextField NumIPPTextField;
    private javax.swing.JTextField NumTextField;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Prenom;
    private javax.swing.JTextField PrenomTextField;
    private javax.swing.JButton Retour;
    private javax.swing.JLabel Rue;
    private javax.swing.JTextField RueTextField;
    private javax.swing.JLabel Sexe;
    private javax.swing.JTextField SexeTextField;
    private javax.swing.JLabel TitrePage;
    private javax.swing.JButton Valider;
    private javax.swing.JLabel Ville;
    private javax.swing.JTextField VilleTextField;
    // End of variables declaration//GEN-END:variables
}
