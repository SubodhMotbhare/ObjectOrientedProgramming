import java.awt.*;

public class association_1
{
association_1()
{
Frame fr=new Frame();
Choice c1=new Choice();
Choice c2=new Choice();
c1.setBounds(50,50,50,50);
c2.setBounds(105,50,50,50);
c1.add("AJP");
c1.add("STE");
c1.add("OSY");
c2.add("Ist");
c2.add("IInd");
c2.add("IIIrd");
fr.add(c1);
fr.add(c2);
fr.setTitle("assoiciation Example");
fr.setSize(800,800);
fr.setLayout(null);
fr.setVisible(true);
}
public static void main(String s[])
{
association_1 a=new association_1();
}
}