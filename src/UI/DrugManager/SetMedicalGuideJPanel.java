/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DrugManager;

import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.Pharmacy.Drug;
import Business.Pharmacy.MedicalGuideline;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public class SetMedicalGuideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SetMedicalGuideJPanel
     */
    private JPanel userProcessContainer;
    private Drug drug;
    private Enterprise enterprise;

    public SetMedicalGuideJPanel(JPanel userProcessContainer, Drug drug, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.drug = drug;
        this.enterprise = enterprise;

    }

    private void blankifyPanel()
    {
        usageInfojTextField1.setText("");
        dosageInfojTextField3.setText("");
        storageInfojTextField4.setText("");
        sideEffectsjTextField5.setText("");
        ingredientsjTextField7.setText("");
        howToRefilljTextField6.setText("");
        keepOutOfjTextField9.setText("");
        othersjTextField1.setText("");
        notForPeoplejTextField8.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usageInfojTextField1 = new javax.swing.JTextField();
        dosageInfojTextField3 = new javax.swing.JTextField();
        storageInfojTextField4 = new javax.swing.JTextField();
        sideEffectsjTextField5 = new javax.swing.JTextField();
        howToRefilljTextField6 = new javax.swing.JTextField();
        ingredientsjTextField7 = new javax.swing.JTextField();
        notForPeoplejTextField8 = new javax.swing.JTextField();
        keepOutOfjTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        othersjTextField1 = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();

        submitjButton1.setText("Submit Drug");
        submitjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Usage Information:");

        jLabel2.setText("Dosage Information:");

        jLabel3.setText("Storage Information:");

        jLabel4.setText("Side effects:");

        jLabel5.setText("Ingredients:");

        jLabel6.setText("How to Refill:");

        jLabel7.setText("Not for people:");

        jLabel8.setText("Keep out of reach from:");

        usageInfojTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usageInfojTextField1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Others:");

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usageInfojTextField1)
                            .addComponent(keepOutOfjTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(notForPeoplejTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(howToRefilljTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(ingredientsjTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(sideEffectsjTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(storageInfojTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(dosageInfojTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(othersjTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton1)
                        .addGap(179, 179, 179)
                        .addComponent(submitjButton1)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usageInfojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dosageInfojTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(storageInfojTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sideEffectsjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ingredientsjTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(howToRefilljTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(notForPeoplejTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(keepOutOfjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(othersjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backjButton1)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitjButton1)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usageInfojTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usageInfojTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usageInfojTextField1ActionPerformed

    private void submitjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButton1ActionPerformed
        // TODO add your handling code here:

        boolean flag = true;
        String usage = usageInfojTextField1.getText();
        String dosage = dosageInfojTextField3.getText();
        String storage = storageInfojTextField4.getText();
        String sideEffect = sideEffectsjTextField5.getText();
        String ingredients = ingredientsjTextField7.getText();
        String refill = howToRefilljTextField6.getText();
        String keepOutOf = keepOutOfjTextField9.getText();
        String others = othersjTextField1.getText();
        String notFor = notForPeoplejTextField8.getText();

        if ((usage.isEmpty()) || (dosage.isEmpty()) || (storage.isEmpty()) || (sideEffect.isEmpty())
                || (ingredients.isEmpty()) || (refill.isEmpty()) || (keepOutOf.isEmpty())
                || (others.isEmpty()) || (notFor.isEmpty())) {
            flag = false;
            int option = JOptionPane.showConfirmDialog(null, "Some field(s) are empty. Do You want to continue?","WARNING", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                flag = true;
            }
        }
        if (flag) {
            MedicalGuideline mg = new MedicalGuideline();

            mg.setDosageInfo(dosage);
            mg.setIngredients(ingredients);
            mg.setKeepOutOf(keepOutOf);
            mg.setNotForPeople(notFor);
            mg.setOthers(others);
            mg.setRefillUse(refill);
            mg.setSideEffects(sideEffect);
            mg.setStorageInfo(storage);
            mg.setUsageInfo(usage);

            drug.setMg(mg);
            PharmaceuticalCompanyEnterprise pce = (PharmaceuticalCompanyEnterprise) enterprise;
            pce.getDrugList().add(drug);
            
            blankifyPanel();
            JOptionPane.showMessageDialog(null, "Drug added successfully.");
        }
    }//GEN-LAST:event_submitjButton1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField dosageInfojTextField3;
    private javax.swing.JTextField howToRefilljTextField6;
    private javax.swing.JTextField ingredientsjTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField keepOutOfjTextField9;
    private javax.swing.JTextField notForPeoplejTextField8;
    private javax.swing.JTextField othersjTextField1;
    private javax.swing.JTextField sideEffectsjTextField5;
    private javax.swing.JTextField storageInfojTextField4;
    private javax.swing.JButton submitjButton1;
    private javax.swing.JTextField usageInfojTextField1;
    // End of variables declaration//GEN-END:variables
}
