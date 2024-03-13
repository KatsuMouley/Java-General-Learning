package constructors;

public class main{
    public static void main(String[] args){
        human humanbeing1 = new human("Jack", 19, 70, 1.7);
        human humanbeing2 = new human("Vitor", 23, 90, 2.1);
        human humanbeing3 = new human("Dextorks", 49, 120, 1.8);
        humanbeing1.IMC();
        humanbeing2.IMC();
        humanbeing3.IMC();
    }
}