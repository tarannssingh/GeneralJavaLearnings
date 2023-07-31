import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelProj extends JPanel implements ActionListener{ 

    static int PROJ_WIDTH = MyFrame.FRAME_WIDTH;                   // Atributes of the frame
    static int PROJ_HEIGHT = (int) (MyFrame.FRAME_HEIGHT * 3/4);
    int SPEED = 15;                                                // Speed and Angle of the Projectile
    int ANGLE = 45;
    Timer timer;                                                   // We will use this for the movements
    Projectile projectile;                                         // Making the projectile global

//!!!!!!!!!!!    // This button is just for testing 
JButton button = new JButton("Fire");

    boolean fired = false; // This will be our way of telling the actionlistener to shoot the projectile
   
//!!!!!!!!!!!    // I must find a way to make these good enough where the projectile is actual somewhat to scale
    static final int TIME = 10; // This is the time in Milliseconds // Our metrics of time will be 0.010 s
    static int PROJ_DIAMETER = 25; // This is the diameter of the projectile
    
    PanelProj()
    {
        this.setPreferredSize(new Dimension(PROJ_WIDTH,PROJ_HEIGHT));
        this.setBackground(Color.gray);

        // The idea with the projectile
        // We will create a projectile.
        // We will do all of the calculations and figure out the math behind the path it will take 
        // once we fire the mechnisim to fire it
        // After that, we will vizulaize it 

        this.setLayout(null);
        button.setBounds(PROJ_WIDTH/2 - 50, 0, 100, 40); // for position and size of the projectile
        this.add(button);
        button.addActionListener(this);

        //Every time the timer is called, we perform a redraw
        timer = new Timer(TIME, this); // 10 milisecond intervals
        // timer.setRepeats(true);
        timer.start(); 
        

   
    }


    public void paint(Graphics g)
    {
        // We do this to keep the same compoenents of the orgional paint class
        super.paint(g);
        Graphics2D g2D = (Graphics2D) (g);
        if (fired)
        {
            g2D.setStroke(new BasicStroke(9));
            g2D.setPaint(Color.red);
            g2D.fillOval( (int) projectile.getX(), (int) projectile.getY(), PROJ_DIAMETER, PROJ_DIAMETER);
        }

    }



    @Override
    // This will occur every time based on the timer paramenters
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == button)
        {
            this.fire();
            fired = true;
            System.out.println("" + projectile.getX());

        }

// fired && (projectile.getY() - 2 * PROJ_DIAMETER <= this.getHeight())
        while (fired) // If the projectile is fired and doesn't touch the ground
        {
            // Here we will do all of the physics that will ultimently change the x and y of the projectile             
                                // if (projectile.getY() > this.getHeight())
              System.out.println("" + projectile.getY());
            projectile.setX(
                projectile.getX() + projectile.getVx()
            );
            projectile.setVx(
                projectile.getVx() + projectile.getAx()
            );
            
            projectile.setY(                            // I had an error here, where Y was postive, but our Y axis is upside down
                projectile.getY() + projectile.getVy()
            );
            projectile.setVy(
                projectile.getVy() + projectile.getAy()
            );

            try {
                Thread.sleep(10);
            } catch (InterruptedException f) {
                // Handle any exceptions that might occur
            }

        }
        System.out.println("" + projectile.getY());
        System.out.println("" + 2 * PROJ_DIAMETER);
        System.out.println("" + this.getHeight());
        System.out.println("" + (projectile.getY() - 2 * PROJ_DIAMETER ));
        System.out.println("" + projectile.getX() + " , " + projectile.getY());

        repaint();
    }

    public void fire()
    {
        projectile = new Projectile(SPEED, ANGLE);
    }

}