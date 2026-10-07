package arrays;

public class CountEven {
    public static void main(String[] args){
        int[] a = {4, -2, 9, 0, 7, -5};
        int evenCount = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                evenCount = evenCount + 1;
            }
        }
        System.out.println(evenCount);
    }
}
