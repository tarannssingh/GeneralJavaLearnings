import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    


    JRadioButton pizzaButton;
    JRadioButton hotDogButton;
    JRadioButton hamburgerButton;

    //Image icons to set them for the radio buttons
    ImageIcon pizzaIcon;
    ImageIcon hamIcon;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        pizzaButton.addActionListener(this);
        // Setting the Icon for the image 
        pizzaIcon = new ImageIcon("purple.png");
        pizzaButton.setIcon(pizzaIcon);
        //        pizzaButton.setSelectedIcon(hamIcon); 
        //  NOTE: you must have a setIcon in order to have a setSelectedIcon


        hotDogButton = new JRadioButton("Hotdog");
        hotDogButton.addActionListener(this);
        hotDogButton.setFocusable(true);



        hamburgerButton = new JRadioButton("Hamburger");
        hamburgerButton.addActionListener(this);
        // Setting the Icon
        hamIcon = new ImageIcon("shock.png");

        // This will allow us to keep the buttons together and only allow us to choose 1 out of them
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        this.add(pizzaButton);
        this.add(hotDogButton);
        this.add(hamburgerButton);
        

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton)
        {
            System.out.println("Your ordered Pizza!");
        }
        else if (e.getSource() == hamburgerButton)
        {
            System.out.println("Your ordered Hamburger!");
        }
        else if (e.getSource() == hotDogButton)
        {
            System.out.println("Your ordered Hotdog!");
        }
    }

}
