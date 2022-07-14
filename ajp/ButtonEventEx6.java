import java.awt.*;
import java.awt.event.*;

public class ButtonEventEx6 extends Frame implements ActionListener
{
TextField T1;
Button b1;
ButtonEventEx6()
{
T1=new TextField("Motbhare Subodh Uddhav");
b1=new Button("Reset");
add(T1); add(b1);
T1.setBounds(50,50,170,20);
b1.setBounds(50,80,70,20);
b1.addActionListener(this);
setSize(800,800);
setLayout(null);
setVisible(true);
//setTitle("Event handling example");
}
public void actionPerformed(ActionEvent a)
{
T1.setText(" ");
}
public static void main(String s[])
{
ButtonEventEx6 d=new ButtonEventEx6();
}
}