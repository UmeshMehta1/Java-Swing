package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonumosInnerClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);

        frame.setVisible(true);

        JButton btn = new JButton("Click Me");
        btn.setBounds(100, 100, 100, 50);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.RED);
            }
        });


    }
}