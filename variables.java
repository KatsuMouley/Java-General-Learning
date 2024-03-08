public class variables {
    public static void main(String[] args){
        int Inteiros = 15;// 32 bits
        System.out.println(Inteiros);
        long Longos = 15;//64 bits
        System.out.println(Longos);
        float Floats = 1.6f;// 32 bits
        System.out.println(Floats);
        Double Doubles = 15.7;// 64 bits
        System.out.println(Doubles);
        boolean verdadeiro = true;//8 bits
        System.out.println(verdadeiro);
        byte bytes = 1;//8 bits
        System.out.println(bytes);
        char chars = 'A';//16 bits
        System.out.println(chars);
        char[] strings1 = new char[] {'A', 'B', 'C'}; // Each char have 16 bits. Which means that an phrase with 32 letters would have 512 bits
        for (int i = 0; i < strings1.length; i ++) {
            System.out.println(strings1[i]);
        }
        String strings2 = "Hello world how you're doing?";
        System.out.println(strings2);
    }
}
