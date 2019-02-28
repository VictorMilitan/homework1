package cars.models;

import cars.parts.Engine;

/**
 *
 * @author User
 */
public class Car {
    
    int numberOfWheels;   //атрибут - характеризует 
    int numberOfDoors;
    String name;
    String subModel;
    Engine engine;
    
    boolean isStarted = false;
    
    
    void startEngine() {         //метод - что делает 
        isStarted = true;
        
    }
    
    void run() {
       consumeFuel();
    }
    
    void consumeFuel() {
        
    }
    
    public void present() {
        System.out.println("Info: Name" + name + " subModel:" + subModel
                + "#Wheels" + numberOfWheels + " #Doors" + numberOfDoors);
    }
}
