package swing;

import javax.swing.*;
import java.awt.*;

public class TextField {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,100, 500,500);

        Container c = frame.getContentPane();

        c.setLayout(null);

        JTextField t1=new JTextField();
        t1.setBounds(100,50, 130, 30);
        c.add(t1);

        t1.setText("Umesh Mehta");

        Font font = new Font("Arial", Font.BOLD, 25);
        t1.setFont(font);

        t1.setForeground(Color.GREEN);

//        t1.setEnabled(false);

        frame.setVisible(true);
    }
}
