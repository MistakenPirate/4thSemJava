package Swing;
import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        Abc obj = new Abc();

    }
}

class Abc extends JFrame{ //by default card layout
    public Abc(){
        JLabel l= new JLabel("Hello World");
        JLabel l1= new JLabel("Welcome Sameer");
        add(l);
        add(l1);


        setLayout(new FlowLayout());//sets layout to flow layout
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//makes sure that the code stops running when X button is clicked
    }
}