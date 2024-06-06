package java_frames_gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
public class MyFrame2 extends JFrame implements ActionListener{
    private JTextField jt1;
    private JTextField jt2;
    private JButton jb1;
    private JLabel jl1;

    public MyFrame2()
    {
        setTitle("CONCATENATE_STRINGS");
        setSize(400,300);
        setLocation(200,100);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JLabel lb1=new JLabel("String 1:");
        lb1.setBounds(50,50,50,50);
        lb1.setForeground(Color.red);
        add(lb1);


        jt1=new JTextField();
        jt1.setBounds(150,50,150,50);
        add(jt1);

        JLabel lb2=new JLabel("String 2:");
        lb2.setBounds(50,100,50,50);
        add(lb2);


        jt2=new JTextField();
        jt2.setBounds(150,100,150,50);
        add(jt2);


        jl1=new JLabel("result");
        jl1.setBounds(150,150,150,50);
        add(jl1);


        jb1=new JButton("CONCATENATE");
        jb1.setBounds(150,190,150,50);
        add(jb1);

        // add action listner
        jb1.addActionListener(this);




    }
    public static void main(String[] args)
    {
        new MyFrame2();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb1)
        {
            jl1.setText("AyushMehendiratta");
        }
    }
}
