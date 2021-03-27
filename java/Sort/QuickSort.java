public class QuickSort{

    public static void Quick_Sort(int[] nums, int L, int H){
        if(L > H){
            return; 
        }
        int i = L, j = H, temp = nums[L], t; 
        while(i < j){
            while(temp >= nums[i] && i < j) j--;
            while(temp >= nums[i] && i < j) i++;
            if(i < j){
                t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }
            nums[L] = nums[i];
            nums[i] = temp;
            Quick_Sort(nums, L, j - 1);
            Quick_Sort(nums, j + 1, H);
        }
    }

    public static void main(String[] args) {
        String path = "Y:\\School\\AD\\ADA\\python\\EG.txt";
        int[] nums = new ReadFileUtil().ReadArrayDoc(path);
        Quick_Sort(nums, 0, nums.length-1);
        
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}