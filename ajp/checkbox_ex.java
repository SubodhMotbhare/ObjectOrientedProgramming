import java.awt.*;

public class checkbox_ex extends Frame
{
checkbox_ex()
{
Checkbox c1=new Checkbox();
c1.setBounds(100,100,100,100);
Checkbox c2=new Checkbox("Green");
c2.setBounds(100,200,100,100);
Checkbox c3=new Checkbox("Red",true);
c3.setBounds(100,300,100,100);
c1.setLabel("Blue");
c1.setState(false);
add(c1);
add(c2);
add(c3);
setTitle("Checkbox example");
setSize(1000,1000);
setLayout(null);
setVisible(true);
}
public static void main(String s[])
{
checkbox_ex c=new checkbox_ex();
}
}