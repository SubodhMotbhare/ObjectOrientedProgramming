import javax.swing.*;
import java.awt.*;
public class ImageIconEx extends JFrame
{
public ImageIconEx()
{
Container ct=getContentPane();
ImageIcon N=new ImageIcon("team.jpg");
ct.add(N);
}
public static void main(String s[])
{
ImageIconEx JF=new ImageIconEx();
JF.setVisible(true);
JF.setSize(600,600);
JF.setTitle("JFrame2 example");
JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}