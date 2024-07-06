package swing;
import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(100, 111);
//        frame.setLocation(100, 159);
        frame.setBounds(500,100, 500,500);
        frame.setTitle("Main Frame");

        ImageIcon icon = new ImageIcon("img.png");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        c.setBackground(Color.GRAY);

        frame.setResizable(false);
    }

}
