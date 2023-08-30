/* Design  an  applet  to  display  the  user  information  such  as  Roll  No., 
Name, Branch and Section in separate lines. */

import java.awt.*;

public class lab10q1 {

    public static void main(String[] args) {
        Frame frame = new Frame("User Information");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 1));

        String rollNo = "21051577";
        String name = "Manav Malhotra";
        String branch = "Computer Science";
        String section = "CSE 14";

        panel.add(new Label("Roll No.: " + rollNo));
        panel.add(new Label("Name: " + name));
        panel.add(new Label("Branch: " + branch));
        panel.add(new Label("Section: " + section));

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

}
