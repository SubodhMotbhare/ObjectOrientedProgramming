import java.awt.*;
class button_ex extends Frame
{
button_ex()
{
Button b1=new Button("ok");
b1.setBounds(200,200,100,100);
Button b2=new Button();
b2.setBounds(100,100,100,100);
b2.setLabel("SUBMIT");
//int c=b1.getLabel();
add(b1);
add(b2);
setLayout(null);
setSize(1000,1000);
 setVisible(true); 
 setTitle ("Button Example");
}
public static void main(String s[])
{
button_ex d=new button_ex();
}
}