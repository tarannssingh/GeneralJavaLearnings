import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener{
    
    JButton button; 

    // Honestly this lesson was kind of meh. We have a way for a user to communicate their files with us through our program though.

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // This button will be used to open the file manager to select a file
        button = new JButton("Select File");
        button.addActionListener(this);
        
        this.add(button);
        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // This checks if the action performed is our button
        if (e.getSource() == button)
        {
            JFileChooser fileChooser = new JFileChooser();
            // This will select a file to open
            // int response = fileChooser.showOpenDialog(null); // What is a parent compenent?
            int response = fileChooser.showSaveDialog(null); // This selects a file to save (meaning making a file and saving it to desktop location)

            // This is a way to make the default direcctory a certain file. 
            fileChooser.setCurrentDirectory(new File(".")); // This is a way to set the current directory that shows up on the desktop file manager to be the file name that we put in




            if (response == JFileChooser.APPROVE_OPTION)
            {
                // This way we look for and get the file that was selected if the user puts it in
                // WE get the file location and use it.
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                JOptionPane.showMessageDialog(null, "File \"" + file + "\" Loaded", "How to use this program!", JOptionPane.WARNING_MESSAGE);

            }

        }
       
    }

}
