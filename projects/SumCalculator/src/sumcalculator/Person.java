/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumcalculator;

/**
 *
 * @author User
 */
public class Person {
    String name, surname;
    int age;
    
    public Person() {
        //default constructor
        System.out.println("Default Constructor");
    
}
    public Person(String pName, String pSurname) {
        //code
    name = pName;
    surname = pSurname;
    System.out.println("Default with 2 Constructors");

}
    public Person(String pName, String pSurname, int age) {
        name = pName;  //this.name = name;
        surname = pSurname;
        this.age = age;
        System.out.println("Default with 3 Constructors");
    }
    
    public void show(){
        System.out.println(name + " " + surname + " " + age);
        
    }
   
            
        }
  
       
    

