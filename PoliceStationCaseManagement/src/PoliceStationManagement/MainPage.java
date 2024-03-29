/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoliceStationManagement;
import SQLPackage.*;
/**
 *
 * @author Lenovo
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        setTitle("Police Station Case Management System");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReportButton = new javax.swing.JButton();
        databaseGoButton = new javax.swing.JButton();
        databaseComboBox = new javax.swing.JComboBox<>();
        databseLabel = new javax.swing.JLabel();
        InfoGoButton = new javax.swing.JButton();
        informationComboBox = new javax.swing.JComboBox<>();
        informationLabel = new javax.swing.JLabel();
        MainLabel = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 885));
        getContentPane().setLayout(null);

        ReportButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ReportButton.setText("REPORT");
        ReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReportButton);
        ReportButton.setBounds(580, 650, 180, 60);

        databaseGoButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        databaseGoButton.setText("Go");
        databaseGoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseGoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(databaseGoButton);
        databaseGoButton.setBounds(940, 540, 93, 40);

        databaseComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        databaseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--","Police Station", "Victim", "Accused", "Witness","Evidence","Case","Police Officer","All" }));
        databaseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(databaseComboBox);
        databaseComboBox.setBounds(560, 540, 230, 40);

        databseLabel.setFont(new java.awt.Font("Adobe Arabic", 1, 48)); // NOI18N
        databseLabel.setForeground(new java.awt.Color(240, 240, 240));
        databseLabel.setText("Directory");
        getContentPane().add(databseLabel);
        databseLabel.setBounds(150, 530, 310, 50);

        InfoGoButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        InfoGoButton.setText("Go");
        InfoGoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoGoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InfoGoButton);
        InfoGoButton.setBounds(940, 450, 93, 40);

        informationComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        informationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--","Victim", "Accused", "Witness","Evidence","Case"}));
        informationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(informationComboBox);
        informationComboBox.setBounds(560, 450, 230, 40);

        informationLabel.setFont(new java.awt.Font("Adobe Arabic", 1, 48)); // NOI18N
        informationLabel.setForeground(new java.awt.Color(255, 255, 255));
        informationLabel.setText("Information");
        getContentPane().add(informationLabel);
        informationLabel.setBounds(100, 440, 400, 60);

        MainLabel.setFont(new java.awt.Font("Californian FB", 1, 48)); // NOI18N
        MainLabel.setForeground(new java.awt.Color(255, 255, 255));
        MainLabel.setText("Police Station Case Management System");
        getContentPane().add(MainLabel);
        MainLabel.setBounds(240, 280, 850, 100);

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
        LogoLabel.setText("jLabel2");
        getContentPane().add(LogoLabel);
        LogoLabel.setBounds(520, 30, 210, 260);

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/bg_pic.jpg"))); // NOI18N
        bgLabel.setText("jLabel1");
        getContentPane().add(bgLabel);
        bgLabel.setBounds(-220, 0, 1500, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoGoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoGoButtonActionPerformed
        // TODO add your handling code here:
       Object selectedItem =  informationComboBox.getSelectedItem();
       if(selectedItem.toString() == "Victim")
       {
           VictimPage vObj = new VictimPage();
           vObj.show();
           this.setVisible(false);
           
       }
     
       if(selectedItem.toString() == "Accused")
       {
           AccusedJFrame AccusedObj = new AccusedJFrame ();
           AccusedObj.show();
           this.setVisible(false);
           
       }
       if(selectedItem.toString() == "Witness")
       {
           WitnessForm WitnessObj = new WitnessForm();
           WitnessObj.show();
           this.setVisible(false);
           
       }
       if(selectedItem.toString() == "Evidence")
       {
           EvidenceForm EvidenceObj = new EvidenceForm();
           EvidenceObj.show();
           this.setVisible(false);
           
       }
       if(selectedItem.toString() == "Case")
       {
           CaseForm CaseObj = new CaseForm();
           CaseObj.show();
           this.setVisible(false);
           
       }
       
       
       
    }//GEN-LAST:event_InfoGoButtonActionPerformed

    private void informationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_informationComboBoxActionPerformed

    private void databaseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_databaseComboBoxActionPerformed

    private void databaseGoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseGoButtonActionPerformed
        // TODO add your handling code here:
        Object selectedItem =  databaseComboBox.getSelectedItem();
       if(selectedItem.toString() == "Police Station")
       {
           PoliceStationTable psTObj = new PoliceStationTable();
           psTObj.show();
           this.setVisible(false);
           
       }
       if(selectedItem.toString() == "Victim")
       {
           VictimTable vTObj = new VictimTable();
           vTObj.show();
           this.setVisible(false);
           
       }
        if(selectedItem.toString() == "Police Officer")
       {
           PoliceOfficerTable poTObj = new PoliceOfficerTable();
           poTObj.show();
           this.setVisible(false);
           
       }
          if(selectedItem.toString() == "Accused")
       {
           AccusedTable AccusedTObj = new AccusedTable();
           AccusedTObj.show();
           this.setVisible(false);
           
       }
       if(selectedItem.toString() == "Witness")
       {
           WitnessTableJframe WitnessTObj = new WitnessTableJframe();
           WitnessTObj.show();
           this.setVisible(false);
           
       }
       if(selectedItem.toString() == "Evidence")
       {
           EvidenceTable EvidenceTObj = new EvidenceTable();
           EvidenceTObj.show();
           this.setVisible(false);
           
       }
       if(selectedItem.toString() == "Case")
       {
           CaseTable CaseTObj = new CaseTable();
           CaseTObj.show();
           this.setVisible(false);
           
       }
       if(selectedItem.toString() == "All")
       {
           All AllTObj = new All();
           AllTObj.show();
           this.setVisible(false);
           
       }
    }//GEN-LAST:event_databaseGoButtonActionPerformed

    private void ReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportButtonActionPerformed
        // TODO add your handling code here:
        Report repobj = new Report();
        repobj.show();
        this.setVisible(false);
        
    }//GEN-LAST:event_ReportButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoGoButton;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JButton ReportButton;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JComboBox<String> databaseComboBox;
    private javax.swing.JButton databaseGoButton;
    private javax.swing.JLabel databseLabel;
    private javax.swing.JComboBox<String> informationComboBox;
    private javax.swing.JLabel informationLabel;
    // End of variables declaration//GEN-END:variables
}
