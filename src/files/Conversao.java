package files;
public class Conversao {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        // Contas matemáticas em java não tem tanta diferença do básico. / % - + continuam sendo utilizados normalmente.
        double Decimals = 15.6;
        int Ints = 10;
        Decimals = (double) Ints / 3;// Converção de valores
        String linha = "look at this " + Decimals + " number.";
        System.out.println(linha); 
        //Oh no our double number output is too long! how can we solve this?
        //How about this?
        String FormatedNumber = String.format( "%.2f", Decimals);
        System.out.println("No! Instead look at this " + FormatedNumber +" number"); 
    }
}
