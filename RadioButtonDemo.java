import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class RadioButtonDemo implements ActionListener { 
   JRadioButton jRadioButton1; 
   JRadioButton jRadioButton2; 
   JButton jButton; 
   JLabel prompt, response; 
   ButtonGroup group;
   RadioButtonDemo() { 
      // set up frame
      JFrame f = new JFrame();
      f.setTitle("RadioButton Demo"); 
      f.setLayout(new FlowLayout()); 
      f.setSize(500,180);
      // set up the two radio buttons
      jRadioButton1 = new JRadioButton("Coffee"); 
      jRadioButton2 = new JRadioButton("Tea"); 
      // set up the radio button group - this lets us clear out the selections
      group = new ButtonGroup();
      group.add(jRadioButton1);
      group.add(jRadioButton2);
      // set up the click button
      jButton = new JButton("Click"); 
      // set up the two labels
      prompt = new JLabel("Which drink?"); 
      response = new JLabel("");
      // add everything to frame
      f.add(jRadioButton1); 
      f.add(jRadioButton2); 
      f.add(jButton); 
      f.add(prompt); 
      f.add(response);
      // be able to do something on the click
      jButton.addActionListener(this); 
      f.setVisible(true); 
   } 
  public void actionPerformed(ActionEvent e) 
  { 
      //if the 'coffee' button is selected
      if (jRadioButton1.isSelected()) { 
         response.setText("I like coffee");
      } 
      //if the 'tea' button is selected
      else if (jRadioButton2.isSelected()) { 
         response.setText("I like tea");
      } 
      // if neither are selected but user pushes 'click' button anyway
      else { 
         response.setText("I'd like to be able to enter a final plea"); 
      } 
      //this clears out the clicked button
      group.clearSelection(); 
  } 
} 