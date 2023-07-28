import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.*;

public class MyFrame extends JFrame implements KeyListener{

    JLabel label;
    ImageIcon icon;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null); // We are going to use key strocks to move things on screen
        
        // Adding the key listener
        this.addKeyListener(this);

        //Setting Icon
        icon = new ImageIcon("shock.png");


        // Label Settings
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        // label.setBackground(Color.red);
        // label.setOpaque(true); // It only displays if we make it not tranparent through this 
        label.setIcon(icon); // Setting the image
        
        this.getContentPane().setBackground(Color.CYAN); // Setting the background


        this.add(label);
        this.setVisible(true);
    }



    @Override // keyTyped is fired right when a key is typed (meaning when it is able to be displayed on screen). It uses KeyChar, so the output of it (e) is a char
    public void keyTyped(KeyEvent e) { // Use for letters
        // Switch logic here > if statemnts
        switch(e.getKeyCode())
        {
            /* 
            // To stop where it doesn't go both directions at same time, multi thread for x and y direction???
            case 'a': label.setLocation(label.getX() - 25 , label.getY());  // a //WE have numbers here, because the arrow keys are labeled via numbers
                break;
            case 'w': label.setLocation(label.getX() + 25, label.getY());  // w
                break;
            case 's': label.setLocation(label.getX(), label.getY() - 25);  // s
                break;
            case 'd': label.setLocation(label.getX(), label.getY() + 25);  // d
                break;
            */
        }

    }

    @Override // keyPressed is fired when a key is pressed down. Like the literal key. In this scenario, the key code rather than the key is outputed
    public void keyPressed(KeyEvent e) {  // User for no letter ones (arrow key and shift)
        switch(e.getKeyCode())
        {
            // To stop where it doesn't go both directions at same time, multi thread for x and y direction???
            case 37: label.setLocation(label.getX() - 25 , label.getY());  // a //WE have numbers here, because the arrow keys are labeled via numbers
                break;
            case 39: label.setLocation(label.getX() + 25, label.getY());  // w
                break;
            case 38: label.setLocation(label.getX(), label.getY() - 25);  // s
                break;
            case 40: label.setLocation(label.getX(), label.getY() + 25);  // d
                break;

        }
    }

    @Override // When ever a key is let go, this is called.
    public void keyReleased(KeyEvent e) { // We get like a literal info stamp of the key
        System.out.println("You released key char: " + e.getKeyChar()); // This is the actual char value of the key
        System.out.println("You released key char: " + e.getKeyCode()); // This is the actual key value of the key
    }

}