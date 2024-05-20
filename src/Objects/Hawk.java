package Objects;
import Objects.interfaces.*;
public class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("The hawk got its prey");
    }
    
}
