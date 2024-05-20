package files.package2;
import files.package1.A;
public class Asub extends A{
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        // C c = new C();
        //default: visible to all classes in the same package 
        Asub asub = new Asub();
        System.out.println(asub.protrectedMessage);
        // protected: visible to all classes in the same package or classes in other packages that are a subclass
    }
}
