import java.awt.*;
import java.applet.*;
/*<applet code="FontEx" width="500" height="1000"></applet> */
public class FontEx extends Applet
{
public void init()
{
Font f=new Font("IMPACT",Font.BOLD,50);
setFont(f);
Color c=new Color(25,160,54);
setForeground(c);
}
public void paint(Graphics g)
{

g.drawString("Motbhare Subodh Uddhav",50,50);
}
}
