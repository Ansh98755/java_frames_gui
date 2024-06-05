package java_frames_gui;
// package java_frames_gui;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color; 
public class MyFrame1 extends JFrame{
    public MyFrame1()
    {
        setTitle("My Frame 1 ");
        setLocation(200,100);
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        JPanel My_Panel= new JPanel();
        My_Panel.setBackground(Color.red);
        // add(My_Panel,BorderLayout.EAST) it will add my panel according to the border layout since we have set the layout as null hence we can now set the panel according to coustom layout 
        My_Panel.setBounds(50,50,50,50);
        add(My_Panel);



        JPanel My_Panel2= new JPanel();
        My_Panel2.setBackground(Color.blue);
        // add(My_Pane2,BorderLayout.WEST);
        My_Panel2.setBounds(110,50,50,50);
        add(My_Panel2);



        JPanel My_Panel3= new JPanel();
        My_Panel3.setBackground(Color.green);
        // add(My_Panel3,BorderLayout.NORTH);
        My_Panel3.setBounds(160,50,50,50);
        add(My_Panel3);


        JPanel My_Panel4= new JPanel();
        My_Panel4.setBackground(Color.pink);
        // add(My_Panel4,BorderLayout.SOUTH);
        My_Panel4.setBounds(210,50,50,50);
        add(My_Panel4);



        JPanel My_Panel5= new JPanel();
        My_Panel5.setBackground(Color.black);
        // add(My_Panel5,BorderLayout.CENTER);
        My_Panel5.setBounds(270,50,50,50);
        add(My_Panel5);


    }
    public static void main(String[] args) {
        new MyFrame1();
        
    }
    
}
