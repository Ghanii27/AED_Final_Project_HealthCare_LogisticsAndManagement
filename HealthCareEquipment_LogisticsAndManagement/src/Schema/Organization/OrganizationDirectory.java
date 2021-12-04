/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Organization;

import Schema.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author ganes
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    public OrganizationDirectory () {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(OrganizationType type){
Organization organization = null;
if (type.getValue().equals(OrganizationType.Doctor.getValue())){
organization = new DoctorOrganization();
organizationList.add(organization);
}

else if (type.getValue().equals(OrganizationType.Pharmacy.getValue())){
organization=new PharmacyOrganization();
organizationList.add(organization);
}

else if (type.getValue().equals(OrganizationType.Supplier.getValue())){
organization=new SupplierOragnization();
organizationList.add(organization);
}

else if (type.getValue().equals(OrganizationType.MedicalEquipment.getValue())){
organization=new EquipmentHandlingOrganization();
organizationList.add(organization);
}
else if (type.getValue().equals(OrganizationType.Transport.getValue())){
organization=new TransportOrganization();
organizationList.add(organization);
}
return organization;
}

}
