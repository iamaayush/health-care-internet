/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.Network.NetworkCity;
import Business.Network.NetworkCountry;
import Business.Network.NetworkState;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyAdminWorkRequest;
import Business.WorkQueue.EmergencyDoctorEnquiryWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import UI.AdministrativeRole.Pharmacy.ViewBroadcastJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization docOrg;
    private Enterprise enterprise;
    private Doctor doctor;
    private EcoSystem system;
    private ArrayList<PharmaceuticalCompanyEnterprise> pharmaCoList;

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.docOrg = organization;
        this.system = system;
        if ((enterprise instanceof HospitalEnterprise) || (enterprise instanceof ClinicEnterprise)) {
            this.enterprise = enterprise;
        }
        doctor = (Doctor) userAccount.getPerson();

        populateTable();
    }

    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) emergencyjTable1.getModel();
        dtm.setRowCount(0);

        Object[] row = new Object[4];
        for (WorkRequest request : doctor.getWorkQueue().getWorkRequestList()) {
            if (request instanceof EmergencyAdminWorkRequest) {
                EmergencyAdminWorkRequest ewr = (EmergencyAdminWorkRequest) request;

                row[0] = ewr.getMRN();
                row[1] = ewr.getPatientName();
                row[2] = ewr.getEnterprise();
                row[3] = ewr;

                dtm.addRow(row);
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

        manageWorkRequestsjButton1 = new javax.swing.JButton();
        labTestResultsjButton1 = new javax.swing.JButton();
        managePharmacyRequestjButton1 = new javax.swing.JButton();
        manageReferralRequestsjButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emergencyjTable1 = new javax.swing.JTable();
        sendEnquiryjButton1 = new javax.swing.JButton();
        enquiryjTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manageEmergencyDetailsjButton1 = new javax.swing.JButton();
        viewBroadcastsjButton2 = new javax.swing.JButton();
        viewDrugGuidelinesjButton1 = new javax.swing.JButton();

        manageWorkRequestsjButton1.setText("Manage Work Requests");
        manageWorkRequestsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWorkRequestsjButton1ActionPerformed(evt);
            }
        });

        labTestResultsjButton1.setText("Manage Lab Test Results");
        labTestResultsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTestResultsjButton1ActionPerformed(evt);
            }
        });

        managePharmacyRequestjButton1.setText("Manage Pharmacy Requests");
        managePharmacyRequestjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmacyRequestjButton1ActionPerformed(evt);
            }
        });

        manageReferralRequestsjButton1.setText("Manage Referral requests");
        manageReferralRequestsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageReferralRequestsjButton1ActionPerformed(evt);
            }
        });

        emergencyjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MRN", "Patient Name", "Enterprise", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(emergencyjTable1);

        sendEnquiryjButton1.setText("Send Enquiry over the network");
        sendEnquiryjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEnquiryjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enquiry :");

        jLabel2.setText("Emergency Requests:");

        manageEmergencyDetailsjButton1.setText("Manage emergency Details");
        manageEmergencyDetailsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmergencyDetailsjButton1ActionPerformed(evt);
            }
        });

        viewBroadcastsjButton2.setText("View Broadcast(s)");
        viewBroadcastsjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBroadcastsjButton2ActionPerformed(evt);
            }
        });

        viewDrugGuidelinesjButton1.setText("View Drug Guidelines");
        viewDrugGuidelinesjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugGuidelinesjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(186, 186, 186)
                        .addComponent(manageEmergencyDetailsjButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(enquiryjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sendEnquiryjButton1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageWorkRequestsjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labTestResultsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewDrugGuidelinesjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(managePharmacyRequestjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageReferralRequestsjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewBroadcastsjButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(manageEmergencyDetailsjButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sendEnquiryjButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enquiryjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageWorkRequestsjButton1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTestResultsjButton1)
                            .addComponent(manageReferralRequestsjButton1)))
                    .addComponent(managePharmacyRequestjButton1))
                .addGap(27, 27, 27)
                .addComponent(viewBroadcastsjButton2)
                .addGap(26, 26, 26)
                .addComponent(viewDrugGuidelinesjButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageWorkRequestsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWorkRequestsjButton1ActionPerformed
        // TODO add your handling code here:
        ManageDoctorWorkRequestsJPanel mwrjp = new ManageDoctorWorkRequestsJPanel(userProcessContainer, doctor, system);
        userProcessContainer.add("manageWorkRequestJPanel", mwrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageWorkRequestsjButton1ActionPerformed

    private void labTestResultsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTestResultsjButton1ActionPerformed
        // TODO add your handling code here:
        LabTestResultsJPanel ltrjp = new LabTestResultsJPanel(userProcessContainer, doctor);
        userProcessContainer.add("LabTestResultsJPanel", ltrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_labTestResultsjButton1ActionPerformed

    private void managePharmacyRequestjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmacyRequestjButton1ActionPerformed
        // TODO add your handling code here:
        ManageDocPharmacyRequestsJPanel mdprjp = new ManageDocPharmacyRequestsJPanel(userProcessContainer, doctor);
        userProcessContainer.add("manageDocPharmacyRequestJPanel", mdprjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePharmacyRequestjButton1ActionPerformed

    private void manageReferralRequestsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageReferralRequestsjButton1ActionPerformed
        // TODO add your handling code here:
        manageReferalRequestsJPanel mrjp = new manageReferalRequestsJPanel(userProcessContainer, doctor);
        userProcessContainer.add("manageReferalJPanel", mrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageReferralRequestsjButton1ActionPerformed

    private void sendEnquiryjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEnquiryjButton1ActionPerformed
        // TODO add your handling code here:

        String enquiryMsg = enquiryjTextField1.getText();

        if (enquiryMsg.isEmpty()) {
            int value = JOptionPane.showConfirmDialog(null, "Send Empty message?", "WARNING", JOptionPane.YES_NO_OPTION);
            if (value == JOptionPane.YES_OPTION) {
                enquiryMsg = "EMERGENCY CASE ENQUIRY";
            } else {
                return;
            }
        }

        int selectedRow = emergencyjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }
        int MRN = (int) emergencyjTable1.getValueAt(selectedRow, 0);

        WorkRequest request = (WorkRequest) emergencyjTable1.getValueAt(selectedRow, 3);
        Enterprise e = (Enterprise) emergencyjTable1.getValueAt(selectedRow, 2);

        EmergencyDoctorEnquiryWorkRequest edewr = new EmergencyDoctorEnquiryWorkRequest();
        edewr.setDoctor(doctor);
        edewr.setEntSender(e);
        edewr.setMessage(enquiryMsg);
        edewr.setMRN(MRN);

        for (NetworkCountry networkCountry : system.getCountryNetworkList()) {
            for (NetworkState networkState : networkCountry.getStateList()) {
                for (NetworkCity networkCity : networkState.getCityList()) {
                    for (Enterprise enterp : networkCity.getEnterpriseDirectory().getEnterpriseList()) {
                        if ((enterp instanceof HospitalEnterprise) || (enterp instanceof ClinicEnterprise)) {
                            enterp.getWorkQueue().getWorkRequestList().add(edewr);
                        }
                    }
                }
            }
        }
        doctor.getWorkQueue().getWorkRequestList().add(edewr);
        doctor.getWorkQueue().getWorkRequestList().remove(request);
    }//GEN-LAST:event_sendEnquiryjButton1ActionPerformed

    private void manageEmergencyDetailsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmergencyDetailsjButton1ActionPerformed
        // TODO add your handling code here:
        ViewEmergencyDetailsJPanel vedjp = new ViewEmergencyDetailsJPanel(userProcessContainer, doctor);
        userProcessContainer.add("viewEmergencyEnquiry", vedjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmergencyDetailsjButton1ActionPerformed

    private void viewBroadcastsjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBroadcastsjButton2ActionPerformed
        // TODO add your handling code here:

        WorkQueue wq = doctor.getWorkQueue();
        ViewBroadcastJPanel vbjp = new ViewBroadcastJPanel(userProcessContainer, wq);
        userProcessContainer.add("viewbroadcastDoctorJPanel", vbjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewBroadcastsjButton2ActionPerformed

    private void viewDrugGuidelinesjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugGuidelinesjButton1ActionPerformed
        // TODO add your handling code here:

        pharmaCoList = new ArrayList<>();
        for (NetworkCountry networkCountry : system.getCountryNetworkList()) {
            for (NetworkState networkState : networkCountry.getStateList()) {
                for (NetworkCity networkCity : networkState.getCityList()) {
                    for (Enterprise enter : networkCity.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enter instanceof PharmaceuticalCompanyEnterprise) {
                            PharmaceuticalCompanyEnterprise phcoen = (PharmaceuticalCompanyEnterprise) enter;
                            pharmaCoList.add(phcoen);
                        }
                    }
                }
            }
        }
        ViewDrugGuidelinesJPanel vdgjp = new ViewDrugGuidelinesJPanel(userProcessContainer, pharmaCoList);
        userProcessContainer.add("ViewDrugGuidelinesJPanel", vdgjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewDrugGuidelinesjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable emergencyjTable1;
    private javax.swing.JTextField enquiryjTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton labTestResultsjButton1;
    private javax.swing.JButton manageEmergencyDetailsjButton1;
    private javax.swing.JButton managePharmacyRequestjButton1;
    private javax.swing.JButton manageReferralRequestsjButton1;
    private javax.swing.JButton manageWorkRequestsjButton1;
    private javax.swing.JButton sendEnquiryjButton1;
    private javax.swing.JButton viewBroadcastsjButton2;
    private javax.swing.JButton viewDrugGuidelinesjButton1;
    // End of variables declaration//GEN-END:variables
}
