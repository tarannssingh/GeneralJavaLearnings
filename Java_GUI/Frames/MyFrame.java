import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    // Second way to create Jframe
    // This way just abstracts the creation of the frame from the main class to its own class
    MyFrame()
    {
/* 


        // J Frame is a GUI window in which we can add compnents to
        this.setTitle("JFrame Title"); // This sets the title for the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will exit out of the JFrame application
        // There is also HIDE_ON_CLOSE and DO_NOTHING_ON_CLOSE
        this.setResizable(false); // This prevents the frame from having the ability to resize
        this.setSize(400, 400);     // Takes in a dimension or width/height ints (it sets the size (x and y dimension) of the frame)
       
        ImageIcon image = new ImageIcon("purple.png"); // This will create an image icon at the top of our program
        this.setIconImage(image.getImage()); // This will change the icon of the frame
       
        this.getContentPane().setBackground(Color.red); // This will make the background of the frame the color we stated
        // There are also custom colors
        this.getContentPane().setBackground(new Color(146, 132, 193));
        this.getContentPane().setBackground(new Color(0x23F3F4));
    }    
*/   
}
}