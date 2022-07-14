import java.awt.*;
import java.applet.*;
/*<applet code="RectangleEx" width="800" height="800"></applet>*/
public class RectangleEx extends Applet
{
public void init()
{
Color c1=new Color(255,0,0);
Color c2=new Color(255,255,255);
setBackground(c1);
setForeground(c2);
}
public void paint(Graphics g)
{
g.drawRect(50,50,50,50);
g.drawOval(110,50,50,50);
}
}