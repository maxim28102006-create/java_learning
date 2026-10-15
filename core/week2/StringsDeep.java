package week2;

public class StringsDeep {

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

    static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static String removeSpaces(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));   // true
        System.out.println(isPalindrome("abba"));    // true
        System.out.println(isPalindrome("hello"));   // false
        System.out.println(isPalindrome("a"));       // true
        System.out.println(reverse("Hello"));   // olleH
        System.out.println(reverse("Java"));    // avaJ
        System.out.println(removeSpaces("I love Java"));   // IloveJava
        System.out.println(removeSpaces("  a b  "));       // ab
        System.out.println(removeSpaces("Java"));          // Java
    }

}
