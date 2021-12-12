/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Role;

import Schema.EcoSystem;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Supplier.SupplierWorkAreaJPanel;

/**
 *
 * @author ganes
 */
public class SupplierRole extends Role {

  
    @Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
return new SupplierWorkAreaJPanel(userProcessContainer,business,account,organization);
}

@Override
public String toString() {
    return "Support Role";
}
    
}
