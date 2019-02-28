/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.models;

/**
 *
 * @author User
 */
public class Countable {
    
    String objectName;
    static int counter = 0;
    
    //Count the amount of objects if type Countable 
    public Countable() {
        counter++;
        objectName = "Countable " + counter;
       // System.out.println(objectName);
    }
    
}
