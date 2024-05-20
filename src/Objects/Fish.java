package Objects;
import Objects.interfaces.*;
//Fish can eat smaller fish and can be eated by bigger fish
public class Fish implements Prey,Predator {
    
    @Override
    public void flee(){
        System.out.println("The fish drawed away... he swimed away? IDK");
    }
    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }
}
