import java.awt.*;
import java.awt.event.*;

public class ButtonEventEx2 extends Frame implements ActionListener
{
TextField T1,T2;
Button B1;
Label L1;
public ButtonEventEx2()
{
L1=new Label("Enter the text  =");
T1=new TextField("Hello");
T2=new TextField();
B1=new Button("Ok");
L1.setBounds(50,50,100,20);
T1.setBounds(150,50,70,20);
B1.setBounds(50,90,100,20);
T2.setBounds(150,90,70,20);
add(L1); add(T1); add(T2); add(B1);
B1.addActionListener(this);
setSize(600,600);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent AE)
{
T2.setText(T1.getText());
}
public static void main(String s[])
{
ButtonEventEx2 b= new ButtonEventEx2();
}
}