import java.util.*;
class Array_input{
	Array_input(int []nums, int n){
		Scanner sc = new Scanner(System.in);
		//System.out.println(Arrays.toString(nums));
		for(int i=0;i<n;i++){
			System.out.print("Array("+i+"): ");
			nums[i]=sc.nextInt();
			/* System.out.println("Raw - Array\n"+Arrays.toString(nums)); */
		}
	}
}
class Swap{
	static void swap(int []nums,int index_1, int index_2){
		/* // x=4 , y=5
		x = x+y; // = 4+5 = 9
		y = x-y; // = 9-5 = 4
		x = x-y; // = 9-4 = 5 */
		int temp = nums[index_1];
		nums[index_1] = nums[index_2];
		nums[index_2] = temp;
	}
}
class Insertion_Sort{
	/*
		Intution of this Insertion Sort(Ascending Order) Algorithm is ->
	*/
	public void Sort(int []nums, int n){
		int flag=0;
		for(int i=0; i<=(n-2) && i>=0; i++){
			flag++;
			System.out.println("/***************************/");
			System.out.println("nums[i]: "+nums[i]);
			System.out.println("/***************************/");
			int j;
			for(j=(i+1); j>=0; --j){
				System.out.println("nums[i]: "+nums[i]);
				System.out.println("nums[j]: "+nums[j]);
				System.out.println("--------------------------------------");
				if(nums[i]>nums[j]){ // Ascending order sorting
					System.out.println("nums[i]: "+nums[i]+" nums[j]: "+nums[j]);
					System.out.println("nums[i]: "+nums[i]+" > nums[j]: "+nums[j]);
					Swap.swap(nums,i,j);
					System.out.println("nums[i]: "+nums[i]+" nums[j]: "+nums[j]);
					System.out.println("Now the array is: "+Arrays.toString(nums));
					System.out.println("xxxxxxxxxxxxxx--end--xxxxxxxxxxxxxxxxx");
				}else{
					System.out.println("nums[i]: "+nums[i]+"<<<else<<< nums[j]: "+nums[j]);
					// System.out.println("Now the array is: "+Arrays.toString(nums));
					break;
				}
				if(i>0){
					i--;
				}
			}
			// if (flag==10) {
			// 	System.exit(0);
			// }
		}
	}
}
public class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array(n): ");
		int n=sc.nextInt();
		int nums[] = new int[n];
		Array_input a = new Array_input(nums, n);
		System.out.println("Before Sorting the array is: "+Arrays.toString(nums));
		Insertion_Sort s=new Insertion_Sort();
		s.Sort(nums,n);
		System.out.println("After Sorting the array is: "+Arrays.toString(nums));
	}
}