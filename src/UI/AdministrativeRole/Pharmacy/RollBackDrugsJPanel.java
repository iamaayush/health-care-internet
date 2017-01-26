/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole.Pharmacy;

import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Pharmacy.Drug;
import Business.WorkQueue.DrugRollBackWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class RollBackDrugsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RollBackDrugsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Drug drug;

    public RollBackDrugsJPanel(JPanel upc, Enterprise enterprise) {
        initComponents();
        userProcessContainer = upc;
        this.enterprise = enterprise;

        populateTable();

    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) drugjTable1.getModel();

        dtm.setRowCount(0);

        PharmaceuticalCompanyEnterprise pce = (PharmaceuticalCompanyEnterprise) enterprise;
        for (Drug drug : pce.getDrugList()) {
            {
                Object[] row = new Object[3];

                if ((drug.getFdaStatus().equalsIgnoreCase("banned"))
                        || (drug.getFdaStatus().equalsIgnoreCase("approved"))) {
                    row[0] = drug;
                    row[1] = drug.getDrugID();
                    row[2] = drug.getFdaStatus();
                    
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

        jScrollPane2 = new javax.swing.JScrollPane();
        drugjTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        messagejTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        sendRequestjButton1 = new javax.swing.JButton();
        backjButton2 = new javax.swing.JButton();

        drugjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Drug Name", "Drug ID", "Drug Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(drugjTable1);

        messagejTextArea1.setColumns(20);
        messagejTextArea1.setRows(5);
        jScrollPane1.setViewportView(messagejTextArea1);

        jLabel2.setText("Message :");

        sendRequestjButton1.setText("Send request");
        sendRequestjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestjButton1ActionPerformed(evt);
            }
        });

        backjButton2.setText("<< Back");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sendRequestjButton1)
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backjButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(sendRequestjButton1)
                .addGap(18, 18, 18)
                .addComponent(backjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendRequestjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestjButton1ActionPerformed
        // TODO add your handling code here:

        String message = messagejTextArea1.getText();
        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Message cannot be empty.");
            return;
        }

        int row = drugjTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        } else {
            drug = (Drug) drugjTable1.getValueAt(row, 0);
        }
        DrugRollBackWorkRequest drwr = new DrugRollBackWorkRequest();
        drwr.setDrug(drug);
        drwr.setEnterprise(enterprise);
        drwr.setMessage(message);
        drug.setFdaStatus("CallBack");

        PharmaceuticalCompanyEnterprise pce = (PharmaceuticalCompanyEnterprise) enterprise;
        for (PharmacyEnterprise pharmacy : pce.getPharmacyList()) {
            pharmacy.getWorkQueue().getWorkRequestList().add(drwr);
        }


    }//GEN-LAST:event_sendRequestjButton1ActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton backjButton2;
    private javax.swing.JTable drugjTable1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messagejTextArea1;
    private javax.swing.JButton sendRequestjButton1;
    // End of variables declaration//GEN-END:variables
}