import java.awt.*;
public class checkboxmenuitem_ex extends Frame
{
 checkboxmenuitem_ex()
{
MenuBar m =new MenuBar();
setMenuBar(m);
Menu f=new Menu("File");
Menu e=new Menu("Edit");
Menu v=new Menu("view");
Menu s=new Menu("save"); 
m.add(f);
m.add(e);
m.add(v);
CheckboxMenuItem n=new CheckboxMenuItem("New",false);
CheckboxMenuItem o=new CheckboxMenuItem("Open",true);
//CheckboxMenuItem s=new CheckboxMenuItem("Save",true);
//Menu s 
f.add(n);
f.add(o); 
f.add(s);
CheckboxMenuItem sa=new CheckboxMenuItem("Save as",false);
CheckboxMenuItem ca=new CheckboxMenuItem("Cancel",false);
s.add(sa);
s.add(ca);
setTitle("CheckboxMenuItem Example");
setSize(1000,1000);
setVisible(true);
setLayout(null);
}
public static void main(String s[])
{
checkboxmenuitem_ex ex = new checkboxmenuitem_ex();
}
}


