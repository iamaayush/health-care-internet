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
import Business.Network.NetworkCity;
import Business.Network.NetworkCountry;
import Business.Network.NetworkState;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.WorkQueue.ReferredDoctorWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class ReferAnotherDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReferAnotherDoctorJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Patient patient;
    private ArrayList<Encounter> encounterList;
    private Doctor doctor;
    private Enterprise sendEnt;

    public ReferAnotherDoctorJPanel(JPanel upc, EcoSystem system, Patient patient, ArrayList<Encounter> elist, Doctor doctor, Enterprise sendEnt) {
        initComponents();
        userProcessContainer = upc;
        this.system = system;
        this.patient = patient;
        encounterList = elist;
        this.doctor = doctor;
        this.sendEnt = sendEnt;

        populateCountryComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void populateCountryComboBox() {
        countryjComboBox1.removeAllItems();
        for (NetworkCountry networkCountry : system.getCountryNetworkList()) {
            countryjComboBox1.addItem(networkCountry);
        }
//        populateStateComboBox();
    }

    private void populateStateComboBox(NetworkCountry nc) {
        statejComboBox2.removeAllItems();
//        NetworkCountry nc = (NetworkCountry) countryjComboBox1.getSelectedItem();
//        if (nc != null) {
        for (NetworkState networkState : nc.getStateList()) {
            statejComboBox2.addItem(networkState);
        }
//            populateCityComboBox();
//        }
    }

    private void populateCityComboBox(NetworkState ns) {
        cityjComboBox3.removeAllItems();
//        NetworkState ns = (NetworkState) statejComboBox2.getSelectedItem();
//        if (ns != null) {
        for (NetworkCity networkCity : ns.getCityList()) {
            cityjComboBox3.addItem(networkCity);
        }
//            populateEnterpriseComboBox();
//        }

    }

    private void populateEnterpriseComboBox(NetworkCity nci) {
        enterprisejComboBox4.removeAllItems();
//        NetworkCity ncity = (NetworkCity) cityjComboBox3.getSelectedItem();
//        if (ncity != null) {
        for (Enterprise enterpr : nci.getEnterpriseDirectory().getEnterpriseList()) {
            if ((enterpr instanceof HospitalEnterprise) || (enterpr instanceof ClinicEnterprise)) {
                enterprisejComboBox4.addItem(enterpr);
//                    populateTable(enterpr);
            }
        }
//        }
    }

    private void populateTable(Enterprise enterprise) {

        DefaultTableModel dtm = (DefaultTableModel) doctorJTable.getModel();
        dtm.setRowCount(0);

        Object[] row = new Object[3];
        if ((enterprise instanceof HospitalEnterprise) || (enterprise instanceof ClinicEnterprise)) {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (Person person : organization.getPersonDirectory().getPersonList()) {
                    if (person instanceof Doctor) {
                        Doctor doct = (Doctor) person;

                        if (!doct.equals(doctor)) {
                            row[0] = doct.getDoctorLiscenceID();
                            row[1] = doct;
                            row[2] = doct.getSpeciality();

                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        doctorJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        countryjComboBox1 = new javax.swing.JComboBox();
        statejComboBox2 = new javax.swing.JComboBox();
        cityjComboBox3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        enterprisejComboBox4 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sendPatientDetailsjButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        messagejTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();

        doctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Liscence ID", "Doctor Name", "Specialization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorJTable);

        jLabel3.setText("City:");

        countryjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryjComboBox1ActionPerformed(evt);
            }
        });

        statejComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statejComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statejComboBox2ActionPerformed(evt);
            }
        });

        cityjComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityjComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityjComboBox3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Enterprise :");

        enterprisejComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterprisejComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisejComboBox4ActionPerformed(evt);
            }
        });

        jLabel2.setText("State:");

        jLabel1.setText("Country:");

        sendPatientDetailsjButton1.setText("Send Patient Details");
        sendPatientDetailsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPatientDetailsjButton1ActionPerformed(evt);
            }
        });

        messagejTextArea1.setColumns(20);
        messagejTextArea1.setRows(5);
        jScrollPane2.setViewportView(messagejTextArea1);

        jLabel5.setText("Message:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(countryjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(statejComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityjComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterprisejComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backjButton1)
                                .addGap(142, 142, 142)
                                .addComponent(sendPatientDetailsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(countryjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(statejComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cityjComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(enterprisejComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(sendPatientDetailsjButton1)
                        .addGap(21, 21, 21))
                    .addComponent(backjButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void countryjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryjComboBox1ActionPerformed
        // TODO add your handling code here:
        NetworkCountry nc = (NetworkCountry) countryjComboBox1.getSelectedItem();
        if (nc != null) {
            populateStateComboBox(nc);
        }
    }//GEN-LAST:event_countryjComboBox1ActionPerformed

    private void statejComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statejComboBox2ActionPerformed
        // TODO add your handling code here:
        NetworkState ns = (NetworkState) statejComboBox2.getSelectedItem();
        if (ns != null) {
            populateCityComboBox(ns);
        }
    }//GEN-LAST:event_statejComboBox2ActionPerformed

    private void cityjComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityjComboBox3ActionPerformed
        // TODO add your handling code here:
        NetworkCity nci = (NetworkCity) cityjComboBox3.getSelectedItem();
        if (nci != null) {
            populateEnterpriseComboBox(nci);
        }
    }//GEN-LAST:event_cityjComboBox3ActionPerformed

    private void enterprisejComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisejComboBox4ActionPerformed
        // TODO add your handling code here:
        enterprise = (Enterprise) enterprisejComboBox4.getSelectedItem();
        if (enterprise != null) {
            populateTable(enterprise);
        }
    }//GEN-LAST:event_enterprisejComboBox4ActionPerformed

    private void sendPatientDetailsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPatientDetailsjButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = doctorJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }
        String message = messagejTextArea1.getText();
        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Message cannot be empty.");
        }

        Doctor doc = (Doctor) doctorJTable.getValueAt(selectedRow, 1);

        ReferredDoctorWorkRequest rdwr = new ReferredDoctorWorkRequest();

        rdwr.setEncounterList(encounterList);

        patient.setReferredDoctor(doc);
        patient.setEntreffDoc(enterprise);

        rdwr.setPatient(patient);
        rdwr.setRecvEnt(enterprise);
        rdwr.setRequestDate(new Date());
        rdwr.setSendEnt(sendEnt);
        rdwr.setSender(doctor);
        rdwr.setReceiver(doc);
        rdwr.setStatus("Reffered to Dr. " + doc);
        rdwr.setMessage(message);

        patient.getWorkQueue().getWorkRequestList().add(rdwr);
        doctor.getWorkQueue().getWorkRequestList().add(rdwr);
        doc.getWorkQueue().getWorkRequestList().add(rdwr);

        messagejTextArea1.setText("");
        JOptionPane.showMessageDialog(null, "Request sent to doctor.");

    }//GEN-LAST:event_sendPatientDetailsjButton1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JComboBox cityjComboBox3;
    private javax.swing.JComboBox countryjComboBox1;
    private javax.swing.JTable doctorJTable;
    private javax.swing.JComboBox enterprisejComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messagejTextArea1;
    private javax.swing.JButton sendPatientDetailsjButton1;
    private javax.swing.JComboBox statejComboBox2;
    // End of variables declaration//GEN-END:variables
}
