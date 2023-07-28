import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;



public class MyFrame extends JFrame implements ActionListener{
    
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;


    
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("purple.png");
        saveIcon = new ImageIcon("shock.png");

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar); // We don't add the bar, rather we set it

        // Making main menu headers
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        // Adding them to the menu
        menuBar.add(fileMenu);
        menuBar.add(editMenu); // This creates indviudal tabs for us to store other specfic menu items 
        menuBar.add(helpMenu);

            loadItem = new JMenuItem("Load");
            loadItem.addActionListener(this);
            saveItem = new JMenuItem("Save");
            saveItem.addActionListener(this);
            exitItem = new JMenuItem("Exit");
            exitItem.addActionListener(this);

            // This changes the icons image
            loadItem.setIcon(loadIcon);
            saveItem.setIcon(saveIcon);

            // Keyboard Short Cuts
            loadItem.setMnemonic(KeyEvent.VK_L); // This makes it where we can use "l" for load 
            saveItem.setMnemonic(KeyEvent.VK_S); // This makes it where we can use "s" for save 
            exitItem.setMnemonic(KeyEvent.VK_E); // This makes it where we can use "e" for exit 

            // Doesn't work :(

            fileMenu.setMnemonic(KeyEvent.VK_F);
            editMenu.setMnemonic(KeyEvent.VK_E); // This set is Alt + letter 
            helpMenu.setMnemonic(KeyEvent.VK_H); // b/c they are menu headers







            fileMenu.add(loadItem);
            fileMenu.add(saveItem);
            fileMenu.add(exitItem);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem)
        {
            //We will say we loaded item
            JOptionPane.showMessageDialog(null, "Your Item has Loaded Succesfully.", "Load Status", JOptionPane.PLAIN_MESSAGE);

        }
        if (e.getSource() == saveItem)
        {
            //We will say we saved item
            JOptionPane.showMessageDialog(null, "Your Item has Saved Succesfully.", "Load Status", JOptionPane.PLAIN_MESSAGE);
        }
        if (e.getSource() == exitItem)
        {
            //We will say we will exit
            System.exit(13); //exits the java program
        }
    }

}
