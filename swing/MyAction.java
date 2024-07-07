package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{
   Container c;
   JButton btn;

   MyFrame(){
       c=this.getContentPane();
       c.setLayout(null);

       btn= new JButton("Click Me");
       btn.setBounds(100, 100, 100, 50);
       c.add(btn);
       btn.addActionListener(this);
   }

    public void actionPerformed(ActionEvent e) {
         c.setBackground(Color.GRAY);
    }
}

class MyAction{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);

        frame.setVisible(true);
    }
}
