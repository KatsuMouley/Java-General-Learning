package Objects;
public class Garage {

    public Garage(){}

    public void Park(Car car/*Since car is inside the same package of Garage, which is Objects, we can use it inside this object without the need to import the package*/){
        System.out.println("The "+ car.name +" is parked in the Garage");
    }
}
