import java.util.*;
class Array_Input{
    static int [] numsIO(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int []nums=new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("Enter Array("+i+"): ");
            nums[i]=sc.nextInt();
        }
        return nums;
    }
}
class Swap{
    static void swap(int []nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
class Insertion_Sort{
    static int []Sort(int []nums, int n){
       
        for (int i=0; i<=n-2; i++) {
            for (int j=i+1; j>=1; j--) { //This inner-Loop will terminate when 'j=0' then only.
                if(nums[j]<nums[j-1]){
                    Swap.swap(nums, j, j-1);
                }else{
                	break; // good practice
                }
            }
        }

        return nums;
    }
}
public class Main{
    public static void main(String []args){
        int []nums = Array_Input.numsIO();        
        // System.out.println(Arrays.toString(nums));
        System.out.println("Before sorting the array is: "+Arrays.toString(nums));
        int []sorted_nums=Insertion_Sort.Sort(nums, nums.length);
        System.out.println("After sorting the array is: "+Arrays.toString(sorted_nums));
    }
}