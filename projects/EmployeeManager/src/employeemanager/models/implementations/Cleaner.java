/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.models.implementations;

import employeemanager.models.Employee;


/**
 *
 * @author User
 */
public class Cleaner extends Employee {
    
    @Override
    public String toString(){
        return "Cleaner that likes to clean";
    }
    
}

class CleanerDemo {
    
    public static void main(String[] args) {
        Cleaner cl = new Cleaner();
        System.out.println(cl);
    }
}
