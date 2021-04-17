import java.util.*;
public class SelectSort {

    public static void Select_Sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i; 
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j; 
                }
            }
            
            if (i != minIndex) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
       
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = in.next();
            nums[i] = Integer.parseInt(str[i]);
        }

        for(int i = 0; i < n; i++){

        }
        Select_Sort(nums);
        in.close();
    }
}