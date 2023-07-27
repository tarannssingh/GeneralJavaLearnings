import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {


        // This sets the image we have to be our icon for the label
        ImageIcon icon = new ImageIcon("purple.png");
        
        // These make the label and set the name and image associated with it 
        JLabel label = new JLabel();
        label.setText("Hi :)");
        label.setIcon(icon);

        // Use if there is a layout set
       
       
        // These also set where in the panel the label will be situated 
        // This is only used when there is no layout mangaer (i.e. null). This will allow you to move it to any specfic spot in the container it is in
        label.setBounds(0, 0, 250, 250); // This gives us a border to play with in postioning the label
        // If we set a layout, like in cyan, then this will take precdent in the postion the label is compared to the frame.
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER); 


        // ex of null and where we determine the layout 
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);  // This changes the background of the panel
        redPanel.setBounds(0, 0, 250, 250); // This sets the bounds of the panel
        redPanel.setLayout(null);   // This removes the pre-downloaded layout and allows us to adjust the label when it is in there // Other wise we woudl have a flow layout installed


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        // bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(500, 0, 250, 250);
        greenPanel.setLayout(null);
        
        // ex with broderlayout 
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.cyan);
        cyanPanel.setBounds(0 , 250, 750, 250);
        cyanPanel.setLayout(new BorderLayout());






        JFrame frame = new JFrame(); 
        frame.setTitle("JFrame"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true); 
        frame.setSize(750, 750);
        // We will discuss these later
        frame.setLayout(null);

        // Add the panels to the frames
        frame.add(redPanel);    // This adds our compenet (panel) to the frame
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.add(cyanPanel);

        // Add the label
        cyanPanel.add(label);

        // Set some more frame settings
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
