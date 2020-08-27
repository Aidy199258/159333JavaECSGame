import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Game_Panel extends JPanel {

    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 1500, HEIGHT = 1000;

    public Game_Panel() {


        setFocusable(true);
        setBackground(Color.black);

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        //System.out.println(isInMenu);
    }
}
