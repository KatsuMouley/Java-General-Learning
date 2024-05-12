package files.package1;

import files.package2.C;

public class A {
    protected String protrectedMessage = "This is a protrected message";
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        C c = new C();
        // System.out.println(c.defaultMessage);
        //default: visible to all classes in the same package 

        System.out.println(c.publicMessage);
        // public: visible in all classes in all packages
        B b = new B();
        System.out.println(b.getPrivateMessage());
        // private: visible only in the same class, we can use getters to get the private variables

    }
}
