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
public class FichePatient extends javax.swing.JFrame {

    /**
     * Creates new form FichePatient
     */
    public FichePatient() {
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

        FichePatient = new javax.swing.JPanel();
        InfoPatient = new javax.swing.JPanel();
        infoN = new javax.swing.JLabel();
        infoP = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        infoAdresse = new javax.swing.JLabel();
        infoNumSS = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        date1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        TitrePage = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        LogoMedSolutions = new javax.swing.JLabel();
        LogoCHU = new javax.swing.JLabel();
        DMA = new javax.swing.JPanel();
        DM = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FichePatient.setBackground(new java.awt.Color(255, 255, 255));

        InfoPatient.setBackground(new java.awt.Color(255, 255, 255));
        InfoPatient.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information du patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        infoN.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        infoN.setText("Nom :");

        infoP.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        infoP.setText("Prénom :");

        date.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        date.setText("Date de naissance :");

        infoAdresse.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        infoAdresse.setText("Identifiant IPP");

        infoNumSS.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        infoNumSS.setText("Adresse");

        date1.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        date1.setText("Sexe");

        javax.swing.GroupLayout InfoPatientLayout = new javax.swing.GroupLayout(InfoPatient);
        InfoPatient.setLayout(InfoPatientLayout);
        InfoPatientLayout.setHorizontalGroup(
            InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPatientLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoPatientLayout.createSequentialGroup()
                        .addComponent(date1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(InfoPatientLayout.createSequentialGroup()
                        .addGroup(InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoPatientLayout.createSequentialGroup()
                                .addComponent(date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InfoPatientLayout.createSequentialGroup()
                                .addGroup(InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InfoPatientLayout.createSequentialGroup()
                                        .addComponent(infoAdresse)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(InfoPatientLayout.createSequentialGroup()
                                        .addComponent(infoNumSS)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(InfoPatientLayout.createSequentialGroup()
                        .addComponent(infoN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 59, Short.MAX_VALUE)
                        .addComponent(infoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(88, Short.MAX_VALUE))))
        );
        InfoPatientLayout.setVerticalGroup(
            InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPatientLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoN)
                    .addComponent(infoP)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date1)
                    .addComponent(jTextField6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoAdresse)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoNumSS)
                    .addComponent(jTextField4))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        TitrePage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TitrePage.setForeground(new java.awt.Color(178, 12, 25));
        TitrePage.setText("Princeton Plainsboro - Fiche Patient");

        Retour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Retour.setText("Retour");

        LogoMedSolutions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_medsolutions.png"))); // NOI18N

        LogoCHU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.PNG"))); // NOI18N

        DMA.setBackground(new java.awt.Color(255, 255, 255));
        DMA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        javax.swing.GroupLayout DMALayout = new javax.swing.GroupLayout(DMA);
        DMA.setLayout(DMALayout);
        DMALayout.setHorizontalGroup(
            DMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        DMALayout.setVerticalGroup(
            DMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        DM.setBackground(new java.awt.Color(255, 255, 255));
        DM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        javax.swing.GroupLayout DMLayout = new javax.swing.GroupLayout(DM);
        DM.setLayout(DMLayout);
        DMLayout.setHorizontalGroup(
            DMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        DMLayout.setVerticalGroup(
            DMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FichePatientLayout = new javax.swing.GroupLayout(FichePatient);
        FichePatient.setLayout(FichePatientLayout);
        FichePatientLayout.setHorizontalGroup(
            FichePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FichePatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FichePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FichePatientLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LogoCHU)
                        .addGap(56, 56, 56)
                        .addGroup(FichePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FichePatientLayout.createSequentialGroup()
                                .addComponent(DM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(FichePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Retour)
                                    .addComponent(LogoMedSolutions)))
                            .addComponent(DMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TitrePage, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FichePatientLayout.setVerticalGroup(
            FichePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FichePatientLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(FichePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitrePage)
                    .addComponent(Retour))
                .addGap(50, 50, 50)
                .addComponent(InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FichePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FichePatientLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FichePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FichePatientLayout.createSequentialGroup()
                                .addComponent(LogoMedSolutions)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FichePatientLayout.createSequentialGroup()
                                .addComponent(LogoCHU)
                                .addGap(195, 195, 195))))
                    .addGroup(FichePatientLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(DMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DM;
    private javax.swing.JPanel DMA;
    private javax.swing.JPanel FichePatient;
    private javax.swing.JPanel InfoPatient;
    private javax.swing.JLabel LogoCHU;
    private javax.swing.JLabel LogoMedSolutions;
    private javax.swing.JButton Retour;
    private javax.swing.JLabel TitrePage;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel infoAdresse;
    private javax.swing.JLabel infoN;
    private javax.swing.JLabel infoNumSS;
    private javax.swing.JLabel infoP;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
