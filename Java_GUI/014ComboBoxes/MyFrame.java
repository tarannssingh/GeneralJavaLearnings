import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    

    JComboBox comboBox;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // This is our list/fields box items
        // THE Data being listed as fields can be any reference data type
        // Meanins Strings are good. But int and double are not.
        // However we can use the wrapper class and have a list of Integer and Double, which are reference types.
        String[] animals = {"Dog", "Cat", "Aligator", "Llama"};

        Integer[] numbers = { 1, 2, 3, 4, 5, 6};

        comboBox = new JComboBox(animals);
        // adding the event listenr to it
        comboBox.addActionListener(this);
        
        // There is are a ton of different methods that we can utilize

        // Here is one setEditable = allows the user to pick fields through just name but can also allow them to make up there own fields
        // comboBox.setEditable(true);

        // This allows us to see how many items we may have
        System.out.println(comboBox.getItemCount());

        // This allows us to add another object to the combo list
        comboBox.addItem("Turtle");

        // This allows us to insert an object at a certain index
        comboBox.insertItemAt("Fish", 2);

        // We can also set the selected item
        // comboBox.setSelectedIndex(2); // It always selects the index we selected

        // We can also remove an item
        // comboBox.removeItem("Dog");
        // comboBox.removeItemAt(2);
        // comboBox.removeAllItems();


        
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox)
        {
            // Here, we are able to distinguish between the different fields and get the selected option and its index (good for using this to do something with)
            String selected = (String) comboBox.getSelectedItem();
            int inx = comboBox.getSelectedIndex();
            JOptionPane.showMessageDialog(null, "You Selected \"" + selected + "\"" + " Number: #" + inx, "How to use this program!", JOptionPane.PLAIN_MESSAGE);

        }
    }



}
 
