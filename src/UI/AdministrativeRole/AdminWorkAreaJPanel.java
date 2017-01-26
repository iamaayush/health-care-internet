/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Business.Creator;
import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.PharmacyStoreOrganization;
import Business.WorkQueue.EmergencyDoctorEnquiryWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import UI.AdministrativeRole.Pharmacy.ManagePharmacyDrugsJPanel;
import UI.AdministrativeRole.Pharmacy.ManagePharmacyJPanel;
import UI.AdministrativeRole.Pharmacy.ManagePharmacyWorkRequestNewJPanel;
import UI.AdministrativeRole.Pharmacy.NetworkCommunicationRequestJPanel;
import UI.AdministrativeRole.Pharmacy.RollBackDrugsJPanel;
import UI.AdministrativeRole.Pharmacy.ViewBroadcastJPanel;
import UI.AdministrativeRole.Pharmacy.ViewDrugCallBackRequestJPanel;
import UI.AdministrativeRole.Pharmacy.ViewDrugFeedbackJPanel;
import UI.AdministrativeRole.Pharmacy.ViewMyPharmaciesJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form adminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem system;
    private Creator c;
    private Organization cPatientOrg;
    private Enterprise pharmCompEnt;
    boolean flag;

    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        entNamejLabel2.setText("Welcome to " + enterprise.getName());
        c = system.getCreator();
        for (Organization organization : c.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PatientOrganization) {
                cPatientOrg = organization;
            }
        }

        if (enterprise instanceof HospitalEnterprise) {
//            managePharmaceuticalCojButton2.setVisible(false);
            managePharmacyjButton1.setVisible(false);
            manageDrugsjButton1.setVisible(false);
            viewMyPharmaciesjButton1.setVisible(false);
            managePharmacyWorkRequestjButton1.setVisible(false);
            networkCommunicationjButton1.setVisible(false);
            viewBroadcastsjButton1.setVisible(false);
            rollbackjButton1.setVisible(false);
            viewDrugCallBackjButton1.setVisible(false);
            viewDrugFeedbackjButton1.setVisible(false);
            emergencyPaneljPanel1.setVisible(true);
            populateTable();

        }
        if (enterprise instanceof ClinicEnterprise) {
//            managePharmaceuticalCojButton2.setVisible(false);
            managePharmacyjButton1.setVisible(false);
            manageDrugsjButton1.setVisible(false);
            viewMyPharmaciesjButton1.setVisible(false);
            managePharmacyWorkRequestjButton1.setVisible(false);
            networkCommunicationjButton1.setVisible(false);
            viewBroadcastsjButton1.setVisible(false);
            rollbackjButton1.setVisible(false);
            viewDrugCallBackjButton1.setVisible(false);
            viewDrugFeedbackjButton1.setVisible(false);
            emergencyPaneljPanel1.setVisible(true);
            populateTable();

        }
        if (enterprise instanceof PharmacyEnterprise) {
            managePatientjButton1.setVisible(false);
            managePersonJButton.setVisible(false);
//            managePharmacyjButton1.setVisible(false);
            viewMyPharmaciesjButton1.setVisible(false);
            networkCommunicationjButton1.setVisible(false);
            rollbackjButton1.setVisible(false);
            viewDrugFeedbackjButton1.setVisible(false);
            emergencyPaneljPanel1.setVisible(false);
        }
        if (enterprise instanceof PharmaceuticalCompanyEnterprise) {
            managePatientjButton1.setVisible(false);
//            managePersonJButton.setVisible(false);
            managePharmacyjButton1.setVisible(false);
            manageDrugsjButton1.setVisible(false);
            managePharmacyWorkRequestjButton1.setVisible(false);
            this.pharmCompEnt = enterprise;
            viewBroadcastsjButton1.setVisible(false);
            viewDrugCallBackjButton1.setVisible(false);
            emergencyPaneljPanel1.setVisible(false);

        }
    }

    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) emergencyEnquiryjTable1.getModel();
        dtm.setRowCount(0);

        Object[] row = new Object[4];
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            if (request instanceof EmergencyDoctorEnquiryWorkRequest) {
                EmergencyDoctorEnquiryWorkRequest edewr = (EmergencyDoctorEnquiryWorkRequest) request;

                {
                    row[0] = edewr.getEntSender();
                    row[1] = edewr.getMRN();
                    row[2] = edewr.getDoctor();
                    row[3] = edewr;

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

        managePersonJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        managePatientjButton1 = new javax.swing.JButton();
        managePharmacyjButton1 = new javax.swing.JButton();
        manageDrugsjButton1 = new javax.swing.JButton();
        viewMyPharmaciesjButton1 = new javax.swing.JButton();
        managePharmacyWorkRequestjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        networkCommunicationjButton1 = new javax.swing.JButton();
        viewBroadcastsjButton1 = new javax.swing.JButton();
        rollbackjButton1 = new javax.swing.JButton();
        viewDrugCallBackjButton1 = new javax.swing.JButton();
        viewDrugFeedbackjButton1 = new javax.swing.JButton();
        emergencyPaneljPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emergencyEnquiryjTable1 = new javax.swing.JTable();
        emergencyjLabel2 = new javax.swing.JLabel();
        emergencyjButton1 = new javax.swing.JButton();
        emergencyRequestsjLabel3 = new javax.swing.JLabel();
        respondjButton1 = new javax.swing.JButton();
        entNamejLabel2 = new javax.swing.JLabel();

        managePersonJButton.setText("Manage Employee");
        managePersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonJButtonActionPerformed(evt);
            }
        });

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        managePatientjButton1.setText("Manage Patient");
        managePatientjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientjButton1ActionPerformed(evt);
            }
        });

        managePharmacyjButton1.setText("Manage Pharmacy Stores");
        managePharmacyjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmacyjButton1ActionPerformed(evt);
            }
        });

        manageDrugsjButton1.setText("Manage Drugs");
        manageDrugsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDrugsjButton1ActionPerformed(evt);
            }
        });

        viewMyPharmaciesjButton1.setText("View My Pharmacies");
        viewMyPharmaciesjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMyPharmaciesjButton1ActionPerformed(evt);
            }
        });

        managePharmacyWorkRequestjButton1.setText("Manage Pharmacy Work Request");
        managePharmacyWorkRequestjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmacyWorkRequestjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("MY WORK AREA : ADMIN ROLE");

        networkCommunicationjButton1.setText("Network Communication request");
        networkCommunicationjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkCommunicationjButton1ActionPerformed(evt);
            }
        });

        viewBroadcastsjButton1.setText("View Broadcast(s)");
        viewBroadcastsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBroadcastsjButton1ActionPerformed(evt);
            }
        });

        rollbackjButton1.setText("Roll Back Drugs");
        rollbackjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollbackjButton1ActionPerformed(evt);
            }
        });

        viewDrugCallBackjButton1.setText("View Drug Call Back Requests");
        viewDrugCallBackjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugCallBackjButton1ActionPerformed(evt);
            }
        });

        viewDrugFeedbackjButton1.setText("View Drug Feedback");
        viewDrugFeedbackjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugFeedbackjButton1ActionPerformed(evt);
            }
        });

        emergencyEnquiryjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise", "MRN", "Doctor", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(emergencyEnquiryjTable1);

        emergencyjLabel2.setText("In Case Of Emergency:");

        emergencyjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emergencyjButton1.setText("EMERGENCY");
        emergencyjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyjButton1ActionPerformed(evt);
            }
        });

        emergencyRequestsjLabel3.setText("Emergency Requests:");

        respondjButton1.setText("Respond to request");
        respondjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondjButton1ActionPerformed(evt);
            }
        });

        entNamejLabel2.setText("jLabel2");

        javax.swing.GroupLayout emergencyPaneljPanel1Layout = new javax.swing.GroupLayout(emergencyPaneljPanel1);
        emergencyPaneljPanel1.setLayout(emergencyPaneljPanel1Layout);
        emergencyPaneljPanel1Layout.setHorizontalGroup(
            emergencyPaneljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emergencyPaneljPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emergencyPaneljPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(emergencyPaneljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emergencyPaneljPanel1Layout.createSequentialGroup()
                        .addComponent(emergencyRequestsjLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emergencyPaneljPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(entNamejLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(emergencyPaneljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emergencyjLabel2)
                    .addComponent(emergencyjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emergencyPaneljPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(respondjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        emergencyPaneljPanel1Layout.setVerticalGroup(
            emergencyPaneljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emergencyPaneljPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emergencyPaneljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emergencyjLabel2)
                    .addComponent(entNamejLabel2))
                .addGroup(emergencyPaneljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emergencyPaneljPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(emergencyjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(emergencyPaneljPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(emergencyRequestsjLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respondjButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(emergencyPaneljPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(managePersonJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(managePatientjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(managePharmacyjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(viewBroadcastsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(viewDrugCallBackjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manageDrugsjButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(managePharmacyWorkRequestjButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewDrugFeedbackjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewMyPharmaciesjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(networkCommunicationjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rollbackjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emergencyPaneljPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewBroadcastsjButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageOrganizationJButton)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(managePersonJButton)
                            .addComponent(managePharmacyjButton1))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(managePatientjButton1)
                            .addComponent(viewDrugCallBackjButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageDrugsjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDrugFeedbackjButton1)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(viewMyPharmaciesjButton1))
                            .addComponent(rollbackjButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(networkCommunicationjButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managePharmacyWorkRequestjButton1)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonJButtonActionPerformed

        ManagePersonJPanel managePersonJPanel = new ManagePersonJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("ManagePersonJPanel", managePersonJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_managePersonJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void managePatientjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientjButton1ActionPerformed
        // TODO add your handling code here:

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PatientOrganization) {
                flag = true;
            }
        }
        if (flag == true) {

            ManagePatientJPanel mpjp = new ManagePatientJPanel(userProcessContainer, enterprise, cPatientOrg, c);
            userProcessContainer.add("managePatientJPanel", mpjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Add Patient Organization.");
        }
    }//GEN-LAST:event_managePatientjButton1ActionPerformed

    private void managePharmacyjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmacyjButton1ActionPerformed
        // TODO add your handling code here:

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PharmacyStoreOrganization) {
                flag = true;
            }
        }
        if (flag) {
            ManagePharmacyJPanel mphjp = new ManagePharmacyJPanel(userProcessContainer, enterprise);
            userProcessContainer.add("managePharmacyJPanel", mphjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Add Pharmacy Store Organization.");
            return;
        }
    }//GEN-LAST:event_managePharmacyjButton1ActionPerformed

    private void manageDrugsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDrugsjButton1ActionPerformed
        // TODO add your handling code here:
        ManagePharmacyDrugsJPanel mpdjp = new ManagePharmacyDrugsJPanel(userProcessContainer, system, enterprise);
        userProcessContainer.add("managePharmacyDrugsJPanel", mpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDrugsjButton1ActionPerformed

    private void viewMyPharmaciesjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMyPharmaciesjButton1ActionPerformed
        // TODO add your handling code here:
        ViewMyPharmaciesJPanel vmpjp = new ViewMyPharmaciesJPanel(userProcessContainer, pharmCompEnt);
        userProcessContainer.add("viewMyPharmaciesJPanel", vmpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewMyPharmaciesjButton1ActionPerformed

    private void managePharmacyWorkRequestjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmacyWorkRequestjButton1ActionPerformed
        // TODO add your handling code here:
        ManagePharmacyWorkRequestNewJPanel mpwrjp = new ManagePharmacyWorkRequestNewJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("managePharmacyWorkRequest", mpwrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePharmacyWorkRequestjButton1ActionPerformed

    private void emergencyjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyjButton1ActionPerformed
        // TODO add your handling code here:
        EmergencyRequestJPanel erjp = new EmergencyRequestJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("emergencyRequestJPanel", erjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_emergencyjButton1ActionPerformed

    private void respondjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondjButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = emergencyEnquiryjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }

        WorkRequest request = (WorkRequest) emergencyEnquiryjTable1.getValueAt(selectedRow, 3);
        if (request instanceof EmergencyDoctorEnquiryWorkRequest) {
            EmergencyDoctorEnquiryWorkRequest edewr = (EmergencyDoctorEnquiryWorkRequest) request;
            int MRN = edewr.getMRN();

            if (enterprise instanceof HospitalEnterprise) {
                HospitalEnterprise hent = (HospitalEnterprise) enterprise;
                for (Encounter encounter : hent.getEncounterList()) {
                    if (encounter.getPatient().getMRN() == MRN) {
                        edewr.getEncounterList().add(encounter);
                    }
                }
            }
            if (enterprise instanceof ClinicEnterprise) {
                ClinicEnterprise cent = (ClinicEnterprise) enterprise;
                for (Encounter encounter : cent.getEncounterList()) {
                    if (encounter.getPatient().getMRN() == MRN) {
                        edewr.getEncounterList().add(encounter);
                    }
                }
            }
        }
        enterprise.getWorkQueue().getWorkRequestList().remove(request);
        JOptionPane.showMessageDialog(null, "Patient records sent.");
        populateTable();
    }//GEN-LAST:event_respondjButton1ActionPerformed

    private void networkCommunicationjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkCommunicationjButton1ActionPerformed
        // TODO add your handling code here:
        NetworkCommunicationRequestJPanel ncrjp = new NetworkCommunicationRequestJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("networkCommunicationRequestJPanel", ncrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_networkCommunicationjButton1ActionPerformed

    private void viewBroadcastsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBroadcastsjButton1ActionPerformed
        // TODO add your handling code here:

        if (enterprise instanceof PharmacyEnterprise) {
            WorkQueue wq = enterprise.getWorkQueue();
            ViewBroadcastJPanel vbjp = new ViewBroadcastJPanel(userProcessContainer, wq);
            userProcessContainer.add("viewbroadcastJPanel", vbjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewBroadcastsjButton1ActionPerformed

    private void rollbackjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollbackjButton1ActionPerformed
        // TODO add your handling code here:
        RollBackDrugsJPanel rbdjp = new RollBackDrugsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("RollBackDrugsJPanel", rbdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_rollbackjButton1ActionPerformed

    private void viewDrugCallBackjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugCallBackjButton1ActionPerformed
        // TODO add your handling code here:
        ViewDrugCallBackRequestJPanel vdcrjp = new ViewDrugCallBackRequestJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ViewDrugCallBackRequest", vdcrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDrugCallBackjButton1ActionPerformed

    private void viewDrugFeedbackjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugFeedbackjButton1ActionPerformed
        // TODO add your handling code here:
        ViewDrugFeedbackJPanel vdfjp = new ViewDrugFeedbackJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ViewDrugFeedbackJP", vdfjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDrugFeedbackjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable emergencyEnquiryjTable1;
    private javax.swing.JPanel emergencyPaneljPanel1;
    private javax.swing.JLabel emergencyRequestsjLabel3;
    private javax.swing.JButton emergencyjButton1;
    private javax.swing.JLabel emergencyjLabel2;
    private javax.swing.JLabel entNamejLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageDrugsjButton1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton managePatientjButton1;
    private javax.swing.JButton managePersonJButton;
    private javax.swing.JButton managePharmacyWorkRequestjButton1;
    private javax.swing.JButton managePharmacyjButton1;
    private javax.swing.JButton networkCommunicationjButton1;
    private javax.swing.JButton respondjButton1;
    private javax.swing.JButton rollbackjButton1;
    private javax.swing.JButton viewBroadcastsjButton1;
    private javax.swing.JButton viewDrugCallBackjButton1;
    private javax.swing.JButton viewDrugFeedbackjButton1;
    private javax.swing.JButton viewMyPharmaciesjButton1;
    // End of variables declaration//GEN-END:variables
}
