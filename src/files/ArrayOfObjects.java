package files;
import Objects.Food;
public class ArrayOfObjects {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        // int[] numbers = new int[3];
        // String[] words = new String[3];
        // boolean[] results = {true, false, true, false};

        Food[] foods = new Food[5];
        Food food1 = new Food("carrot");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("pizza");
        foods[0] = food1;
        foods[1] = food2;
        foods[2] = food3;        
        System.out.println(foods[0].name);
        System.out.println(foods[1].name);
        System.out.println(foods[2].name);
        System.out.println("--------------------------");
        Food[] foods2 = {food1, food2, food3};
        System.out.println(foods2[0].name);
        System.out.println(foods2[1].name);
        System.out.println(foods2[2].name);
        System.out.println("--------------------------");
    }
}
