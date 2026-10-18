package week2;

public class FromMemory {
    static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));

        }
        return sb.toString();
    }
    static String removeSpaces(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }

    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static String merge(String w1, String w2){
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(w1.length(), w2.length());
        for (int i = 0; i < maxLen; i++){
            if(i < w1.length()){
                sb.append(w1.charAt(i));
            }
            if(i < w2.length()){
                sb.append(w2.charAt(i));
            }
        }
        return sb.toString();

    }

    static boolean validPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String clear = sb.toString();
        int left = 0;
        int right = clear.length() - 1;
        while (left < right){
            if (clear.charAt(left) != clear.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    static int diagonalSum(int[][] mat){
        int n = mat.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[i][n-1-i];
        }
        if (n % 2 != 0){
            int x = n / 2;
            sum -= mat[x][x];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(reverse("abc"));                                  // cba
        System.out.println(removeSpaces("a b c"));                           // abc
        System.out.println(isPalindrome("level"));                           // true
        System.out.println(isPalindrome("abc"));                             // false
        System.out.println(merge("abc", "pqr"));                             // apbqcr
        System.out.println(merge("ab", "pqrs"));                             // apbqrs
        System.out.println(validPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(validPalindrome("race a car"));                   // false
        System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}})); // 25
    }



}
