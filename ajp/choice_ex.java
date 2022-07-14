import java.awt.*;

public class choice_ex extends Frame
{
choice_ex()
{
Choice c=new Choice();
c.setBounds(100,100,140,140);
c.add("Latur");
c.add("Nanded");
c.add("Beed");
c.add("Osmanabad");
c.add("Parbhani");
c.add("Hingoli");
c.add("Aurangabad");
c.add("Jalna");
c.add("Solapur");
c.add("Kolhapur");
c.add("Pune");
c.add("Sangali");
c.add("Satara");
add(c);
Choice c1=new Choice();
c1.setBounds(100,200,140,140);
c1.add("Maharashtra");
c1.add("Rajsthan");
c1.add("Madhyapradesh");
c1.add("Uttarpradesh");
c1.add("Gujrat");
c1.add("Gova");
add(c1);
setTitle("Choice Peogram");
setSize(800,800);
setLayout(null);
setVisible(true);
}
public static void main(String s[])
{
choice_ex c1=new choice_ex();
}
}

