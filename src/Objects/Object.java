package Objects;

public class Object {
    public String name = "John", health = "great", favFood = "hamburger"; 
    public int age = 57, money = 1043;
    
    public Object(){}
    
    @Override
    public String toString()
    {
        // String myString = name+'\n'+health+'\n'+favFood+'\n'+age+'\n'+money+'\n';
        return name+'\n'+health+'\n'+favFood+'\n'+age+'\n'+money+'\n';
    }

}

