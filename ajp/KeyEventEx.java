import java.awt.*;
import java.awt.event.*;

public class KeyEventEx extends Frame implements KeyListener
{
Label L;
KeyEventEx()
{
L=new Label();
add(L);
L.setBounds(150,100,150,30);
addKeyListener(this);
setSize(600,600);
setLayout(null);
setVisible(true);
}
public void keyPressed(KeyEvent k)
{
L.setText("Keybord Press");
}
public void keyReleased(KeyEvent k)
{
L.setText("Keybord release");
}
public void keyTyped(KeyEvent k)
{
L.setText("Keybord Type");
}
public static void main(String s[])
{
KeyEventEx g=new KeyEventEx();
}
}