package week1;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int x = sc.nextInt();

        switch (x) {
            case 1 -> System.out.println("ужасно");
            case 2 -> System.out.println("плохо");
            case 3 -> System.out.println("удовлетворительно");
            case 4 -> System.out.println("хорошо");
            case 5 -> System.out.println("отлично");


        }
    }
}
