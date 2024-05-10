package files;
public class MethodsExercising1 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        
        int x = 3;
        int y = 7;
        System.out.println(soma(x, y));
    }

    static int soma(int x, int y){
        int z = x+y;
        return z;
    }
    
}
