package files;
import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Hello " + name);
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "You're " + age + " years old");
    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm)"));
    JOptionPane.showMessageDialog(null, "You're " + height + " cm tall");
    }
}
