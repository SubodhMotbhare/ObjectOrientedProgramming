import java.awt.*;

public class association_2
{
association_2()
{
Frame fr=new Frame();
Label L1=new Label("Name:-");
Label L2=new Label("Mo No:-");
TextField T1=new TextField();
TextField T2=new TextField();
L1.setBounds(30,30,50,20);
T1.setBounds(85,30,50,20);
L2.setBounds(30,55,50,20);
T2.setBounds(85,55,50,20);
fr.add(L1);
fr.add(L2);
fr.add(T1);
fr.add(T2);
fr.setSize(800,800);
fr.setTitle("Association Example");
fr.setLayout(null);
fr.setVisible(true);
}
public static void main(String s[])
{
association_2 a=new association_2();
}
}