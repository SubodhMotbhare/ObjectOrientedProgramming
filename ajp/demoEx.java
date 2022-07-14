import java.awt.*;
public class demoEx extends Frame
{
demoEx()
{
Label L =new Label("Welcome To AWT java"); 
L.setBounds(200,200,100,100);
add(L);
setTitle("AWT");
setSize(1000,1000);
setLayout(null);
setVisible(true);
}
public static void main(String s[])
{
demoEx d=new demoEx();
}
}