import java.util.ArrayList;
public class forEach {
    public static void main(String[] args) {
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
