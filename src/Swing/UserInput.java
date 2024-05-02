package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class UserInput {
    public static void main(String[] args) {
        RadioDemo obj = new RadioDemo();
    }
}

class RadioDemo extends JFrame{
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;

    JCheckBox c1,c2;



    public RadioDemo(){
        t1 = new JTextField(15);
        b = new JButton("OK");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l = new JLabel("Greetings");
        c1 = new JCheckBox("Dancer");
        c2 = new JCheckBox("Singer");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(b);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(l);

//        c1.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent e) {
//                System.out.println("c1");
//            }
//        });

        c1.addItemListener(e->{
            System.out.println("c1");
        });

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();

                if(r1.isSelected()){
                    name = "Mr. " + name;
                }
                if(r2.isSelected()){
                    name = "Ms. " + name;
                }
                if(c1.isSelected()){
                    name = name + " Dancer";
                }
                if(c2.isSelected()){
                    name = name + " Singer";
                }
                l.setText(name);
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
