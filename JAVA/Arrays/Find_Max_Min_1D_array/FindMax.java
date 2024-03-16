import java.util.*;
class FindMax{ 
}
class Array_input{
	Array_input(int []nums, int n){
		Scanner sc = new Scanner(System.in);
		//System.out.println(Arrays.toString(nums));
		for(int i=0;i<n;i++){
			System.out.print("Array("+i+"): ");
			nums[i]=sc.nextInt();
		}
		System.out.println("Raw - Array\n"+Arrays.toString(nums));
	}
}
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array(n): ");
		int n=sc.nextInt();
		int nums[] = new int[n];
		Array_input a = new Array_input(nums, n);
		System.out.println("Raw - Array\n"+Arrays.toString(nums));
	}
}