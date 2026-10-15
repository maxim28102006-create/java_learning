package week2;

public class Overload {
    static int max(int a, int b){
        int res = 0;
        if (a > b){
            res = a;
        }else{
            res = b;
        }
        return res;
    }



    static int max(int a, int b, int c){
        int ab = max(a, b);
        return max(ab, c);


    }

    static int max(int[] arr){
        int res = arr[0];
        for (int x : arr){
            if(x > res){
                res = x;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(max(3, 7));                  // 7
        System.out.println(max(4, 9, 2));               // 9
        System.out.println(max(new int[]{5, 1, 8, 3})); // 8
        System.out.println(max(new int[]{-4, -2, -9})); // -2
    }

}


