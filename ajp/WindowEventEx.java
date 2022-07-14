import java.awt.*;
import java.awt.event.*;

public class WindowEventEx extends Frame implements WindowListener
{
Label L;
WindowEventEx()
{
L=new Label();
L.setBounds(50,50,150,20);
add(L);
addWindowListener(this);
setSize(1000,1000);
setVisible(true);
setLayout(null);
}
public void windowOpened(WindowEvent obj)
{
L.setText("window is open");
}
public void windowClosed(WindowEvent obj)
{
L.setText("window is close");
}
public void windowActivated(WindowEvent obj)
{
L.setText("window is Activate");
}
public void windowDeactivated(WindowEvent obj)
{
L.setText("window is deactivate");
}
public void windowClosing(WindowEvent obj)
{
L.setText("window is closing");
}
public void windowIconified(WindowEvent obj)
{
L.setText("window is iconified");
}
public void windowDeiconified(WindowEvent obj)
{
L.setText("window is deiconified");
}
public static void main(String s[])
{
WindowEventEx c=new WindowEventEx();
}
}
