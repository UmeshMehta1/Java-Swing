package swing;

import javax.swing.*;
import java.awt.*;

public class PasswordField {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,100, 500,500);

        Container c = frame.getContentPane();

        c.setLayout(null);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(10, 40, 200, 40);
        c.add(pass);

        pass.setText("223443343");
        pass.setFont(new Font("Arial",Font.PLAIN,30 ));

        pass.setEchoChar('*');
//        pass.setEchoChar((char)0); //Show password
        frame.setVisible(true);
    }
}
