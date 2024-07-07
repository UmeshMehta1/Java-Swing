package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action4 {
    public static Container c;
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        c = frame.getContentPane();

        c.setLayout(null);

        frame.setVisible(true);


        JButton red = new JButton("Red");
        JButton yellow = new JButton("YELLOW");
        JButton blue = new JButton("BLUE");

        red.setBounds(100, 100, 100, 50);
        yellow.setBounds(250, 100, 100, 50);
        blue.setBounds(400, 100, 100, 50);

        c.add(red);
        c.add(yellow);
        c.add(blue);

        red.addActionListener(new RedClass());
        yellow.addActionListener(new YellowClass());
        blue.addActionListener(new BlueClass());


    }
}

class RedClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Action4.c.setBackground(Color.RED);
    }
}

class YellowClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Action4.c.setBackground(Color.YELLOW);
    }
}


class BlueClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Action4.c.setBackground(Color.BLUE);
    }
}