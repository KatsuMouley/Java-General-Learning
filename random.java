import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random rand = new Random();

        int x = rand.nextInt(6)+1;// random number between 1 and 6
        System.out.println(x); 
        x = rand.nextInt(10); // Random number between 0 and 10
        System.out.println(x); 
        double y = rand.nextDouble(5); // Random number between 5 and 0
        System.out.println(y); 
        
    }
}
