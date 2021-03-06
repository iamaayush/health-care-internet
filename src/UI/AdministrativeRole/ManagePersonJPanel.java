/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.DrugManagementOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Person.Doctor;
import Business.Person.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem system;

    public ManagePersonJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        populateTable();
        populateOrganizationJCombo();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) personjTable1.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (organization instanceof DoctorOrganization) {
            for (Person person : organization.getPersonDirectory().getPersonList()) {
                Object[] row = new Object[3];
                row[0] = person;
                row[1] = person.getUniqueId();
                row[2] = organization;

                model.addRow(row);
            }
        }
//        }
    }

    private void populateOrganizationJCombo() {

        organizationjComboBox1.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationjComboBox1.addItem(organization);
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

        organizationjComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        addDoctorjButton2 = new javax.swing.JButton();
        addNursejButton3 = new javax.swing.JButton();
        addLabAssistantjButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personjTable1 = new javax.swing.JTable();
        deletejButton1 = new javax.swing.JButton();
        refreshTableJButton = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        createDrugManagerjButton1 = new javax.swing.JButton();

        organizationjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationjComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization:");

        addDoctorjButton2.setText("Add Doctor");
        addDoctorjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorjButton2ActionPerformed(evt);
            }
        });

        addNursejButton3.setText("Create Nurse");
        addNursejButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNursejButton3ActionPerformed(evt);
            }
        });

        addLabAssistantjButton4.setText("Create Lab Assistant");
        addLabAssistantjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLabAssistantjButton4ActionPerformed(evt);
            }
        });

        personjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Person Name", "Person ID", "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personjTable1);

        deletejButton1.setText("Remove Doctor");
        deletejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton1ActionPerformed(evt);
            }
        });

        refreshTableJButton.setText("Refresh");
        refreshTableJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableJButtonActionPerformed(evt);
            }
        });

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        createDrugManagerjButton1.setText("Create Drug Manager");
        createDrugManagerjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDrugManagerjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(organizationjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addDoctorjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addNursejButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addLabAssistantjButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createDrugManagerjButton1))
                            .addComponent(backjButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(refreshTableJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deletejButton1)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(deletejButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshTableJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(organizationjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDoctorjButton2)
                    .addComponent(addNursejButton3)
                    .addComponent(addLabAssistantjButton4)
                    .addComponent(createDrugManagerjButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(backjButton1)
                .addGap(105, 105, 105))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationjComboBox1ActionPerformed
        // TODO add your handling code here:

        Organization organization = (Organization) organizationjComboBox1.getSelectedItem();

        if (organization instanceof DoctorOrganization) {
//            addDoctorjButton2.setEnabled(true);
            addNursejButton3.setEnabled(false);
            addLabAssistantjButton4.setEnabled(false);
            createDrugManagerjButton1.setEnabled(false);
            addDoctorjButton2.setEnabled(true);
        }

        if (organization instanceof NurseOrganization) {
            addDoctorjButton2.setEnabled(false);
            createDrugManagerjButton1.setEnabled(false);
            addLabAssistantjButton4.setEnabled(false);
            addNursejButton3.setEnabled(true);
        }

        if (organization instanceof LabOrganization) {
            addDoctorjButton2.setEnabled(false);
            addNursejButton3.setEnabled(false);
            createDrugManagerjButton1.setEnabled(false);
            addLabAssistantjButton4.setEnabled(true);
        }
        if (organization instanceof PatientOrganization) {
            addDoctorjButton2.setEnabled(false);
            addNursejButton3.setEnabled(false);
            addLabAssistantjButton4.setEnabled(false);
            createDrugManagerjButton1.setEnabled(false);
        }
        if (organization instanceof DrugManagementOrganization) {
            addDoctorjButton2.setEnabled(false);
            addNursejButton3.setEnabled(false);
            addLabAssistantjButton4.setEnabled(false);
            createDrugManagerjButton1.setEnabled(true);
        }


    }//GEN-LAST:event_organizationjComboBox1ActionPerformed

    private void addDoctorjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorjButton2ActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DoctorOrganization) {
                flag = true;
            }
        }
        if (flag) {
            AddDoctorToEnterpriseJPanel adtejp = new AddDoctorToEnterpriseJPanel(userProcessContainer, enterprise, system);
            userProcessContainer.add("addDoctorToEnterpriseJPanel", adtejp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Doctor Enterprise not added yet");
            return;
        }
    }//GEN-LAST:event_addDoctorjButton2ActionPerformed

    private void deletejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton1ActionPerformed
        // TODO add your handling code here:
        int row = personjTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
        } else {

            Person person = (Person) personjTable1.getValueAt(row, 0);
            if (person instanceof Doctor) {
                int selectedValue = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Delete?", "WARNING", JOptionPane.YES_NO_OPTION);

                if (selectedValue == JOptionPane.YES_OPTION) {
                    for (Organization organ : enterprise.getOrganizationDirectory().getOrganizationList()) {

                        if (organ instanceof DoctorOrganization) {
                            Doctor doctor = (Doctor) personjTable1.getValueAt(row, 0);
                            organ.getPersonDirectory().getPersonList().remove(doctor);
                            doctor.getMyEnterpriseList().remove(enterprise);
                            populateTable();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Only doctor can be removed from here.");
            }
        }
    }//GEN-LAST:event_deletejButton1ActionPerformed

    private void refreshTableJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableJButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshTableJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void addNursejButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNursejButton3ActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof NurseOrganization) {
                flag = true;
            }
        }
        if (flag == true) {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof NurseOrganization) {
                    AddNurseJPanel anjp = new AddNurseJPanel(userProcessContainer, organization);
                    userProcessContainer.add("addNurseJPanel", anjp);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Add Nurse Organization.");
        }
    }//GEN-LAST:event_addNursejButton3ActionPerformed

    private void addLabAssistantjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLabAssistantjButton4ActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof LabOrganization) {
                flag = true;
            }
        }
        if (flag == true) {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof LabOrganization) {
                    LabOrganization lOrg = (LabOrganization) organization;
                    AddLabOrgJPanel alojp = new AddLabOrgJPanel(userProcessContainer, lOrg);
                    userProcessContainer.add("addLabOrgJPanel", alojp);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Add Lab Organization.");
        }
    }//GEN-LAST:event_addLabAssistantjButton4ActionPerformed

    private void createDrugManagerjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDrugManagerjButton1ActionPerformed
        // TODO add your handling code here:
        boolean flag1 = false;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DrugManagementOrganization) {
                flag1 = true;
            }
        }
        if (flag1 == true) {

            CreateDrugManagerJPanel cdmjp = new CreateDrugManagerJPanel(userProcessContainer, enterprise);
            userProcessContainer.add("createDrugManagerJPanel", cdmjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Add Drug Manager Organization.");
        }

    }//GEN-LAST:event_createDrugManagerjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctorjButton2;
    private javax.swing.JButton addLabAssistantjButton4;
    private javax.swing.JButton addNursejButton3;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createDrugManagerjButton1;
    private javax.swing.JButton deletejButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationjComboBox1;
    private javax.swing.JTable personjTable1;
    private javax.swing.JButton refreshTableJButton;
    // End of variables declaration//GEN-END:variables
}
