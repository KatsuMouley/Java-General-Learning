import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[] vetores = new int[] { 1, 2, 3, 4, 5 };
        int[] vetores2 = new int[5];
        // int[] vetores = new int[4];
        //vetores[1] = 1;
        //vetores[2] = 2;
        //vetores[3] = 3;
        //vetores[4] = 4;

        for (int i = 0; i < vetores.length; i++) {
            System.out.println("---------------\n" + "'"+ vetores[i] + "'" + " vetor da variavel vetores["+ (i+1) +"]");
            vetores2[i] = Input.nextInt();
            System.out.println("'"+ vetores2[i] + "'" + " vetor da variavel vetores2["+ (i+1) +"]");
        }
    }
}
