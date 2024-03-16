import java.util.*;
class getMax{
	static int[] Find_Maximum_Element(int []nums, int start, int end){
		/* max[ element_index, element_value] */
		int []max=new int[2];
		int max_element = nums[0];
		for(int i=start; i<=end; i++){
			if(max_element<nums[i]){
				max_element=nums[i];
				max[0]=i;
			}
		}
		max[1]=max_element;
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
class Swap{
	Swap(int []nums,int index_1, int index_2){
		/* // x=4 , y=5
		x = x+y; // = 4+5 = 9
		y = x-y; // = 9-5 = 4
		x = x-y; // = 9-4 = 5 */
		int temp = nums[index_1];
		nums[index_1] = nums[index_2];
		nums[index_2] = temp;
	}
}
class Selection_Sort{
	
	public void Sort(int []nums, int n){
		int max[]=new int[2];
		for(int i=(n-1); i>=0; --i){
			
			int start_index=0; // start always with 0th index - because sorting the array from last element
			
			int end_index=i;
			
			// find maximum element from the unsorted array (⬇⬇⬇⬇)
			max = getMax.Find_Maximum_Element(nums, start_index,end_index);
			
			// max[0] = maximun element index of the remaining array
			Swap s=new Swap(nums,max[0],end_index);
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
		Selection_Sort s=new Selection_Sort();
		s.Sort(nums,n);
		System.out.println("After Sorting the array is: "+Arrays.toString(nums));
	}
}