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
import ui.Transportation.TransportationWorkAreaJPanel;

/**
 *
 * @author ganes
 */
public class TransportationRole extends Role {
    @Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
return new TransportationWorkAreaJPanel(userProcessContainer,account,organization,business);
}

@Override
public String toString() {
    return "Transportation Role";
}
}
