package files;

import Objects.DiceRoller;

public class RollDice {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        //local =  declared inside a method
        //   visible only to that method

        //global  = declared outside a method, but within a class
        //   visible to all parts of a class
        DiceRoller diceRoller = new DiceRoller();
        System.out.println("---------------\n"+diceRoller.number1);
    }
}
