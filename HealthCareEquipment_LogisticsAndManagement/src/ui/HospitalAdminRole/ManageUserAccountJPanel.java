/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalAdminRole;

import Schema.Employee.Employee;
import Schema.Enterprise.Enterprise;
import Schema.Organization.Organization;
import Schema.Organization.OrganizationDirectory;
import Schema.Role.Role;
import Schema.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 16176
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {
    private JPanel userprocesscontainer;
    private Enterprise ent;
    

    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(JPanel userprocessContainer, Enterprise ent) {
        initComponents();
        this.ent=ent;
        this.userprocesscontainer=userprocessContainer;
        
        populateOrgCmbBox();
        popData();
    }

        public void populateOrgCmbBox() {
orgCmbBox1.removeAllItems();
for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
orgCmbBox1.addItem(organization);
}
    }

        public void popData() {
DefaultTableModel model = (DefaultTableModel)  userTbl1.getModel();
model.setRowCount(0);
for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
Object row[] = new Object[2];
row[0] = ua.getUsername();
row[1] = ua.getRole();
((DefaultTableModel) userTbl1.getModel()).addRow(row);
}
}
    }
        
        
public void populateRoleCmbBox(Organization org) {
roleCmbBox1.removeAllItems();
for (Role role : org.getSupportedRole()){
roleCmbBox1.addItem(role);
}
    }

public void populateEmpCmbBox(Organization org) {
empCmbBox1.removeAllItems();
for (Employee emp : org.getEmployeeDirectory().getEmployeeList()){
empCmbBox1.addItem(emp);
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
        userTbl1 = new javax.swing.JTable();
        passwordLbl1 = new javax.swing.JLabel();
        usernameLbl1 = new javax.swing.JLabel();
        backBtn1 = new javax.swing.JButton();
        passwordTxt1 = new javax.swing.JTextField();
        nameTxt1 = new javax.swing.JTextField();
        orgLbl1 = new javax.swing.JLabel();
        roleLbl1 = new javax.swing.JLabel();
        createuserBtn1 = new javax.swing.JButton();
        empCmbBox1 = new javax.swing.JComboBox();
        roleCmbBox1 = new javax.swing.JComboBox();
        orgCmbBox1 = new javax.swing.JComboBox();
        empLbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        userTbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
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
        jScrollPane2.setViewportView(userTbl1);

        passwordLbl1.setText("Password      :");

        usernameLbl1.setText("User Name    :");

        backBtn1.setText("<< Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        passwordTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxt1ActionPerformed(evt);
            }
        });

        orgLbl1.setText("Organization  :");

        roleLbl1.setText("Role             :");

        createuserBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        createuserBtn1.setText("Create User Account");
        createuserBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createuserBtn1ActionPerformed(evt);
            }
        });

        empCmbBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        roleCmbBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        orgCmbBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCmbBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgCmbBox1ActionPerformed(evt);
            }
        });

        empLbl1.setText("Employee      :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Manage User Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createuserBtn1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(632, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(508, 508, 508)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roleLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roleCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(empLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orgLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orgCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usernameLbl1)
                                .addComponent(passwordLbl1))
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTxt1)
                                .addComponent(passwordTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))))
                    .addContainerGap(690, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createuserBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(428, 428, 428)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(orgLbl1)
                        .addComponent(orgCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empLbl1)
                        .addComponent(empCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(roleLbl1)
                        .addComponent(roleCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameLbl1)
                        .addComponent(nameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordLbl1)
                        .addComponent(passwordTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(241, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
 userprocesscontainer.remove(this);
 CardLayout lyt = (CardLayout) userprocesscontainer.getLayout();
lyt.previous(userprocesscontainer);// TODO add your handling code here:
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void passwordTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxt1ActionPerformed

    private void createuserBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createuserBtn1ActionPerformed
String userName =   nameTxt1.getText();
String password = passwordTxt1.getText();
Organization org = (Organization) orgCmbBox1.getSelectedItem();
Employee emp = (Employee) empCmbBox1.getSelectedItem();
Role role = (Role) roleCmbBox1.getSelectedItem();
org.getUserAccountDirectory().createUserAccount(userName, password, emp, role);
popData();// TODO add your handling code here:
        
    }//GEN-LAST:event_createuserBtn1ActionPerformed

    private void orgCmbBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgCmbBox1ActionPerformed
Organization org = (Organization) orgCmbBox1.getSelectedItem();
if (org!=null){
populateEmpCmbBox(org);
populateRoleCmbBox(org);// TODO add your handling code here:
    }//GEN-LAST:event_orgCmbBox1ActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton createuserBtn1;
    private javax.swing.JComboBox empCmbBox1;
    private javax.swing.JLabel empLbl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTxt1;
    private javax.swing.JComboBox orgCmbBox1;
    private javax.swing.JLabel orgLbl1;
    private javax.swing.JLabel passwordLbl1;
    private javax.swing.JTextField passwordTxt1;
    private javax.swing.JComboBox roleCmbBox1;
    private javax.swing.JLabel roleLbl1;
    private javax.swing.JTable userTbl1;
    private javax.swing.JLabel usernameLbl1;
    // End of variables declaration//GEN-END:variables







}
