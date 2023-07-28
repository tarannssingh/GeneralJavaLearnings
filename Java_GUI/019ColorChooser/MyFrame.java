import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;

public class MyFrame extends JFrame implements ActionListener{
    

    JButton button;
    JLabel label;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Choose a Color");
        button.addActionListener(this);
        label = new JLabel();
        label.setBackground(Color.gray);
        label.setText("This is some Text");
        label.setFont(new Font ("Comic Sans", Font.BOLD, 100));
        label.setOpaque(true); // This makes it where we can actually add a background
        
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            // Here we make the color menu
            JColorChooser colorChooser = new JColorChooser();
            
            // This opens the color menu that allows a user to choose a color from a color pallet
            Color color = JColorChooser.showDialog(null, "Colors to Choose", Color.black); // This opens up there menu

            // Because we set the variable color 
            // label.setForeground(color);
            label.setBackground(color); // Can do other components than label
            // Now that we have the color that the user picked save, we can apply it to something.
        }
    }


}
