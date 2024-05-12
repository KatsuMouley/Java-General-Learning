package Objects;

public class Car extends Vehicle {
	public String name, Typename = "Car"; 
	public String make = "Chevrolet";
	public String model = "Corvette";
	public int year = 2020;
	public String color = "blue";
	public double price = 50000.00;
    public int wheels = 4, door = 4;
	
    public Car(){}
	public Car(String name){
		this.name = name;
	}

	public void drive() {
		System.out.println("You drive the car");
	}
	public void brake() {
		System.out.println("You step on the brakes");
		
	}	
	
    //When a method is abstract, we're forced to Override the method in the child class
    @Override
    public void start() {
        System.out.println("the Car started to move");    
    }
}
