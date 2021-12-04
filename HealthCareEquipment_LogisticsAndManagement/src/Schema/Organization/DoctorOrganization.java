/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Organization;

import Schema.Doctor.DoctorPrescription;
import Schema.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ganes
 */
public class DoctorOrganization extends Organization {

        private ArrayList<DoctorPrescription> plist;
        public DoctorOrganization(){
            super(Organization.OrganizationType.Doctor.getValue());
            plist=new ArrayList<DoctorPrescription>();
                     
        }
 
        @Override 
        public ArrayList<Role> getSupportedRole(){
            ArrayList<Role> roles = new ArrayList<>();
            roles.add(new DoctorRole());
            return roles;
        }

    public ArrayList<DoctorPrescription> getPlist() {
        return plist;
    }

    public void setPlist(ArrayList<DoctorPrescription> plist) {
        this.plist = plist;
    }
    
    public void addPrescription(DoctorPrescription prescription){
        plist.add(prescription);
    }
    }
    

