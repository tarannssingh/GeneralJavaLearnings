import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.*;

public class PanelDash extends JPanel {
    
    // Atributes of the panel
    static int DASH_WIDTH = MyFrame.FRAME_WIDTH;
    static int DASH_HEIGHT = (int) (MyFrame.FRAME_HEIGHT * 3/16);

    JLabel label;

    PanelDash()
    {
        this.setPreferredSize(new Dimension(DASH_WIDTH,DASH_HEIGHT));
        this.setBackground(Color.WHITE);
        this.setLayout(new FlowLayout());
        label = new JLabel("This is the dash. It will change based on the menu options clicked.\n Currently it is just decorational.");
        this.add(label);

    }


}
