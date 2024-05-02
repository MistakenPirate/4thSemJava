package Swing;

import javax.swing.*;
import java.awt.*;

public class AnonCalc {
    public static void main(String[] args) {
        Anon obj = new Anon();
    }
}

class Anon extends JFrame {
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JLabel l;
    public Anon(){
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);

        b1.addActionListener(e->{
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int res = x + y;
            l.setText(res+"");
        });

        b2.addActionListener(e->{
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int res = x - y;
            l.setText(res+"");
        });

        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
