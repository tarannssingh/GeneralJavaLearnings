import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;



public class Game {
    
    JFrame frame; 
    JLabel label; 

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game()
    {
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true); // This is allows th background to show

        // Setting up the actions that will occur 
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new Rightction();

        // When the UP key is pressed, it gets that input and then associates the action map key of "upAction" with it. Then at the getActionMap method, we can use that key to say that it will unlock a call to the upAction method
        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);
        //
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction"); // Can just change 's' to "DOWN" for arrows (same for other key bindings)
        label.getActionMap().put("downAction", downAction);
        //
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        //
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
            label.repaint();
        }
        
    }

    public class DownAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
            label.repaint();
        }
        
    }
    
    public class LeftAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
            label.repaint();
        }
    }

    public class Rightction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
            // we don't need to call repaint, as Javax Swing automatically calls this when a compoenent moves. When we move a componenet, the orgional form is labeled unvailed and Java Swing forces a repaint after what is being done is done. So after the arrow key movmeents, Java forces the invalid frame to be painted ove with the new location of the compoenet 
        }
        
    }

}
