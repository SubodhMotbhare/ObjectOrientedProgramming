import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class demo6 extends Frame implements ActionListener
{
TextField T1,T2;
Button b1;
demo6()
{
T1=new TextField("Num");
T2=new TextField("Ans");
b1=new Button("Squareroot");
add(T1);  
add(T2); 
add(b1);
T1.setBounds(50,50,40,20);
T2.setBounds(100,50,40,20);
b1.setBounds(60,80,40,20);
b1.addActionListener(this);
setSize(1000,1000);
setVisible(true);
setLayout(null);
setTitle("Square root Programme");
}
public void actionPerformed(ActionEvent A)
{
int n, n1;
n=Integer.parseInt(T1.getText());
n1=Math.sqrt(n);
T2.setText(String.valueOf(n1));
}
public static void main(String s[])
{
demo6 d=new demo6();
}
}