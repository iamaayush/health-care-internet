/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Forum;

import Business.Forum.Disease;
import Business.Forum.ForumTopic;
import Business.Organization.ICDOrganization;
import Business.Person.Patient;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class ManageForumJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageForumJPanel
     */
    private JPanel userProcessContainer;
    private ICDOrganization iCDOrg;
    private Disease disease;
    private Patient patient;

    public ManageForumJPanel(JPanel userProcessContainer, Disease disease, ICDOrganization iCDOrg, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.disease = disease;
        this.iCDOrg = iCDOrg;
        this.patient=patient;

        diseaseNamejLabel1.setText(disease.getDiseaseName());
        populateTopicTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void populateTopicTable() {

        DefaultTableModel dtm = (DefaultTableModel) topicjTable1.getModel();
        dtm.setRowCount(0);

        Object[] row = new Object[4];
        for (ForumTopic ft : iCDOrg.getForumList()) {
            if (ft.getDisease().equals(disease))
            {
                row[0] = ft;
                row[1] = ft.getReplyList().size();
                row[2] = ft.getSenderPatient();
                row[3] = ft.getCreatedOn();

                dtm.addRow(row);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        topicjTable1 = new javax.swing.JTable();
        viewTopicjButton1 = new javax.swing.JButton();
        diseaseNamejLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewTopicjTextArea1 = new javax.swing.JTextArea();
        createNewTopicjButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        createNewTopicjTextArea1 = new javax.swing.JTextArea();
        viewRepliesjButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        topicjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Topic Name", "Reply Count", "Created By", "Created On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(topicjTable1);
        if (topicjTable1.getColumnModel().getColumnCount() > 0) {
            topicjTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
            topicjTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        viewTopicjButton1.setText("View Topic>>");
        viewTopicjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTopicjButton1ActionPerformed(evt);
            }
        });

        diseaseNamejLabel1.setText("<DiseaseName>");

        viewTopicjTextArea1.setEditable(false);
        viewTopicjTextArea1.setColumns(20);
        viewTopicjTextArea1.setRows(5);
        jScrollPane3.setViewportView(viewTopicjTextArea1);

        createNewTopicjButton1.setText("Create New Topic");
        createNewTopicjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewTopicjButton1ActionPerformed(evt);
            }
        });

        createNewTopicjTextArea1.setColumns(20);
        createNewTopicjTextArea1.setRows(5);
        jScrollPane5.setViewportView(createNewTopicjTextArea1);

        viewRepliesjButton2.setText("View Replies>>");
        viewRepliesjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRepliesjButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Write your Topic here:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(viewTopicjButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewRepliesjButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diseaseNamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(createNewTopicjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diseaseNamejLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(viewRepliesjButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewTopicjButton1)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(createNewTopicjButton1)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewTopicjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTopicjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = topicjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }
        ForumTopic ft = (ForumTopic) topicjTable1.getValueAt(selectedRow, 0);
        viewTopicjTextArea1.setText(ft.getName());

    }//GEN-LAST:event_viewTopicjButton1ActionPerformed

    private void viewRepliesjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRepliesjButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = topicjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select a row");
            return;
        }
        ForumTopic ft = (ForumTopic) topicjTable1.getValueAt(selectedRow, 0);

        ManageReplyJPanel mrjp = new ManageReplyJPanel(userProcessContainer, patient, ft);
        userProcessContainer.add("ManageReplyJPanel", mrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewRepliesjButton2ActionPerformed

    private void createNewTopicjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewTopicjButton1ActionPerformed
        // TODO add your handling code here:

        String topicName = createNewTopicjTextArea1.getText();
        if (topicName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Message Text cannot be empty.");
            return;
        }
        ForumTopic ft = new ForumTopic();
        ft.setCreatedOn(new Date());
        ft.setDisease(disease);
        ft.setSenderPatient(patient);
        ft.setName(topicName);
        
        
        iCDOrg.getForumList().add(ft);
       
        populateTopicTable(); 
    }//GEN-LAST:event_createNewTopicjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createNewTopicjButton1;
    private javax.swing.JTextArea createNewTopicjTextArea1;
    private javax.swing.JLabel diseaseNamejLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable topicjTable1;
    private javax.swing.JButton viewRepliesjButton2;
    private javax.swing.JButton viewTopicjButton1;
    private javax.swing.JTextArea viewTopicjTextArea1;
    // End of variables declaration//GEN-END:variables
}