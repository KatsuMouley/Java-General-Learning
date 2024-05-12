package Objects;
import Objects.interfaces.*;
public class Rabbit implements Prey {
    @Override
    public void flee(){
        System.out.println("The rabbit ran away");
    }
}
