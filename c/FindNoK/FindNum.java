import java.util.*;

public class FindNum{

    public static Object[] Clean(int[] nums){
        Set set = new HashSet();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        return set.toArrray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k;
        n = in.nextInt();
        k = in.nextInt();
        System.out.println("n=" + n + "k=" + k);
        int[] nums = new int[100005];
        
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        Clean(nums);

        for(int num: nums){
            System.out.print(nums + " ");
        }
        in.close();
    }
}
