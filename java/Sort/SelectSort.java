public class SelectSort {

    public static void Select_Sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i; // 记录最小值的下标
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j; // 找出 i + 1 -> length 之间的最小值
                }
            }
            // 交换 当前索引 与 最小值索引
            if (i != minIndex) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
        // 遍历数组
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        String path = "Y:\\School\\AD\\ADA\\python\\EG.txt";
        Select_Sort(new ReadFileUtil().ReadArrayDoc(path));
    }
}