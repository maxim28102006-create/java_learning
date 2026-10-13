package week2;
import java.util.Arrays;
public class Matrix {

    public static int[] colSums(int[][] m) {
        int[] result = new int[m[0].length];


        for (int col = 0; col < m[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < m.length; row++) {
                sum = sum + m[row][col]; //
            }


            result[col] = sum;
        }


        return result;
    }


    static int maxElement(int[][] m){
        int max = m[0][0];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (m[i][j] > max){
                    max = m[i][j];
                }
            }
        }
        return max;
    }






    static int sumAll(int[][] m){
        int sum = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                sum = sum + m[i][j];

            }
        }
        return sum;

    }





    public static void main(String[] args){
        int[][] m = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(m[2][1]);
        System.out.println(m.length);
        System.out.println(m[0].length);
        System.out.println(m[1][0] + m[0][1]);
        System.out.println(sumAll(m));   // 78
        int[][] neg = {
                {-5, -3},
                {-8, -1}
        };
        System.out.println(maxElement(m));    // 12
        System.out.println(maxElement(neg));  // -1
        System.out.println(Arrays.toString(colSums(m)));

    }
}
