import javax.swing.JFrame;

public class MyFrame extends JFrame{
    
    DragPanel dragPanel = new DragPanel();

    MyFrame()
    {
        this.setTitle("Drag and Drop Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);

        this.add(dragPanel);

        this.setVisible(true);
    }

    

}
