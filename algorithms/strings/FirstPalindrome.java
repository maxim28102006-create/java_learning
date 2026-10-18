package strings;

// LeetCode 2108. Find First Palindromic String in the Array
// Шаблон 5 (ранний выход): нашёл — return внутри цикла, не нашёл — после
// Помощник isPalindrome — два указателя
// Время: O(n · m), n — число слов, m — длина слова; Память: O(1)
class FirstPalindrome {
    public String firstPalindrome(String[] words) {
        for (String word : words) {          // нужно само слово, не номер → for-each
            if (isPalindrome(word)) {
                return word;                 // нашли первое — сразу выходим
            }
        }
        return "";                           // ни одного палиндрома (пустая строка, не пробел)
    }

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;                // одна несовпавшая пара — уже не палиндром
            }
            left++;
            right--;
        }
        return true;                         // все пары совпали
    }

    public static void main(String[] args) {
        FirstPalindrome f = new FirstPalindrome();
        System.out.println(f.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"})); // ada
        System.out.println(f.firstPalindrome(new String[]{"notapalindrome", "racecar"}));           // racecar
        System.out.println("[" + f.firstPalindrome(new String[]{"def", "ghi"}) + "]");               // []
    }
}