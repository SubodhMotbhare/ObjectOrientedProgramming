import javax.swing.*;
import java.awt.*;

public class JButton_JRadioButton_JCheckbox extends JFrame
{
JButton_JRadioButton_JCheckbox()
{
JButton B1=new JButton("OK");
B1.setToolTipText("IT's Button");
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
JScrollPane JS=new JScrollPane(B1,v,h);
JCheckBox C1=new JCheckBox("AJP",false);
JRadioButton R1=new JRadioButton("DBMS",false);
JRadioButton R2=new JRadioButton("OOP",true);
JRadioButton R3=new JRadioButton("DTE",false);
JRadioButton R4=new JRadioButton("CGR",false);
B1.setBounds(50,50,100,30);
C1.setBounds(50,90,100,30);
R1.setBounds(50,130,100,30); 
R2.setBounds(160,130,100,30);
R3.setBounds(50,170,100,30);
R4.setBounds(160,170,100,30);
add(B1);
add(JS);
add(C1);
add(R1); add(R2); add(R3); add(R4);
ButtonGroup BG=new ButtonGroup();
BG.add(R1);
BG.add(R2);
BG.add(R3);
BG.add(R4);
setVisible(true);
setLayout(null);
setSize(1000,1000);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String s[])
{
JButton_JRadioButton_JCheckbox j=new JButton_JRadioButton_JCheckbox();
}
}