import java.awt.*;
import java.awt.event.*;

public class MousedListenerExample extends Frame implements MouseListener
{
Label L1;
MousedListenerExample()
{
L1=new Label();
add(L1);
L1.setBounds(50,50,150,20);
L1.addMouseListener(this);
setSize(1000,1000);
setVisible(true);
setLayout(null);

}
public void mouseClicked(MouseEvent M)
{
L1.setText("Mouse Clicked");
}
public void mouseEntered(MouseEvent M)
{
L1.setText("Mouse Entered");
}
public void mouseExited(MouseEvent M)
{
L1.setText("Mouse Exited");
}
public void mousePressed(MouseEvent M)
{
L1.setText("Mouse Pressed");
}
public void mouseReleased(MouseEvent M)
{
L1.setText("Mouse Released");
}
public static void main(String S[])
{
MousedListenerExample d=new MousedListenerExample();
}
}








