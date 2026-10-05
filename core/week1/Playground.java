package week1;
import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int x = sc.nextInt();



        switch (x) {
            case 1 -> System.out.println("один");
            case 2 -> System.out.println("два");
            case 3, 4 -> System.out.println("хуйня");
            default -> System.out.println("что-то другое");
        }
        System.out.println("конец программы");
    }
}

