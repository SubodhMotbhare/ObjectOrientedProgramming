import java.awt.*;
import java.awt.event.*;

public class ItemEventEx extends Frame implements ItemListener
{
Label L1;
List LS;
ItemEventEx()
{
L1=new Label();
LS=new List(5);
LS.add("Latur");
LS.add("Nanded");
LS.add("Pune");
LS.add("Osmanabad");
add(L1); add(LS);
L1.setBounds(50,50,80,20);
LS.setBounds(140,90,100,20);
LS.addItemListener(this);
setLayout(null);
setVisible(true);
setSize(700,700);
}
public void itemStateChanged(ItemEvent I)
{
L1.setText(LS.getSelectedItem());
}
public static void main(String s[])
{
ItemEventEx I=new ItemEventEx();
}
}