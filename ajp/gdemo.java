import java.awt.*;

class gdemo extends Frame
{
gdemo()
{
Button B1=new Button("Save");
Button B2=new Button("RESET");
setTitle("Gridexample");
GridLayout gl=new GridLayout(2,0);
setLayout(gl);
add(B1);
add(B2);
setSize(400,500);
setVisible(true);
}
public static void main(String s[])
{
gdemo d1=new gdemo();
}
}