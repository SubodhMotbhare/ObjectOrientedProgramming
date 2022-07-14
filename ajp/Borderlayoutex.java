import java.awt.*;

public class Borderlayoutex extends Frame {
	Borderlayoutex() {
		CheckboxGroup c = new CheckboxGroup();
		Checkbox c1 = new Checkbox("OSY", true, c);
		Checkbox c2 = new Checkbox("AJP", true, c);
		Checkbox c3 = new Checkbox("STE", true, c);
		Checkbox c4 = new Checkbox("EVN", true, c);
		Checkbox c5 = new Checkbox("ACN", true, c);
		BorderLayout b = new BorderLayout(300, 300);
		setLayout(b);
		add(c1, BorderLayout.EAST);
		add(c2, BorderLayout.WEST);
		add(c3, BorderLayout.CENTER);
		add(c4, BorderLayout.SOUTH);
		add(c5, BorderLayout.NORTH);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String s[]) {
		Borderlayoutex c = new Borderlayoutex();
	}
}
