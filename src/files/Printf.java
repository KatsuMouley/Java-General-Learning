package files;
public class Printf{
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Hello world!";
        int myInt = 10;
        double myDouble = 64;

        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);
    }
}