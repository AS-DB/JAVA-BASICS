import java.awt.*;
import java.awt.event.*;

class Example1 implements ActionListener {
    TextField tf1;
    Button b1;

    Example1() {
        Frame f1 = new Frame();
        tf1 = new TextField();
        tf1.setBounds(50, 50, 200, 30); // Adjusted width for better visibility

        b1 = new Button("Show");
        b1.setBounds(50, 100, 70, 30); // Adjusted width and height

        b1.addActionListener(this);

        f1.add(tf1);
        f1.add(b1);

        f1.setTitle("Show message");
        f1.setSize(300, 200); // Adjusted the size for better visibility
        f1.setLayout(null);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf1.setText("GIETU");
    }

    public static void main(String s[]) {
        Example1 e1 = new Example1();
    }
}
