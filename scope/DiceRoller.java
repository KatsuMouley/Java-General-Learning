package scope;
import java.util.Random;
public class DiceRoller {

    Random random1;
    int number1;

    DiceRoller(){
        random1 = new Random();
        roll();
    }

    void Roll(){
        number1 = random(6)+1;
        System.out.println(number1);
    }
}
