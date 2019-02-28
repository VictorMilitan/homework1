package employeemanager.models;

/**
 *
 * @author User
 */
public class CountableDemo {
    
    public static void main(String [] args) {
        Countable countable = new Countable();
        System.out.println("Counter = " + Countable.counter);
        Countable countable2 = new Countable();
        System.out.println("Counter = " + Countable.counter);
        Countable countable3 = new Countable();
        System.out.println("Counter = " + Countable.counter);
        Countable countable4 = new Countable();
        System.out.println("Created " + Countable.counter + " objects of type Coutable");
    }
    
}
