package Objects;

public class Car extends Vehicle {
    

	public String make = "Chevrolet";
	public String model = "Corvette";
	public int year = 2020;
	public String color = "blue";
	public double price = 50000.00;
	
    public Car(){}

	public void drive() {
		System.out.println("You drive the car");
	}
	public void brake() {
		System.out.println("You step on the brakes");
	}	
}
