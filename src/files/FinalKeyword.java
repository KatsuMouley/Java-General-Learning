package files;
public class FinalKeyword {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        final double VALUE = 3.15124;
        //VALUE = 1;
        //any variable that has a final keyword in the declaration can't be changed
        System.out.println(VALUE);

    }
}
