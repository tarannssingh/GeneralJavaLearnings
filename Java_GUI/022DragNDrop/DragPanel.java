import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    
    ImageIcon image = new ImageIcon("screenshot.png"); 
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner; // This is a point representing the cornor of the image
    Point prevPT; // This will represent our previous corner of the image

    DragPanel()
    {
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener(); 
        DragListener dragListener = new DragListener(); // These are instances of the classes we made
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener); //Here we add these via runnign them through method assoicated with this instance of the method
    }


    // This will repaint our image after we update the postion of our image
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); //This keeps the og paint feature
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
        // Paint this, the graphics, x position of painting the image, and the y position of painting the image
    }

    // This will listen to our mouse clicks
    private class ClickListener extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            prevPT = e.getPoint(); // prevPT becomes to where we clicked
        }
    }

    // This will actuall move our image as our mouse moves
    private class DragListener extends MouseMotionAdapter
    {
        public void mouseDragged(MouseEvent e)
        {
            Point currentPT = e.getPoint();

            imageCorner.translate(

                (int)(currentPT.getX() - prevPT.getX()),
                (int)(currentPT.getY() - prevPT.getY()) //This translates our image from where it was to the new position 

            );
            prevPT = currentPT;
            repaint();
        }
    }
}
