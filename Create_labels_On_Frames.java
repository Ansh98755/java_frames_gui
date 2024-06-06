package java_frames_gui;
import javax.swing.JFrame;
// import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;


public class Create_labels_On_Frames extends JFrame{
    public Create_labels_On_Frames()
    {
        setTitle("My Frame");
        setSize(200,200);
        setLocation(300,100);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JLabel l1 = new JLabel("First Name");
        add(l1,BorderLayout.EAST);
        l1.setBounds(50,50,50,50);

        JLabel l2=new JLabel("Last Name");
        add(l2,BorderLayout.SOUTH);
        l2.setBounds(50,110,50,50);
    }

    public static void main(String args[])
    {
        new Create_labels_On_Frames();
    }
    
}
