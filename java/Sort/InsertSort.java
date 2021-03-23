public class InsertSort {

    public static void InsertSort(int[] ary) {
        int temp = 0;
        for (int i = 1; i < ary.length; i++) {
            int j = i - 1;
            temp = ary[i];
            for (; j >= 0 && temp < ary[j]; j--) {
                ary[j + 1] = ary[j];
            }
            ary[j + 1] = temp;
        }

        for (int i : ary) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] ary = { 1, 5, 2, 23, 2, 6, 26, 7, 7, 8, 34 };
        InsertSort(ary);
    }
}