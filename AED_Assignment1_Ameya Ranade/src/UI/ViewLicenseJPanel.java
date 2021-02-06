/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.Person;

/**
 *
 * @author ameya
 */
public class ViewLicenseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewLicenseJPanel
     */
    Person person;
    public ViewLicenseJPanel(Person person) {
        initComponents();
        this.person = person;
        displayperson();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bldtypeLbl = new javax.swing.JLabel();
        expdtTxt = new javax.swing.JTextField();
        lncsLbl = new javax.swing.JLabel();
        bldtypeTxt = new javax.swing.JTextField();
        lncsTxt = new javax.swing.JTextField();
        issuedtLbl = new javax.swing.JLabel();
        issuedtTxt = new javax.swing.JTextField();
        picTxt = new javax.swing.JTextField();
        expdtLbl = new javax.swing.JLabel();
        picLbl = new javax.swing.JLabel();
        lcnsLbl = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.inactiveCaption);
        setPreferredSize(new java.awt.Dimension(650, 500));
        setLayout(null);

        bldtypeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bldtypeLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bldtypeLbl.setText("Blood Type :");
        add(bldtypeLbl);
        bldtypeLbl.setBounds(128, 187, 142, 23);

        expdtTxt.setEditable(false);
        expdtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expdtTxtActionPerformed(evt);
            }
        });
        add(expdtTxt);
        expdtTxt.setBounds(288, 146, 190, 23);

        lncsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lncsLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lncsLbl.setText("License Number :");
        add(lncsLbl);
        lncsLbl.setBounds(136, 58, 130, 23);

        bldtypeTxt.setEditable(false);
        bldtypeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bldtypeTxtActionPerformed(evt);
            }
        });
        add(bldtypeTxt);
        bldtypeTxt.setBounds(288, 189, 190, 23);

        lncsTxt.setEditable(false);
        lncsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lncsTxtActionPerformed(evt);
            }
        });
        add(lncsTxt);
        lncsTxt.setBounds(288, 60, 190, 23);

        issuedtLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        issuedtLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        issuedtLbl.setText("Date of Issue :");
        add(issuedtLbl);
        issuedtLbl.setBounds(135, 101, 130, 23);

        issuedtTxt.setEditable(false);
        issuedtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuedtTxtActionPerformed(evt);
            }
        });
        add(issuedtTxt);
        issuedtTxt.setBounds(288, 103, 190, 23);

        picTxt.setEditable(false);
        picTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picTxtActionPerformed(evt);
            }
        });
        add(picTxt);
        picTxt.setBounds(288, 232, 190, 23);

        expdtLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expdtLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        expdtLbl.setText("Date of Expirate :");
        add(expdtLbl);
        expdtLbl.setBounds(137, 144, 130, 23);

        picLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        picLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        picLbl.setText("Picture :");
        add(picLbl);
        picLbl.setBounds(150, 230, 120, 23);

        lcnsLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lcnsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcnsLbl.setText("Driver's License Information");
        add(lcnsLbl);
        lcnsLbl.setBounds(10, 11, 630, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void expdtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expdtTxtActionPerformed
        // TODO add your handling code here:
        expdtTxt.setEditable(false);
    }//GEN-LAST:event_expdtTxtActionPerformed

    private void lncsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lncsTxtActionPerformed
        // TODO add your handling code here:
        lncsTxt.setEditable(false);
    }//GEN-LAST:event_lncsTxtActionPerformed

    private void issuedtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuedtTxtActionPerformed
        // TODO add your handling code here:
        issuedtTxt.setEditable(false);
    }//GEN-LAST:event_issuedtTxtActionPerformed

    private void bldtypeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bldtypeTxtActionPerformed
        // TODO add your handling code here:
        bldtypeTxt.setEditable(false);
    }//GEN-LAST:event_bldtypeTxtActionPerformed

    private void picTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picTxtActionPerformed
        // TODO add your handling code here:
        picTxt.setEditable(false);
    }//GEN-LAST:event_picTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bldtypeLbl;
    private javax.swing.JTextField bldtypeTxt;
    private javax.swing.JLabel expdtLbl;
    private javax.swing.JTextField expdtTxt;
    private javax.swing.JLabel issuedtLbl;
    private javax.swing.JTextField issuedtTxt;
    private javax.swing.JLabel lcnsLbl;
    private javax.swing.JLabel lncsLbl;
    private javax.swing.JTextField lncsTxt;
    private javax.swing.JLabel picLbl;
    private javax.swing.JTextField picTxt;
    // End of variables declaration//GEN-END:variables

    private void displayperson() {
        
        lncsTxt.setText(person.getLcnsnum());
        issuedtTxt.setText(person.getIss_dt());
        expdtTxt.setText(person.getExp_dt());
        bldtypeTxt.setText(person.getBld_type());
        picTxt.setText(person.getPicture());
    }
}