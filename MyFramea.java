import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l1, l2, l3; // l3 is the label for displaying the result
    JTextField t1, t2;
    JButton b1, b2, b3, b4 ,b5 b6, b7 ;

    MyFrame() {
        l1 = new JLabel("Enter number 1: ");
        l2 = new JLabel("Enter number 2: ");
        l3 = new JLabel("Result: "); // Add missing semicolon
        t1 = new JTextField("");
        t2 = new JTextField("");
        b1 = new JButton("ok");
        b1.setBounds(50, 250, 70, 30);
        b2 = new JButton("Clear");
        b2.setBounds(150, 250, 70, 30);
        b3 = new JButton("Exit");
        b3.setBounds(250, 250, 70, 30);
        b4 = new JButton("Add");
        b4.setBounds(50,270,70, 30);
        b5 = new JButton("sub");
        b5.setBounds(150 ,270, 70,30);
        b6 = new JButton("mul");
        b6        
        
        setLayout(null);
        l1.setBounds(50, 120, 100, 30);
        l2.setBounds(50, 170, 100, 30);
        l3.setBounds(50, 300, 150, 30); // Adjusted size for the result label
        t1.setBounds(145, 120, 100, 30);
        t2.setBounds(145, 170, 100, 30);
        
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setTitle("Welcome");
        setSize(400, 500);
        setLocation(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) { 
        if (ae.getSource() == b3) {
            System.exit(0); // Exit the program
        } else if (ae.getSource() == b2) {
            t1.setText(""); // Clear text field
            t2.setText("");
            l3.setText("Result: "); // Clear result label
        } else if (ae.getSource() == b1) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = s1 + " " + s2; // Concatenate the text
            l3.setText("Result: " + s3); // Correct reference to l3
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}

