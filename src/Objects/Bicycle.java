package Objects;
public class Bicycle extends Vehicle {
    public String Typename = "Bike";
    public int wheels = 2, pedals = 2;

    public Bicycle(){
		super.Typename = Typename;
    }
    
    //When a method is abstract, we're forced to Override the method in the child class
    @Override
    public void start() {
        System.out.println("the Bike started to move");    
    }

    @Override
    public void drive() {
		System.out.println("You drive the Bicycle");
	}
    @Override
	public void brake() {
		System.out.println("You step on the brakes of the bicycle... You crashed in the floor!? how?");	
	}	
}