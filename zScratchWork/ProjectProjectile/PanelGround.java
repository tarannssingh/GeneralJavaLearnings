import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelGround extends JPanel{
    
    // Atributes of the panel
    static int GROUND_WIDTH = MyFrame.FRAME_WIDTH;
    static int GROUND_HEIGHT = (int) (MyFrame.FRAME_HEIGHT * 1/16);

    JLabel label;
 
    PanelGround()
    {
        this.setPreferredSize(new Dimension(GROUND_WIDTH, GROUND_HEIGHT));
        this.setBackground(Color.green);
        label = new JLabel("This is the ground!");
        this.add(label);
    }

}
