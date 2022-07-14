import java.awt.*;

public class checkboxgroupex1 extends Frame
{
checkboxgroupex1()
{
CheckboxGroup c=new CheckboxGroup();
Checkbox c1=new Checkbox("OSY",true,c);
Checkbox c2=new Checkbox("AJP",true,c);
Checkbox c3=new Checkbox("STE",true,c);
Checkbox c4=new Checkbox("EVN",true,c);
Checkbox c5=new Checkbox("ACN",true,c);
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
public static void main (String s[])
{
checkboxgroupex1 c=new checkboxgroupex1();
}
}
