package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends JFrame implements ActionListener{
    Container c;
    JButton btn=new JButton("RED");
    JButton btn2=new JButton("YELLOW");
    JButton btn3=new JButton("GREEN");

    MyFrame2(){
        c=this.getContentPane();
        c.setLayout(null);


        btn.setBounds(100, 100, 100, 50);
        btn2.setBounds(250, 100, 100, 50);
        btn3.setBounds(400, 100, 100, 50);


        c.add(btn);
        c.add(btn2);
        c.add(btn3);


        btn.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            c.setBackground(Color.RED);
        } else if (e.getSource()==btn2) {
            c.setBackground(Color.YELLOW);
        }else{
            c.setBackground(Color.GREEN);
        }
    }
}


public class MultipleButtonHandel {
    public static void main(String[] args) {
        MyFrame2 frame = new MyFrame2();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);

        frame.setVisible(true);
    }


}
