public class Fibonacci {

    public static long fibonacci(Long n){
        if (n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        long sns = System.nanoTime(), sms = System.currentTimeMillis();
        long n = 42;
        System.out.println("当n = " + n + " 时, 数为: " +fibonacci(n));
        long ens = System.nanoTime(), ems = System.currentTimeMillis();
        System.out.println("纳秒用时: " + (ens - sns) + " ns");
        System.out.println("毫秒用时: " + (ems - sms) + " ms");

    }
}