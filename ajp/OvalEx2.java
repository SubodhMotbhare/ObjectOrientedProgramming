import java.awt.*;
import java.applet.*;

/*<applet code="OvalEx2" width="800" height="600"></applet>*/

public class OvalEx2 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.YELLOW);
g.drawOval(250,250,50,50);

g.setColor(Color.RED);
g.drawOval(250,250,100,100);

g.setColor(Color.BLUE);
g.drawOval(250,250,150,150);

g.setColor(Color.GREEN);
g.drawOval(250,250,200,200);

g.setColor(Color.CYAN);
g.drawOval(250,250,250,250);

g.setColor(Color.GRAY);
g.drawOval(250,250,300,300);


}
}

