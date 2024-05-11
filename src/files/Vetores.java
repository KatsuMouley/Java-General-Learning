package files;
import java.util.ArrayList;
import java.util.Scanner;
public class Vetores {
    
    public static void main(String[] args) {
        run();
    }
    public static void run() {
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

        //  ArrayList = a resizable array. Standard arrays cant be resizable. 
        //              Elements can be added and removed after compilation phase
        //              store reference data types, wrapper classes
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        System.err.println("-----------------------\n-----------------------\n-----------------------\n");
        //food.size() method get for us the length of the ArrayList
        //food.get(position) method get us the array in the specified position
        //food.set(position, element) method is used to set a specific array in a specific position
        //food.remove(position) method is used to remove a specific array in a specific position
        //food.clear() method is used to clear the ArrayList
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.err.println("-----------------------\n-----------------------\n-----------------------\n");
        ArrayList<ArrayList<String>> ToBuyList = new ArrayList<ArrayList<String>>();
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        System.out.println(bakeryList);
        System.out.println(bakeryList.get(1));
        System.out.println("-----------------------\n-----------------------\n-----------------------\n");
        ArrayList<String> moviesToWatch = new ArrayList<String>();
        moviesToWatch.add("Avengers");
        moviesToWatch.add("Avatar");
        moviesToWatch.add("Five Nights at Freddys");
        System.out.println(moviesToWatch);
        System.out.println(moviesToWatch.get(2));
        System.out.println("-----------------------\n-----------------------\n-----------------------\n");
        ArrayList<String> toDoList = new ArrayList<String>();
        toDoList.add("Math task");
        toDoList.add("Study section");
        System.out.println(toDoList);
        System.out.println(toDoList.get(0));
        System.out.println("-----------------------\n-----------------------\n-----------------------\n");
        //2D array list
        ToBuyList.add(moviesToWatch);
        ToBuyList.add(toDoList);
        ToBuyList.add(bakeryList);
        System.out.println(ToBuyList);
        System.out.println(ToBuyList.get(1));
        System.out.println(ToBuyList.get(1).get(0));
        System.out.println("-----------------------\n-----------------------\n-----------------------\n");
        Input.close();
        //Can we add normal arrays to ArrayList?
        //No, we can't add arrays inside an ArrayList. But we can use the "for()" method to add all the elements the array inside the ArrayList
        //Ou seja, ArrayList e Array normais são dois tipos de dados diferentes
        ArrayList<String> Id = new ArrayList<String>();
        String[] ids = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for(int i =0; i< ids.length; i++){
            Id.add(ids[i]);
        }
        System.out.println(Id);
        System.out.println("-----------------------\n-----------------------\n-----------------------\n");

    }
}
