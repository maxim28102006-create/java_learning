package loops;
import java.util.Scanner;
// Итераций: n (i проходит от 1 до n)
// Сложность: O(n)
public class SumToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Сумма " + sum);

    }
}
