/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;

import Schema.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author 16176
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel upContainer;
    Enterprise ent;
        /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel upContainer, Enterprise ent) {
        initComponents();
        this.upContainer=upContainer;
        this.ent=ent;
        valueLbl.setText(ent.getName());
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
        enterpriseLbl = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();
        manageOrgBtn = new javax.swing.JButton();
        manageEmpBtn = new javax.swing.JButton();
        manageUserBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 102));
        headerLbl.setText("My Work Area - Administrative Role");
        add(headerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        enterpriseLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enterpriseLbl.setText("Enterprise:");
        add(enterpriseLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        valueLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        valueLbl.setText("<value>");
        add(valueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        manageOrgBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageOrgBtn.setText("Manage Organization");
        manageOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgBtnActionPerformed(evt);
            }
        });
        add(manageOrgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 260, -1));

        manageEmpBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageEmpBtn.setText("Manage Employee");
        manageEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpBtnActionPerformed(evt);
            }
        });
        add(manageEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 260, -1));

        manageUserBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageUserBtn.setText("Manage User");
        manageUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserBtnActionPerformed(evt);
            }
        });
        add(manageUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserBtnActionPerformed
ui.HospitalAdminRole.ManageUserAccountJPanel  mngUA = new   ui.HospitalAdminRole.ManageUserAccountJPanel(upContainer, ent) ;
upContainer.add("ManageUserAccountJPanel",mngUA);
CardLayout cly = (CardLayout) upContainer.getLayout();
cly.next(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_manageUserBtnActionPerformed

    private void manageEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpBtnActionPerformed
ui.HospitalAdminRole.ManageEmployeeJPanel mngEmpJPanel = new ui.HospitalAdminRole.ManageEmployeeJPanel(upContainer, ent.getOrganizationDirectory());
upContainer.add("mngEmpJPanel", mngEmpJPanel);
CardLayout lyt = (CardLayout) upContainer.getLayout();
lyt.next(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_manageEmpBtnActionPerformed

    private void manageOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgBtnActionPerformed
        ui.HospitalAdminRole.ManageOrganizationJPanel manageOrgJPanel = new ui.HospitalAdminRole.ManageOrganizationJPanel(upContainer, ent.getOrganizationDirectory());
        upContainer.add("manageOrgJPanel", manageOrgJPanel);
        CardLayout layout = (CardLayout) upContainer.getLayout();
        layout.next(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_manageOrgBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JButton manageEmpBtn;
    private javax.swing.JButton manageOrgBtn;
    private javax.swing.JButton manageUserBtn;
    private javax.swing.JLabel valueLbl;
    // End of variables declaration//GEN-END:variables
}
