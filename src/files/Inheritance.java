package files;
import Objects.Bicycle;
import Objects.Car;

public class Inheritance {
       public static void main(String[] args) {
        run();
    }
    public static void run() {Car car = new Car();
		
		car.go(car.Typename);
		car.stop(car.Typename);
		
		Bicycle bike = new Bicycle();
		
		bike.go(bike.Typename);
		bike.stop(bike.Typename);
		
		System.out.println(car.door);
		System.out.println(bike.pedals);
    }
}
