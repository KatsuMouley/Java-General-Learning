public class methods {
    public static void main(String[] args) {
        String name = "Katsu";
        int age = 19;
        method(name, age);
    }

    static void method(String name, int age){
        System.out.println("Hello "+name);
        System.out.println("You're "+age+" years old");
    }
}