import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
public class Create_panel_labels extends JFrame {
    public Create_panel_labels()
    {
        setTitle("My Frame");
        setSize(800,500);
        setLocation(300,100);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        // creating a panel
        JPanel panel= new JPanel();
        panel.setBounds(50,50,400,300);
        panel.setLayout(null);
        panel.setBackground(Color.yellow);
        add(panel);



        // creating labels inside this panel
        JLabel l1= new JLabel("Name:");
        l1.setBounds(50,50,100,50);
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Arial" , Font.BOLD , 20 ));
        panel.add(l1);


        JLabel l3= new JLabel("Address");
        l3.setBounds(50,150,100,50);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Arial" , Font.BOLD , 20 ));
        panel.add(l3);

        JLabel l2= new JLabel("Roll-No:");
        l2.setBounds(50,100,100,50);
        l2.setForeground(Color.blue);
        l2.setFont(new Font("Arial" , Font.BOLD , 20 ));
        panel.add(l2);
        
    }

    public static void main(String [] args)
    {
        new Create_panel_labels();
    }
}
