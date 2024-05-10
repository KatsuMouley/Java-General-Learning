package files;

import Objects.Animal;
import Objects.Dog;

public class OverridingMethods {
    public static void main(String[] args) {
        run();
    }
    // method overriding = 	Declaring a method in sub class,
    //						which is already present in parent class.
    //						done so that a child class can give its own implementation
    public static void run() {
        Animal animal = new Animal();
		Dog dog = new Dog();
		animal.speak();
		dog.speak();
    }
}

