/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.Creator;

import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public class IFDAWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IFDAWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Organization drugRegOrg;
    public IFDAWorkAreaJPanel(JPanel upc, Organization org) {
        initComponents();
        userProcessContainer=upc;
        drugRegOrg=org;
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageDrugRequestsjButton2 = new javax.swing.JButton();

        manageDrugRequestsjButton2.setText("Manage Drug Requests");
        manageDrugRequestsjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDrugRequestsjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(manageDrugRequestsjButton2)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(manageDrugRequestsjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageDrugRequestsjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDrugRequestsjButton2ActionPerformed
        // TODO add your handling code here:
        ManageDrugAprrovalJPanel mdajp = new ManageDrugAprrovalJPanel(userProcessContainer,drugRegOrg);
        userProcessContainer.add("manageDrugApproval", mdajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDrugRequestsjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageDrugRequestsjButton2;
    // End of variables declaration//GEN-END:variables
}
