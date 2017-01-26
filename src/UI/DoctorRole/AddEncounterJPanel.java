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
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.NetworkCity;
import Business.Network.NetworkCountry;
import Business.Network.NetworkState;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Pharmacy.Drug;
import Business.WorkQueue.DoctorToLabWorkRequest;
import Business.WorkQueue.DoctorToPharmacyWorkRequest;
import Business.WorkQueue.EntAdminWorkRequest;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.ReferredDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public class AddEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEncounterJPanel
     */
    private JPanel userProcessContainer;
    private WorkRequest request;
    private Doctor doctor;
    private Patient patient;
    private Enterprise enterprise;
    private EcoSystem system;
    private Encounter encounter;
    private DoctorToLabWorkRequest dlr;
    private ArrayList<Drug> tempDrugList;
    boolean flag = false;

    public AddEncounterJPanel(JPanel upc, WorkRequest request, EcoSystem system) {
        initComponents();
        userProcessContainer = upc;
        this.request = request;
        encounter = new Encounter();
        this.system = system;
        tempDrugList = new ArrayList<>();

        if (request instanceof PatientWorkRequest) {
            PatientWorkRequest pwr = (PatientWorkRequest) request;
            this.patient = pwr.getPatient();
            this.doctor = pwr.getDoctor();
            this.enterprise = pwr.getEntRecv();
        }
        if (request instanceof EntAdminWorkRequest) {
            EntAdminWorkRequest eawr = (EntAdminWorkRequest) request;
            this.patient = eawr.getPatient();
            this.doctor = eawr.getDoctor();
            this.enterprise = eawr.getEntSender();
        }
        if (request instanceof ReferredDoctorWorkRequest) {
            ReferredDoctorWorkRequest rdwr = (ReferredDoctorWorkRequest) request;
            this.patient = rdwr.getPatient();
            this.doctor = (Doctor) rdwr.getReceiver();
            this.enterprise = rdwr.getRecvEnt();
        }

        populateCountryComboBox();
    }

    private void populateCountryComboBox() {
        countryjComboBox1.removeAllItems();
        for (NetworkCountry networkCountry : system.getCountryNetworkList()) {
            countryjComboBox1.addItem(networkCountry);
        }
        populateStateComboBox();
    }

    private void populateStateComboBox() {
        statejComboBox2.removeAllItems();
        NetworkCountry nc = (NetworkCountry) countryjComboBox1.getSelectedItem();
        if (nc != null) {
            for (NetworkState networkState : nc.getStateList()) {
                statejComboBox2.addItem(networkState);
            }
            populateCityComboBox();
        }
    }

    private void populateCityComboBox() {
        cityjComboBox3.removeAllItems();
        NetworkState ns = (NetworkState) statejComboBox2.getSelectedItem();
        if (ns != null) {
            for (NetworkCity networkCity : ns.getCityList()) {
                cityjComboBox3.addItem(networkCity);
            }
        }
    }

    private void populatePharmacyComboBox() {
        pharmacyjComboBox1.removeAllItems();
        NetworkCity city = (NetworkCity) cityjComboBox3.getSelectedItem();
        if (city != null) {
            for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof PharmacyEnterprise) {
                    PharmacyEnterprise pharmacy = (PharmacyEnterprise) enterprise;
                    pharmacyjComboBox1.addItem(pharmacy);
                }
            }
        }
    }

    private void populateDrugComboBox() {
        drugNamejComboBox1.removeAllItems();
        PharmacyEnterprise ph = (PharmacyEnterprise) pharmacyjComboBox1.getSelectedItem();
        if (ph != null) {
            for (Drug drug : ph.getDrugList()) {
                if (drug.getFdaStatus().equals("Approved")) {
                    drugNamejComboBox1.addItem(drug);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        respiratoryRatejTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        heartRatejTextField1 = new javax.swing.JTextField();
        bloodPressurejTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        temperatureJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        weightjTextField3 = new javax.swing.JTextField();
        labMessagejLabel7 = new javax.swing.JLabel();
        labTestjCheckBox1 = new javax.swing.JCheckBox();
        addEncounterjButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        presciptionjTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        messagejTextField1 = new javax.swing.JTextField();
        sendToPharmacyjButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        statejComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cityjComboBox3 = new javax.swing.JComboBox();
        countryjComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        pharmacyjComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        closeCasejButton1 = new javax.swing.JButton();
        drugNamejComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        encounterDrugListjTextArea1 = new javax.swing.JTextArea();
        AddtoListjButton1 = new javax.swing.JButton();
        clearListjButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Add Vital Signs:");

        jLabel2.setText("Respiratory Rate:");

        respiratoryRatejTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                respiratoryRatejTextField1KeyReleased(evt);
            }
        });

        jLabel3.setText("Heart Rate:");

        heartRatejTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                heartRatejTextField1KeyReleased(evt);
            }
        });

        bloodPressurejTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bloodPressurejTextField2KeyReleased(evt);
            }
        });

        jLabel4.setText("Blood Pressure:");

        temperatureJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                temperatureJTFKeyReleased(evt);
            }
        });

        jLabel5.setText("Temperature:");

        jLabel6.setText("Weight:");

        weightjTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weightjTextField3KeyReleased(evt);
            }
        });

        labMessagejLabel7.setText("Message:");
        labMessagejLabel7.setEnabled(false);

        labTestjCheckBox1.setText("Lab Test Required?");
        labTestjCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTestjCheckBox1ActionPerformed(evt);
            }
        });

        addEncounterjButton1.setText("Add Encounter");
        addEncounterjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEncounterjButton1ActionPerformed(evt);
            }
        });

        presciptionjTextArea1.setColumns(20);
        presciptionjTextArea1.setRows(5);
        jScrollPane2.setViewportView(presciptionjTextArea1);

        jLabel7.setText("Prescription:");

        messagejTextField1.setEnabled(false);

        sendToPharmacyjButton1.setText("Send to Pharmacy");
        sendToPharmacyjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToPharmacyjButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Country:");

        statejComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statejComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statejComboBox2ActionPerformed(evt);
            }
        });

        jLabel9.setText("State:");

        cityjComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityjComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityjComboBox3ActionPerformed(evt);
            }
        });

        countryjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryjComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setText("City:");

        pharmacyjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pharmacyjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyjComboBox1ActionPerformed(evt);
            }
        });

        jLabel11.setText("List of Pharmacies:");

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        closeCasejButton1.setText("Close Case");
        closeCasejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCasejButton1ActionPerformed(evt);
            }
        });

        drugNamejComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drugNamejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugNamejComboBox1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Drug:");

        encounterDrugListjTextArea1.setColumns(20);
        encounterDrugListjTextArea1.setRows(5);
        jScrollPane1.setViewportView(encounterDrugListjTextArea1);

        AddtoListjButton1.setText("Add to list");
        AddtoListjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoListjButton1ActionPerformed(evt);
            }
        });

        clearListjButton1.setText("Clear List");
        clearListjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearListjButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Selected Drugs:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(respiratoryRatejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(temperatureJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                        .addComponent(weightjTextField3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bloodPressurejTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(heartRatejTextField1)))
                            .addComponent(labMessagejLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labTestjCheckBox1)
                                    .addComponent(messagejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sendToPharmacyjButton1)
                                                .addGap(15, 15, 15))
                                            .addComponent(AddtoListjButton1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearListjButton1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(drugNamejComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(countryjComboBox1, 0, 151, Short.MAX_VALUE)
                                        .addComponent(statejComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cityjComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pharmacyjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(71, 71, 71)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(backjButton1)
                .addGap(116, 116, 116)
                .addComponent(addEncounterjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeCasejButton1)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(closeCasejButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(respiratoryRatejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(temperatureJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(weightjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(heartRatejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(bloodPressurejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labTestjCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labMessagejLabel7)
                                    .addComponent(messagejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addEncounterjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(countryjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(statejComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cityjComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pharmacyjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(drugNamejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(10, 10, 10)
                                .addComponent(AddtoListjButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearListjButton1)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addComponent(sendToPharmacyjButton1)
                                .addContainerGap(75, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labTestjCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTestjCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (labTestjCheckBox1.isSelected()) {
            labMessagejLabel7.setEnabled(true);
            messagejTextField1.setEnabled(true);
        }
        if (!labTestjCheckBox1.isSelected()) {
            labMessagejLabel7.setEnabled(false);
            messagejTextField1.setEnabled(false);
        }
    }//GEN-LAST:event_labTestjCheckBox1ActionPerformed

    private void addEncounterjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEncounterjButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if ((respiratoryRatejTextField1.getText().isEmpty()) || (heartRatejTextField1.getText().isEmpty())
                    || (temperatureJTF.getText().isEmpty()) || (bloodPressurejTextField2.getText().isEmpty())
                    || (weightjTextField3.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Field(s) cannot be left blank.");
                return;
            }

            int RespRate = Integer.parseInt(respiratoryRatejTextField1.getText());
            int heartrate = Integer.parseInt(heartRatejTextField1.getText());
            Float temp = Float.parseFloat(temperatureJTF.getText());
            Float bloodPressure = Float.parseFloat(bloodPressurejTextField2.getText());
            Float weight = Float.parseFloat(weightjTextField3.getText());
            String Presc = presciptionjTextArea1.getText();
            String message = messagejTextField1.getText();

//        
            encounter.setDoctor(doctor);
            encounter.setEncounterDate(new Date());
            encounter.setPatient(patient);
            encounter.getPrescriptionList().add(Presc);

            encounter.getVitalSign().setBloodPressure(bloodPressure);
            encounter.getVitalSign().setHeartRate(heartrate);
            encounter.getVitalSign().setRespiratoryRate(RespRate);
            encounter.getVitalSign().setTemperature(temp);
            encounter.getVitalSign().setWeight(weight);

            if (labTestjCheckBox1.isSelected()) {
                
                if(message.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Message cannot be null.");
                    return;
                }
                dlr = new DoctorToLabWorkRequest();
                dlr.setMRN(String.valueOf(patient.getMRN()));
                dlr.setMessage(message);
                dlr.setRequestDate(new Date());
                dlr.setSender(doctor);
                dlr.setStatus("pending");
                dlr.setResult("Sent to Lab");

                patient.getWorkQueue().getWorkRequestList().add(dlr);
                doctor.getWorkQueue().getWorkRequestList().add(dlr);

                encounter.setRequest(dlr);

                messagejTextField1.setText("");

                JOptionPane.showMessageDialog(null, "Encounter added and request sent to lab");
            } else {
                JOptionPane.showMessageDialog(null, "Encounter added");
            }

            if (enterprise instanceof HospitalEnterprise) {
                HospitalEnterprise ent = (HospitalEnterprise) enterprise;
                ent.getEncounterList().add(encounter);
                for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof LabOrganization) {
                        org.getWorkQueue().getWorkRequestList().add(dlr);
                    }
                }
            }
            if (enterprise instanceof ClinicEnterprise) {
                ClinicEnterprise ent = (ClinicEnterprise) enterprise;
                ent.getEncounterList().add(encounter);
                for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof LabOrganization) {
                        org.getWorkQueue().getWorkRequestList().add(dlr);
                    }
                }
            }
            flag = false;

            respiratoryRatejTextField1.setText("");
            heartRatejTextField1.setText("");
            temperatureJTF.setText("");
            weightjTextField3.setText("");
            bloodPressurejTextField2.setText("");

            presciptionjTextArea1.setText("");

            encounterDrugListjTextArea1.setText("");
            
            sendToPharmacyjButton1.setEnabled(false);
            AddtoListjButton1.setEnabled(false);
            clearListjButton1.setEnabled(false);
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Enter valid values");
        }

    }//GEN-LAST:event_addEncounterjButton1ActionPerformed

    private void statejComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statejComboBox2ActionPerformed
        // TODO add your handling code here:
        populateCityComboBox();
    }//GEN-LAST:event_statejComboBox2ActionPerformed

    private void cityjComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityjComboBox3ActionPerformed
        // TODO add your handling code here:
        populatePharmacyComboBox();
    }//GEN-LAST:event_cityjComboBox3ActionPerformed

    private void countryjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryjComboBox1ActionPerformed
        // TODO add your handling code here:
        populateStateComboBox();
    }//GEN-LAST:event_countryjComboBox1ActionPerformed

    private void sendToPharmacyjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToPharmacyjButton1ActionPerformed
        // TODO add your handling code here:

        String Presc = presciptionjTextArea1.getText();
//        Drug d = (Drug)drugNamejComboBox1.getSelectedItem();
        PharmacyEnterprise ph = (PharmacyEnterprise) pharmacyjComboBox1.getSelectedItem();

        if ((Presc.isEmpty()) || (ph == null)) {
            JOptionPane.showMessageDialog(null, "Prescription or pharmacy cannot be empty");
            return;
        }
        if (encounterDrugListjTextArea1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Drug cart is empty.");
            return;
        } else {

            DoctorToPharmacyWorkRequest dpwr = new DoctorToPharmacyWorkRequest();
            dpwr.setPatient(patient);
            dpwr.setDoctor(doctor);
            dpwr.setMessage(Presc);
            dpwr.setEnterprise(enterprise);

            for (Drug d : tempDrugList) {
                dpwr.getEncounterDrugList().add(d);
            }

            dpwr.setRequestDate(new Date());
            dpwr.setStatus("Sent to Pharmacy");
            encounter.getPrescriptionList().add(Presc);

            patient.getWorkQueue().getWorkRequestList().add(dpwr);
            doctor.getWorkQueue().getWorkRequestList().add(dpwr);
            ph.getWorkQueue().getWorkRequestList().add(dpwr);
            flag = true;

            JOptionPane.showMessageDialog(null, "Prescription sent to pharmacy: " + ph);
            tempDrugList.clear();
            encounterDrugListjTextArea1.setText("");
            pharmacyjComboBox1.setEnabled(true);

        }

    }//GEN-LAST:event_sendToPharmacyjButton1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:

        if (flag) {
            JOptionPane.showMessageDialog(null, "Encounter has not been saved");
            return;
        } else {
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void closeCasejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCasejButton1ActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(null, "Are you sure, you want to Close the case?", "WARNING", JOptionPane.YES_NO_OPTION);
        if (value == JOptionPane.YES_OPTION) {
            if (patient.getPrefferedDoctor().equals(doctor)) {
                JOptionPane.showMessageDialog(null, "You are preffered doctor. You cannot close the case.");
                return;
            }

            if (!(patient.getReferredDoctor() == null)) {
                patient.setReferredDoctor(null);
                patient.setEntreffDoc(null);
            }
        }
    }//GEN-LAST:event_closeCasejButton1ActionPerformed

    private void pharmacyjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyjComboBox1ActionPerformed
        // TODO add your handling code here:
        populateDrugComboBox();
    }//GEN-LAST:event_pharmacyjComboBox1ActionPerformed

    private void drugNamejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugNamejComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugNamejComboBox1ActionPerformed

    private void AddtoListjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoListjButton1ActionPerformed
        // TODO add your handling code here:
        Drug d = (Drug) drugNamejComboBox1.getSelectedItem();
        if(d==null)
        {
            JOptionPane.showMessageDialog(null, "No drug in pharmacy.");
            return;
        }
        tempDrugList.add(d);

        encounter.getDrugList().add(d);

        encounterDrugListjTextArea1.append(String.valueOf(d) + "\n");
        pharmacyjComboBox1.setEnabled(false);


    }//GEN-LAST:event_AddtoListjButton1ActionPerformed

    private void clearListjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearListjButton1ActionPerformed
        // TODO add your handling code here:
        for (Drug d : tempDrugList) {
            encounter.getDrugList().remove(d);
        }
        tempDrugList.clear();
        encounterDrugListjTextArea1.setText("");
        pharmacyjComboBox1.setEnabled(true);
    }//GEN-LAST:event_clearListjButton1ActionPerformed

    private void respiratoryRatejTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respiratoryRatejTextField1KeyReleased
        // TODO add your handling code here:
        if ((Pattern.matches("^[a-zA-Z]+$", respiratoryRatejTextField1.getText()))) {
            respiratoryRatejTextField1.setText(null);
        }
    }//GEN-LAST:event_respiratoryRatejTextField1KeyReleased

    private void temperatureJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temperatureJTFKeyReleased
        // TODO add your handling code here:
        if ((Pattern.matches("^[a-zA-Z]+$", temperatureJTF.getText()))) {
            temperatureJTF.setText(null);
        }
    }//GEN-LAST:event_temperatureJTFKeyReleased

    private void weightjTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightjTextField3KeyReleased
        // TODO add your handling code here:
        if ((Pattern.matches("^[a-zA-Z]+$", weightjTextField3.getText()))) {
            weightjTextField3.setText(null);
        }
    }//GEN-LAST:event_weightjTextField3KeyReleased

    private void heartRatejTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heartRatejTextField1KeyReleased
        // TODO add your handling code here:
        if ((Pattern.matches("^[a-zA-Z]+$", heartRatejTextField1.getText()))) {
            heartRatejTextField1.setText(null);
        }
    }//GEN-LAST:event_heartRatejTextField1KeyReleased

    private void bloodPressurejTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bloodPressurejTextField2KeyReleased
        // TODO add your handling code here:
        if ((Pattern.matches("^[a-zA-Z]+$", bloodPressurejTextField2.getText()))) {
            bloodPressurejTextField2.setText(null);
        }
    }//GEN-LAST:event_bloodPressurejTextField2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtoListjButton1;
    private javax.swing.JButton addEncounterjButton1;
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField bloodPressurejTextField2;
    private javax.swing.JComboBox cityjComboBox3;
    private javax.swing.JButton clearListjButton1;
    private javax.swing.JButton closeCasejButton1;
    private javax.swing.JComboBox countryjComboBox1;
    private javax.swing.JComboBox drugNamejComboBox1;
    private javax.swing.JTextArea encounterDrugListjTextArea1;
    private javax.swing.JTextField heartRatejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labMessagejLabel7;
    private javax.swing.JCheckBox labTestjCheckBox1;
    private javax.swing.JTextField messagejTextField1;
    private javax.swing.JComboBox pharmacyjComboBox1;
    private javax.swing.JTextArea presciptionjTextArea1;
    private javax.swing.JTextField respiratoryRatejTextField1;
    private javax.swing.JButton sendToPharmacyjButton1;
    private javax.swing.JComboBox statejComboBox2;
    private javax.swing.JTextField temperatureJTF;
    private javax.swing.JTextField weightjTextField3;
    // End of variables declaration//GEN-END:variables
}
