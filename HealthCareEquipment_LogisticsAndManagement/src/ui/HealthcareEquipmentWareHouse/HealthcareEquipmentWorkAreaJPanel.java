/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HealthcareEquipmentWareHouse;

import Schema.EcoSystem;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import Schema.WorkQueue.HealthcareEquipmentWorkRequest;
import Schema.WorkQueue.TransportationWorkRequest;
import Schema.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 16176
 */
public class HealthcareEquipmentWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel upContainer;
    private EcoSystem sys;
    private UserAccount ua;
    private Organization org;
    private Network ntw;
    private Enterprise ent;
    private Organization transportOrganization;

    /**
     * Creates new form HealthcareEquipmentWorkAreaJPanel
     */
    public HealthcareEquipmentWorkAreaJPanel(JPanel upContainer, EcoSystem sys, UserAccount ua, Organization org, Network ntw) {
        initComponents();
        this.upContainer = upContainer;
        this.ua = ua;
        this.sys = sys;
        this.org = org;
        this.ntw=ntw;
        populateHealthCareEquipmentReqTbl();
    }
    
     public void populateHealthCareEquipmentReqTbl(){
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        System.out.println(org.getWorkQueue().getWorkRequestList().size());
        for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0]=((HealthcareEquipmentWorkRequest) request);
            String urgencyLevel = ((HealthcareEquipmentWorkRequest) request).getUrgencyLevel();
            int quantity = ((HealthcareEquipmentWorkRequest) request).getQuantity();
            row[1] = urgencyLevel;
            row[2]=quantity;
            row[3]=request.getSender().getUsername();
            
            row[4]=request.getReceiver().getUsername();
            
            model.addRow(row);
        }
}

     public void populateTransportWorkRequest(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        Object row[]=new Object[4];
        for(WorkRequest request : ua.getWorkQueue().getWorkRequestList()){
            row[0]=((TransportationWorkRequest) request);
            row[1]=request.getReceiver();
            row[2]=request.getStatus();
            row[3]=((TransportationWorkRequest)request).getTime();
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

        assignBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        processReqBtn = new javax.swing.JButton();
        viewReqBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        headerLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        assignBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignBtn.setText("ASSIGN TO ME");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        processReqBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        processReqBtn.setText("PROCESS REQUEST>>>");
        processReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReqBtnActionPerformed(evt);
            }
        });

        viewReqBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewReqBtn.setText("VIEW REQUEST STATUS>>");
        viewReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReqBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N

        headerLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 102));
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/steth.png"))); // NOI18N
        headerLbl.setText("REQUESTS FROM HOSPITALS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EQUIPMENT NAME", "URGENCY LEVEL", "QUANTITY", "SENDER", "RECIEVER", "REQUEST SENT Y/N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(488, 488, 488)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(161, 161, 161)
                                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(203, 203, 203)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(viewReqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(processReqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(518, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(processReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(353, 353, 353))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReqBtnActionPerformed
 int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        
       HealthcareEquipmentWorkRequest request = (HealthcareEquipmentWorkRequest)jTable1.getValueAt(selectedRow, 0);
       System.out.println("hello");
       request.setStatus("Request sent to transport department for delivery");
       TransportationWorkRequest transportrequest=new TransportationWorkRequest();
        transportrequest=new TransportationWorkRequest();
        transportrequest.setSender(ua);
        
        transportrequest.setHospitalName(request.getHospitalName());
        
        transportrequest.setUrgency(request.getUrgencyLevel());
        transportrequest.setStatus("Sent");
        transportrequest.setEquipmentinfo(("Name: "+request.getEquipmentName())+","+ "Qauntity: " +( request.getQuantity()));
        request.setExpectedArrivalTime(request.getMessage());
        request.setTransportrequestStatus("Y");
        if(ntw.getName().equals(this.ntw.getName())){
            for(Enterprise enterprise :ntw.getEnterpriseDirectory().getEnterpriseList() ){
                System.out.println("****" +enterprise.getName());
                System.out.println("******"+enterprise.getEnterpriseType());
                for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                      System.out.println("***** Organization Name:" +organization.getName());
                   if(organization.getName().equals("Transportation Organization")){
                      System.out.println("True");
                   System.out.println("***** organization Name"+organization.getName());
                   JOptionPane.showMessageDialog(null, "A Notification has been sent to concerned Transport Department "
                              + "The request id is : "+transportrequest.getUniqueId());
                      int requestId=transportrequest.getUniqueId();
                      System.out.println("***" +requestId);
                      transportrequest.setRequestId(requestId);
                      ua.getWorkQueue().getWorkRequestList().add(transportrequest);
                       organization.getWorkQueue().getWorkRequestList().add(transportrequest);
                      
                   }  
                        
                   }
                   }
                  
         CardLayout layout = (CardLayout) upContainer.getLayout();
          upContainer.add("ProcessRequest", new ViewTransportationRequestJPanel(upContainer,ua));
          layout.next(upContainer);
        
         }
        else{
          CardLayout layout = (CardLayout) upContainer.getLayout();
          upContainer.add("ProcessRequest", new ViewTransportationRequestJPanel(upContainer,ua));
         layout.next(upContainer);
         
        }
       // populateTransportWorkRequest();
           // TODO add your handling code here:
    }//GEN-LAST:event_processReqBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row!");
        }
        
        HealthcareEquipmentWorkRequest request = (HealthcareEquipmentWorkRequest)jTable1.getValueAt(selectedRow, 0);
        request.setReceiver(ua);
        request.setStatus("Pending");
        request.setTransportrequestStatus("N");
        
        populateHealthCareEquipmentReqTbl();        // TODO add your handling code here:
    }//GEN-LAST:event_assignBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
upContainer.remove(this);
        CardLayout layout = (CardLayout) upContainer.getLayout();
        layout.previous(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReqBtnActionPerformed
CardLayout layout = (CardLayout) upContainer.getLayout();
        upContainer.add("ProcessRequest", new ViewTransportationRequestJPanel(upContainer,ua));
        layout.next(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_viewReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton processReqBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewReqBtn;
    // End of variables declaration//GEN-END:variables
}
