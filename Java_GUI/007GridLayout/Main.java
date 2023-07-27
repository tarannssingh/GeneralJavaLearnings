import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
        //!Quick notes
        // Layout manger is responsible for the placement of components in a containor (be it the panels in a frame, or the labels in a panel)
        // There are 3 common mangers , as well as a null statemnt that allows us to us a grid style in manging
            //3 FlowLayout = A GridLayout allows us to create a grid where we can add compoenets that fill up the whole space. The grid layout makes it where the compoenets all have the same size of space to work with 


            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(new Dimension(500, 500)); 
            frame.setTitle("JFrame"); 

            // Setting the layout
            frame.setLayout(new GridLayout(4,4, 10, 10)); // the Default is border layout 
            // row, column, horz spacing, vert spacing

            
            frame.add(new JButton("1"));
            frame.add(new JButton("2"));
            frame.add(new JButton("3"));
            frame.add(new JButton("4"));
            frame.add(new JButton("5"));
            frame.add(new JButton("6"));
            frame.add(new JButton("7"));
            frame.add(new JButton("8"));
            frame.add(new JButton("9"));
            frame.add(new JButton("10"));
            frame.add(new JButton("11"));
            frame.add(new JButton("12"));
            frame.add(new JButton("13"));
            frame.add(new JButton("14"));
            frame.add(new JButton("15"));
            frame.add(new JButton("16"));
            




            frame.setVisible(true); 
    }

}