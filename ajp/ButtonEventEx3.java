import java.awt.*;
import java.awt.event.*;

public class ButtonEventEx3 extends Frame implements ActionListener
{
TextField T1;
Button B1,B2;
public ButtonEventEx3()
{
T1=new TextField();
B1=new Button("Ok");
B2=new Button("Cancel");
T1.setBounds(50,50,150,30);
B1.setBounds(50,90,70,30);
B2.setBounds(130,90,70,30);
add(T1); add(B1); add(B2);
B1.addActionListener(this);
B2.addActionListener(this);
setSize(600,600);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent AE)
{
if(AE.getSource()==B1)
{
T1.setText("you have clicked ok");
}
if(AE.getSource()==B2)
{
T1.setText("you have clicked Clear");
}
}
public static void main(String s[])
{
ButtonEventEx3 b= new ButtonEventEx3();
}
}