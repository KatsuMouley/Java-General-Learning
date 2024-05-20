package files;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner input = new Scanner(System.in);
        String[][] words = new String[3][3];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.println("You're in the line "+ (i+1) +" in the collumn "+ (j+1));
                words[i][j] = input.nextLine();
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println();
            for (int j = 0; j < words[i].length; j++) {
                System.out.printf(" ' "+words[i][j]+" ' ");
            }
        }
        input.close();
    }
    
}
