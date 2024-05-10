package Objects;
import java.util.Random;
public class DiceRoller {

    public Random random;
    public int number1;

    public DiceRoller(){
        this.random = new Random();
        Roll();
    }

    public void Roll(){
        this.number1 = random.nextInt(6)+1;
        System.out.println(number1);
    }
}
