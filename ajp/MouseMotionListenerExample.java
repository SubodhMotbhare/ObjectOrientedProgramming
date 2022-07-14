import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample extends Frame implements MouseMotionListener
{
Label L1;
MouseMotionListenerExample()
{
L1=new Label();
add(L1);
L1.setBounds(50,50,100,50);
L1.addMouseMotionListener(this);
setSize(500,500);
setVisible(true);
setLayout(null);
}
public void mouseDragged(MouseEvent v)
{
Graphics g=getGraphics();
g.setColor(Color.yellow);
g.drawRect(v.getX(),v.getY(),20,20);
}
public void mouseMoved(MouseEvent v)
{
L1.setText("Mouse Is Moved");
}
public static void main(String s[])
{
MouseMotionListenerExample L=new MouseMotionListenerExample();
}
}










