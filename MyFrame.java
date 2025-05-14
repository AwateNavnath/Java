/*import javax.swing.*;
class MyFrame extends JFrame{ 
 JLabel l1;
 
   MyFrame()
     {
        l1 = new JLabel("Navan");        
        setTitle("Welcome");
        setSize(400,500);
        setLocation(500,300);
        add(l1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
      }
public static void main(String []args)
{
   new MyFrame();
}
}
*/
/*
import javax.swing.*;
class MyFrame extends JFrame{ 
 JLabel l1;
 JLabel l2;
 JTextField t1;
 JTextField t2;
 JButton b1,b2,b3;
   MyFrame()
     {
        l1 = new JLabel("My Name is : ");
        l2 = new JLabel("My surname is : ");
        t1 = new JTextField("");
        t2 = new JTextField("");
        b1 = new JButton("Add");
        b1.setBounds(50,250,70,30);
        b2 = new JButton("Clear");
        b2.setBounds(150,250,70,30);
        b3 = new JButton("Exist");
        b3.setBounds(250,250,70,30);
         setLayout(null);
        l1.setBounds(50,120,100,30);
        l2.setBounds(50,170,100,30);
        t1.setBounds(130,120,100,30);
        t2.setBounds(150,170,100,30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l1 = new JLabel("Navan");        
        setTitle("Welcome");
        setSize(400,500);
        setLocation(600,300);
        add(l1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
      }
public static void main(String []args)
{
   new MyFrame();
}
}

import javax.swing.*;
class MyFrame extends JFrame{ 
 JLabel l1;
 JLabel l2;
 JTextField t1;
 JTextField t2;
 JButton b1,b2,b3;
   MyFrame()
     {
        l1 = new JLabel(" Ente number 1 : ");
        l2 = new JLabel(" Enter number 2 : ");
        t1 = new JTextField("");
        t2 = new JTextField("");
        b1 = new JButton("Add");
        b1.setBounds(50,250,70,30);
        b2 = new JButton("Clear");
        b2.setBounds(150,250,70,30);
        b3 = new JButton("Exist");
        b3.setBounds(250,250,70,30);
         setLayout(null);
        l1.setBounds(50,120,100,30);
        l2.setBounds(50,170,100,30);
        t1.setBounds(145,120,100,30);
        t2.setBounds(150,170,100,30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l1 = new JLabel("Navan");        
        setTitle("Welcome");
        setSize(400,500);
        setLocation(600,300);
        add(l1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
      }
public static void main(String []args)
{
   new MyFrame();
}
}
*/
/*

import javax.swing.*;
class MyFrame extends JFrame implements ActionListener { 
 JLabel l1;
 JLabel l2;
 JTextField t1;
 JTextField t2;
 JButton b1,b2,b3;
   MyFrame()
     {
        l1 = new JLabel(" Ente number 1 : ");
        l2 = new JLabel(" Enter number 2 : ");
        t1 = new JTextField("");
        t2 = new JTextField("");
        b1 = new JButton("Add");
        b1.setBounds(50,250,70,30);
        b2 = new JButton("Clear");
        b2.setBounds(150,250,70,30);
        b3 = new JButton("Exist");
        b3.setBounds(250,250,70,30);
         setLayout(null);
        l1.setBounds(50,120,100,30);
        l2.setBounds(50,170,100,30);
        t1.setBounds(145,120,100,30);
        t2.setBounds(150,170,100,30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
               
        l1 = new JLabel("Navan");        
        setTitle("Welcome");
        setSize(400,500);
        setLocation(600,300);
        add(l1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
      }

public void actionPerformed(ActionEvent ae)
{ 
   if (ae.getSoursce() == b3)
   {
       System.out.println(0);
    }
     else if (ae.getSoursce() == b2)
          {
             t1.setText(" ");
             t2.setText(" "); 
          }
   else if (ae.getSoursce()==b1)
      {
       String s1 = t1.getText();
       String s2 = t2.getText();
       String s3 = s1 +" " + s2;  
       System.out.println(s3); 
    }
}
public static void main(String []args)
{
   new MyFrame();
}

}
*/
/*
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1, b2, b3;

    MyFrame() {
        l1 = new JLabel("Enter number 1: ");
        l2 = new JLabel("Enter number 2: ");
        l3 = new JLabel("Result: ")
        t1 = new JTextField("");
        t2 = new JTextField("");
        b1 = new JButton("Add");
        b1.setBounds(50, 250, 70, 30);
        b2 = new JButton("Clear");
        b2.setBounds(150, 250, 70, 30);
        b3 = new JButton("Exit");
        b3.setBounds(250, 250, 70, 30);
        
        setLayout(null);
        l1.setBounds(50, 120, 100, 30);
        l2.setBounds(50, 170, 100, 30);
        l3.setBounds(50, 300, 150, 70);
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
        } else if (ae.getSource() == b1) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = s1 + " " + s2; // Concatenate the text
            resultLable.setText("Result: " +s3);
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l1, l2, l3; // l3 is the label for displaying the result
    JTextField t1, t2;
    JButton b1, b2, b3;

    MyFrame() {
        l1 = new JLabel("Enter number 1: ");
        l2 = new JLabel("Enter number 2: ");
        l3 = new JLabel("Result: "); // Add missing semicolon
        t1 = new JTextField("");
        t2 = new JTextField("");
        b1 = new JButton("Add");
        b1.setBounds(50, 250, 70, 30);
        b2 = new JButton("Clear");
        b2.setBounds(150, 250, 70, 30);
        b3 = new JButton("Exit");
        b3.setBounds(250, 250, 70, 30);
        
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

