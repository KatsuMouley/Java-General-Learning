package files;
import java.util.Scanner;
public class MathMethod {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Scanner input = new Scanner(System.in);
        double x = 15.52;
        double y = 7.23;

        double z = Math.max(x, y);
        System.out.println(z); 
        z = Math.min(x, y);
        System.out.println(z); 
        y = -15;
        z = Math.abs(y);
        System.out.println(z); 
        z = Math.sqrt(9);
        System.out.println(z);
        z = Math.round(x);
        System.out.println(z); 
        z = Math.floor(x);
        System.out.println(z); 
        z = Math.ceil(x);
        System.out.println(z); 
        System.out.printf("Please Insert the X of the triagle: "); 
        x = input.nextDouble();
        System.out.printf("Please Insert the Y of the triagle: "); 
        y = input.nextDouble();
        z = Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
        System.out.printf("This is the Hypotenuse: " + z);
        input.nextLine();
        input.close();
    }    
}
