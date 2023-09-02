/* Implement an applet which consists of two buttons named as RED and 
BLUE. When the user clicks RED button, a message “you have passed 
RED” will be displayed in the applet window. Similarly, when the user 
clicks BLUE button, a message “you have pressed BLUE” will be 
displayed in the applet window. */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class lab10q3 extends Applet implements ActionListener {
    private Button redButton;
    private Button blueButton;
    private String message = "";

    public void init() {
        redButton = new Button("RED");
        blueButton = new Button("BLUE");
        add(redButton);
        add(blueButton);
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
    }

    public void paint(Graphics g) { 
        g.drawString(message, 20, 100);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            message = "you have pressed RED";
        } else if (e.getSource() == blueButton) {
            message = "you have pressed BLUE";
        }
        repaint();
    }

    public static void main(String[] args) {
        lab10q3 demo = new lab10q3();
        demo.init();
        Frame f = new Frame("Button Demo");
        f.add(demo);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
