/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Person;
import Business.WorkQueue.EmergencyAdminWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class EmergencyRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyRequestJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public EmergencyRequestJPanel(JPanel upc, Enterprise enterprise) {
        initComponents();
        userProcessContainer = upc;
        this.enterprise = enterprise;

        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) doctorJTable.getModel();
        dtm.setRowCount(0);

        Object[] row = new Object[3];
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof DoctorOrganization) {
                for (Person person : org.getPersonDirectory().getPersonList()) {
                    if (person instanceof Doctor) {
                        Doctor doct = (Doctor) person;

                        row[0] = doct.getDoctorLiscenceID();
                        row[1] = doct;
                        row[2] = doct.getSpeciality();
                        
                        dtm.addRow(row);
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mrnjTextField1 = new javax.swing.JTextField();
        patientNamejTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorJTable = new javax.swing.JTable();
        sendjButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        messagejTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("MRN:");

        jLabel2.setText("Patient Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Create and Send Request to the Network:");

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

        sendjButton1.setText("Send");
        sendjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendjButton1ActionPerformed(evt);
            }
        });

        messagejTextArea1.setColumns(20);
        messagejTextArea1.setRows(5);
        jScrollPane2.setViewportView(messagejTextArea1);

        jLabel3.setText("Message:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mrnjTextField1)
                                    .addComponent(patientNamejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(sendjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mrnjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(patientNamejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(sendjButton1)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendjButton1ActionPerformed
        // TODO add your handling code here:
        
        String name = patientNamejTextField2.getText();
        String message = messagejTextArea1.getText();
        int MRN = Integer.parseInt(mrnjTextField1.getText());
        
        if(message.isEmpty())
        {
            int value = JOptionPane.showConfirmDialog(null, "Send Empty message?","WARNING",JOptionPane.YES_NO_OPTION);
        
            if(value == JOptionPane.YES_OPTION)
            {
                message = "EMERGENCY CASE";
            }
        }
                EmergencyAdminWorkRequest ewr = new EmergencyAdminWorkRequest();
            
                int selectedRow = doctorJTable.getSelectedRow();
                Doctor doctor = (Doctor)doctorJTable.getValueAt(selectedRow, 1);
                ewr.setDoctor(doctor);
                ewr.setEnterprise(enterprise);
                ewr.setMRN(MRN);
                ewr.setPatientName(name);
                ewr.setMessage(message);
                
                doctor.getWorkQueue().getWorkRequestList().add(ewr);        
    }//GEN-LAST:event_sendjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable doctorJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messagejTextArea1;
    private javax.swing.JTextField mrnjTextField1;
    private javax.swing.JTextField patientNamejTextField2;
    private javax.swing.JButton sendjButton1;
    // End of variables declaration//GEN-END:variables
}
