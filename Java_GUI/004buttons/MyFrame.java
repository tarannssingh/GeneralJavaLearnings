import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MyFrame extends JFrame implements  ActionListener{

    // This makes our button global for the Frame
    JButton button;
    JLabel label;

    MyFrame()
    {
        //This makes the icons 
        ImageIcon icon = new ImageIcon("purple.png");
        ImageIcon icon2 = new ImageIcon("shock.jpeg");

        // This instatites the label
        label = new JLabel();
        // This sets a new icon to the label
        label.setIcon(icon2);
        // This sets the bounds of the label (like where it is allowed to have compoenets)
        label.setBounds(150, 250, 150, 150);
        // we will make it where the label is visibile after we click the button
        label.setVisible(false);



        // This makes a button and sets its size
        button = new JButton();
        button.setBounds(100, 100, 250, 200);
        // This gives the button the ability to be listened to 
        button.addActionListener(this); //WE can also subsittue the implementation of Action listener with an lambda experesion
                                                // button.addActionListener(e -> System.out.println("Hi"));
        
    // Here we will customize the apperance of the button
        // This sets the title of the button
        button.setText("\"Hi\" Button");
        // This removes the focusablity of the box (so there is no border esc thing around the button)
        button.setFocusable(false);
        // This adds an icon to our button
        button.setIcon(icon);
        // This is where the postion of the text on the button will be located  
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        // This edits the apperance of the text
        button.setFont(new Font("Comic Sans", Font.BOLD, 24));
        // This will set the gap between the text and image
        button.setIconTextGap(5);
        // This adds a border
            // You can pick any type of border, I picked etched
        
        // This sets the color of the text and the button
        button.setForeground(Color.cyan);
        button.setBackground(Color.GREEN);
       
        button.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        //button.setBorder(BorderFactory.createLoweredBevelBorder());        

        // This disables the button 
        // We can add this to the action listenr to make it where once it is clicked, it is disabled
        button.setEnabled(true);






        // JFrame set up
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // no layout manger
       // this.setLayout(null); // Using null layout for explicit positioning
        this.setSize(new Dimension(500, 500)); // the size
        this.setVisible(true);
        this.setTitle("JFrame"); 
        // this.getContentPane().setBackground(Color.black);

        // This adds the button to the frame
        this.add(button);

        // This ads the label
        this.add(label);

    }

    // Now our frame can listen for events 
    @Override
    public void actionPerformed(ActionEvent e) {

        // This checks if the source of the action listened to is the button being clicked, if so it does this.
        if (e.getSource() == button)
        {
            System.out.println("Hi");
            label.setVisible(true);
        }
    
}

}
