package week1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько чисел? ");
        int n = sc.nextInt();
        System.out.print("Введите числа: ");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for (int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }

    }
}
