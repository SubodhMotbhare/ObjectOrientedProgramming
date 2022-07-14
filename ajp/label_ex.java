import java.awt.*;

public class label_ex extends Frame
{
label_ex()
{
Label L1=new Label();
L1.setBounds(50,100,100,70);
L1.setText("CIVIL Engineering");
Label L2=new Label("Computer Engineering");
L2.setBounds(50,150,100,70);
Label L3=new Label("Mechnical Engineering",Label.RIGHT);
L3.setBounds(100,150,300,100);
add(L1); add(L2); add(L3);
setTitle("Label Example");
setLayout(null);
setSize(1000,1500);
setVisible(true);
}
public static void main(String s[])
{
label_ex l=new label_ex();
}
}