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
    }
}
