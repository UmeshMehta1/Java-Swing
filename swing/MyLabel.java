package swing;

import javax.swing.*;
import java.awt.*;

public class MyLabel {

        public static void main(String[] args) {
            JFrame frame= new JFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(100, 111);
//        frame.setLocation(100, 159);
            frame.setBounds(500,100, 500,500);
//            frame.setTitle("Label");
            Container c = frame.getContentPane();

            c.setLayout(null);

            //For Label
//            JLabel label= new JLabel("Username");
//            label.setBounds(100,100, 700,100);
//
//            Font font = new Font("Arial", Font.ITALIC,30);
//            label.setFont(font);
//
//            c.add(label);


// For image.
            ImageIcon icon=new ImageIcon("D:\\BCA III\\java_swing2\\swing\\img_1.png");
            JLabel label= new JLabel("Umesh", icon,JLabel.CENTER);
            label.setBounds(30, 50, icon.getIconWidth(), icon.getIconHeight());
            c.add(label);

            frame.setVisible(true);

    }

}
