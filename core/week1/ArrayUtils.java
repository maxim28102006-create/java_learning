package week1;
import java.util.Arrays;

public class ArrayUtils {

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    static int[] reverse(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        return reversed;
    }

    static int countEven(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }











    public static void main(String[] args){
        int[] a = {4, -2, 9, 0, 7, -5};
        int[] b = {-3, -1, -7};

        System.out.println("max(a): " + max(a));
        System.out.println("max(b): " + max(b));
        System.out.println("min(a): " + min(a));
        System.out.println("min(b): " + min(b));
        System.out.println("Где 9: " + indexOf(a, 9));
        System.out.println("Где -5: " + indexOf(a, -5));
        System.out.println("Где 100: " + indexOf(a, 100));
        int[] r = reverse(a);
        System.out.println("reverse(a): " + Arrays.toString(r));
        System.out.println("a после: " + Arrays.toString(a));
        System.out.println(countEven(a));
        System.out.println(countEven(new int[]{1, 3, 5}));
        System.out.println(countEven(new int[]{}));
    }

}
