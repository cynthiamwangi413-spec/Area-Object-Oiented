
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name= JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"I am" + age + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"I am" + height + "cm tall");

        String gender = JOptionPane.showInputDialog("Enter your gender");
        JOptionPane.showMessageDialog(null,"I am a" + gender);

    }
}