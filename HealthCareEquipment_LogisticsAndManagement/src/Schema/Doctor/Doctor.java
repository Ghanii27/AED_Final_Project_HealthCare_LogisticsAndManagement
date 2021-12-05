/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Schema.Doctor;

/**
 *
 * @author krishna
 */
public class Doctor {
    private String Name;
    private PrescriptionList prescriptionlist;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public PrescriptionList getPrescriptionlist() {
        return prescriptionlist;
    }

    public void setPrescriptionlist(PrescriptionList prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }
    
    public Doctor(){
        prescriptionlist = new PrescriptionList();
    }
}
