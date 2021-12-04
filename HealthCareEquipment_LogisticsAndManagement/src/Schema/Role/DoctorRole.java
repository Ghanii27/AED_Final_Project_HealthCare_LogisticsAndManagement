/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Role;

import Schema.Enterprise.Enterprise;
import Schema.Organization.DoctorOrganization;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ganes
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business, Network network) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account,(DoctorOrganization)organization,enterprise,business,network);
    }
    
    
}
