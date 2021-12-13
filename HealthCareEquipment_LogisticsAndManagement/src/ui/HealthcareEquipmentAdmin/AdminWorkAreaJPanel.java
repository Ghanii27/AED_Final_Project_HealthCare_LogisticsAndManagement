/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HealthcareEquipmentAdmin;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Schema.Enterprise.Enterprise;
import ui.HospitalAdminRole.*;



/**
 *
 * @author 16176
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLbl.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();
        enterpriseLbl = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();
        manageOrgBtn = new javax.swing.JButton();
        manageemployeeBtn = new javax.swing.JButton();
        manageuserBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 102));
        headerLbl.setText("MY Work Area - Administrative Role");
        jPanel1.add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 720, 40));

        enterpriseLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        enterpriseLbl.setText("Enterprise : ");
        jPanel1.add(enterpriseLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        valueLbl.setText("<Value>");
        jPanel1.add(valueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        manageOrgBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageOrgBtn.setText("Manage Organization");
        manageOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgBtnActionPerformed(evt);
            }
        });
        jPanel1.add(manageOrgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 230, 40));

        manageemployeeBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageemployeeBtn.setText("Manage Employee");
        manageemployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageemployeeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(manageemployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 230, 40));

        manageuserBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageuserBtn.setText("Manage User");
        jPanel1.add(manageuserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgBtnActionPerformed
       ManageOrganizationJPanel manageOrgJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
       userProcessContainer.add("manageOrgJPanel", manageOrgJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrgBtnActionPerformed

    private void manageemployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageemployeeBtnActionPerformed
     ManageEmployeeJPanel manageemployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
         userProcessContainer.add("manageemployeeJPanel",manageemployeeJPanel );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_manageemployeeBtnActionPerformed

    private void manageuserBtnActionPerformed(java.awt.event.ActionEvent evt) {
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
         userProcessContainer.add("ManageUserAccountJPanel",muajp );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageOrgBtn;
    private javax.swing.JButton manageemployeeBtn;
    private javax.swing.JButton manageuserBtn;
    private javax.swing.JLabel valueLbl;
    // End of variables declaration//GEN-END:variables
}
