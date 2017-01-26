/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Person.LabAssistant;
import Business.Person.Person;
import Business.Role.LabAssistantRole;
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
public class AddLabOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddLabOrgJPanel
     */
    private JPanel userProcessContainer;
    private Organization labAssistOrg;

    public AddLabOrgJPanel(JPanel upc, Organization organization) {
        initComponents();
        this.userProcessContainer = upc;
        this.labAssistOrg = organization;
        
        populateTable();
        
        jDateChooser1.getDateEditor().setEnabled(false);
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) labjTable1.getModel();

        dtm.setRowCount(0);

        for (UserAccount userAccount : labAssistOrg.getUserAccountDirectory().getUserAccountList()) {
            if (userAccount.getPerson() instanceof LabAssistant) {
                Person person = userAccount.getPerson();
                LabAssistant la = (LabAssistant) person;
                Object[] row = new Object[3];
                row[0] = la.getLabAssistLiscenceID();
                row[1] = la;
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

        countryjTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        statejTextField4 = new javax.swing.JTextField();
        specialityjTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        usernamejTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        passwordjTextField2 = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        primaryLanguagejTextField1 = new javax.swing.JTextField();
        deletejButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        firstNamejTextField3 = new javax.swing.JTextField();
        line1AddressjTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lastNamejLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lastNamejTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submitjButton1 = new javax.swing.JButton();
        cityjTextField3 = new javax.swing.JTextField();
        firstNamejLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        labjTable1 = new javax.swing.JTable();
        primaryContactjTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labAssistLiscenceIDjTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        genderjComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        uniqueIDjTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("User Account Details:");

        jLabel1.setText("Liscence ID:");

        jLabel16.setText("Primary Language:");

        jLabel3.setText("UserName:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Personal Details:");

        jLabel15.setText("Speciality:");

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        deletejButton2.setText("Delete");
        deletejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Line 1:");

        line1AddressjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line1AddressjTextField2ActionPerformed(evt);
            }
        });

        jLabel10.setText("State:");

        lastNamejLabel1.setText("Last Name:");

        jLabel11.setText("Country:");

        jLabel4.setText("Password:");

        submitjButton1.setText("Submit");
        submitjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButton1ActionPerformed(evt);
            }
        });

        firstNamejLabel5.setText("First Name:");

        labjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Liscence ID", "Lab Assist Name", "UserName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(labjTable1);

        jLabel7.setText("Primary Contact Number:");

        jLabel9.setText("City:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("ADDRESS");

        jLabel2.setText("Gender:");

        genderjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel5.setText("Unique ID:");

        jLabel6.setText("DOB:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(deletejButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel13))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(passwordjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel14))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(labAssistLiscenceIDjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(jLabel15)
                .addGap(41, 41, 41)
                .addComponent(specialityjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(firstNamejLabel5)
                .addGap(25, 25, 25)
                .addComponent(firstNamejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addComponent(primaryContactjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lastNamejLabel1)
                .addGap(26, 26, 26)
                .addComponent(lastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel16)
                .addGap(40, 40, 40)
                .addComponent(primaryLanguagejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(genderjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(uniqueIDjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addComponent(line1AddressjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel9)
                .addGap(117, 117, 117)
                .addComponent(jLabel10)
                .addGap(120, 120, 120)
                .addComponent(jLabel11))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(cityjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(statejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(countryjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(submitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(backjButton1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deletejButton2)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(passwordjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel14)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labAssistLiscenceIDjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(specialityjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNamejLabel5)
                    .addComponent(firstNamejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(primaryContactjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNamejLabel1)
                    .addComponent(lastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primaryLanguagejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(genderjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(line1AddressjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(uniqueIDjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(submitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(backjButton1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void deletejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton2ActionPerformed
        // TODO add your handling code here:
        int row = labjTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
        } else {
            int selectedValue = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Delete?", "WARNING", JOptionPane.YES_NO_OPTION);

            if (selectedValue == JOptionPane.YES_OPTION) {
                LabAssistant labAssist = (LabAssistant) labjTable1.getValueAt(row, 1);
                labAssistOrg.getPersonDirectory().getPersonList().remove(labAssist);

                UserAccount ua = (UserAccount) labjTable1.getValueAt(row, 2);
                labAssistOrg.getUserAccountDirectory().getUserAccountList().remove(ua);

                populateTable();
            } else {
                return;
            }
        }
    }//GEN-LAST:event_deletejButton2ActionPerformed

    private void line1AddressjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line1AddressjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line1AddressjTextField2ActionPerformed

    private void submitjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButton1ActionPerformed
        // TODO add your handling code here:
        String userName = usernamejTextField1.getText();
        String password = passwordjTextField2.getText();
        String fname = firstNamejTextField3.getText();
        String lname = lastNamejTextField1.getText();
        String labAssistLiscenceID = labAssistLiscenceIDjTextField1.getText();
        String gender = String.valueOf(genderjComboBox1.getSelectedItem());
        String uniqueID = uniqueIDjTextField1.getText();

        String DateFormat = "EEE, MMM d, yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
        Date d = jDateChooser1.getDate();
        Date Dob = d;

        String speciality = specialityjTextField1.getText();
        String primaryContact = primaryContactjTextField1.getText();
        String line1 = line1AddressjTextField2.getText();
        String city = cityjTextField3.getText();
        String state = statejTextField4.getText();
        String country = countryjTextField5.getText();
        String primaryLanguage = primaryLanguagejTextField1.getText();
        String degree = specialityjTextField1.getText();

        if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Date Field cannot be empty");
            return;
        }

        if (!(userName.isEmpty() || password.isEmpty() || fname.isEmpty() || lname.isEmpty() || labAssistLiscenceID.isEmpty() || gender.isEmpty()
                || uniqueID.isEmpty() || String.valueOf(Dob).isEmpty() || speciality.isEmpty() || primaryContact.isEmpty() || line1.isEmpty()
                || city.isEmpty() || state.isEmpty() || country.isEmpty() || primaryLanguage.isEmpty()
                || usernamejTextField1.getText().isEmpty() || passwordjTextField2.getText().isEmpty())) {
        
            if(EcoSystem.checkIfUsernameUnique(userName) == false)
            {
                return;
            }
                LabAssistant labAssist = new LabAssistant();

                UserAccount userAccount = labAssistOrg.getUserAccountDirectory().createUserAccount(userName, password, labAssist, new LabAssistantRole());

                labAssist.setGender(gender);
                labAssist.setUniqueId(uniqueID);
                labAssist.setAddressline1(line1);
                labAssist.setCity(city);
                labAssist.setCountry(country);
                labAssist.setFirstName(fname);
                labAssist.setLastName(lname);
                labAssist.setDateOfBirth(Dob);
                labAssist.setState(state);
                labAssist.setPrimaryLanguage(primaryLanguage);
                labAssist.setPrimaryContact(primaryContact);
                labAssist.setLabAssistLiscenceID(labAssistLiscenceID);

                labAssistOrg.getPersonDirectory().createPerson(labAssist);
                populateTable();
            }
        else {
            JOptionPane.showMessageDialog(null, "No Fields can be left blank");
        }
    }//GEN-LAST:event_submitjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField cityjTextField3;
    private javax.swing.JTextField countryjTextField5;
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
    private javax.swing.JTextField labAssistLiscenceIDjTextField1;
    private javax.swing.JTable labjTable1;
    private javax.swing.JLabel lastNamejLabel1;
    private javax.swing.JTextField lastNamejTextField1;
    private javax.swing.JTextField line1AddressjTextField2;
    private javax.swing.JTextField passwordjTextField2;
    private javax.swing.JTextField primaryContactjTextField1;
    private javax.swing.JTextField primaryLanguagejTextField1;
    private javax.swing.JTextField specialityjTextField1;
    private javax.swing.JTextField statejTextField4;
    private javax.swing.JButton submitjButton1;
    private javax.swing.JTextField uniqueIDjTextField1;
    private javax.swing.JTextField usernamejTextField1;
    // End of variables declaration//GEN-END:variables
}