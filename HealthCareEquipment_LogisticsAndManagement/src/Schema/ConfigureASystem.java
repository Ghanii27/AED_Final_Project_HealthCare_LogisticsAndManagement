/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema;


import Schema.Employee.Employee;
import Schema.Role.SysAdminRole;
import Schema.UserAccount.UserAccount;

/**
 *
 * @author krishna
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("YGS");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("neu","neu",employee,new SysAdminRole());
        return system;
    }
    
}
