import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {

    // Making what we need
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);


    ProgressBarDemo()
    {
// Many different ways to set this up, this is just a basic interpretation. Can even make it like an health bar if we reverse it
        bar.setValue(0); //Here is the starting of the bar
        bar.setBounds(0,0, 500, 100); // Set the size of the bar (b/c no layout manager)
        bar.setStringPainted(true); //This gives us a percentage for our progress bar to state its progress
        bar.setFont(new Font("MV Boli", Font.BOLD, 25)); //setting our font 
        bar.setForeground(Color.red); // Changes the color of the fill. // Doesn't work well for mac :(
        bar.setBackground(Color.BLACK); //Background color




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);


        frame.add(bar);





        frame.setVisible(true);

        fill();
    }


    public void fill()
    {
        int counter = 0;
        
        while (counter <= 100)
        {
            bar.setValue(counter);
            try {
                Thread.sleep(50); // This turns off the thread for this many milliseconds
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter++;
        }

        bar.setString("Done! :)"); // After we finish, we change the percentage to say this message.

    }

}
