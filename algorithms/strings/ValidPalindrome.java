package strings;

// LeetCode 125. Valid Palindrome
// Шаблон: очистка через StringBuilder + два указателя
// Время: O(n); Память: O(n) — строка clean
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Часть 1: очистка — оставляем буквы и цифры в нижнем регистре
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String clean = sb.toString();

        // Часть 2: палиндром — два указателя навстречу друг другу
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false; // нашли несовпадение — сразу выходим
            }
            left++;
            right--;
        }
        return true; // дошли до середины без несовпадений
    }

    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(v.isPalindrome("race a car"));                     // false
        System.out.println(v.isPalindrome(" "));                              // true
    }
}