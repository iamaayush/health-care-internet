/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.DoctorRole;

import Business.Pharmacy.Drug;
import Business.Pharmacy.MedicalGuideline;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public class ViewMedicalGuidelinesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewMedicalGuidelinesJPanel
     */
    private JPanel userProcessContainer;
    private Drug drug;
    private MedicalGuideline mg;
    public ViewMedicalGuidelinesJPanel(JPanel upc, Drug drug) {
        initComponents();
        userProcessContainer=upc;
        this.drug=drug;
        
        mg = drug.getMg();
        populatePanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        othersjTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usageInfojTextField1 = new javax.swing.JTextField();
        sideEffectsjTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        howToRefilljTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dosageInfojTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        storageInfojTextField4 = new javax.swing.JTextField();
        keepOutOfjTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ingredientsjTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        notForPeoplejTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setText("Not for people:");

        jLabel8.setText("Keep out of reach from:");

        usageInfojTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usageInfojTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Storage Information:");

        jLabel4.setText("Side effects:");

        jLabel5.setText("Ingredients:");

        jLabel6.setText("How to Refill:");

        jLabel9.setText("Others:");

        jLabel1.setText("Usage Information:");

        jLabel2.setText("Dosage Information:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(57, 57, 57)
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
                        .addComponent(othersjTextField1))
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
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
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populatePanel()
    {
        
        usageInfojTextField1.setText(mg.getUsageInfo());
        dosageInfojTextField3.setText(mg.getDosageInfo());
        storageInfojTextField4.setText(mg.getStorageInfo());
        sideEffectsjTextField5.setText(mg.getSideEffects());
        ingredientsjTextField7.setText(mg.getIngredients());
        howToRefilljTextField6.setText(mg.getRefillUse());
        keepOutOfjTextField9.setText(mg.getKeepOutOf());
        othersjTextField1.setText(mg.getOthers());
        notForPeoplejTextField8.setText(mg.getNotForPeople());
   
        
    }
    
    
    
    private void usageInfojTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usageInfojTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usageInfojTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField usageInfojTextField1;
    // End of variables declaration//GEN-END:variables
}
