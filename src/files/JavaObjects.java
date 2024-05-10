package files;
import Objects.Car;
public class JavaObjects {

    public static void main(String[] args) {
        run();
    }
	public static void run() {
		
		Car myCar1 = new Car();
		// Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();
	}
}