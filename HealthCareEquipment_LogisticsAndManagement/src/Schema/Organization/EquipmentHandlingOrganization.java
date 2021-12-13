/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Organization;

import Schema.Role.MedicalEquipmentRole;
import Schema.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class EquipmentHandlingOrganization extends Organization {
    public EquipmentHandlingOrganization(){
        super(Organization.OrganizationType.MedicalEquipment.getValue());
          }
    
    
    @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicalEquipmentRole());
        return roles;
    }
}
