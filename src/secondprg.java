import java.util.Arrays;
import java.util.Scanner;

public class secondprg {
	int target;
	int arr[];
	public secondprg(int n) {
		target=0;
		arr=new int[n];
		
	}
	public void getData() {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter Array Element = ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Sc.nextInt();
		}
		System.out.print("Enter Target sum = ");
		target=Sc.nextInt();
		
	}
	public int[] sum() {
		int[] ans=new int[0];
		int i=0,j=arr.length-1;
		Arrays.sort(arr);
		while(i<j) {
			int op=arr[i]+arr[j];
			if(op>target) {
				j--;
			}else if(op<target) {
				i++;
			}else {
				if(arr[i]==arr[j]) {
					return ans;
				}
				return ans=new int[] {arr[i],arr[j]};
			}
		}
		return ans=new int[] {};
		
	}

	public static void main(String[] args) {
		int n;
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter the number of element in array = ");
		n=Sc.nextInt();
		secondprg S1=new secondprg(n);
		S1.getData();
		int ans[]=S1.sum();
		System.out.print("Pair are = "+ Arrays.toString(ans));
	}

}