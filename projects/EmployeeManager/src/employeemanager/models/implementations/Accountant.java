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
public class Accountant extends Employee {
    
    public void calculate() {
        System.out.println("Accountant calculates");
    }
    
    @Override    //при переписании ставим это чтобы компилятор проверил за нас сдплали ли мы правильно оверрайд
    public void work() {
        super.work();
        calculate();
    }
    
}

class AccountDemo {
    public static void main (String[] args) {
        Employee employee = new Employee();
        employee.work();
        
        Accountant acc = new Accountant();
        acc.work();
    }
}
