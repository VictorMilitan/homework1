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
public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // we know :
        //name
        //surname
        //birth
        // IDNP
        //street
        //blockNo
        //appartmentNo
        
        Programmer programmer = new Programmer();
        Programmer programmerWithSurname = new Programmer("Victor");
        Programmer programmerWithSurnameAndBirth = new Programmer("Victor", 25);
        Programmer programmerWithNameAndSurnameAndIDNP = new Programmer("Victor", "Militan", 25);
        Programmer programmerWithSteetAndBlockNoAndApartmentNo = new Programmer("Lenin", 13, 5);
        //Programmer programmerWithNameAndSurnameAndBirthAndIdnpAndStreetAndBlockNoAndApartmentNo = new Programmer("Victor", "Militan", 1993, 159486532, "Lenin", 35, 2);
        programmer.show();
        programmerWithSurname.show();
        programmerWithSurnameAndBirth.show();
        programmerWithNameAndSurnameAndIDNP.show();
        programmerWithSteetAndBlockNoAndApartmentNo.show();
       // programmerWithNameAndSurnameAndBirthAndStreetAndIDNPAndBlockNoAndApartmentNo.show();
        
        Bookkeeper bookkeeper = new Bookkeeper();
        Bookkeeper bookkeeperWithSurname = new Bookkeeper("Smith");
        Bookkeeper bookkeeperWithSurnameAndBirth = new Bookkeeper("Smith", 1990);
        Bookkeeper bookkeeperWithNameAndSurnameAndIDNP = new Bookkeeper("John", "Smith", 195468795);
        Bookkeeper bookkeeperWithSteetAndBlockNoAndApartmentNo = new Bookkeeper("Avenue", 26, 18);
        bookkeeperWithSteetAndBlockNoAndApartmentNo.show();
        
        
        Manager manager = new Manager();
        Manager managerWithSurname = new Manager();
        Manager managerWithSurnameAndBirth = new Manager();
        Manager managerWithNameAndSurnameAndIDNP = new Manager();
        Manager managerWithSteetAndBlockNoAndApartmentNo = new Manager();
        
        
        Salesman salesman = new Salesman();
        Salesman salesmanWithSurname = new Salesman();
        Salesman salesmanWithSurnameAndBirth = new Salesman();
        Salesman salesmanWithNameAndSurnameAndIDNP = new Salesman();
        Salesman salesmanWithSteetAndBlockNoAndApartmentNo = new Salesman();
        
        Technician technician = new Technician();
        Technician technicianWithSurname = new Technician();
        Technician technicianWithSurnameAndBirth = new Technician();
        Technician technicianWithNameAndSurnameAndIDNP = new Technician();
        Technician technicianWithSteetAndBlockNoAndApartmentNo = new Technician();
    }
    
}
