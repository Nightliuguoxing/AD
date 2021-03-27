public class InsertSort {

    public static void Insert_Sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            // 若第i个元素大于i-1元素则直接插入,反之
            if(nums[i] < nums[i - 1]){
                int j = i - 1;
                int temp = nums[i];
                // 采用顺序方式查找插入方式,查找同时元素后移
                while(j > -1 && temp < nums[j]){
                    nums[j + 1] = nums[j];
                    j--;
                }
                // 放入正确位置
                nums[j + 1] = temp;
            }
        }

        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        String path = "Y:\\School\\AD\\ADA\\python\\EG.txt";
        Insert_Sort(new ReadFileUtil().ReadArrayDoc(path));
    }
}