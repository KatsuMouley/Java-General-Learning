package files;
// import Objects.Vehicle;
import Objects.Car;
public class Abstraction {
        public static void main(String[] args) {
            run();
        }
        public static void run() {
            // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
            //				abstract methods are declared without an implementation
            // Vehicle vehicle = new Vehicle();
            Car car1 = new Car();
            car1.start();
        }


}
