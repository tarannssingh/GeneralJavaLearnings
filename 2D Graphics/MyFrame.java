
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    // implicitly invoked
    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawLine( 0, 0, 500, 500);
    }
    
}
