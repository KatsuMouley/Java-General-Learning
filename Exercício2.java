import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Exercício2 {
    public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null, "Welcome to the program, please insert enter to continue");

        
    }    

    public static void exibirMenuInicial(){
        String[] matriculas = new String[5];
        String[] nomes = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];

        String[][] dadosAlunos = new String[4][5];
        //Structs ou classes/Objetos
        Aluno a1 = new Aluno();
        a1.matricula = "A";
        a1.nome = "nome";
        a1.nota1 = 5;
        a1.nota2 = 9;
        
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

    }
}

