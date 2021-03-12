public class T0308 {
    public static void main(String[] args) {
        int sum = 0;
        long startTime = System.currentTimeMillis();
        for(int i = 1 ; i < 1000000; i++){
            sum *= i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }
}