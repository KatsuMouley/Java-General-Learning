package files;
import java.util.ArrayList;
public class ForEach {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        String[] animals = {"bird", "dog", "cat"};
        for(String i : animals){
            System.out.println(i);
        }
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        for(String i : bakeryList){
            System.out.println(i);
        }

    }
}
