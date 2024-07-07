package swing;

import javax.swing.*;
import java.awt.*;

public class MyButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);



        ImageIcon icon = new ImageIcon("D:\\BCA III\\java_swing2\\swing\\img_1.png");

//        JButton btn= new JButton("Click Me");
        JButton btn= new JButton(icon);
        btn.setSize(icon.getIconWidth(),icon.getIconHeight());
        c.add(btn);

//        Font font= new Font("Arial",Font.PLAIN,20);
//        btn.setFont(font);
//
//        btn.setText("My Button");

        

        frame.setVisible(true);
    }
}
