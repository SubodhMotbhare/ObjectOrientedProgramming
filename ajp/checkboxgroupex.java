import java.awt.*;

public class checkboxgroupex extends Frame
{
checkboxgroupex()
{
Checkbox c1=new Checkbox("OSY");
Checkbox c2=new Checkbox("AJP");
Checkbox c3=new Checkbox("STE");
Checkbox c4=new Checkbox("EVN");
Checkbox c5=new Checkbox("ACN");
add(c1); add(c2); add(c3); add(c4); add(c5); 
c1.setBounds(50,50,50,30);
c2.setBounds(50,90,50,30);
c3.setBounds(50,130,50,30);
c4.setBounds(50,170,50,30);
c5.setBounds(50,210,50,30);
setSize(500,500);
setLayout(null);
setVisible(true);
}
public static void main(String s[])
{
 c=new checkboxgroupex();
}
}