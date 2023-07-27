import java.awt.*;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyPanel panel;
    public MyFrame()
    {
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    //Overiding the paint method in JFrame
    //This is already automatically called when ever there is action
 
}


//    public void paint(Graphics g)
//     {
//         // We cast grpahics g to graphics2D
//         Graphics2D g2D = (Graphics2D) g;

//         g2D.drawLine(0, 0, 500, 500);
//     }