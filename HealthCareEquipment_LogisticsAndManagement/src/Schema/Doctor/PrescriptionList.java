/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Doctor;

import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class PrescriptionList {
    
    private ArrayList<DoctorPrescription> prescriptionlist;
    public ArrayList<DoctorPrescription> getPrescriptionlist() {
        return prescriptionlist;
    }

    
    public void setPrescriptionlist(ArrayList<DoctorPrescription> prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }
    
    
    public DoctorPrescription addDoctorPrescription(){
        DoctorPrescription prescription = new DoctorPrescription();
        prescriptionlist.add(prescription);
        return prescription;
    }
}
