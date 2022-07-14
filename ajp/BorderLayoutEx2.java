import java.awt.*;

public class BorderLayoutEx2 extends Frame
{
BorderLayoutEx2()
{
Frame f=new Frame();
Label L1=new Label("Login");
Label L2=new Label("Username");
Label L3=new Label("Password");
TextField T1=new TextField();
TextField T2=new TextField();
Button B1=new Button("Submit");
BorderLayout BL=new BorderLayout();
f. setLayout(BL);
 f.add(L1,BorderLayout.NORTH);
f.add(L2,BorderLayout.WEST);
f.add(L3,BorderLayout.WEST);
f.add(T1,BorderLayout.EAST);
f.add(T2,BorderLayout.EAST);
f.add(B1,BorderLayout.SOUTH);
f.setTitle("Latur");
f.setSize(1000,1000);
f.setVisible(true);
}
public static void main(String s[])
{
BorderLayoutEx2 d=new BorderLayoutEx2();
}
}