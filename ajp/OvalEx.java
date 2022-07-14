import java.awt.*;
import java.applet.*;
/*<applet code="OvalEx" width="800" height="800"></applet>*/
public class OvalEx extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.RED);
g.fillOval(50,50,70,70);

g.setColor(Color.YELLOW);
g.fillOval(50,130,70,70);

g.setColor(Color.GREEN);
g.fillOval(50,210,70,70);
}
}