package Objects;

public class Bake {
    public String bread, sauce, cheese, toping;
    public Bake(){}
    
    public Bake(String bread){
        this.bread = bread;
    }
    
    public Bake(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }
    
    public Bake(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    
    public Bake(String bread, String sauce, String cheese, String toping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toping = toping;
    }
}
