package Objects;

public class Boat extends Vehicle{
    public Boat(){
        super.Typename = "Boat";
    }
    @Override
    public void start() {
        System.out.println("the Car started to move");  
    }
    @Override
    public void drive() {
		System.out.println("You drive the Boat");
	}
    @Override
	public void brake() {
		System.out.println("You step on the brakes of the Boat... boats have breaks?");	
	}	
}
