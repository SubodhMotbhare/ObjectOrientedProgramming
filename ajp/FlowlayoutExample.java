import java.awt.*;

public class FlowlayoutExample extends Frame 
{
FlowlayoutExample()
{
Label L1=new Label("Cricket is a bat-and-ball game played between two teams of eleven players on a field");
Label L2=new Label("Forms of cricket ran all-white kissed leather with a slightly raised sewn seam enclosing a cork core layered with tightly wound string.");
Label L3=new Label("Given Derrick's age,icket children's game is reinfocricket");
FlowLayout f=new FlowLayout();
setLayout(f);
add(L1,FlowLayout.LEFT);
add(L2,FlowLayout.CENTER);
add(L3,FlowLayout.RIGHT);
setSize(500,500);
setVisible(true);
}
public static void main(String s[])
{
FlowlayoutExample Ex=new FlowlayoutExample();
}
}