/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.UserAccount;

import Schema.Employee.Employee;
import Schema.Role.Role;
import Schema.WorkQueue.WorkQueue;

/**
 *
 * @author 16176
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    
    public UserAccount(){
        workQueue = new WorkQueue();
    }
    
    
    
}
