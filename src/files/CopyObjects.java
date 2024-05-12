package files;
import Objects.SubObject;
public class CopyObjects {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        SubObject obj1 = new SubObject("Katsu", 19);
        SubObject obj2 = new SubObject("Victor", 28);
        SubObject obj3 = new SubObject(obj2);//it already clone in the declaration
        System.out.println(obj1+"\n- obj1\n"+obj2+"\n- obj2\n--------------");
        // obj2 = obj1; // In this line, we're passing the adress of the variable to another variable. So we're not duplicating the instance as intended
        obj2.copy(obj1); // here we created a copy method to duplicate the variable the instance way
        System.out.println("- obj1\n"+obj1+"\n- obj2\n"+obj2+"\n- obj3\n"+obj3+"\n--------------");
    }
}
