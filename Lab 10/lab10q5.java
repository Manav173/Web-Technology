/* Design an applet to display a coloured smiley. */

import java.awt.*;
import javax.swing.*;

public class lab10q5 extends JApplet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.blue);
        g.fillOval(100, 100, 20, 20);
        g.fillOval(180, 100, 20, 20);
        g.drawArc(100, 150, 100, 50, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Applet");
        lab10q5 smileyApplet = new lab10q5();
        frame.add(smileyApplet);
        frame.setSize(300, 300);
        frame.setVisible(true);
        smileyApplet.init();
        smileyApplet.start();
    }
}
