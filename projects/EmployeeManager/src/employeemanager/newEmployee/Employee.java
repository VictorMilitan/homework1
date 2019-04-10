/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.newEmployee;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Employee {

    private Integer id;
    private String name;
    private String surname;
    protected Position position;
    private String street;
    private String city;
    private String country;
    private Integer zip;
    private LocalDate birth;

    public Employee(String name, String surname, String day, String month, String year, String street, String city, String country, Integer zip) {
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.city = city;
        this.country = country;
        this.setBirth(day, month, year);
        this.zip = zip;

    }
    
    public Employee(String id, String name, String surname, String birth, String adress,String position) {
        
    }
    
    public Employee(Integer id, String name, String surname, String birth, String adress,Position position) {
        
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Position getPosition() {
        return position;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(String day, String month, String year) {
        birth = LocalDate.parse(year + "-" + month + "-" + day);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isValid() {
        return !this.name.isEmpty();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

//    @Override
//    public String toString() {
//        return "Employee{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", "
//                + "street=" + street + ", country=" + country + ", zip=" + zip + ","
//                + "city=" + city + ", position=" + position + '}';
//    }
    public void work() {
        System.out.println("I am an employee.");
    }

    public String toString() {
        return id + "," + name + "," + surname + "," + birth + "," + (street + " " + city + " " + country + " " + zip) + "," + position;
    }

}
