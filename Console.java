import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        // var a = 10;
        // System.out.println("Text plus " + a);
        // Scanner inputVar = new Scanner(System.in);
        // System.out.println("Digite seu nome...");
        // String name = inputVar.nextLine();
        // System.out.println("ola " + name);
        // boolean exe = true;
        // int contador = 0;
        // String[] letras = new String[] { "A", "B", "C" };
        // System.out.println("1 Position = " + letras[0]);
        // for (int i = 0; i < letras.length /* the length of the var letras is 3 */;
        // i++) {
        // System.out.println("Letra: " + letras[i]);
        // }
        // int Inteiro = 34;
        // double Decimal = 15.15;
        // boolean ValorVerdadeiro = true;
        // for (int i = 0; i < 6; i++) {
        //     for (int j = 0; j < 10; j++) {
        //         System.err.printf("[]");
        //     }
        //     System.err.printf("\n");
        // }
        // Github/GitLab/Bitbucket são servidores de hospedagem de código. Utilizando o sistema de versionamento de git.        /* ------------------ Exercises ------------------ */
        /*#1*/
        System.out.println("**----------------------------------------**");
        /*Initialize the Scanner method*/
        Scanner Input = new Scanner(System.in);
        System.out.println("Please input the height: ");
        Double height = Input.nextDouble();
        System.out.println("Please input the width: ");
        Double width = Input.nextDouble();
        Double result = width * height;
        System.out.println("The area that of the square is: " + result);
        System.out.println("**----------------------------------------**");
        /*#2*/
        System.out.println("Please input value to convert (R$):");
        double real = Input.nextFloat();
        System.out.println("Dolar: " + String.format("%.2f", (real / 5.17)));
        System.out.println("Euro: " + String.format("%.2f", (real / 6.14)));
        System.out.println("Peso Argentino: " + String.format("%.2f", (real / 0.05)));
        // 1. Dólar (1 dólar = 5,17 reais)
        // 2. Euro (1 euro = 6,14 reais)
        // 3. Peso argentino (1 peso argentino = 0,05 reais)
        System.out.println("**----------------------------------------**");
        /*#3*/

        System.out.println("**----------------------------------------**");
        /*#4*/

        System.out.println("**----------------------------------------**");
    }
}
