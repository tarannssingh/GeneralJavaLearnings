import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
        //!Quick notes
        // Layout manger is responsible for the placement of components in a containor (be it the panels in a frame, or the labels in a panel)
        // There are 3 common mangers , as well as a null statemnt that allows us to us a grid style in manging
            //2 FlowLayout = A FlowLayout allows us to place compoennts in a row as per if the compoents size perfered size fit. As the compoments fill up the row, then it goes to the next row


            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(new Dimension(500, 500)); 
            frame.setTitle("JFrame"); 

            // Setting the layout
            frame.setLayout(new FlowLayout(FlowLayout.CENTER /* HERE we can edit where the alignment of the compents are */)); // the Default is border layout 
            // frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10 /* HERE we can edit where the spacing */)); // the Default is border layout 
            // Short cut to add a button for our leanring purposes

            JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(200,250));
            panel.setBackground(Color.lightGray);
            panel.setLayout(new FlowLayout()); // By default, panels use a flow layout



            panel.add(new JButton("1"));
            panel.add(new JButton("2"));
            panel.add(new JButton("3"));
            panel.add(new JButton("4"));
            panel.add(new JButton("5"));
            panel.add(new JButton("6"));
            panel.add(new JButton("7"));
            panel.add(new JButton("8"));
            panel.add(new JButton("9"));
    
            frame.add(panel);
            frame.setVisible(true);

    }

}