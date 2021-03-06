/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author ameya
 */
public class DemoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DemoJPanel
     */
    
    Person person;
    
    public DemoJPanel(Person person) {
        initComponents();
        this.setSize(2000, 2000);
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        demoLbl = new javax.swing.JLabel();
        fnameLbl = new javax.swing.JLabel();
        lnameLbl = new javax.swing.JLabel();
        dobLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        hgtLbl = new javax.swing.JLabel();
        wgtLbl = new javax.swing.JLabel();
        ssnLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hgtTxt = new javax.swing.JTextField();
        wgtTxt = new javax.swing.JTextField();
        ssnTxt = new javax.swing.JTextField();
        dobTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        fnameTxt = new javax.swing.JTextField();
        lnameTxt = new javax.swing.JTextField();

        setBackground(java.awt.SystemColor.inactiveCaption);
        setPreferredSize(new java.awt.Dimension(650, 500));

        demoLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        demoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        demoLbl.setText("Demographic Information");

        fnameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fnameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fnameLbl.setText("First Name :");

        lnameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lnameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lnameLbl.setText("Last Name :");

        dobLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dobLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dobLbl.setText("Date of birth :");

        ageLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageLbl.setText("Age :");

        hgtLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hgtLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hgtLbl.setText("Height :");

        wgtLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wgtLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        wgtLbl.setText("Weight :");

        ssnLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ssnLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ssnLbl.setText("SSN :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setLabel("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hgtTxt.setPreferredSize(new java.awt.Dimension(7, 25));

        wgtTxt.setPreferredSize(new java.awt.Dimension(7, 25));

        ssnTxt.setPreferredSize(new java.awt.Dimension(7, 25));

        dobTxt.setPreferredSize(new java.awt.Dimension(7, 25));

        ageTxt.setPreferredSize(new java.awt.Dimension(7, 25));

        fnameTxt.setPreferredSize(new java.awt.Dimension(7, 25));
        fnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTxtActionPerformed(evt);
            }
        });

        lnameTxt.setPreferredSize(new java.awt.Dimension(7, 25));
        lnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnameLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnameLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hgtLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wgtLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssnLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hgtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wgtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(demoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(demoLbl)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hgtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hgtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wgtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wgtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTxtActionPerformed

    private void lnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code 
        
        person.setF_name(fnameTxt.getText());
        person.setL_name(lnameTxt.getText());
        person.setDob(dobTxt.getText());
        person.setAge(ageTxt.getText());
        person.setHgt(hgtTxt.getText());
        person.setWgt(wgtTxt.getText());
        person.setSsn(ssnTxt.getText());
        
        JOptionPane.showMessageDialog(this, "Demographic Information Saved.");
   
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JLabel demoLbl;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JLabel fnameLbl;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JLabel hgtLbl;
    private javax.swing.JTextField hgtTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lnameLbl;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JLabel ssnLbl;
    private javax.swing.JTextField ssnTxt;
    private javax.swing.JLabel wgtLbl;
    private javax.swing.JTextField wgtTxt;
    // End of variables declaration//GEN-END:variables
}
