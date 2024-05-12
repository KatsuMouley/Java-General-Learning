package Objects;
public class Bicycle extends Vehicle {
    public String Typename = "Bike";
    public int wheels = 2, pedals = 2;
    
    //When a method is abstract, we're forced to Override the method in the child class
    @Override
    public void start() {
        System.out.println("the Bike started to move");    
    }
}