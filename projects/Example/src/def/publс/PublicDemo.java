package def.publс;

import def.PublicPerson;
import def.prvate.PrivatePerson;

/**
 *
 * @author User
 */
public class PublicDemo {
    public static void main(String [] args) {
        PublicPerson publicPerson = new PublicPerson();
        PrivatePerson privatePerson = new PrivatePerson();
        //PersonWithDefaultAccess pers = new PersonWithDefaultPerson();
        publicPerson.name = " Jake";
        publicPerson.surname = "Peterson";
        
        publicPerson.presentYourself();
    }
    
}

