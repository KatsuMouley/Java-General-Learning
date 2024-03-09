import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[] vetores = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < vetores.length; i++) {
            System.out.println("---------------\n" + vetores[i]);
            System.out.println(i + "\n ----------");
        }
    }
}
