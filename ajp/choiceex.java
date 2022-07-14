import java.awt.*;
import java.applet.*;
/*
<applet code="choiceex"width="400" height="500"></applet>
*/
public class choiceex extends Applet
{
public void init()
{
Label l= new Label("select:");
//l.setBounds(10,10,40,40);
Choice c=new Choice();
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
//c.setBounds(10,10,40,40);
//setTitle("Choice Peogram");
//setSize(800,800);
//setLayout(null);
//setVisible(true);
}

}

