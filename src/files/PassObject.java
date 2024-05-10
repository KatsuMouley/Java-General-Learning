package files;
import Objects.Car;
import Objects.Garage;
public class PassObject {
    public static void main(String[] args) {
        run();
    }
    //How to pass objects as arguments?
    public static void run() {
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");
        garage.Park(car1);
        garage.Park(car2);
    }
}
