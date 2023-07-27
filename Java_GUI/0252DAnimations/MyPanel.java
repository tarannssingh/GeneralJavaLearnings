import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener{
    
    final static int PANEL_WIDTH = 500;
    final static int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y = 0; 

    MyPanel()
    {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("purple.png").getImage();
        // Delay and Action Listern
        // 1000 ms = 1 sec 
        // we can say this as we are implementing the action listern
        timer = new Timer(10, this); // 10 milisecond intervals
        timer.start();


    }

    public void paint(Graphics g)
    {
        // This just runs paint for the orgional painted things 
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        // can replace with a rectangle
        g2D.drawImage(enemy, x, y, null);

    }

    @Override
    // This will occur every time based on the timer paramenters
    public void actionPerformed(ActionEvent e) {

// To make this a full physics vizualizer in a way (we can add certain
// parameters that would make it where the math would check out to work universially
// like if the projectile hit the floor, certain physics will be done to make it where
// the ball would rebound. Or if it hit another projectile, an inelastic collosion would occur)

        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0)
        {
            xVelocity *= -1;
        }    
        x += xVelocity;
        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0)
        {
            yVelocity *= -1;
        }    
        y += yVelocity;
        // WE are going to redraw our interface with this so that there is an actual change for every time interval we set
        repaint();
    }

}

// The timer will help us move 