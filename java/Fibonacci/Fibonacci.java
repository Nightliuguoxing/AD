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
        System.out.println("��n = " + n + " ʱ, ��Ϊ: " +fibonacci(n));
        long ens = System.nanoTime(), ems = System.currentTimeMillis();
        System.out.println("������ʱ: " + (ens - sns) + " ns");
        System.out.println("������ʱ: " + (ems - sms) + " ms");

    }
}