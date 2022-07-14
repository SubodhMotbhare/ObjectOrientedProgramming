import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="ButtonEventEx4" width="600" height="600"></applet>*/

public class ButtonEventEx4 extends Applet implements ActionListener
{
TextField T1,T2,T3;
Button B1;
public void init()
{
T1=new TextField();
T2=new TextField();
T3=new TextField();
B1=new Button("ADD");
add(T1); add(T2); add(T3); add(B1);
B1.addActionListener(this);
}
public void actionPerformed(ActionEvent A)
{
int n1,n2,n3;
String s;
n1=Integer.parseInt(T1.getText());
n2=Integer.parseInt(T2.getText());
n3=n1+n2;
T3.setText(n3);
}
}