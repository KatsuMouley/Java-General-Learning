package files;
public class Flags {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
    //  printf = an optional method to control, format, and display text to the console window
    //           two arguments = format string + (object/variable/value)
    //  % [flags] [precision] [width] [conversion-character]

    System.out.printf("This is a format string %d\n",123);
    System.out.printf("This is a %d format string\n", 612);
    
    boolean myBoolean = true;
    char myChar = '@';
    String myString = "Hello world!";
    int myInt = 100;
    double myDouble = 64.6020;
        // conversion-characters
    System.out.printf("%b\n",myBoolean);
    System.out.printf("%c\n",myChar);
    System.out.printf("%s\n",myString);
    System.out.printf("%d\n",myInt);
    System.out.printf("%f\n",myDouble);
        //width field
        //It sets the minimum number of characters to be written as output
    System.out.printf("Hello %10s\n", myString);
        //Precision
        //sets number of digits of precision when outputting floating-point values
    System.out.printf("You have this amount of money: %.2f\n", myDouble);
        //flags
        //  adds an effect to output based on the flag added to format specifier
        //  - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if number > 1000
        System.out.printf("You have this much money %-20f\n", myDouble);
        int negNumber = -10000;
        int posNumber = 10000;
        long bigNumber = 10000000000000L;
        System.out.printf("We have two values: %+d and %+d\n", negNumber, posNumber);     
        System.out.printf("and we have this %05d\n", posNumber);
        System.out.printf("and also that %,d\n", bigNumber);
    }
    
}
