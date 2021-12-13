/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Organization;

import Schema.PharmaInventory.PharmaInventory;
import Schema.Role.PharmacistRole;
import Schema.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class PharmacyOrganization extends Organization{
private ArrayList<PharmaInventory> medList;
public PharmacyOrganization()
 {
super(Organization.OrganizationType.Pharmacy.getValue());
medList=new ArrayList<PharmaInventory>();
}


@Override
public ArrayList<Role> getSupportedRole()
 {
ArrayList<Role> roles = new ArrayList<>();
roles.add(new PharmacistRole());
return roles;
}
public ArrayList<PharmaInventory> getMedList()
 {
return medList;
}
public void setMedList(ArrayList<PharmaInventory> medList)
{
this.medList = medList;
}
public void addMedicine(PharmaInventory mi)
{
medList.add(mi);
}

}
