/* Here's a java program that creates the GUI screen as per your requirements. the program accepts the user's name,class, hobbies, font style , and font size and then displays the selected options in a text box.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserInfoGUI extends JFrame implements ActionListener {
          // Declar GUI components
          JTextField nameField,classField;
          JCheckBox musicCheck,sportsCheck, travelCheck, boldCheck, italicCheck, underlineCheck;
          JRadioButton fyButton, syButton,tyButton;
          JComboBox<String> fontComboBox, sizeComboBox;
          JTextArea resultArea;
          JButton applyButton;
          ButtonGroup classGroup;
          
         public UserInfoGUI() {
               // Set up the frame
              setTitle("User Information Form");
              setSize(600,400);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLayout(new GridLayout(10,2,25,15));
           
               // yout Name
              JLabel nameLabel = new JLabel("Your Name:");
              nameField = new JTextField(20);
              add(nameLabel);
              add(nameField);
             
               // Your Hobbies
              JLabel hobbiesLabel = new JLabel("your Hobbies:");
              JPanel hobbiesPanel = new JPanel();
              musicCheck = new JCheckBox("Music");
              sportsCheck =  new JCheckBox("Sports");
              travelCheck = new JCheckBox("Traveling");
              hobbiesPanel.add(musicCheck);
              hobbiesPanel.add(sportsCheck);
              hobbiesPanel.add(travelCheck);
              add(hobbiesLabel);
              add(hobbiesPanel);
          
              // Font Style
              JLabel fontLabel = new JLabel("Font Style:");
              JPanel stylePanel = new JPanel();
              boldCheck = new JCheckBox("Bold");
              italicCheck = new JCheckBox("Italic");
              underlineCheck = new JCheckBox("Underline");            
              stylePanel.add(boldCheck);
              stylePanel.add(italicCheck);
              stylePanel.add(underlineCheck);
              add(fontLabel);
              add(stylePanel);
               
              // Your class
             JLabel classLabel = new JLabel("You class");
             JPanel classPanel = new JPanel();
             fyButton =  new JRadioButton("Fy");
             syButton = new JRadioButton("sy");
             tyButton = new JRadioButton("ty");
             classGroup = new ButtonGroup();
             classPanel.add(fyButton);
             classGroup.add(syButton);
             classGroup.add(tyButton);
             classPanel.add(fyButton);
             classPanel.add(syButton);
             classPanel.add(tyButton);
             add(classLabel);
             add(classPanel);
     
             // Font Options
             JLabel fontTypeLabel = new JLabel("Font:");
             fontComboBox = new JComboBox<>(new String[]{"Arial","Serif","SansSerif"});
             add(fontTypeLabel);
             add(fontComboBox);
             
             JLabel fontSizeLabel = new JLabel("Size:");
             sizeComboBox = new JComboBox<>(new String[]{"8","10","12","14","16"});
             add(fontSizeLabel);
             add(sizeComboBox);
     
             // Result Display
             resultArea = new JTextArea(15,60);
             resultArea.setEditable(false);
             JScrollPane scrollPane = new JScrollPane(resultArea);
             add(new JLabel("Display all content:"));
             add(scrollPane);
              
             // Apply Button
             applyButton = new JButton("Apply Changes");
             applyButton.addActionListener(this);
             add(applyButton);
             setVisible(true);
           }
         
            @Override
            public void actionPerformed(ActionEvent e) {
                  // Get name
            String name =  nameField.getText();
            
              // Get class
            String  className = "";
             if(fyButton.isSelected()) {
                    className = "FY";
             } else if(syButton.isSelected()) {
                    className = "SY";
             } else if(tyButton.isSelected()) {
                  className = "TY";
             }
        
              // Get hobbies
            StringBuilder hobbies = new StringBuilder();
            if (musicCheck.isSelected()) {
                 hobbies.append("music");
           }
           if (sportsCheck.isSelected()) {
                 hobbies.append("Sports");
             }
          if(travelCheck.isSelected()) {
               hobbies.append("Travelling");
           }
          
          // Get font style
         StringBuilder style = new StringBuilder("Style:");
         if(boldCheck.isSelected()) {
            style.append("Bold");
           }
         if (italicCheck.isSelected()) {
            style.append("Italic");
            }
         if(underlineCheck.isSelected()){
             style.append("Underline");
           }
     
         // Get font type and size
        String fontType = (String)fontComboBox.getSelectedItem();
        String fontSize = (String)sizeComboBox.getSelectedItem();
 
         // Display the result
 
         resultArea.setText("Name:" + name + "\n Class:"+className+ "\nHobbies:"  +hobbies.toString() + "\nFont:"+ fontType + ""+ fontSize + "\n" + style.toString());
 
     }

    public static void main(String[] args) {
          new UserInfoGUI(); // Create and show the GUI
        }
    }

/* 
### Explanation of the code:
  1. *Components
 - *JTextField*: nameField is used to input the user's name.
 - *JCheckBox*: musicCheck,sportsCheck,travelCheck for selecting hobbies;
 boldCheck,italicheck,underlineCheck for selecting font styles.
 - *JRadioButton*:fyButton,syButton, tyButton for selecting  the user's class.
   size.
- *JComboBox*: fontComboBox and sizeComboBox for choosing the font type and size.
- *JTextArea*: resultArea for displaying the results.
- *JButton*: applyButton to apply the changes and display the selected values.

  2.*Layout*:
- The layout is set to GridLayout with 7 rows and 2 columns for aligning the components.

   3 *ActionListener*:
- When the *Apply Changes*button is clicked, the actionPerformed method gathers all the input data (name,  class,hobbies , font style ,font type ,and font size ) and displays
it in the resultArea.

### How It Works :
 
1. *User Input*:
-The user enters thieir *name* in the text field.
-The user selects their *hobbies* (Music, Sports,Traveling) using checboxes.
- The user selects their *class* (FY,SY,TY) using radio buttons.
- The user selects  *font style* (Bold,Italic,Underline),*font type*(Arial,Serif,SansSerif),and *font size * from the drop-down meanus.

2. *Apply Changes*:
   - When the "Apply changes"button is pressed, the selected values are displayed in the text area.

### Example Output:
  
  If the user enters:
 
 - Name: "Navanth"
 - class: "Fy"
 -  Hobbies : Music ,Travekling 
 - Font : Arial
 -  Font: Arial
- Font Style:Bold,Italic
- Font Size:14
 
The resultArea will display:
 
 Name: John
 Class : FY
 Hobbies : Music Traveling 
 Font : Arial 14
 Style:Bold Italic

 */        
  
   
  




















