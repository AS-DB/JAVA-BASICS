import javax.swing.*;

class GUI {
public static void main(String[] args) {
    String name=JOptionPane.showInputDialog("HEllo please enter your name");
    JOptionPane.showMessageDialog(null, "Your name is\t"+ name);

    int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "YOur age is"+age);
}}
    
