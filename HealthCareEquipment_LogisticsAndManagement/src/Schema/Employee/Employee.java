/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Employee;

/**
 *
 * @author ganes
 */
public class Employee {
    private String EmployeeName;
    private int EmployeeId;
    private static int count = 1;
    
    public Employee() {
        EmployeeId = count;
        count++;
    }
    public int getEmployeeId(){
        return EmployeeId;
    }
    public void setName (String EmployeeName){
        this.EmployeeName=EmployeeName;
        }
    public String getEmployeeName(){
        return EmployeeName;
        }
    @Override
    public String toString(){
        return EmployeeName;
    }
}
