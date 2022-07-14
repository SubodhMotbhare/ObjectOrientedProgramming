import javax.swing.*;
import java.awt.*;

class JLabelEx extends JFrame 
{
JLabelEx()
{
ImageIcon I1=new ImageIcon("C:\\Users\\motbh\\Pictures\\OIP.jpg");
JLabel JL=new JLabel("Good Evening",I1,JLabel.RIGHT);
JL.setBounds(100,100,343,245);
add(JL);
setLayout(null);
setVisible(true);
setSize(600,600);
setTitle("JLabel Example");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String s[])
{
JLabelEx JL=new JLabelEx();
}
}
