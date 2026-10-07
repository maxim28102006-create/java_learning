package week1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber1{
    public static void main(String[] args){
        Random random = new Random();
        int y = random.nextInt(100) + 1;
        int user = 0;
        System.out.println("Загадал число " + y);
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        do {
            System.out.print("Введи число от 1 до 100: ");
            user = sc.nextInt();
            if (user > y){
                System.out.println("Меньше");
            } else if (user == y){
                System.out.println("Джекпот");
            } else {
                System.out.println("Больше");
            }
            attempts++;
        } while (user != y);
        System.out.println("Угадал за " + attempts + " попыток");
    }
}

