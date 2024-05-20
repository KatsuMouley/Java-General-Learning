package files;

import java.util.Scanner;

import Objects.Animal;
import Objects.Cat;
import Objects.Dog;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        run();
    }
    
    // polymorphism = many shapes/forms;
    // example = A Corvette is a Car that it's a Vehicle that it's an Object.
    //
    // Dynamic = After compilation (During running)
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        
        System.out.println("What animal do you want?"); 
        System.out.print("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();
        
        if(choice==1) {
        animal = new Dog();
        animal.speak();
        }
        else if(choice==2) {
        animal = new Cat();
        animal.speak();
        }
        else {
        animal = new Animal();
        System.out.println("That choice was invalid");
        animal.speak();
        }
        scanner.close();
    }
}
