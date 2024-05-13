package Objects;

public abstract class Vehicle {
    // inheritance = 	the process where one class acquires,
	//					the attributes and methods of another.
    public String Typename;
    public double speed;

    public abstract void start();//Abstract methods does not specift a body
    public abstract void drive();
    public abstract void brake();
    public void go(String Typename){
        System.out.println("The "+Typename+" is moving");
    }
    public void stop(String Typename){
        System.out.println("The "+Typename+" is stopped");
    }

}
