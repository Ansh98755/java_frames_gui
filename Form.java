import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form extends JFrame implements ActionListener {
    private JTextField jt1;
    private JPasswordField jp1;
    private JButton bt1;
    private JButton bt2;
    private JLabel result;

    public Form() {
        setTitle("Details");
        setSize(400, 300);
        setLocation(200, 100);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JLabel l1 = new JLabel("UserName:");
        l1.setBounds(50, 50, 100, 30);
        l1.setForeground(Color.red);
        add(l1);

        jt1 = new JTextField();
        jt1.setBounds(150, 50, 150, 30);
        add(jt1);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);
        l2.setForeground(Color.blue);
        add(l2);

        jp1 = new JPasswordField();
        jp1.setBounds(150, 100, 150, 30);
        add(jp1);

        result = new JLabel("");
        result.setBounds(150, 150, 200, 30);
        result.setForeground(Color.black);
        add(result);

        // Create login and reset buttons
        bt1 = new JButton("Login");
        bt1.setBounds(50, 200, 100, 30);
        add(bt1);

        bt2 = new JButton("Reset");
        bt2.setBounds(200, 200, 100, 30);
        add(bt2);

        // Add action listeners
        bt1.addActionListener(this);
        bt2.addActionListener(this);
    }

    public static void main(String[] args) {
        new Form();
    }

    // Handler
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            String Username = jt1.getText();
            String Password = new String(jp1.getPassword());
            if (Username.equals("Ayush") && Password.equals("Ayush@9987")) {
                result.setText("Login Successful");
            } else {
                result.setText("Login Failed!!!");
            }
        } else if (e.getSource() == bt2) {
            jt1.setText("");
            jp1.setText("");
            result.setText(""); // Clear the result label
            System.out.println("Reset button clicked");
        }
    }
}
