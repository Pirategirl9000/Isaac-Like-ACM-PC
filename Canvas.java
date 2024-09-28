import javax.swing.*;
import java.awt.*;

public class Canvas extends JFrame {
    Canvas() {
        super("Canvas");
        Canvas c = new Canvas() {
            public void paint(Graphics g) {} //Used for initialization
        };

        c.setBackground(new Color(255, 255, 255));

        add(c); //Adds the canvas to the JFrame
        setSize(720, 720); //Should be a square room so why not a square JFrame
        setVisible(true);
    }
}