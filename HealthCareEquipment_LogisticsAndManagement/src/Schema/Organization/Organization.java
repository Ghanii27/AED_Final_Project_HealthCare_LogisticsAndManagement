/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Organization;

import Schema.Doctor.DoctorPrescription;
import Schema.Employee.EmployeeDirectory;
import Schema.Role.Role;
import Schema.UserAccount.UserAccountDirectory;
import Schema.WorkQueue.WorkQueue;
import Schema.WorkQueue.HealthcareEquipmentWorkRequest;
import java.util.ArrayList;
/**
 *
 * @author ganes
 */
public abstract class Organization {
    private String name;
private WorkQueue workQueue;
private EmployeeDirectory employeeDirectory;
private UserAccountDirectory userAccountDirectory;
private int organizationID;
private static int counter;

private HealthcareEquipmentWorkRequest medreq;
private ArrayList<DoctorPrescription> pList;

public enum OrganizationType{
Admin("Admin Organization"), Doctor("Doctor Organization"),Operations("Operations Organization"),
Pharmacy("Pharmacy Organization"),Supplier("Supplier Organization"),MedicalEquipment("Equipment Organization"),
Transport("Transportation Organization");
private String value;

private OrganizationType(String value) {
this.value = value;
    }
public String getValue() {
return value;
    }
}



public Organization(String name) {
this.name = name;
workQueue = new WorkQueue();
employeeDirectory = new EmployeeDirectory();
userAccountDirectory = new UserAccountDirectory();

organizationID = counter;
pList=new ArrayList<DoctorPrescription>();

// medreq=new HealthcareEquipmentWorkRequest();
++counter;
}
public abstract ArrayList<Role> getSupportedRole();
public UserAccountDirectory getUserAccountDirectory() {
return userAccountDirectory;
}
public int getOrganizationID() {
return organizationID;
}
public EmployeeDirectory getEmployeeDirectory() {
return employeeDirectory;
}
public String getName() {
return name;
}
public WorkQueue getWorkQueue() {
return workQueue;
}
public void setName(String name) {
this.name = name;
}
public void setWorkQueue(WorkQueue workQueue) {
this.workQueue = workQueue;
}
@Override
public String toString() {
return name;
}
    
}
