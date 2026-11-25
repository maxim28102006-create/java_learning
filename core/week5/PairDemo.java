package week5;

public class PairDemo {
    static Pair<Integer, Integer> minMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new Pair<>(min, max);
    }
    public static void main(String[] args){
        Pair<String, Integer> p1 = new Pair<>("Макс", 20);
        Pair<Integer, Boolean> p2 = new Pair<>(7, true);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(minMax(new int[]{5, 2, 9, 1, 7}));
    }

}
