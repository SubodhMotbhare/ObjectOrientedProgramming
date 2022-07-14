import java.util.Scanner;

class Adder{
	 int arr[] ;
	 int targetsum = 0;
	
	
}


public class Array {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sizo of array = ");
		int size = sc.nextInt();
		int arr1[] = new int[100] ;
		System.out.println("Enter the array Elements = ");
		for(int i=0; i<size; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println(" array Elements = ");
		for(int i=0; i<size; i++)
		{
			System.out.println(arr1[i]);
		}
		
		
		

	}

}
