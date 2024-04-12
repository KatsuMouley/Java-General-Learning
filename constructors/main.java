public class Main{
    public static void main(String[] args){
        Human humanbeing1 = new Human("Jack", 19, 70, 1.7);
        Human humanbeing2 = new Human("Vitor", 23, 100, 1.9);
        Human humanbeing3 = new Human("Dextorks", 49, 100, 1.8);
        humanbeing1.IMC();
        humanbeing2.IMC();
        humanbeing3.IMC();
    }
}