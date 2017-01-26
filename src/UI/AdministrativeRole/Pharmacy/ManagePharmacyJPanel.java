/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole.Pharmacy;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmacyStoreOrganization;
import Business.Pharmacy.PharmacyStores;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class ManagePharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePharmacyJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public ManagePharmacyJPanel(JPanel upc, Enterprise enterprise) {
        initComponents();
        userProcessContainer = upc;
        this.enterprise = enterprise;

        populateTable();
    }

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) storesjTable1.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PharmacyStoreOrganization) {
                PharmacyStoreOrganization pso = (PharmacyStoreOrganization) organization;
                for (PharmacyStores ps : pso.getPharmaStoresList()) {
                    Object[] row = new Object[5];
                    row[0] = ps;
                    row[1] = ps.getStoreID();
                    row[2] = ps.getCountry();
                    row[3] = ps.getState();
                    row[4] = ps.getCity();

                    model.addRow(row);
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
        storesjTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        storeNamejTextField1 = new javax.swing.JTextField();
        storeIDjTextField2 = new javax.swing.JTextField();
        countryjTextField3 = new javax.swing.JTextField();
        statejTextField4 = new javax.swing.JTextField();
        cityjTextField5 = new javax.swing.JTextField();
        createjButton1 = new javax.swing.JButton();
        deletejButton2 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();

        storesjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Store Name", "Store ID", "Country", "State", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storesjTable1);

        jLabel1.setText("Store Name:");

        jLabel2.setText("Store ID:");

        jLabel3.setText("Country:");

        jLabel4.setText("State:");

        jLabel5.setText("City:");

        createjButton1.setText("CREATE");
        createjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButton1ActionPerformed(evt);
            }
        });

        deletejButton2.setText("Delete");
        deletejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton2ActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(storeNamejTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(storeIDjTextField2)
                                    .addComponent(cityjTextField5))
                                .addComponent(countryjTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(statejTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(createjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deletejButton2)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(deletejButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(storeNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(storeIDjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(countryjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cityjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createjButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButton1ActionPerformed
        // TODO add your handling code here:

        String name = storeNamejTextField1.getText();
        String ID = storeIDjTextField2.getText();
        String Country = countryjTextField3.getText();
        String State = statejTextField4.getText();
        String city = cityjTextField5.getText();

        if((name.isEmpty()) || ID.isEmpty() || Country.isEmpty() || Country.isEmpty() || State.isEmpty()
                || city.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Field(s) cannot be empty.");
            return;
        }
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PharmacyStoreOrganization) {
                PharmacyStoreOrganization pso = (PharmacyStoreOrganization) organization;
                for (PharmacyStores ps : pso.getPharmaStoresList()) {
                    if (ps.getStoreID().equalsIgnoreCase(ID)) {
                        JOptionPane.showMessageDialog(null, "This ID already exists.");
                        return;
                    }
                }
            }
        }

        storeIDjTextField2.setText("");
        storeNamejTextField1.setText("");
        countryjTextField3.setText("");
        statejTextField4.setText("");
        cityjTextField5.setText("");

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PharmacyStoreOrganization) {
                PharmacyStores pharmacyStores = new PharmacyStores();
                pharmacyStores.setName(name);
                pharmacyStores.setStoreID(ID);
                pharmacyStores.setCountry(Country);
                pharmacyStores.setState(State);
                pharmacyStores.setCity(city);

                PharmacyStoreOrganization pso = (PharmacyStoreOrganization) organization;
                pso.getPharmaStoresList().add(pharmacyStores);
            }
        }
        populateTable();
    }//GEN-LAST:event_createjButton1ActionPerformed

    private void deletejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton2ActionPerformed
        // TODO add your handling code here:
        int row = storesjTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
        } else {
            int selectedValue = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Delete?", "WARNING", JOptionPane.YES_NO_OPTION);

            if (selectedValue == JOptionPane.YES_OPTION) {
                PharmacyStores pharmacyStores = (PharmacyStores) storesjTable1.getValueAt(row, 0);

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof PharmacyStoreOrganization) {
                        PharmacyStoreOrganization pso = (PharmacyStoreOrganization) organization;
                        pso.getPharmaStoresList().remove(pharmacyStores);
                    }
                }

                populateTable();
            } else {
                return;
            }
        }
    }//GEN-LAST:event_deletejButton2ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField cityjTextField5;
    private javax.swing.JTextField countryjTextField3;
    private javax.swing.JButton createjButton1;
    private javax.swing.JButton deletejButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField statejTextField4;
    private javax.swing.JTextField storeIDjTextField2;
    private javax.swing.JTextField storeNamejTextField1;
    private javax.swing.JTable storesjTable1;
    // End of variables declaration//GEN-END:variables
}