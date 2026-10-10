package loops;

public class MathUtils {

    static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    static long factorial(int n){
        long sum = 1;
        for (int i = 1; i <= n; i++){
            sum = sum * i;
        }
        return sum;
    }

    static int sumOfDigits(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }

        }
        return true;



    }



    public static void main(String[] args) {
        System.out.println(sumToN(5));
        System.out.println(sumToN(1));
        System.out.println(sumToN(100));
        System.out.println(factorial(5));
        System.out.println(factorial(0));
        System.out.println(factorial(20));
        System.out.println(sumOfDigits(234));
        System.out.println(sumOfDigits(0));
        System.out.println(sumOfDigits(1000));
        System.out.println(isPrime(1));    // false
        System.out.println(isPrime(2));    // true
        System.out.println(isPrime(9));    // false
        System.out.println(isPrime(17));   // true
        System.out.println(isPrime(97));   // true
        System.out.println(isPrime(100));  // false

        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }

        }
    }

}




