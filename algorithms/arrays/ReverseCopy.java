package arrays;

import java.util.Arrays;

public class ReverseCopy {
    public static void main(String[] args){
        int[] a = {4, -2, 9, 0, 7, -5};
        int[] reversed = new int[a.length];

        for (int i = 0; i < reversed.length; i++){
            reversed[a.length - 1 - i] = a[i];
        }
        System.out.println("Исходный: " + Arrays.toString(a));
        System.out.println("Развёрнутый: " + Arrays.toString(reversed));
    }
}
