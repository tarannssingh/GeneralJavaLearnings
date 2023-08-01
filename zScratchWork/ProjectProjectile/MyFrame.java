import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame {

    // These variables make it easier to see what is editable
    static int FRAME_WIDTH = 1200;
    static int FRAME_HEIGHT = (int)(FRAME_WIDTH * 0.5) ;


    // These are the three panels being set up 
    PanelDash dash;
    PanelGround ground;
    PanelProj proj;

    // Menu bars and there items
    JMenuBar menuBar;
    
    JMenuItem viewMenu;
    JMenuItem editMenu;
    JMenuItem createMenu;
    JMenuItem saveMenu;

    MyFrame()
    {
        // These are the basic Frame settings
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Project Projectile");
        this.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        // Setting up and adding the panels
        dash = new PanelDash();
        ground = new PanelGround(); 
        proj = new PanelProj();
        this.add(dash, BorderLayout.NORTH);
        this.add(ground, BorderLayout.SOUTH); 
        this.add(proj, BorderLayout.CENTER);


        // Menu Bar
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        viewMenu = new JMenu("View");
        editMenu = new JMenu("Edit");
        createMenu = new JMenu("Create");
        saveMenu = new JMenu("Save");

        menuBar.add(viewMenu);
        menuBar.add(editMenu);
        menuBar.add(createMenu);
        menuBar.add(saveMenu);


        // All of the funcationality should be in this specfic panels. The frame just houses them
        // this.pack();
        
        this.setVisible(true);


    }
    
}
