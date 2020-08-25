import Systems.GamePanel;

import javax.swing.*;

public class Window extends JFrame {
    public Window (){
        setTitle("The Flying Puppy");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new GamePanel(800,600));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
