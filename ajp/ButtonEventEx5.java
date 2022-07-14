import java.awt.*;
import java.awt.event.*;

public class ButtonEventEx5 extends Frame implements ActionListener
{
TextField T1;
Button b1;
ButtonEventEx5()
{
T1=new TextField("");
b1=new Button("ok");
add(T1); add(b1);
T1.setBounds(50,50,70,20);
b1.setBounds(50,80,40,20);
b1.addActionListener(this);
setSize(800,800);
setLayout(null);
setVisible(true);
//setTitle("Event handling example");
}
public void actionPerformed(ActionEvent a)
{
T1.setText("Welcome");
}
public static void main(String s[])
{
ButtonEventEx5 d=new ButtonEventEx5();
}
}