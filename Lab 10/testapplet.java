import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.applet.Applet;
public class testapplet extends Applet implements ActionListener, TextListener
{
    String s,s1,s2;
    Button b1,b2;
    TextField t1,t2,t3;
    int a,b,c;
    public void init()
    {
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("Add");
        b2=new Button("Sub");
        GridLayout l1=new GridLayout(1,5);
        setLayout(l1);
        add(new JLabel("Input 1:"));
        add(t1);
        add(new JLabel("Input 2:"));
        add(t2);
        add(b1);
        add(b2);
        add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        s1=t1.getText();
        s2=t2.getText();
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        s=e.getActionCommand();
        if(s.equals("Add"))
        {
            c=a+b;
            t3.setText(String.valueOf(c));
        }
        else if(s.equals("Sub"))
        {
            c=a-b;
            t3.setText(String.valueOf(c));
        }
    }
    public void textValueChanged(TextEvent e) {
    }
    public static void main(String[] args) {
        
        testapplet houseApplet = new testapplet(); 
        houseApplet.init();
        JFrame frame = new JFrame("Calculator Applet");
        frame.getContentPane().add(houseApplet);
        frame.pack();
        frame.setVisible(true);
    }
}
