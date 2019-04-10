/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.newEmployee;

/**
 *
 * @author User
 */
public class Accountant extends Employee {

    String type = "accountant";

    public Accountant(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void work() {
        System.out.println("I am accountant");
    }
    

}
