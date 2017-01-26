/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.NetworkCity;
import Business.Network.NetworkCountry;
import Business.Network.NetworkState;
import Business.Pharmacy.Drug;
import UI.Creator.ViewDrugJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class AddDrugsToPharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDrugsToPharmacyJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise pharmEnterprise;
    private PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise;

    public AddDrugsToPharmacyJPanel(JPanel upc, EcoSystem system, Enterprise enterprise) {
        initComponents();
        userProcessContainer = upc;
        this.system = system;
        this.pharmEnterprise = enterprise;

        populatePharmaCoTable();

    }

    private void populatePharmaCoTable() {

        DefaultTableModel dtm = (DefaultTableModel) pharmaCompanyjTable1.getModel();

        dtm.setRowCount(0);

        for (NetworkCountry country : system.getCountryNetworkList()) {
            for (NetworkState state : country.getStateList()) {
                for (NetworkCity city : state.getCityList()) {
                    for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof PharmaceuticalCompanyEnterprise) {
                            Object[] row = new Object[2];
                            row[0] = enterprise;
                            row[1] = enterprise.getOrganizationID();

                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
    }

    private void populateDrugTable(PharmaceuticalCompanyEnterprise pce) {
        DefaultTableModel dtm = (DefaultTableModel) drugjTable1.getModel();

        dtm.setRowCount(0);

        for (Drug drug : pce.getDrugList()) {

            if (drug.getFdaStatus().equalsIgnoreCase("approved")) {
                Object[] row = new Object[2];
                row[0] = drug.getDrugID();
                row[1] = drug;

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
        pharmaCompanyjTable1 = new javax.swing.JTable();
        listOfDrugsjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drugjTable1 = new javax.swing.JTable();
        viewDrugjButton1 = new javax.swing.JButton();
        addjButton2 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();

        pharmaCompanyjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pharmaceutical Company", "Company ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pharmaCompanyjTable1);

        listOfDrugsjButton1.setText("View List Of Drugs");
        listOfDrugsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfDrugsjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Drugs for selected Pharmaceutical Company:");

        drugjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug ID", "Drug Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(drugjTable1);

        viewDrugjButton1.setText("View Drug Details");
        viewDrugjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugjButton1ActionPerformed(evt);
            }
        });

        addjButton2.setText("ADD");
        addjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButton2ActionPerformed(evt);
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
                        .addGap(277, 277, 277)
                        .addComponent(listOfDrugsjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backjButton1)
                                .addGap(182, 182, 182)
                                .addComponent(addjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(viewDrugjButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2)))))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(listOfDrugsjButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewDrugjButton1)
                        .addGap(18, 18, 18)
                        .addComponent(addjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDrugjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugjTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a Row.");
            return;
        }
        Drug drug = (Drug) drugjTable1.getValueAt(selectedRow, 1);
        ViewDrugJPanel vdjp = new ViewDrugJPanel(userProcessContainer, drug);
        userProcessContainer.add("ViewDrugJPanel", vdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDrugjButton1ActionPerformed

    private void listOfDrugsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfDrugsjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = pharmaCompanyjTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a Row.");
            return;
        } else {
            PharmaceuticalCompanyEnterprise pce = (PharmaceuticalCompanyEnterprise) pharmaCompanyjTable1.getValueAt(selectedRow, 0);
            this.pharmaceuticalCompanyEnterprise = pce;

            populateDrugTable(pce);

        }
    }//GEN-LAST:event_listOfDrugsjButton1ActionPerformed

    private void addjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButton2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = drugjTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a Row.");
            return;
        }

        
        
        Drug drug = (Drug) drugjTable1.getValueAt(selectedRow, 1);
        PharmacyEnterprise pharmacy = (PharmacyEnterprise) pharmEnterprise;
        
        for(Drug d : pharmacy.getDrugList())
        {
            if(d.getDrugID() == null ? drug.getDrugID() == null : d.getDrugID().equals(drug.getDrugID()))
            {
                JOptionPane.showMessageDialog(null, "Drug already in inventory");
                return;
            }
        }
        pharmacy.getDrugList().add(drug);

        pharmaceuticalCompanyEnterprise.getPharmacyList().add(pharmacy);
        JOptionPane.showMessageDialog(null, "Drug added successfully.");
    }//GEN-LAST:event_addjButton2ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton2;
    private javax.swing.JButton backjButton1;
    private javax.swing.JTable drugjTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listOfDrugsjButton1;
    private javax.swing.JTable pharmaCompanyjTable1;
    private javax.swing.JButton viewDrugjButton1;
    // End of variables declaration//GEN-END:variables
}
