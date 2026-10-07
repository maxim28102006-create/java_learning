package loops;
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите н ");

        long n = sc.nextLong();

        long sum = 1;
        for (int i = 1; i <= n; i++){
            sum = sum * i;
        }
        System.out.println("Результат " + sum);
    }
}
