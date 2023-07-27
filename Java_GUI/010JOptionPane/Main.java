import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args) {
        
        //JOptionPane ; This is a pop up box that prompts the user to do something or just informs them.

       // JOptionPane.showMessageDialog(null, "Here is some information: \nInformation\nMore Information\nEven More Information", "How to use this program!", JOptionPane.PLAIN_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Here is some more information: \nInformation\nMore Information\nEven More Information", "How to use this program!", JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Did you want some information?", "How to use this program!", JOptionPane.QUESTION_MESSAGE);
       // JOptionPane.showMessageDialog(null, "You have information!: \nInformation\nMore Information\nEven More Information", "How to use this program!", JOptionPane.WARNING_MESSAGE);
       // JOptionPane.showMessageDialog(null, "No More Infomration\nInformation\nMore Information\nEven More Information", "How to use this program!", JOptionPane.ERROR_MESSAGE);

        // make user pick a choice and returns a number representing the option
        // int answer = JOptionPane.showConfirmDialog(null, "Yes or No", "Choose Please", JOptionPane.YES_NO_CANCEL_OPTION);
        
        // This gets an input and returns it 
        // String name = JOptionPane.showInputDialog("What is your name??: ");
        // JOptionPane.showMessageDialog(null, "Hello " + name, "How to use this program!", JOptionPane.ERROR_MESSAGE);

        //Our own image 
        ImageIcon icon = new ImageIcon("purple.png");
        
        
        //Our own repsonses 
        String[] responses = {"*Blush*", "Thanks", "No, you are awsome"};        
        

        // This allows us to be more custom with our option window
        JOptionPane.showOptionDialog(
            null,
            "You are cool!",
            "Secret Message",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            responses,
            1);

        


    }

}