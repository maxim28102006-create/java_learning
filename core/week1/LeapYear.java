package week1;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
            System.out.println("Високосный");
        }  else {
            System.out.println("Не високосный");
        }
    }
}
