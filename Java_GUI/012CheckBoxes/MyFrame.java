import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        // Instatiate my icons
        xIcon = new ImageIcon("purple.png");
        checkIcon = new ImageIcon("shock.png");



        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this /* because we are implementing the action listener to our instance */);

        //Making the checkbox
         checkBox = new JCheckBox();

        //Setting the images of check and uncheck image
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);


        // Text next to check
        checkBox.setText("Air Resistance");

        // Focusablity
        checkBox.setFocusable(false);

        // Set the font
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));


        // Adding the checkBox to our frame 
        this.add(button);
        this.add(checkBox);

        this.pack();
        this.setVisible(true);
    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            // This is a way to check if the checkbox is selected
            if (checkBox.isSelected())
            {
                JOptionPane.showMessageDialog(null, "You Selected", "Your Answer", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}
