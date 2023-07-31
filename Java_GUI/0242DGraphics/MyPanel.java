import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

    Image image;

    public MyPanel()
    {
        // We are creating an image icon, and then the getting the image from that
        // this allows us to get an image
        image = new ImageIcon("purple.png").getImage();
        this.setPreferredSize(new Dimension(500,500));

    }

    public void paint(Graphics g)
    {
        // We cast grpahics g to graphics2D
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(9));
        g2D.setPaint(Color.red);

    // Image
        g2D.drawImage(image, 0, 0, 500, 500, null);

    // Line
        g2D.drawLine(0, 0, 500, 500);
    // Rectangle
        g2D.setPaint(Color.magenta);
        g2D.fillRect(0, 0, 100, 200);
        g2D.setPaint(Color.green);
        g2D.drawRect(0, 0, 100, 200);

    // Circle
        g2D.setPaint(Color.yellow);
        g2D.fillOval(0,0,100,100);
        g2D.setPaint(Color.orange);
        g2D.drawOval(0, 0, 100, 100);
        
    // PokeBall
        g2D.setPaint(Color.red);
        g2D.fillArc(0, 0, 100, 100, 0, 180);
        g2D.setPaint(Color.white);
        g2D.fillArc(0,0, 100, 100, 180,180);

    // Trianngle        
        int[] xPoints = {232, 105, 63};
        int[] yPoints = {125, 237, 122};
        g2D.setPaint(Color.yellow);
        g2D.fillPolygon(xPoints, yPoints, 3);
        g2D.setPaint(Color.green);
        g2D.drawPolygon(xPoints, yPoints, 3);
    
    // String 
        g2D.setPaint(Color.cyan);
        g2D.setFont(new Font("Tahoma", Font.BOLD, 50));
        g2D.drawString("HELLO", 12, 50);
            // the starting postion is the bottom left corner of the string
            // so don't start at an y of 0


        











    }

    // You can call setPaint to change the color and differntate
    // the shapes you make 

    // The most recently created shape/paint_call will be the one that is more on top
    // when compare to the painted shapes called before it

// This script shows all the diffenret fonts I have avaible to use 
            // GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            // Font[] fonts = ge.getAllFonts();
            // for (Font font : fonts) {
            //     System.out.println(font.getFontName());
            // }

}
