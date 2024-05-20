package files;

import Objects.Bake;

public class OverloadedCons {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Bake pizzariaBakingType1 = new Bake();
        Bake pizzariaBakingType2 = new Bake("massa");
        Bake pizzariaBakingType3 = new Bake("massa", "molho");
        Bake pizzariaBakingType4 = new Bake("massa", "molho", "queijo");
        Bake pizzariaBakingType5 = new Bake("massa", "molho", "queijo", "recheio");
        System.out.println(pizzariaBakingType1.bread+'\n');
        System.out.println(pizzariaBakingType2.bread+'\n');
        System.out.println(pizzariaBakingType3.sauce+'\n');
        System.out.println(pizzariaBakingType4.cheese+'\n');
        System.out.println(pizzariaBakingType5.toping+'\n');
    }
}
