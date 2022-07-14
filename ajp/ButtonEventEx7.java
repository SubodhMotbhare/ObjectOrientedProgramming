import java.awt.*;
import java.awt.event.*;

public class ButtonEventEx7 extends Frame implements ActionListener
{
TextField T1,T2;
Button b1;
Label L1;
ButtonEventEx7()
{
L1=new Label("Enter name");
T1=new TextField("Subodh");
b1=new Button("ok");
T2=new TextField();
add(L1);
add(T1); add(b1);
add(T2);
L1.setBounds(50,50,100,30);
T1.setBounds(150,50,70,30);
b1.setBounds(50,90,40,30);
T2.setBounds(150,90,70,30);
b1.addActionListener(this);
setSize(800,800);
setLayout(null);
setVisible(true);
//setTitle("Event handling example");
}
public void actionPerformed(ActionEvent a)
{
T2.setText(T1.getText());
}
public static void main(String s[])
{
ButtonEventEx7 d=new ButtonEventEx7();
}
}