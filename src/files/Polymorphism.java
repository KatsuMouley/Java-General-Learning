package files;
import Objects.Boat;
import Objects.Bicycle;
import Objects.Car;
import Objects.Vehicle;
public class Polymorphism {

    public static void main(String[] args) {
        run();
    }
    // polymorphism = 	greek word for poly-"many", morph-"form"
	//					The ability of an object to identify as more than one type
    
    public static void run() {
        Car car = new Car("car");
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, boat, bicycle};
        for (Vehicle x : vehicles) {
            System.out.println("\n-------------------------------------------");
            x.drive();
            x.brake();
            x.go(x.Typename);
            x.stop(x.Typename);
            System.out.println("-------------------------------------------\n");
        }
    }
}
