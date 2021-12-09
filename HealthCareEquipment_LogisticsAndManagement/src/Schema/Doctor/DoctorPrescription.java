/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Doctor;

import java.util.Date;

/**
 *
 * @author krishna
 */
public class DoctorPrescription {
    private String NameOfMedicine;
    private int NoOfDays;
    private int TimesInADay;
    private String daignosis;

    public String getDaignosis() {
        return daignosis;
    }

    public void setDaignosis(String daignosis) {
        this.daignosis = daignosis;
    }
    private Date DateOfPrescription;
    private String networkName;

    public String getNameOfMedicine() {
        return NameOfMedicine;
    }

    public void setNameOfMedicine(String NameOfMedicine) {
        this.NameOfMedicine = NameOfMedicine;
    }

    public int getNoOfDays() {
        return NoOfDays;
    }

    public void setNoOfDays(int NoOfDays) {
        this.NoOfDays = NoOfDays;
    }

    public int getTimesInADay() {
        return TimesInADay;
    }

    public void setTimesInADay(int TimesInADay) {
        this.TimesInADay = TimesInADay;
    }

    public Date getDateOfPrescription() {
        return DateOfPrescription;
    }

    public void setDateOfPrescription(Date DateOfPrescription) {
        this.DateOfPrescription = DateOfPrescription;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
}
