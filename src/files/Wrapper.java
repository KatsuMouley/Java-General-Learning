package files;
public class Wrapper {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        // wrapper classes = provides a way to use primitive data types as reference
        // data types
        // reference data types contain useful methods
        // can be used with collections (ex.ArrayList)

        // primitive //wrapper
        // boolean Boolean
        // char Character
        // int Integer
        // double Double
        // autoboxing = the automatic conversion that Java compiler makes between the primitive types and their corresponding object wrapper class
        // unboxing = the reverse of autobxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;//Autoboxing example
        Character b = '$';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        //primitive > faster than > wrapper
        //Wrappers > more methods than > primitives
        //unboxing example
        if (a==true) {
            System.out.println("This is true");
        }
        String num1 = "15.5";
        Double num2 = Double.parseDouble(num1);
        System.out.println(num2);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

}