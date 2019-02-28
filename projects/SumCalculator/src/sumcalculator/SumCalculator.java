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
public class SumCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SumCalc sumcalc = new SumCalc();
        sumcalc.add(5.5, 5.6);
        sumcalc.add(5, 6);

        Person person = new Person();
        Person personWithNameAndSurname = new Person("Jake", "Peterson");
        Person persWithNameAndSurnameAndAge = new Person("Jake", "Peterson", 25);
        persWithNameAndSurnameAndAge.show();

    }

}
