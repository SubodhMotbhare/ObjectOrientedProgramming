
import java.awt.*;
public class bdemo extends Frame
{
 bdemo()
 {
   Button b1=new Button("B1");
   Button b2=new Button("B2");
   Button b3=new Button("B3");
   Button b4=new Button("B4");
   Button b5=new Button("B5");
   BorderLayout bl=new BorderLayout();
   setLayout(bl);
   add(b1,BorderLayout.NORTH);
   add(b2,BorderLayout.WEST);
   add(b3,BorderLayout.SOUTH);
   add(b4,BorderLayout.EAST);
   add(b5,BorderLayout.CENTER);
   setSize(500,500);
setTitle("BorderLayout Example");
   setVisible(true);
}
public static void main(String s[])
{
bdemo b=new bdemo();
}
}