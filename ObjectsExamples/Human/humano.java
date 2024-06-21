public class humano {
    public String name;
    public int age;
    public double weight;
    public double height;

    public humano(){}//Using overloaded functions we can build a constructor that doesn't need to receive params

    public humano(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }// this is the constructor

}