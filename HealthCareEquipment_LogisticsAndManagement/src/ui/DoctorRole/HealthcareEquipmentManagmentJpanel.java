/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DoctorRole;

import Schema.EcoSystem;
import Schema.Enterprise.Enterprise;
import Schema.Enterprise.MedicalEquipEnterprise;
import Schema.Network.Network;
import Schema.Organization.DoctorOrganization;
import Schema.Organization.EquipmentHandlingOrganization;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import Schema.WorkQueue.HealthcareEquipmentWorkRequest;
import Schema.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 16176
 */
public class HealthcareEquipmentManagmentJpanel extends javax.swing.JPanel {
    private JPanel userprocessContainer;
    private UserAccount ua;
    private DoctorOrganization docOrg;
    private Enterprise ent;
    private MedicalEquipEnterprise medEqEnt;
    private Network ntw;
    private EcoSystem system;
    private Enterprise.EnterpriseType entType;
    private EquipmentHandlingOrganization eqHandOrg;

    /**
     * Creates new form HealthcareEquipmentManagmentJpanel
     */
public HealthcareEquipmentManagmentJpanel(JPanel userprocessContainer, UserAccount ua,DoctorOrganization docOrg, Enterprise ent, EcoSystem system, Network ntw) {
this.userprocessContainer=userprocessContainer;
this.ua = ua;
this.docOrg = docOrg;
this.ent=ent;
this.ntw=ntw;
this.system=system;
initComponents();
populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderLbl = new javax.swing.JLabel();
        MedEquipLbl = new javax.swing.JLabel();
        equipnameCmbBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        urgencyLbl = new javax.swing.JLabel();
        equipnameCmbBox1 = new javax.swing.JComboBox();
        qtyLbl = new javax.swing.JLabel();
        qtyTxtFld = new javax.swing.JSpinner();
        backBtn = new javax.swing.JButton();
        sendReqBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        HeaderLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HeaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLbl.setText("REQUEST MEDICAL EQUIPMENT");

        MedEquipLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MedEquipLbl.setText("MEDICAL EQUIPMENT:");

        equipnameCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Please Select--", "Item 1", "Item 2", "Item 3", "Item 4" }));
        equipnameCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipnameCmbBoxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICAL EQUIPMENT", "MESSAGE", "QUANTITY", "SENDER", "RECEIVER", "STATUS", "REQUEST DATE", "ACTUAL PRICE", "LOAN PRICE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        urgencyLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        urgencyLbl.setText("URGENCY LEVEL:");

        equipnameCmbBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Please Select--", "Item 1", "Item 2", "Item 3", "Item 4" }));
        equipnameCmbBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipnameCmbBox1ActionPerformed(evt);
            }
        });

        qtyLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qtyLbl.setText("QUANTITY:");

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        sendReqBtn.setText("SEND REQUEST");
        sendReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendReqBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshBtn.setText("REFRESH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(84, 84, 84)
                                .addComponent(sendReqBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(qtyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(urgencyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(equipnameCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qtyTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(MedEquipLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(equipnameCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(772, 772, 772))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(HeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refreshBtn))))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedEquipLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipnameCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipnameCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urgencyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(sendReqBtn))
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void equipnameCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipnameCmbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipnameCmbBoxActionPerformed

    private void equipnameCmbBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipnameCmbBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipnameCmbBox1ActionPerformed

    private void sendReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendReqBtnActionPerformed
        HealthcareEquipmentWorkRequest request = new HealthcareEquipmentWorkRequest();
        request.setEquipmentName(equipnameCmbBox.getSelectedItem().toString());
        request.setSender(ua);
        request.setStatus("Sent");
        request.setUrgencyLevel(equipnameCmbBox1.getSelectedItem().toString());
        
        request.setQuantity(Integer.parseInt(qtyTxtFld.getValue().toString()));
        
        Date date = new Date();
        int min = 20;
        int max = 40;       
        Random rand = new Random();

        int n1 = rand.nextInt((max - min)) + 1;
        int n2 = rand.nextInt(10) + 1;
        
        request.setActualprice(n1);
        request.setHospitalName(ent.getName());
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        request.setRequestDate(dateFormat.format(date));
        
        
        request.setLoanedprice(n2);
        
        Organization org = null;
        //Enterprise.EnterpriseType type=null;
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DoctorOrganization) {
                org = organization;
                System.out.println("****" + org);
                break;
            }
        }
        // if (org!=null){

        org.getWorkQueue().getWorkRequestList().add(request);
        ua.getWorkQueue().getWorkRequestList().add(request);
        // equiporg.getWorkQueue().getWorkRequestList().add(request);
        System.out.println("****** " + org.getName());
        System.out.println("******" + ent.getName());
        System.out.println("**** " + ntw.getName());
        for (Network network : system.getNetworkList()) {

            if (ntw.getName().equals(this.ntw.getName())) {
                for (Enterprise ent : ntw.getEnterpriseDirectory().getEnterpriseList()) {
                    System.out.println("****" + ent.getName());
                    System.out.println("******" + ent.getEnterpriseType());
                    //if(enterprise.getEnterpriseType().equals("MedicalEquipmentWareHouse")){
                    //  Enterprise.EnterpriseType type=null;
                    //if(enterprise.getEnterpriseType().equals("MedicalEquipmentWareHouse")){
                    //if (type==Enterprise.EnterpriseType.MedicalEquipmentWareHouse) { 
                    for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println("***** Organizatio Name:" + organization.getName());
                        if (org.getName().equals("Equipment Organization")) {
                            System.out.println("True");
                            // for( Organization organization :enterprise.getOrganizationDirectory().getOrganizationList()){
                            System.out.println("***** organization Name" + organization.getName());
                            // if(organization.getName().equals("EquipmentOrganization")){
                            organization.getWorkQueue().getWorkRequestList().add(request);
                        }
                    }
                }

            }
ua.getWorkQueue().getWorkRequestList().add(request);
populateTable();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_sendReqBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userprocessContainer.remove(this);
        CardLayout layout = (CardLayout) userprocessContainer.getLayout();
        layout.previous(userprocessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderLbl;
    private javax.swing.JLabel MedEquipLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox equipnameCmbBox;
    private javax.swing.JComboBox equipnameCmbBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JSpinner qtyTxtFld;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton sendReqBtn;
    private javax.swing.JLabel urgencyLbl;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (WorkRequest request : docOrg.getWorkQueue().getWorkRequestList()) {
            //for(WorkRequest request : equiporg.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[9];

            row[0] = ((HealthcareEquipmentWorkRequest) request);
            String urgencyLevel = ((HealthcareEquipmentWorkRequest) request).getUrgencyLevel();
            row[1] = urgencyLevel;
            int quantity = ((HealthcareEquipmentWorkRequest) request).getQuantity();
            row[2] = quantity;
            row[3] = request.getSender();
            row[4] = ((HealthcareEquipmentWorkRequest) request).getReceiver();
            row[5] = request.getStatus();
            String expectedArrivalTime = ((HealthcareEquipmentWorkRequest) request).getExpectedArrivalTime();
            row[6] = request.getRequestDate();
            row[7] = ((HealthcareEquipmentWorkRequest) request).getActualprice();
            row[8] = ((HealthcareEquipmentWorkRequest) request).getLoanedprice();

            model.addRow(row);
        }
       
    }
}
