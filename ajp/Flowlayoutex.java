import java.awt.*;

public class Flowlayoutex extends Frame
{
Flowlayoutex()
{
Label L1=new Label("Login");
Label L2=new Label("Username");
Label L3=new Label("Password");
TextField T1=new TextField();
TextField T2=new TextField();
Button B1=new Button("Submit");
FlowLayout f=new FlowLayout();
add(L1,FlowLayout.CENTER);
add(L2,FlowLayout.CENTER);
add(T1,FlowLayout.CENTER);
add(L3,FlowLayout.CENTER);
add(T2,FlowLayout.CENTER);
add(B1,FlowLayout.CENTER);
setLayout(f);
setSize(500,500);
setVisible(true);
}
public static void main(String s[])
{
Flowlayoutex fl=new Flowlayoutex();
}
}