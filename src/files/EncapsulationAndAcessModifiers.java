package files;
import files.package1.B;
public class EncapsulationAndAcessModifiers {

    public static void main(String[] args) {
        run();
    }
    public static void run() {
            // Encapsulation =  attributes of a class will be gidden or private,
            //                  Can be acessed only through methods (getters & setters)
            //                  You should make attributes private if you don't have a reason to make them
            B b = new B("This is an encapsulated message");
            System.out.println(b.getDifferentMessage());
    }
}
