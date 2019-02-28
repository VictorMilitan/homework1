/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author User
 */
public class Salesman {
    String name, surname, street;
    int blockNo, apartmentNo, birth;
    long IDNP;
    
    //1.Default
    //2.Shows surname
    //3.Shows surname+birth
    //4.shows name + birth info
    //5.Where lives 
    //6.add method called show to show all info
    
    public Salesman() {
        //this is default constructer 
        System.out.println("1111");
    }
    
    public Salesman(String surname) {
        this.name = surname;
        System.out.println("2222");
    }   
    
    public Salesman(String surname, int birth) {
        this.surname = surname;
        this.birth = birth;
        System.out.println("3333");
    }
    
    public Salesman(String name, String surname, long IDNP) {
        this.name = name;
        this.surname = surname;
        this.IDNP = IDNP;
        System.out.println("4444");
    }
    
    public Salesman(String street, int blockNo, int apartmentNo) {
        this.street = street;
        this.blockNo = blockNo;
        this.apartmentNo = apartmentNo;
        System.out.println("5555");
    }
    
    public void show() {
        System.out.println(name + " " + surname + " " + birth + " " + IDNP + " " +
                street + " " + blockNo + " " + apartmentNo);
    }
    
    public void displayName() {
        System.out.println(name);
    }
    
    public void displaySurname() {
            System.out.println(surname);
            
    }
    
    public void displayBirth() {
        System.out.println(birth);
    }
    
    public void displayIDNP() {
        System.out.println(IDNP);
    }
    
    public void displaySteet() {
        System.out.println(street);
    }
    
    public void displayBlockNo() {
        System.out.println(blockNo);
    }
    
    public void displayApartmentNo() {
        System.out.println(apartmentNo);
    }
}
