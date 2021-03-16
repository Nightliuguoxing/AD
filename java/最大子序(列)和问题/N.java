import java.util.Scanner;

public class Main {

    public void maxSubAry(int[] nums){
        int max = nums[0], sum = 0;
        for (int num: nums) {
            sum = sum > 0 ? sum + num : num;
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int nums[] = new int[length];
        for (int i = 0; i < length; i++){
			nums[i] = Integer.parseInt(sc.next());
        }
        Main main = new Main();
        main.maxSubAry(nums);
        sc.close();
    }
}