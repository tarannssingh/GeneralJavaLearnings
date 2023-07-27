import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        
// Labels
        ImageIcon imageForFrame = new ImageIcon("purple.png");

        JLabel label = new JLabel(); // This creats a label
        label.setText("Hello World!");  // This sets the tezt of the label // Or you can pass it through as a parameter for new JLabel();
        label.setIcon(imageForFrame);
         

// J Frame is a GUI window in which we can add compnents to

        JFrame frame = new JFrame(); // This made a frame
        frame.setTitle("JFrame Title"); // This sets the title for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will exit out of the JFrame application
        // There is also HIDE_ON_CLOSE and DO_NOTHING_ON_CLOSE
        frame.setResizable(true); // This prevents the frame from having the ability to resize
        frame.setSize(500, 500);     // Takes in a dimension or width/height ints (it sets the size (x and y dimension) of the frame)
       
        // Here we make an imageicon that can access the file
        // then we extract the image from the image icon and set that as the icon
        ImageIcon image = new ImageIcon("purple.png"); // This will create an image icon at the top of our program
        frame.setIconImage(image.getImage()); // This will change the icon of the frame
       
        frame.getContentPane().setBackground(Color.red); // This will make the background of the frame the color we stated
        // There are also custom colors
        frame.getContentPane().setBackground(new Color(146, 132, 193));
        frame.getContentPane().setBackground(new Color(0x23F3F4));
        


       // MyFrame myFrame = new MyFrame();

        // We can also just call the MyFrame()/JFrame() by itsself
        // new JFrame();
        // new myFrame();

// Labels
        frame.add(label);



// J Frame
        frame.setVisible(true); // This makes a fram visible

    }
}
