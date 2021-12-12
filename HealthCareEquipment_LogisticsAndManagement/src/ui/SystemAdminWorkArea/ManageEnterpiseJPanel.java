/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Schema.EcoSystem;
import Schema.Enterprise.Address;
import Schema.Enterprise.AddressList;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 16176
 */
public class ManageEnterpiseJPanel extends javax.swing.JPanel {
    private JPanel userprocessContainer;
    private EcoSystem system;
    private AddressList addressList;
    

    /**
     * Creates new form ManageEnterpiseJPanel
     */
    public ManageEnterpiseJPanel(JPanel userprocessContainer, EcoSystem system) {
        initComponents();
        this.userprocessContainer = userprocessContainer;
        this.system=system;
        addressList=new AddressList();
        populateTable();
        populateComboBox();
    }

    private void populateTable() {
DefaultTableModel model = (DefaultTableModel) nameTbl.getModel();
model.setRowCount(0);
for(Network ntw : system.getNetworkList()){
    for(Enterprise ent : ntw.getEnterpriseDirectory().getEnterpriseList()){
        Object[] row = new Object[4];
        row[0] = ent.getName();
        row[1] = ntw.getName();
        row[2] = ent.getEnterpriseType().getValue();
        row[3] = ent.getZipcode();
        model.addRow(row);
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
        nameTbl = new javax.swing.JTable();
        networkLbl = new javax.swing.JLabel();
        networkCmbBox = new javax.swing.JComboBox();
        enterprisetypeLbl = new javax.swing.JLabel();
        enterprisetypeCmbBox = new javax.swing.JComboBox();
        nameLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();

        nameTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Network", "Type"
            }
        ));
        jScrollPane1.setViewportView(nameTbl);

        networkLbl.setText("Network:");

        networkCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        enterprisetypeLbl.setText("Enterprise Type:");

        enterprisetypeCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nameLbl.setText("Name:");

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(452, 452, 452)
                                .addComponent(networkLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(453, 453, 453)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterprisetypeLbl)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backBtn))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(enterprisetypeCmbBox, 0, 137, Short.MAX_VALUE)
                                .addComponent(networkCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameTxtField))
                            .addComponent(submitBtn))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterprisetypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterprisetypeCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(submitBtn))
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
Network network = (Network) networkCmbBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterprisetypeCmbBox.getSelectedItem();
        System.out.println(enterprisetypeCmbBox.getSelectedItem());
        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = nameTxtField.getText();
       
        for (Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getName().equals(name)) {
                JOptionPane.showMessageDialog(this, "Enterprise name already exists Please select a different name.");
                return;
            }
        }

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
        
        Address a=addressList.AddAddress();
        a.setEnterpriseName(nameTxtField.getText());
      
    //    File f= new File("D:\\AED_FINALPROJECT\\file.xls");
         
        populateTable();        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
userprocessContainer.remove(this);
Component[] cmpArray = userprocessContainer.getComponents();
Component component= cmpArray[cmpArray.length-1];
SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
sysAdmin.populateTree();
CardLayout crd = (CardLayout) userprocessContainer.getLayout();
crd.previous(userprocessContainer);// TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed



private void populateComboBox() {
networkCmbBox.removeAllItems();
enterprisetypeCmbBox.removeAllItems();
for(Network ntw : system.getNetworkList()){
    networkCmbBox.addItem(ntw);
}
for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()){
    enterprisetypeCmbBox.addItem(type);
}
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox enterprisetypeCmbBox;
    private javax.swing.JLabel enterprisetypeLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTable nameTbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox networkCmbBox;
    private javax.swing.JLabel networkLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
