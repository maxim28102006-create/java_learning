package week2;

public class StringBasics {
    static int countChar(String s, char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            }

        }
        return count;

    }

    static int countVowels(String s){
        int counts = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                counts++;
            }
        }
        return counts;
    }

    static void printReversed(String s){
        for (int i = s.length() - 1; i >=0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();

    }

    public static void main(String[] args){
        System.out.println(countChar("banana", 'n'));
        System.out.println(countChar("banana", 'a'));
        System.out.println(countChar("banana", 'z'));
        System.out.println(countVowels("programming"));
        System.out.println(countVowels("aeiou"));
        System.out.println(countVowels("xyz"));
        printReversed("Hello");   // olleH
        printReversed("Java");    // avaJ
    }

}
