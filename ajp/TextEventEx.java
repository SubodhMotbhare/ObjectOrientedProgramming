import java.awt.*;
import java.awt.event.*;

public class TextEventEx extends Frame implements TextListener
{
TextField T1,T2;
TextEventEx()
{
T1=new TextField();
T2=new TextField();
T1.setBounds(100,50,80,20);
T2.setBounds(190,50,80,20);
add(T1); add(T2);
T1.addTextListener(this);
setSize(600,600);
setVisible(true);
setLayout(null);
}
public void textValueChanged(TextEvent obj)
{
T2.setText(T1.getText());
}
public static void main(String s[])
{
TextEventEx t=new TextEventEx();
}
}