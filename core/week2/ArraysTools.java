package week2;
import java.util.Arrays;
public class ArraysTools {

    static int secondLargest(int[] arr){
        int[] a = Arrays.copyOf(arr, arr.length);
        Arrays.sort(a);
        return a[a.length - 2];
    }







    public static void main(String[] args){
        int[] x = {4, -2, 9, 0, 7, -5};
        int[] arr = new int[6];
        Arrays.fill(arr, -1);
        System.out.println(Arrays.toString(arr));
        System.out.println(secondLargest(x));
        System.out.println(Arrays.toString(x));


    }


}
