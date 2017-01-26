/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.WorkQueue.EntAdminWorkRequest;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.ReferredDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class ManagePatientWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private PatientWorkRequest pwr;
    private EntAdminWorkRequest eawr;
    private EcoSystem system;
    private Enterprise enterprise;
    private Doctor doctor;
    
    public ManagePatientWorkRequestJPanel(JPanel upc, EcoSystem system, Patient patient) {
        initComponents();
        userProcessContainer = upc;
        this.patient = patient;
        this.system = system;
        
        populateTable();
    }
    
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) workRequestjTable1.getModel();
        
        dtm.setRowCount(0);
        
        for (WorkRequest request : patient.getWorkQueue().getWorkRequestList()) {
            if (request instanceof PatientWorkRequest) {
                pwr = (PatientWorkRequest) request;
                Object[] row = new Object[6];
                row[0] = pwr.getEntRecv();
                row[1] = pwr.getDoctor();
                row[2] = pwr.getMessage();
                row[3] = pwr.getRequestDate();
                row[4] = pwr.getStatus() == null ? "pending" : pwr.getStatus();
                row[5] = pwr.getAppointment() == null ? "pending" : pwr.getAppointment();
                
                dtm.addRow(row);
            }
            if (request instanceof EntAdminWorkRequest) {
                eawr = (EntAdminWorkRequest) request;
                Object[] row = new Object[6];
                row[0] = eawr.getEntSender();
                row[1] = eawr.getDoctor();
                row[2] = eawr;
                row[3] = eawr.getRequestDate();
                row[4] = eawr.getStatus() == null ? "pending" : eawr.getStatus();
                row[5] = "set By Admin";
                
                dtm.addRow(row);
            }
            if (request instanceof ReferredDoctorWorkRequest) {
                ReferredDoctorWorkRequest rdwr = (ReferredDoctorWorkRequest) request;
                Object[] row = new Object[6];
                row[0] = rdwr.getSendEnt();
                row[1] = rdwr.getSender();
                row[2] = rdwr;
                row[3] = rdwr.getRequestDate();
                row[4] = rdwr.getStatus() == null ? "pending" : rdwr.getStatus();
                row[5] = rdwr.getAppointment() == null ? "pending" : rdwr.getAppointment();

                dtm.addRow(row);
            }
        }
//        populateEntRequestCombo();
    }

//    private void populateEntRequestCombo() {
//
//        entRequestjComboBox1.removeAllItems();
//
//        for (WorkRequest request : patient.getWorkQueue().getWorkRequestList()) {
//            if (request instanceof PatientWorkRequest) {
//                pwr = (PatientWorkRequest) request;
//                enterprise = pwr.getEntSender();
//                entRequestjComboBox1.addItem(enterprise);
//            }
//
//            for (int i = 0; i <= entRequestjComboBox1.getItemCount(); i++) {
//                Enterprise enter = (Enterprise) entRequestjComboBox1.getItemAt(i);
//
//                if (enter.equals(entRequestjComboBox1.getItemAt(i + 1))) {
//                    entRequestjComboBox1.removeItem(enter);
//                }
//            }
//            if (request instanceof EntAdminWorkRequest) {
//                eawr = (EntAdminWorkRequest) request;
//                enterprise = eawr.getEntSender();
//                entRequestjComboBox1.addItem(enterprise);
//            }
//
//            for (int j = 0; j <= entRequestjComboBox1.getItemCount(); j++) {
//                Enterprise enter = (Enterprise) entRequestjComboBox1.getItemAt(j + 1);
//
//                if (enter.equals(enterprise)) {
//                    entRequestjComboBox1.removeItem(enter);
//                }
//            }////////DOCTOR FOR LOOP CHECK LEFT\\\\\\
//        }
//        populateDocCombo();
//    }
//
//    private void populateDocCombo() {
//
//        docRequestjComboBox2.removeAllItems();
//        if (enterprise != null) {
//            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                if (org instanceof DoctorOrganization) {
//                    for (Person person : org.getPersonDirectory().getPersonList()) {
//                        if (person instanceof Doctor) {
//                            Doctor doc = (Doctor) person;
//
//                            for (WorkRequest request : patient.getWorkQueue().getWorkRequestList()) {
//                                if (request instanceof PatientWorkRequest) {
//                                    pwr = (PatientWorkRequest) request;
//                                    if (doc.equals(pwr.getDoctor())) {
//                                        docRequestjComboBox2.addItem(doc);
//                                    }
//                                }
//                                if (request instanceof EntAdminWorkRequest) {
//                                    eawr = (EntAdminWorkRequest) request;
//                                    if (doc.equals(eawr.getDoctor())) {
//                                        docRequestjComboBox2.addItem(doc);
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestjTable1 = new javax.swing.JTable();
        createNewjButton1 = new javax.swing.JButton();
        seeLabTestResultsjButton1 = new javax.swing.JButton();
        seePharmacyWorkRequestsjButton1 = new javax.swing.JButton();
        backjButton3 = new javax.swing.JButton();

        workRequestjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Enterprise", "Doctor", "Message", "Request Date", "Status", "Appointment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestjTable1);

        createNewjButton1.setText("Create New Request");
        createNewjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewjButton1ActionPerformed(evt);
            }
        });

        seeLabTestResultsjButton1.setText("See Lab Test Results>>");
        seeLabTestResultsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeLabTestResultsjButton1ActionPerformed(evt);
            }
        });

        seePharmacyWorkRequestsjButton1.setText("See Pharmacy Work Requests>>");
        seePharmacyWorkRequestsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seePharmacyWorkRequestsjButton1ActionPerformed(evt);
            }
        });

        backjButton3.setText("<< Back");
        backjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(seePharmacyWorkRequestsjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seeLabTestResultsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(createNewjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backjButton3)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(createNewjButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(seeLabTestResultsjButton1)
                .addGap(23, 23, 23)
                .addComponent(seePharmacyWorkRequestsjButton1)
                .addGap(29, 29, 29)
                .addComponent(backjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createNewjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewjButton1ActionPerformed
        // TODO add your handling code here:

        if ((patient.getEntPrefDoc() != null)) {
            
            PatientNewWorkRequestJPanel pnwrjp = new PatientNewWorkRequestJPanel(userProcessContainer, patient, enterprise, doctor);
            userProcessContainer.add("manageWorkRequestJPanel", pnwrjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Doctor not assigned yet.");
            return;
        }
    }//GEN-LAST:event_createNewjButton1ActionPerformed

    private void seeLabTestResultsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeLabTestResultsjButton1ActionPerformed
        // TODO add your handling code here:
        SeeMyLabResultsJPanel smltrjp = new SeeMyLabResultsJPanel(userProcessContainer, patient);
        userProcessContainer.add("SeeMyTestResultsJPanel", smltrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_seeLabTestResultsjButton1ActionPerformed

    private void seePharmacyWorkRequestsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seePharmacyWorkRequestsjButton1ActionPerformed
        // TODO add your handling code here:
        SeePharmacyWorkRequestsJPanel spwrjp = new SeePharmacyWorkRequestsJPanel(userProcessContainer, patient);
        userProcessContainer.add("SeePharmacyWorkRequestJPanel", spwrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_seePharmacyWorkRequestsjButton1ActionPerformed

    private void backjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton3;
    private javax.swing.JButton createNewjButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton seeLabTestResultsjButton1;
    private javax.swing.JButton seePharmacyWorkRequestsjButton1;
    private javax.swing.JTable workRequestjTable1;
    // End of variables declaration//GEN-END:variables
}
