package files;
import java.util.Scanner;
public class ScannerMethod {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Scanner input = new Scanner(System.in);
        System.out.printf("How old are you: ");
        int age = input.nextInt(); //18\n 
        //Scanner lê 18. Porém o \n ainda se mantem dentro do Scanner. sendo assim se utilizarmos um nextline da próxima vez. O Scanner já será terminado, Uma das formas de resolver este problema é utilizando nextline para limpar o Scanner
        input.nextLine();//Limpa o Scanner e libera espaço
        //para testar o bug do qual estou me referindo basta apenas comentar a linha de código acima.
        System.out.printf("Agora digite seu nome: ");
        String name = input.nextLine();
        System.out.println("Seu nome é " + name + "\nSua idade é " + age);
        input.close();
    }
}
