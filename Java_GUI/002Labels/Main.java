import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Main {
    public static void main(String[] args) {
        
        // This will create an image for our program
        ImageIcon image = new ImageIcon("purple.png"); 
        // This will allow us to manufactur a border to apply to our label
        Border border = BorderFactory.createLineBorder(Color.red, 5, true);
        

        JLabel label = new JLabel(/*"Purple"*/); // This creats a label
        // Rather than passing text as a paramenter, we can set the text through the function below
        label.setText("Purple");  // This sets the tezt of the label // Or you can pass it through as a parameter for new JLabel();
        label.setIcon(image); // This puts an image in the label
        
        // When it comes to the default settings of a label
        // Java puts the image on the far left side and the text to the left of the image
        // This I believe is called a border layout. 
        
        // We can edit this though
        label.setHorizontalTextPosition(JLabel.CENTER); // This sets the text relative to the imgage (we can do LEFT, CENTER, or RIGHT)
        label.setVerticalTextPosition(JLabel.CENTER); // This sets the text verically relative to the image (TOP, CENTER, or Bottom of image)
        // With the other settings below, it kind of gets weird
        
        // Text Settings
        label.setForeground(new Color(0xFFa3a4)); // This changes the color of the text
        label.setFont(new Font("MV Boli", Font.ITALIC, 200)); // Font name, style, and size
        
        // Gap setting between text and Image
        // This seems to mostly work well when the iamge and text are not centered togethe
        label.setIconTextGap(-1100); //This gives us a gap for the text and the image 
        
        // Background 
        label.setBackground(Color.black); // Sets the background color
        // We need to make the background on via setting it as opaque
        label.setOpaque(true); // This takes up the whole label size and makes it the background color we set
        
        // This allows us to add our border to our label
        label.setBorder(border);
        
        // These will set the vertical and horizonatl alingment of the contents of the label
        label.setVerticalAlignment(JLabel.CENTER); // Vertical Positon
        label.setHorizontalAlignment(JLabel.CENTER); // Horizontal Postion

        // To change the layout manager so that the label won't expand to the whole window



        JFrame frame = new JFrame(); 
        frame.setTitle("JFrame"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true); 
            // frame.setSize(500, 500);
        
        // It is usally set to BorderLayout
        // This allows us to set the label to a certain size on the frame
            // frame.setLayout(null);
            // label.setBounds(0, 0, 250, 250); // thsi sets to x and y location and dimension of the label

        // SO our frame can have our label
        frame.add(label);
        // This packs the frame's size to accmaddate all of the componenets we have
        frame.pack();
        frame.setVisible(true);

    }
}
