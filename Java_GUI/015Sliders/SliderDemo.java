import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

// Change Listener
// It lisents to change.
// If there is a change in value to the thing we add change listenr to
// it will do what it is told to do 



public class SliderDemo implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    // Declaring the slider 
    JSlider slider;

    SliderDemo()
    {
        frame = new JFrame("Slider Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);
        // slider values == min, max, and starting value 

        // Values to add of the slider
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true); // This allows us to paint ticks (to show the range of numbers)
        slider.setMinorTickSpacing(10); //This is how often there will be a tick that we allowed to be painted
   // What is the differneces between ticks and track???    
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25); // This allows for major ticks to be 

        // Major Ticks and Numbers
        slider.setPaintLabels(true); // This adds values to the major ticks
        slider.setFont(new Font ("MV Boli", Font.BOLD, 15)); //This sets the font of the number lables

        //Changing to vertical Slider
        slider.setOrientation(SwingConstants.VERTICAL);
        // slider.setOrientation(SwingConstants.HORIZONTAL);



        //NOW, we are going to implement a label that will display the what number the tick is on.
        label.setText("σ\u00B0" + "C  =  " + slider.getValue());
        label.setFont(new Font ("MV Boli", Font.BOLD, 25)); //This sets the font of the label

        slider.addChangeListener(this);




        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500, 500);
        
        
        frame.setVisible(true);

    }




    @Override
    public void stateChanged(ChangeEvent e) {
        
        label.setText("σ\u00B0" + "C  =  " + slider.getValue());

    }

}