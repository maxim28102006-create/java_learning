package arrays;
import java.util.Arrays;

public class IndexOfMax {
    public static void main(String[] args){
        int[] a = {4, -2, 9, 0, 7, -5};
        int max = a[0];
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);

    }
}
