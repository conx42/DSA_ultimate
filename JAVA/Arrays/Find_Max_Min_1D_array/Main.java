import java.util.*;
/* 
comment - ctrl+shift+q
comment - ctrl+q
comment - ctrl+k
comment - ctrl+shift+k
*/
class FindMax{
	int Find_Maximum_Element(int []nums, int n){
		int max=nums[0];
		for(int i=0; i<n; i++){
			if(max<nums[i]){
				max=nums[i];
			}
		}
		return max;
	}
}
class Array_input{
	Array_input(int []nums, int n){
		Scanner sc = new Scanner(System.in);
		//System.out.println(Arrays.toString(nums));
		for(int i=0;i<n;i++){
			System.out.print("Array("+i+"): ");
			nums[i]=sc.nextInt();
			/* System.out.println("Raw - Array\n"+Arrays.toString(nums)); */
		}
	}
}
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array(n): ");
		int n=sc.nextInt();
		int nums[] = new int[n];
		Array_input a = new Array_input(nums, n);
		FindMax f = new FindMax();
		int max = f.Find_Maximum_Element(nums, n);
		System.out.print("In your Array "+Arrays.toString(nums)+" The maximum element is: ");
		System.out.println(max);
	}
}