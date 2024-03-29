/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoliceStationManagement;
import SQLPackage.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class CaseForm extends javax.swing.JFrame {

    /**
     * Creates new form CaseForm
     */
    public CaseForm() {
        initComponents();
        setTitle("Case Form");
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
        jButton_back = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jTextField_TypeOfCase = new javax.swing.JTextField();
        jTextField_ReceivingDate = new javax.swing.JTextField();
        jTextField_ClosingDate = new javax.swing.JTextField();
        jTextField_AreaOfCrime = new javax.swing.JTextField();
        jTextField_CaseFilerName = new javax.swing.JTextField();
        jTextField_InvestigatingOfficerName = new javax.swing.JTextField();
        jTextField_CriminalStatus = new javax.swing.JTextField();
        jTextField_FinalReport = new javax.swing.JTextField();
        jTextField_ComplainLetterNo = new javax.swing.JTextField();
        jTextField_CaseAcceptance = new javax.swing.JTextField();
        jTextField_RevivedGoods = new javax.swing.JTextField();
        jTextField_StolenGoods = new javax.swing.JTextField();
        jTextField_MagistrateSection = new javax.swing.JTextField();
        PoliceStationIdLabel = new javax.swing.JLabel();
        jTextField_sectionNo = new javax.swing.JTextField();
        PoliceOfficerIdLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PoliceOfficerIdTextField = new javax.swing.JTextField();
        PoliceStationIdTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_back.setText("BACK");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_back);
        jButton_back.setBounds(110, 770, 140, 50);

        jButton_save.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_save.setText("SAVE");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_save);
        jButton_save.setBounds(1020, 770, 150, 50);

        jTextField_TypeOfCase.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_TypeOfCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TypeOfCaseActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_TypeOfCase);
        jTextField_TypeOfCase.setBounds(440, 690, 530, 40);

        jTextField_ReceivingDate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_ReceivingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ReceivingDateActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_ReceivingDate);
        jTextField_ReceivingDate.setBounds(440, 640, 530, 40);

        jTextField_ClosingDate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_ClosingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ClosingDateActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_ClosingDate);
        jTextField_ClosingDate.setBounds(440, 590, 530, 40);

        jTextField_AreaOfCrime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_AreaOfCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AreaOfCrimeActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_AreaOfCrime);
        jTextField_AreaOfCrime.setBounds(440, 540, 530, 40);

        jTextField_CaseFilerName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_CaseFilerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CaseFilerNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_CaseFilerName);
        jTextField_CaseFilerName.setBounds(440, 490, 530, 40);

        jTextField_InvestigatingOfficerName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_InvestigatingOfficerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_InvestigatingOfficerNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_InvestigatingOfficerName);
        jTextField_InvestigatingOfficerName.setBounds(440, 440, 530, 40);

        jTextField_CriminalStatus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_CriminalStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CriminalStatusActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_CriminalStatus);
        jTextField_CriminalStatus.setBounds(750, 380, 220, 40);

        jTextField_FinalReport.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_FinalReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FinalReportActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_FinalReport);
        jTextField_FinalReport.setBounds(300, 380, 220, 40);

        jTextField_ComplainLetterNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_ComplainLetterNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ComplainLetterNoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_ComplainLetterNo);
        jTextField_ComplainLetterNo.setBounds(750, 330, 220, 40);

        jTextField_CaseAcceptance.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_CaseAcceptance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CaseAcceptanceActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_CaseAcceptance);
        jTextField_CaseAcceptance.setBounds(300, 330, 220, 40);

        jTextField_RevivedGoods.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_RevivedGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_RevivedGoodsActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_RevivedGoods);
        jTextField_RevivedGoods.setBounds(300, 270, 530, 40);

        jTextField_StolenGoods.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_StolenGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StolenGoodsActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_StolenGoods);
        jTextField_StolenGoods.setBounds(300, 220, 530, 40);

        jTextField_MagistrateSection.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_MagistrateSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MagistrateSectionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_MagistrateSection);
        jTextField_MagistrateSection.setBounds(740, 110, 230, 40);

        PoliceStationIdLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PoliceStationIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        PoliceStationIdLabel.setText("PoliceStationId :");
        jPanel1.add(PoliceStationIdLabel);
        PoliceStationIdLabel.setBounds(130, 170, 150, 20);

        jTextField_sectionNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_sectionNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_sectionNoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_sectionNo);
        jTextField_sectionNo.setBounds(300, 110, 220, 40);

        PoliceOfficerIdLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PoliceOfficerIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        PoliceOfficerIdLabel.setText("PoliceOfficerId :");
        jPanel1.add(PoliceOfficerIdLabel);
        PoliceOfficerIdLabel.setBounds(580, 170, 160, 22);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Type Of Case * :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(260, 700, 160, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Closing Date :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(290, 600, 130, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Receiving Date * :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(250, 650, 180, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Area Of Crime :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(280, 550, 150, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Criminal Status * :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(570, 390, 170, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Investigating Officer's Name * :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(130, 450, 310, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Final Report : ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 390, 140, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Complain Letter No * :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(540, 340, 210, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Case Acceptance * :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 340, 190, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Revived Goods :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 280, 150, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Stolen Goods : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 230, 140, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Magistrate Section :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(550, 120, 180, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SectionNo * : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 120, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Case Filer Name * :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 500, 190, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CASE FORM:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 40, 240, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1010, 20, 210, 220);

        PoliceOfficerIdTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(PoliceOfficerIdTextField);
        PoliceOfficerIdTextField.setBounds(740, 160, 230, 40);

        PoliceStationIdTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PoliceStationIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceStationIdTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PoliceStationIdTextField);
        PoliceStationIdTextField.setBounds(300, 160, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/bg_pic.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 1250, 910);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1246, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_sectionNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_sectionNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_sectionNoActionPerformed

    private void jTextField_MagistrateSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MagistrateSectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MagistrateSectionActionPerformed

    private void jTextField_StolenGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StolenGoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StolenGoodsActionPerformed

    private void jTextField_RevivedGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_RevivedGoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_RevivedGoodsActionPerformed

    private void jTextField_CaseAcceptanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CaseAcceptanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CaseAcceptanceActionPerformed

    private void jTextField_ComplainLetterNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ComplainLetterNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ComplainLetterNoActionPerformed

    private void jTextField_FinalReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FinalReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FinalReportActionPerformed

    private void jTextField_CriminalStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CriminalStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CriminalStatusActionPerformed

    private void jTextField_InvestigatingOfficerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_InvestigatingOfficerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_InvestigatingOfficerNameActionPerformed

    private void jTextField_CaseFilerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CaseFilerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CaseFilerNameActionPerformed

    private void jTextField_AreaOfCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AreaOfCrimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AreaOfCrimeActionPerformed

    private void jTextField_ClosingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ClosingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ClosingDateActionPerformed

    private void jTextField_ReceivingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ReceivingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ReceivingDateActionPerformed

    private void jTextField_TypeOfCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TypeOfCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TypeOfCaseActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
          MainPage mObj = new MainPage();
        mObj.show();
        this.setVisible(false);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed

        // TODO add your handling code here:
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        
        String query = "INSERT INTO CASES(SectionNo,PoliceStationId,PoliceOfficerId,MagistrateSection,StolenGoods,RevivedGoods,CaseAcceptance,ComplainLetterNo,FinalReport,CriminalStatus,InvestigatingOfficerName,CaseFilerName,AreaOfCrime,ClosingDate,ReceivingDate,TypeOfCase) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst;
        try {
            pst = (PreparedStatement) cnObj.connection.prepareStatement(query);
            
            pst.setString(1,jTextField_sectionNo.getText());
            pst.setString(2,PoliceStationIdTextField.getText());
            pst.setString(3,PoliceOfficerIdTextField.getText());           
            pst.setString(4,jTextField_MagistrateSection.getText());
            pst.setString(5,jTextField_StolenGoods.getText() );
            pst.setString(6,jTextField_RevivedGoods.getText() );
            pst.setString(7,jTextField_CaseAcceptance.getText());
            pst.setString(8,jTextField_ComplainLetterNo.getText());
            pst.setString(9,jTextField_FinalReport.getText());
            pst.setString(10,jTextField_CriminalStatus.getText());
            pst.setString(11,jTextField_InvestigatingOfficerName.getText());
            pst.setString(12,jTextField_CaseFilerName.getText());
            pst.setString(13,jTextField_AreaOfCrime.getText());
            pst.setString(14,jTextField_ClosingDate.getText());
            pst.setString(15,jTextField_ReceivingDate.getText());
            pst.setString(16,jTextField_TypeOfCase.getText());
            
            
            if((jTextField_sectionNo.getText().equals("")) 
            || (jTextField_ComplainLetterNo.getText().equals(""))
            || (jTextField_CaseAcceptance.getText().equals("")) 
            || (jTextField_CriminalStatus.getText().equals("")) 
            || (jTextField_InvestigatingOfficerName.getText().equals(""))  
            || (jTextField_CaseFilerName.getText().equals(""))
            || (jTextField_ReceivingDate.getText().equals(""))
            || (jTextField_TypeOfCase.getText().equals(""))){
                JOptionPane.showMessageDialog(null,"Please fill up the required(*) text fields!!");
            }
            else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Inserted SUCCESSFULLY");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void PoliceStationIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceStationIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoliceStationIdTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PoliceOfficerIdLabel;
    private javax.swing.JTextField PoliceOfficerIdTextField;
    private javax.swing.JLabel PoliceStationIdLabel;
    private javax.swing.JTextField PoliceStationIdTextField;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_AreaOfCrime;
    private javax.swing.JTextField jTextField_CaseAcceptance;
    private javax.swing.JTextField jTextField_CaseFilerName;
    private javax.swing.JTextField jTextField_ClosingDate;
    private javax.swing.JTextField jTextField_ComplainLetterNo;
    private javax.swing.JTextField jTextField_CriminalStatus;
    private javax.swing.JTextField jTextField_FinalReport;
    private javax.swing.JTextField jTextField_InvestigatingOfficerName;
    private javax.swing.JTextField jTextField_MagistrateSection;
    private javax.swing.JTextField jTextField_ReceivingDate;
    private javax.swing.JTextField jTextField_RevivedGoods;
    private javax.swing.JTextField jTextField_StolenGoods;
    private javax.swing.JTextField jTextField_TypeOfCase;
    private javax.swing.JTextField jTextField_sectionNo;
    // End of variables declaration//GEN-END:variables
}
