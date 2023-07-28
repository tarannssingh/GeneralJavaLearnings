import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.*;

public class MyFrame extends JFrame implements MouseListener{ // There are other ways to get the mouselistener I believe

    JLabel label;
    
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        // Label (as our compoenent) settings
        label = new JLabel();
        label.setBounds(200, 200, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);
    
        this.add(label);
        this.setVisible(true);
    }



    @Override
    public void mouseClicked(MouseEvent e) {
        // This is called when a mouse button has been clicked (both pressed and released) on a componenet

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // This is called when a mouse buton has just been pressed (meaning whether released or not doesn't matter) on a component 
        // JOptionPane.showMessageDialog(null, "You Clicked the Mouse.", "Mouse Clicked?", JOptionPane.INFORMATION_MESSAGE);
        label.setBackground(Color.green);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // This is called when a mouse buton has just been released (meaning whether pressed or not doesn't matter) on a component 
        // JOptionPane.showMessageDialog(null, "You Unclicked the Mouse.", "Mouse Clicked?", JOptionPane.INFORMATION_MESSAGE);
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // This is called when a mouse cursoer enters the area of a componenet
        // JOptionPane.showMessageDialog(null, "You Entered the Componenet", "Mouse Clicked?", JOptionPane.INFORMATION_MESSAGE);
        label.setBackground(Color.blue);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // This is called when a mouse cursoer leaves the area of a componenet
        // JOptionPane.showMessageDialog(null, "You Exited the Componenet", "Mouse Clicked?", JOptionPane.INFORMATION_MESSAGE);
        label.setBackground(Color.red);

    }

}
