package constructors;

public class human {
    String name;
    int age;
    double weight;
    double height;

    human(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }// this is the constructor

    void IMC() {
        double IdealWeight = this.weight / Math.pow(this.height, 2);
        if (IdealWeight <= 18.5) {
           System.out.println(this.name +" esta abaixo do peso"); 
        } else if(18.6 <= IdealWeight & IdealWeight <= 24.9){
            System.out.println(this.name +" esta no eso Ideal");
        }else if(25 <= IdealWeight & IdealWeight <= 29.9){
            System.out.println(this.name +" esta acima do peso");
        }else if(30 <= IdealWeight & IdealWeight <= 34.9){
            System.out.println(this.name +" possui obesidade de grau I");
        }else if(35 <= IdealWeight & IdealWeight <= 39.9){
            System.out.println(this.name +" possui obesidade de grau II(Severa)");
        }else if(40 <= IdealWeight){
            System.out.println(this.name +" possui obesidade de grau III(Mórbida)");
        }
    }

}