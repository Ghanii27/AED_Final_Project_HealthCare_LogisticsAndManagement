/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalAdminRole;

import Schema.Organization.Organization;
import Schema.Organization.Organization.OrganizationType;
import Schema.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 16176
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {
    private OrganizationDirectory orgDir;
    private JPanel userProcessContainer;
    

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory orgDir) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.orgDir = orgDir;
        populateTable();
        populateCombo();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orgTbl = new javax.swing.JTable();
        orgtypeLbl = new javax.swing.JLabel();
        orgCmbBox = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        addOrgBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        headerLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 102));
        headerLbl.setText("Manage Organization");

        orgTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orgTbl);

        orgtypeLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        orgtypeLbl.setText("Organization Type :");

        orgCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgCmbBoxActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addOrgBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        addOrgBtn.setText("Add Organization");
        addOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(orgtypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(orgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addOrgBtn))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(headerLbl)))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(headerLbl)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgtypeLbl))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrgBtn)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(744, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgBtnActionPerformed
OrganizationType orgType = (OrganizationType) orgCmbBox.getSelectedItem();
orgDir.createOrganization(orgType);
populateTable();
    }//GEN-LAST:event_addOrgBtnActionPerformed

    private void orgCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgCmbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgCmbBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrgBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox orgCmbBox;
    private javax.swing.JTable orgTbl;
    private javax.swing.JLabel orgtypeLbl;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
DefaultTableModel model = (DefaultTableModel) orgTbl.getModel();
model.setRowCount(0);
for (Organization org : orgDir.getOrganizationList()){
Object[] row = new Object[2];
row[0] = org.getOrganizationID();
row[1] = org.getName();
model.addRow(row);
}
    }
    
    
private void populateCombo() {
orgCmbBox.removeAllItems();
for (OrganizationType type : Organization.OrganizationType.values()){
if (!type.getValue().equals(OrganizationType.Admin.getValue()))
orgCmbBox.addItem(type);
}
    }
}
