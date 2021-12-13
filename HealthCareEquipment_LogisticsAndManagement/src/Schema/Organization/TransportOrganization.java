/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Organization;

import Schema.Role.Role;
import Schema.Role.TransportationRole;
import java.util.ArrayList;

/**
 *
 * @author ganes
 */
public class TransportOrganization extends Organization {
public TransportOrganization(){
super(Organization.OrganizationType.Transport.getValue());
    
}
@Override
public ArrayList<Role> getSupportedRole(){
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new TransportationRole());
    return roles;
}
}
