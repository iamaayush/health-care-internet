/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.NetworkCity;
import Business.Network.NetworkCountry;
import Business.Network.NetworkState;
import Business.Person.Person;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class ManageEnterpriseAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdmin
     */
    private JPanel userProcessContainer;
    private Enterprise ent;
    private EcoSystem system;

    public ManageEnterpriseAdmin(JPanel userProcessContainer, EcoSystem system, Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.ent = ent;
        String label = "Set Admin for " + ent.getName();
        enterpriseNetworkjLabel1.setText(label);
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminjTable1.getModel();
        model.setRowCount(0);

        for (NetworkCountry networkCountry : system.getCountryNetworkList()) {
            for (NetworkState networkState : networkCountry.getStateList()) {
                for (NetworkCity networkCity : networkState.getCityList()) {
                    for (Enterprise enterprise : networkCity.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                            Object[] row = new Object[6];
                            row[0] = enterprise;
                            row[1] = ua.getPerson();
                            row[2] = ua;
                            row[3] = networkCountry;
                            row[4] = networkState;
                            row[5] = networkCity;

                            model.addRow(row);
                        }
                    }
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
        enterpriseAdminjTable1 = new javax.swing.JTable();
        deletejButton1 = new javax.swing.JButton();
        enterpriseNetworkjLabel1 = new javax.swing.JLabel();
        firstNamejTextField3 = new javax.swing.JTextField();
        firstNamejLabel5 = new javax.swing.JLabel();
        usernamejTextField1 = new javax.swing.JTextField();
        passwordjTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitjButton1 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        lastNamejLabel1 = new javax.swing.JLabel();
        lastNamejTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        personIDjTextField1 = new javax.swing.JTextField();

        enterpriseAdminjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Enterprise name", "Admin Name", "UserName", "Country", "State", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminjTable1);

        deletejButton1.setText("Delete");
        deletejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton1ActionPerformed(evt);
            }
        });

        enterpriseNetworkjLabel1.setText("enterpriseNetwork J label");

        firstNamejLabel5.setText("First Name:");

        jLabel4.setText("Password:");

        jLabel3.setText("UserName:");

        submitjButton1.setText("Submit");
        submitjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButton1ActionPerformed(evt);
            }
        });

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        lastNamejLabel1.setText("Last Name:");

        jLabel1.setText("Person ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 140, Short.MAX_VALUE)
                        .addComponent(enterpriseNetworkjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(deletejButton1)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lastNamejLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(firstNamejLabel5)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backjButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(submitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(firstNamejTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastNamejTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(personIDjTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletejButton1)
                    .addComponent(enterpriseNetworkjLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(passwordjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNamejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNamejLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNamejLabel1)
                            .addComponent(lastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(personIDjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backjButton1)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deletejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton1ActionPerformed
        // TODO add your handling code here:
        int row = enterpriseAdminjTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
        } else {
            int selectedValue = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Delete?", "WARNING", JOptionPane.YES_NO_OPTION);

            if (selectedValue == JOptionPane.YES_OPTION) {
                Enterprise enterprise = (Enterprise) enterpriseAdminjTable1.getValueAt(row, 0);
                UserAccount userAccount = (UserAccount) enterpriseAdminjTable1.getValueAt(row, 2);
                Person person = (Person)enterpriseAdminjTable1.getValueAt(row, 1);
                
                enterprise.getUserAccountDirectory().removeUserAccount(userAccount);
                enterprise.getPersonDirectory().getPersonList().remove(person);
                populateTable();
            }
        }
    }//GEN-LAST:event_deletejButton1ActionPerformed

    private void submitjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButton1ActionPerformed
        // TODO add your handling code here:
        String userName = usernamejTextField1.getText();
        String password = passwordjTextField2.getText();
        String fname = firstNamejTextField3.getText();
        String lname = lastNamejTextField1.getText();
        String id = personIDjTextField1.getText();

        if (!((userName.isEmpty()) || (password.isEmpty()) ||(id.isEmpty()) 
                || (fname.isEmpty()) || (lname.isEmpty()))) {

            if(EcoSystem.checkIfUsernameUnique(userName) == false)
            {
                return;
            }
            Person person = new Person();
            person.setFirstName(fname);
            person.setLastName(lname);
            person.setUniqueId(lname);
            
            ent.getPersonDirectory().getPersonList().add(person);
            UserAccount userAccount = ent.getUserAccountDirectory().createUserAccount(userName, password, person, new AdminRole());

            submitjButton1.setEnabled(false);
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Fields cannot be left blank.");
        }

    }//GEN-LAST:event_submitjButton1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton deletejButton1;
    private javax.swing.JTable enterpriseAdminjTable1;
    private javax.swing.JLabel enterpriseNetworkjLabel1;
    private javax.swing.JLabel firstNamejLabel5;
    private javax.swing.JTextField firstNamejTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNamejLabel1;
    private javax.swing.JTextField lastNamejTextField1;
    private javax.swing.JTextField passwordjTextField2;
    private javax.swing.JTextField personIDjTextField1;
    private javax.swing.JButton submitjButton1;
    private javax.swing.JTextField usernamejTextField1;
    // End of variables declaration//GEN-END:variables
}
