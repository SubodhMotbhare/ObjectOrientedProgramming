import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		int a, b;
		int ar[] = { 1, 2, 3, 4, 5, 6 };
		String ptr = null;
		int choice;
		do {
			System.out.println("1 for Arithmetic Exception ");
			System.out.println("2 for ArrayIndexOutOfBounds Exception ");
			System.out.println("3 for NullPointer Exception");
			System.out.println("");
			System.out.println("Enter Your choice = ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the value for a and b = ");
				a = sc.nextInt();
				b = sc.nextInt();
				try {
					System.out.println(a / b);
				} catch (ArithmeticException e) {
					System.out.println("You shouldn’t divide a number by zero.");
					System.out.println("");
				}
				break;

			case 2:
				try {
					System.out.println(ar[7]);
				} catch (ArrayIndexOutOfBoundsException e2) {
					System.out.println("OOPs!!!Array Index 7 out of bounds for length 6.");
					System.out.println("");
				}
				break;

			case 3:
				try {
					if (ptr.equals("gfg")) {
						System.out.println("Same");
					}
				} catch (NullPointerException e3) {
					System.out.println("Null Pointer Exception arises!!");
					System.out.println("");
				}
				break;

			default:
				System.out.println("Wrong Choice");
			}
		} while (choice != 4);

	}
}
