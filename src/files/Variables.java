package files;
public class Variables {
    
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        //primitives
        int Inteiros = 15;// 32 bits
        System.out.println(Inteiros);
        long Longos = 15268028235L;//64 bits
        System.out.println(Longos);
        float Floats = 1.6f;// 32 bits
        System.out.println(Floats);
        Double Doubles = 15.7;// 64 bits
        System.out.println(Doubles);
        boolean verdadeiro = true;//8 bits
        System.out.println(verdadeiro);
        byte bytes = 1;//8 bits
        System.out.println(bytes);
        char chars = '!';//16 bits
        System.out.println(chars);
        char[] strings1 = new char[] {'@', '$', '#'}; // Each char have 16 bits. Which means that an phrase with 32 letters would have 512 bits
        for (int i = 0; i < strings1.length; i ++) {
            System.out.println(strings1[i]);
        }
        //referenced, referenced data types always start with a CAPITAL LETTER
        String strings2 = "Hello world how you're doing?";
        System.out.println(strings2);
        System.out.println("----------------------------------------\n----------------------------------------\n----------------------------------------\n");


        //SWITCHING VARIABLES
        int x = 1;
        int y = 2;
        int temp = 0;
        System.out.println("X = " + x);
        System.out.println("y = " + y);
        System.out.println("temp = " + temp);
        System.out.println("----------------------------------------\n----------------------------------------\n----------------------------------------\n");
        temp = x;//1
        System.out.println("X = " + x);
        System.out.println("y = " + y);
        System.out.println("temp = " + temp);
        System.out.println("----------------------------------------\n----------------------------------------\n----------------------------------------\n");
        x=y;//2
        System.out.println("X = " + x);
        System.out.println("y = " + y);
        System.out.println("temp = " + temp);
        System.out.println("----------------------------------------\n----------------------------------------\n----------------------------------------\n");
        y=temp;//3
        System.out.println("X = " + x);
        System.out.println("y = " + y);
        System.out.println("temp = " + temp);
        System.out.println("----------------------------------------\n----------------------------------------\n----------------------------------------\n");
    }
}
