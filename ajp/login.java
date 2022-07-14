import java.awt.*;

public class login extends Frame
{
login()
{
Label L1=new Label("Login");
Label L2=new Label("Username");
Label L3=new Label("Password");
TextField T1=new TextField();
TextField T2=new TextField();
Button B1=new Button("Login");
Button B2=new Button("Reset");
T1.setText("Subodh");
T2.setText("Motbhare");
T2.setEchoChar('*');
add(L1);  add(L2); add(L3); add(T1); add(T2); add(B1); add(B2);
L1.setBounds(350,50,40,30);
L2.setBounds(80,80,80,30);
L3.setBounds(80,120,80,30);
T1.setBounds(120,80,100,30);
T2.setBounds(120,120,100,30);
B1.setBounds(80,180,80,30);
B2.setBounds(180,180,80,30);
setSize(800,800);
setTitle("Login Example");
setLayout(null);
setVisible(true);
}
public static void main(String s[])
{
login l=new login();
}
}