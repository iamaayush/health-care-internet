/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.AdministrativeRole.Pharmacy;

import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.WorkQueue.PatientDrugFeedbackWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class ViewDrugFeedbackJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDrugFeedbackJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    public ViewDrugFeedbackJPanel(JPanel upc, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=upc;
        this.enterprise=enterprise;
        
        populateTable();
        
    }
    
    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) drugfeedbackjTable1.getModel();
        dtm.setRowCount(0);

        Object[] row = new Object[6];
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            if (request instanceof PatientDrugFeedbackWorkRequest) {
                PatientDrugFeedbackWorkRequest pdf = (PatientDrugFeedbackWorkRequest) request;

                {
                    row[0] = pdf.getDrug().getDrugID();
                    row[1] = pdf.getDrug();
                    row[2] = pdf.getSender();
                    
                    if(pdf.getSender() instanceof Doctor)
                    {
                        row[3] = "Doctor";
                    }
                    if(pdf.getSender() instanceof Patient)
                    {
                        row[3] = "Patient";
                    }
                    
                    row[4] = pdf.getRequestDate();
                    row[5] = pdf;

                    dtm.addRow(row);
                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        drugfeedbackjTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();

        drugfeedbackjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Drug ID", "Drug Name", "Sender Name", "Type", "Date", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugfeedbackjTable1);

        jLabel1.setText("Feedback for Drugs:");

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
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backjButton1)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTable drugfeedbackjTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}