package files;

import Objects.Object;

public class ToStringMethod {
    // toString() = special method that all objects inherit, 
    //    that returns a string that "textually represents" an object.
    //    can be used both implicitly and explicitly

    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Object pessoa = new Object();

        //This is a way to display the values of Object.class
        System.out.println(pessoa.name);
        System.out.println(pessoa.favFood);
        System.out.println(pessoa.age);
        System.out.println(pessoa.health);
        System.out.println(pessoa.money);
        System.out.println("\n-----------------------------\n");
        System.out.println(pessoa);
        System.out.println(pessoa.toString());
    }
}
