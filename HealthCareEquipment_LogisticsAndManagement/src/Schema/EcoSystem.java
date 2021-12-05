/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema;


import Schema.Organization.Organization;
import java.util.ArrayList;
/**
 *
 * @author krishna
 */
public class EcoSystem extends Organization {



private static EcoSystem business;
private ArrayList<Network> networkList;



public static EcoSystem getInstance() {
if (business == null) {
business = new EcoSystem();
}
return business;
}



private EcoSystem() {
super(null);
networkList = new ArrayList<>();
}



public ArrayList<Network> getNetworkList() {
return networkList;
}



public Network createAndAddNetwork() {
Network network = new Network();
networkList.add(network);
return network;
}



@Override
public ArrayList<Role> getSupportedRole() {
ArrayList<Role> roleList = new ArrayList<>();
roleList.add(new SysAdminRole());
return roleList;
}



public boolean checkIfUsernameIsUnique(String username) {



if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
return false;
}
return true;
}
}