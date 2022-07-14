import javax.swing.*;
import java.awt.*;
public class JFrameEx extends JFrame
{
public JFrameEx()
{
Container ct=getContentPane();
JLabel JL=new JLabel("Swing programmes are started");
ct.add(JL);
JL.setBounds(50,50,100,20);
}
public static void main(String s[])
{
JFrameEx JF=new JFrameEx();
JF.setVisible(true);
JF.setSize(600,600);
JF.setTitle("JFrame2 example");
JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}