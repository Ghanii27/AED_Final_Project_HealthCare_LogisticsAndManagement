/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Organization;

import Schema.Role.AdminRole;
import Schema.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class AdminOrganization extends Organization {
    private String organizationName;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    public AdminOrganization(){
        super(OrganizationType.Admin.getValue());
    }
 
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
}
