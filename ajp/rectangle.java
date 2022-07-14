import java.awt.*;
import java.applet.*;

/*<applet code="rectangle" width="800" height="800"></applet>*/
public class rectangle extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.yellow);
g.fillRect(0,0,100,100);

g.setColor(Color.red);
g.fillRect(100,100,100,100);

g.setColor(Color.blue);
g.fillRoundRect(200,200,200,200,5,5);

g.setColor(Color.green);
g.fillRoundRect(400,400,200,200,10,10);
}
}
