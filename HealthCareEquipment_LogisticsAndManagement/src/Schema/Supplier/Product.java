/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Supplier;

import java.util.Date;

/**
 *
 * @author ganes
 */
public class Product {
    private int id;
    private String slNo;
    private Date expiryDate;
    private int barCodeNumber;
    private String nameOfMedicine;
    private String desc;
    private static int count=0;
    private String nameOfVaccine;
    private String NameOfHospital;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlNo() {
        return slNo;
    }

    public void setSlNo(String slNo) {
        this.slNo = slNo;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    
    public Product(){
        count++;
        id=count;
    }
    
    public int getBarCodeNumber() {
        return barCodeNumber;
    }

    public void setBarCodeNumber(int barCodeNumber) {
        this.barCodeNumber = barCodeNumber;
    }

    public String getNameOfMedicine() {
        return nameOfMedicine;
    }

    public void setNameOfMedicine(String nameOfMedicine) {
        this.nameOfMedicine = nameOfMedicine;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getNameOfVaccine() {
        return nameOfVaccine;
    }

    public void setNameOfVaccine(String nameOfVaccine) {
        this.nameOfVaccine = nameOfVaccine;
    }

    public String getNameOfHospital() {
        return NameOfHospital;
    }

    public void setNameOfHospital(String NameOfHospital) {
        this.NameOfHospital = NameOfHospital;
    }
    
    
    
   
    
}
