import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{


    JButton button;

    JTextField textField;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        // This is a button to submit the field
        button = new JButton("Submit");
        //the button will be action listened
        button.addActionListener(this);

        // This is our actual text field
        textField = new JTextField();

        // This sets the size of the field 
        textField.setPreferredSize(new Dimension(250, 40));

        // Font and color 
        textField.setFont(new Font("Consolas", Font.BOLD, 35));
        textField.setForeground(new Color(0x00F0F0));

        // Background of the textField
        textField.setBackground(Color.ORANGE);
        
        // This sets the color of the carrort when determeing what to type next "|"
        textField.setCaretColor(Color.RED);
        
        // This gives a predetermined field
        textField.setText("Username...");

        

        // Here we add the button and text field. The flowlayout of the frame make it where it adds left to right
        this.add(button);
        this.add(textField);

        
        
        //This makes our frame as tight as possible and wraps around our components. We then make it visible
        this.pack();
        this.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            // When our button is clicked, we will take note of it
            String field = textField.getText();
            JOptionPane.showMessageDialog(null, "You Said: \"" + field + "\"", "I Quoted You", JOptionPane.ERROR_MESSAGE);

            // This controls editability so after we submit, we cannot resubmit
            button.setEnabled(false);
            textField.setEditable(false);

        }
    }
    
}
