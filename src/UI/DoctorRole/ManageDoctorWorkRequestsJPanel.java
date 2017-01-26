/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorRole;

import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class ManageDoctorWorkRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorWorkRequestsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterp;
    private Doctor doctor;
    private Doctor doc;
    private Organization docOrg;
    private Encounter encounter;
    private EcoSystem system;
    private Patient patient;
    private ArrayList<Encounter> encounterList;

    public ManageDoctorWorkRequestsJPanel(JPanel upc, Doctor doctor, EcoSystem system) {
        initComponents();
        userProcessContainer = upc;
        this.doctor = doctor;
        this.system = system;
        populateEntCombo();
    }

    private void populateTable(Enterprise enterprise) {
        DefaultTableModel dtm = (DefaultTableModel) workRequestsjTable1.getModel();

        dtm.setRowCount(0);

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof DoctorOrganization) {

                docOrg = org;
            }
        }
        for (Person p : docOrg.getPersonDirectory().getPersonList()) {
            if (p instanceof Doctor) {
                doc = (Doctor) p;
            }
            if (doc.equals(doctor)) {
                for (WorkRequest request : doctor.getWorkQueue().getWorkRequestList()) {
                    if (request instanceof EntAdminWorkRequest) {
                        EntAdminWorkRequest req = (EntAdminWorkRequest) request;
                        if (req.getEntSender() == enterprise) {
                            Object[] row = new Object[5];
                            row[0] = req.getPatient().getMRN();
                            row[1] = req.getPatient();
                            row[2] = req;
                            row[3] = req.getStatus();
                            row[4] = "Admin Request";

                            dtm.addRow(row);
                        }
                    }
                    if (request instanceof PatientWorkRequest) {
                        PatientWorkRequest req = (PatientWorkRequest) request;
                        if (req.getEntRecv() == enterprise) {
                            Object[] row = new Object[5];
                            row[0] = req.getPatient().getMRN();
                            row[1] = req.getPatient();
                            row[2] = req;
                            row[3] = req.getStatus();
                            row[4] = req.getAppointment();

                            dtm.addRow(row);
                        }
                    }
                    if (request instanceof ReferredDoctorWorkRequest) {

                        ReferredDoctorWorkRequest req = (ReferredDoctorWorkRequest) request;
                        if (req.getReceiver() == doctor) {
                            if (req.getRecvEnt() == enterprise) {

                                Object[] row = new Object[5];
                                row[0] = req.getPatient().getMRN();
                                row[1] = req.getPatient();
                                row[2] = req;
                                row[3] = req.getStatus();
                                row[4] = req.getAppointment() == null ? "pending" : req.getAppointment();

                                dtm.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }

    private void populateEntCombo() {
        enterprisejComboBox1.removeAllItems();

        for (Enterprise e : doctor.getMyEnterpriseList()) {
            enterprisejComboBox1.addItem(e);
        }
    }

    private ArrayList<Encounter> getEncounterList(Enterprise enter) {
        ArrayList<Encounter> encounterList = new ArrayList<>();

        if (enter instanceof HospitalEnterprise) {
            HospitalEnterprise hent = (HospitalEnterprise) enter;
            for (Encounter enc : hent.getEncounterList()) {
                if (enc.getPatient().equals(patient) && enc.getDoctor().equals(doctor)) {
                    encounterList.add(enc);
                }
            }
        }
        if (enter instanceof ClinicEnterprise) {
            ClinicEnterprise cent = (ClinicEnterprise) enter;
            for (Encounter enc : cent.getEncounterList()) {
                if (enc.getPatient().equals(patient) && enc.getDoctor().equals(doctor)) {
                    encounterList.add(enc);
                }
            }
        }
        return encounterList;
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
        workRequestsjTable1 = new javax.swing.JTable();
        enterprisejComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        enterpriseIDjLabel2 = new javax.swing.JLabel();
        processjButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        messagejTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        encounterjButton1 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        referAnotherDoctorjButton1 = new javax.swing.JButton();
        viewAllEncountersjButton1 = new javax.swing.JButton();

        workRequestsjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MRN", "Patient Name", "Message", "Status", "Appointment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestsjTable1);

        enterprisejComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterprisejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisejComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enterprise:");

        enterpriseIDjLabel2.setText("<enterpriseID>");

        processjButton1.setText("Process");
        processjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processjButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Appointment Details:");

        jLabel3.setText("Enterprise ID :");

        encounterjButton1.setText("Encounter >>");
        encounterjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterjButton1ActionPerformed(evt);
            }
        });

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        referAnotherDoctorjButton1.setText("Refer another doctor");
        referAnotherDoctorjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referAnotherDoctorjButton1ActionPerformed(evt);
            }
        });

        viewAllEncountersjButton1.setText("View All encounter(s)");
        viewAllEncountersjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllEncountersjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(backjButton1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(enterprisejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(enterpriseIDjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(26, 26, 26)
                            .addComponent(messagejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(processjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(referAnotherDoctorjButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encounterjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewAllEncountersjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterprisejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(enterpriseIDjLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewAllEncountersjButton1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(messagejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processjButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(encounterjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(referAnotherDoctorjButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterprisejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisejComboBox1ActionPerformed
        // TODO add your handling code here:
        enterp = (Enterprise) enterprisejComboBox1.getSelectedItem();
        if (enterp == null) {
            return;
        }
        enterpriseIDjLabel2.setText(String.valueOf(enterp.getOrganizationID()));

        populateTable(enterp);
    }//GEN-LAST:event_enterprisejComboBox1ActionPerformed

    private void processjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processjButton1ActionPerformed
        // TODO add your handling code here:

        String appointment = messagejTextField1.getText();
        int selectedRow = workRequestsjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }

        WorkRequest request = (WorkRequest) workRequestsjTable1.getValueAt(selectedRow, 2);

        if (appointment.isEmpty()) {
            int box = JOptionPane.showConfirmDialog(null, "Message field empty! Do you want to proceed?", "WARNING", JOptionPane.YES_NO_OPTION);
            if ((box == JOptionPane.NO_OPTION) || (box == JOptionPane.CANCEL_OPTION)) {
                return;
            }
        }
        if (request instanceof EntAdminWorkRequest) {
            EntAdminWorkRequest req = (EntAdminWorkRequest) request;
            req.setStatus("processed");
        } else if (request instanceof PatientWorkRequest) {
            PatientWorkRequest req = (PatientWorkRequest) request;
            req.setAppointment(appointment);
            req.setStatus("processed");
        }
        populateTable(enterp);
    }//GEN-LAST:event_processjButton1ActionPerformed

    private void encounterjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestsjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }

        WorkRequest request = (WorkRequest) workRequestsjTable1.getValueAt(selectedRow, 2);

        if (request instanceof ReferredDoctorWorkRequest) {
            ReferredDoctorWorkRequest rd = (ReferredDoctorWorkRequest) request;
            if (rd.getPatient().getReferredDoctor() == null) {
                JOptionPane.showMessageDialog(null, "Case already closed.");
                return;
            }
        }
        if (request instanceof PatientWorkRequest) {
            PatientWorkRequest pwr = (PatientWorkRequest) request;
            if (pwr.getPatient().getPrefferedDoctor() == doctor && pwr.getPatient().getReferredDoctor()==null) {
                JOptionPane.showMessageDialog(null, "Case already closed.");
                return;
            }
        }
        
        AddEncounterJPanel aejp = new AddEncounterJPanel(userProcessContainer, request, system);
        userProcessContainer.add("AddEncounterJPanel", aejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_encounterjButton1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void referAnotherDoctorjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referAnotherDoctorjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestsjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }
        encounterList = new ArrayList<>();
        WorkRequest request = (WorkRequest) workRequestsjTable1.getValueAt(selectedRow, 2);

        if (request instanceof ReferredDoctorWorkRequest) {

            JOptionPane.showMessageDialog(null, "This request cannot be further referred.");
            return;

        }
        if (request instanceof EntAdminWorkRequest) {
            EntAdminWorkRequest req = (EntAdminWorkRequest) request;
            patient = req.getPatient();
            if (!(patient.getReferredDoctor() == null)) {
                JOptionPane.showMessageDialog(null, "Doctor already referred");
                return;
            }

        } else if (request instanceof PatientWorkRequest) {
            PatientWorkRequest req = (PatientWorkRequest) request;
            patient = req.getPatient();
            if (patient.getReferredDoctor() != null) {
                JOptionPane.showMessageDialog(null, "This patient is already referred");
                return;
            }
//            if (!(patient.getPrefferedDoctor().equals(doctor))) {
//                patient = req.getPatient();
//
//            }
        }
        encounterList = getEncounterList(enterp);

        ReferAnotherDoctorJPanel radjp = new ReferAnotherDoctorJPanel(userProcessContainer, system, patient, encounterList, doctor, enterp);
        userProcessContainer.add("ReferAnotherDoctor", radjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_referAnotherDoctorjButton1ActionPerformed

    private void viewAllEncountersjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllEncountersjButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestsjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }
        encounterList = new ArrayList();
        ArrayList<Encounter> eList = new ArrayList<>();

        WorkRequest request = (WorkRequest) workRequestsjTable1.getValueAt(selectedRow, 2);
        if (request instanceof PatientWorkRequest) {

            PatientWorkRequest pwr = (PatientWorkRequest) request;
            Enterprise ent = pwr.getEntRecv();
            patient = pwr.getPatient();
//            encounterList = getEncounterList(ent);
            for (Encounter en : getEncounterList(ent)) {
                eList.add(en);
            }
        }
        if (request instanceof EntAdminWorkRequest) {

            EntAdminWorkRequest eawr = (EntAdminWorkRequest) request;
            Enterprise ent = eawr.getEntSender();
            patient = eawr.getPatient();
            ArrayList<Encounter> ens = getEncounterList(ent);
            for (Encounter en : ens) {
                eList.add(en);
            }
        }
        if (request instanceof ReferredDoctorWorkRequest) {

            ReferredDoctorWorkRequest rdwr = (ReferredDoctorWorkRequest) request;
            Enterprise ent = rdwr.getSendEnt();
            patient = rdwr.getPatient();
            eList = rdwr.getEncounterList();

            Enterprise entr = rdwr.getRecvEnt();

            for (Encounter en : getEncounterList(entr)) {
                eList.add(en);
            }
        }

        ViewEncounterJPanel vejp = new ViewEncounterJPanel(userProcessContainer, eList);
        userProcessContainer.add("ViewEncounterJPanel", vejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAllEncountersjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton encounterjButton1;
    private javax.swing.JLabel enterpriseIDjLabel2;
    private javax.swing.JComboBox enterprisejComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messagejTextField1;
    private javax.swing.JButton processjButton1;
    private javax.swing.JButton referAnotherDoctorjButton1;
    private javax.swing.JButton viewAllEncountersjButton1;
    private javax.swing.JTable workRequestsjTable1;
    // End of variables declaration//GEN-END:variables
}
