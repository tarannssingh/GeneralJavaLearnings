import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main{
    public static void main(String[] args) {
        
        //!Quick notes
        // Layout manger is responsible for the placement of components in a containor (be it the panels in a frame, or the labels in a panel)
        // There are 3 common mangers , as well as a null statemnt that allows us to us a grid style in manging
            //1 BorderLayout = A Borderlayout allows us to place compoennts in one of 5 spots (North, Sout, East, West, and Center)
            // The most varaible in size is the center allocated space

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500)); // the size
        frame.setTitle("JFrame"); 

        //Setting up the layout manager
        frame.setLayout(new BorderLayout( 10 , 10 /* WE can add margins here  */));

 
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,25));
        panel2.setPreferredSize(new Dimension(25,100));
        panel3.setPreferredSize(new Dimension(25,100));
        panel4.setPreferredSize(new Dimension(100,25));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1, BorderLayout.NORTH); // Can only change height 
        frame.add(panel2, BorderLayout.WEST); // Can only change width
        frame.add(panel3, BorderLayout.EAST); // Can only change width 
        frame.add(panel4, BorderLayout.SOUTH); // Can only change height 
        frame.add(panel5, BorderLayout.CENTER); // Can only change both 

        //-------------------- Sub Panels ---------------------------//
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        // This sets up the layout for panel5 so we can sub classe these
        panel5.setLayout(new BorderLayout());

        // Adding the panels to the main panel
        panel5.add(panel6, BorderLayout.NORTH); // Can only change height 
        panel5.add(panel7, BorderLayout.WEST); // Can only change width
        panel5.add(panel8, BorderLayout.EAST); // Can only change width 
        panel5.add(panel9, BorderLayout.SOUTH); // Can only change height 
        panel5.add(panel10, BorderLayout.CENTER); // Can only change both 


        //------------------------- end of sub panels ----------------------------//




        
        












        frame.setVisible(true);

    }
}