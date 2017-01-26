/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Nurse;
import Business.Person.Person;
import Business.Role.NurseRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class AddNurseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNurseJPanel
     */
    private JPanel userProcessContainer;
    private Organization nurseOrg;

    public AddNurseJPanel(JPanel upc, Organization organization) {
        initComponents();
        this.userProcessContainer = upc;
        this.nurseOrg = organization;
        
        jDateChooser1.getDateEditor().setEnabled(false);
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) nursejTable1.getModel();

        dtm.setRowCount(0);

        for (UserAccount userAccount : nurseOrg.getUserAccountDirectory().getUserAccountList()) {
            if (userAccount.getPerson() instanceof Nurse) {
                Person person = userAccount.getPerson();
                Nurse nurse = (Nurse) person;
                Object[] row = new Object[3];
                row[0] = nurse.getNurseLiscenceID();
                row[1] = nurse;
                row[2] = userAccount;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        nursejTable1 = new javax.swing.JTable();
        firstNamejLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submitjButton1 = new javax.swing.JButton();
        lastNamejLabel1 = new javax.swing.JLabel();
        lastNamejTextField1 = new javax.swing.JTextField();
        firstNamejTextField3 = new javax.swing.JTextField();
        passwordjTextField2 = new javax.swing.JTextField();
        usernamejTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nurseLiscenceIDjTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        genderjComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        uniqueIDjTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        primaryContactjTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        line1AddressjTextField2 = new javax.swing.JTextField();
        cityjTextField3 = new javax.swing.JTextField();
        statejTextField4 = new javax.swing.JTextField();
        countryjTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        degreejTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        primaryLanguagejTextField1 = new javax.swing.JTextField();
        deletejButton2 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nursejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Liscence ID", "Nurse Name", "UserName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(nursejTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 730, 92));

        firstNamejLabel5.setText("First Name:");
        add(firstNamejLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        submitjButton1.setText("Submit");
        submitjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButton1ActionPerformed(evt);
            }
        });
        add(submitjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 140, 40));

        lastNamejLabel1.setText("Last Name:");
        add(lastNamejLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));
        add(lastNamejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 122, -1));
        add(firstNamejTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 122, -1));
        add(passwordjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 122, -1));
        add(usernamejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 122, -1));

        jLabel3.setText("UserName:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel1.setText("Nurse Liscence ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));
        add(nurseLiscenceIDjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 122, -1));

        jLabel2.setText("Gender:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        genderjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        add(genderjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 122, -1));

        jLabel5.setText("Unique ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));
        add(uniqueIDjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 122, -1));

        jLabel6.setText("DOB:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 122, -1));

        jLabel7.setText("Primary Contact Number:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));
        add(primaryContactjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("ADDRESS");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        jLabel9.setText("City:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jLabel10.setText("State:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jLabel11.setText("Country:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, -1, -1));

        jLabel12.setText("Line 1:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        line1AddressjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line1AddressjTextField2ActionPerformed(evt);
            }
        });
        add(line1AddressjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 310, -1));
        add(cityjTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 91, -1));
        add(statejTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 102, -1));
        add(countryjTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 101, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("User Account Details:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Personal Details:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jLabel15.setText("Higest Degree:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));
        add(degreejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 150, -1));

        jLabel16.setText("Primary Language:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, 20));
        add(primaryLanguagejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 150, -1));

        deletejButton2.setText("Delete");
        deletejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton2ActionPerformed(evt);
            }
        });
        add(deletejButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButton1ActionPerformed
        // TODO add your handling code here:
        String userName = usernamejTextField1.getText();
        String password = passwordjTextField2.getText();
        String fname = firstNamejTextField3.getText();
        String lname = lastNamejTextField1.getText();
        String nurseLiscenceID = nurseLiscenceIDjTextField1.getText();
        String gender = String.valueOf(genderjComboBox1.getSelectedItem());
        String uniqueID = uniqueIDjTextField1.getText();

        String DateFormat = "EEE, MMM d, yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
        Date d = jDateChooser1.getDate();
        Date Dob = d;

        String speciality = degreejTextField1.getText();
        String primaryContact = primaryContactjTextField1.getText();
        String line1 = line1AddressjTextField2.getText();
        String city = cityjTextField3.getText();
        String state = statejTextField4.getText();
        String country = countryjTextField5.getText();
        String primaryLanguage = primaryLanguagejTextField1.getText();
        String degree = degreejTextField1.getText();

        if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Date Field cannot be empty");
            return;
        }

        if (!(userName.isEmpty() || password.isEmpty() || fname.isEmpty() || lname.isEmpty() || nurseLiscenceID.isEmpty() || gender.isEmpty()
                || uniqueID.isEmpty() || String.valueOf(Dob).isEmpty() || speciality.isEmpty() || primaryContact.isEmpty() || line1.isEmpty()
                || city.isEmpty() || state.isEmpty() || country.isEmpty() || primaryLanguage.isEmpty()
                || usernamejTextField1.getText().isEmpty() || passwordjTextField2.getText().isEmpty())) {
               
            if(EcoSystem.checkIfUsernameUnique(userName) == false)
            {
                return;
            }
            
            Nurse nurse = new Nurse();

                UserAccount userAccount = nurseOrg.getUserAccountDirectory().createUserAccount(userName, password, nurse, new NurseRole());

                nurse.setGender(gender);
                nurse.setUniqueId(uniqueID);
                nurse.setAddressline1(line1);
                nurse.setCity(city);
                nurse.setCountry(country);
                nurse.setFirstName(fname);
                nurse.setLastName(lname);
                nurse.setDateOfBirth(Dob);
                nurse.setState(state);
                nurse.setPrimaryLanguage(primaryLanguage);
                nurse.setPrimaryContact(primaryContact);
                nurse.setNurseLiscenceID(nurseLiscenceID);
                nurse.setDegree(degree);
                nurseOrg.getPersonDirectory().createPerson(nurse);
                populateTable();
            }  else {
            JOptionPane.showMessageDialog(null, "No Fields can be left blank");
        }
    }//GEN-LAST:event_submitjButton1ActionPerformed

    private void line1AddressjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line1AddressjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line1AddressjTextField2ActionPerformed

    private void deletejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton2ActionPerformed
        // TODO add your handling code here:
        int row = nursejTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
        } else {
            int selectedValue = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Delete?", "WARNING", JOptionPane.YES_NO_OPTION);

            if (selectedValue == JOptionPane.YES_OPTION) {
                Nurse nurse = (Nurse) nursejTable1.getValueAt(row, 1);
                nurseOrg.getPersonDirectory().getPersonList().remove(nurse);

                UserAccount ua = (UserAccount) nursejTable1.getValueAt(row, 2);
                nurseOrg.getUserAccountDirectory().getUserAccountList().remove(ua);

                populateTable();
            } else {
                return;
            }
        }
    }//GEN-LAST:event_deletejButton2ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField cityjTextField3;
    private javax.swing.JTextField countryjTextField5;
    private javax.swing.JTextField degreejTextField1;
    private javax.swing.JButton deletejButton2;
    private javax.swing.JLabel firstNamejLabel5;
    private javax.swing.JTextField firstNamejTextField3;
    private javax.swing.JComboBox genderjComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNamejLabel1;
    private javax.swing.JTextField lastNamejTextField1;
    private javax.swing.JTextField line1AddressjTextField2;
    private javax.swing.JTextField nurseLiscenceIDjTextField1;
    private javax.swing.JTable nursejTable1;
    private javax.swing.JTextField passwordjTextField2;
    private javax.swing.JTextField primaryContactjTextField1;
    private javax.swing.JTextField primaryLanguagejTextField1;
    private javax.swing.JTextField statejTextField4;
    private javax.swing.JButton submitjButton1;
    private javax.swing.JTextField uniqueIDjTextField1;
    private javax.swing.JTextField usernamejTextField1;
    // End of variables declaration//GEN-END:variables
}