package loops;
import java.util.Scanner;
// Сложность О(логn) столько же итераций сколько и цифр
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Цифр " + sum);
    }

}
