import java.util.Scanner;

public class Main {

    public void maxSubAry(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            for( int j = i; j < nums.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += nums[k];
                }
                if (sum > max) max = sum;
            }
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