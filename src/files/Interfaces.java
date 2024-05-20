package files;
import Objects.Rabbit;
import Objects.Hawk;
import Objects.Fish;
public class Interfaces {
    public static void main(String[] args) {
        run();
    }
    // Interface = a template that can be applied to a class.
    //             similar to inheritance, but specifies what a class has/must do.
    //             classes can apply more than one interface, inheritance is limited to 1 super            
    public static void run() {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
