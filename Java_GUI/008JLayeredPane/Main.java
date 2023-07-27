import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main{
    public static void main(String[] args) {
        
        //*QUICK NOTE
        // JLayeredPane is the containor that provides a "z-axis" for positioning compoennts 


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        // add the componenet and then what layer it would be at (of the 5 layers Default, Palette, Modal, Popup, Drag)
        // or do numbers with a wrapper class (0, 1, 2, 3, 4)
        // Doing this makes it where we don't have to add them a certain way, just put on layer, but on a specfic layer, adding order does matter
        layeredPane.add(label1, Integer.valueOf(2));
        layeredPane.add(label2, Integer.valueOf(0) /*JLayeredPane.DEFAULT_LAYER*/);
        layeredPane.add(label3, Integer.valueOf(1));
        
        
        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500)); 
        frame.setTitle("JLayeredPane"); 
        frame.setLayout(null);
        





        frame.setVisible(true);



    }
}