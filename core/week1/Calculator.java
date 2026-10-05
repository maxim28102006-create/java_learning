package week1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("введите первое число: ");
        double x1 = sc.nextDouble();

        System.out.print("введите второе число: ");
        double x2 = sc.nextDouble();

        System.out.println("Сумма " + (x1 + x2));
        System.out.println("Разность" + (x1 - x2));
        System.out.println("Произведение" + (x1 * x2));
        if (x2 == 0) {
            System.out.println("на ноль делить нельзя");
        } else {
            System.out.println("Частное" + (x1 / x2));
        }
    }
}