import java.awt.*;
import java.awt.event.*;

public class TextEventEx2 extends Frame implements TextListener
{
TextField T1,T2;
TextEventEx2()
{
T1=new TextField();
T2=new TextField();
add(T1); add(T2);
T1.setBounds(50,50,50,20);
T2.setBounds(110,50,50,20);
T1.addTextListener(this);
setLayout(null);
setVisible(true);
setSize(600,600);
}
public void textValueChanged(TextEvent TE)
{
T2.setText(T1.getText());
}
public static void main(String s[])
{
TextEventEx2 t=new TextEventEx2();
}
}