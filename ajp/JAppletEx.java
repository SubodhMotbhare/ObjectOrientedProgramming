import javax.swing.*;
import java.awt.*;
/* <applet code="JAppletEx" width=600 height=700 > </applet>*/
public class JAppletEx extends JApplet
{
public void start()
{
ImageIcon I1=new ImageIcon("C:\\Users\\motbh\\Pictures\\OIP.jpg");
JLabel JL=new JLabel("Good Evening",I1,JLabel.RIGHT);
add(JL);
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}