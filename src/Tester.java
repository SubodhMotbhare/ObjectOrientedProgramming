import java.util.Scanner;

class shape{
	public void getInput() {
		
	}
	public  void setArea() {
		
	}
	
}

class trangle extends shape{
	int height, breadth; 
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height = ");
		height = sc.nextInt();
		System.out.println("Enter the breadth = ");
		breadth = sc.nextInt();	
		setArea(height,breadth);	
	}	
		
	void setArea(int h, int b) {
		System.out.println("Area of trangle is ="+ 0.5*h*b);
	}
	
}

class circle extends shape{
	float radius;
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius = ");
		radius = sc.nextFloat();		
		setArea(radius);
	}
	
	void setArea(float r) {
		System.out.println("Area of circle is ="+ 3.14*r*r);
	}	
}

class square extends shape{
	int side;
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side = ");
		side = sc.nextInt();
		setArea(side);
		
} 
	void setArea(int s) {
		System.out.println("Area of square is ="+ s*s);
	}
}
public class Tester {

	public static void main(String[] args) {
		trangle t =new trangle();
		t.getInput();
		
		circle c =new circle();
		c.getInput();
		
		square s =new square();
		s.getInput();

	}

}
