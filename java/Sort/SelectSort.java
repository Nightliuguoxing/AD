import java.util.Scanner;

public class SelectSort{

    public static void SelectSort(int[] ary){
        for(int i = 0; i < ary.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < ary.length; j++){
                if(ary[j] < ary[min]) min = j;
            }
            if (min != i){
                int temp = ary[min];
                ary[min] = ary[i];
                ary[i] = temp;
            }
        }

        for(int num : ary){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] ary = new int[length];
        for(int i = 0; i < length; i++){
            ary[i] = sc.nextInt();
        }
        sc.close();
        SelectSort(ary);
    }
}