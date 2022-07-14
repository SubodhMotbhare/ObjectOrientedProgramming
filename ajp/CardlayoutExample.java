import java.awt.*;

public class CardlayoutExample extends Frame
{
CardlayoutExample()
{
CardLayout CL=new CardLayout();
setLayout(CL);
Label L1=new Label("Username");
Label L2=new Label("password");
TextField T1=new TextField();
TextField T2=new TextField();
Button B1=new Button("Login");
Button B2=new Button("Submit");
add(L1); add(T1); add(L2); add(T2); add(B1); add(B2);
first(L1);
last(B2);
setSize(600,600);
setVisible(true);
}
public static void main(String s[])
{
CardlayoutExample GL=new CardlayoutExample();
}
}