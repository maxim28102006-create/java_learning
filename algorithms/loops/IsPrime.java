package loops;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = sc.nextInt();

        boolean found = false;


        for (int i = 2; i <= (n-1); i++){
            if (n % i == 0){
                found = true;
                System.out.println(n + " / " + i + " = 0 ");
                break;
            }
        }
        if (n < 2){
            System.out.println("Число не простое");
        } else if (found){
            System.out.println("  не простое");
        } else {
            System.out.println("простое");
        }
    }
}
