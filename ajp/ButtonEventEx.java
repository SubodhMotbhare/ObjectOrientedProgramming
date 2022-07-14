import java.awt.*;
import java.awt.event.*;

public class ButtonEventEx extends Frame implements ActionListener
{
Button B1,B2,B3;
ButtonEventEx()
{
B1=new Button("Red");
B2=new Button("Green");
B3=new Button("Yellow");
add(B1); add(B2); add(B3);
B1.setBounds(50,50,50,20);
B2.setBounds(110,50,50,20);
B3.setBounds(170,50,50,20);
B1.addActionListener(this);
B2.addActionListener(this);
B3.addActionListener(this);
setSize(600,600);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent A)
{
Graphics g=getGraphics();
if(A.getSource()==B1)
{
g.setBackGround(Color.RED);
}
if(A.getSource()==B2)
{
g.setBackGround(Color.GREEN);
}
else
{
g.setBackGround(Color.BLUE);
}
}
public static void main(String s[])
{
ButtonEventEx a=new ButtonEventEx();
}
}