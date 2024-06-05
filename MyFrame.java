import javax.swing.JFrame;

public class MyFrame{
    public static void main(String [] args)
    {
        JFrame frame=new JFrame("My Frame");
        frame.setSize ( 300 ,300);
        frame.setLocation(200,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
