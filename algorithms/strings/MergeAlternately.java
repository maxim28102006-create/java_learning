package strings;

// LeetCode 1768. Merge Strings Alternately
// https://leetcode.com/problems/merge-strings-alternately/
// Идея: один индекс i для обеих строк; на каждом шаге дописываем символ из word1 и из word2,
//       если он существует (i < длины). Цикл — до длины более длинной строки.
// Время: O(n + m); Память: O(n + m) — StringBuilder с результатом.
class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLen; i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeAlternately solution = new MergeAlternately();
        System.out.println(solution.mergeAlternately("abc", "pqr"));  // apbqcr
        System.out.println(solution.mergeAlternately("ab", "pqrs"));  // apbqrs
        System.out.println(solution.mergeAlternately("abcd", "pq"));  // apbqcd
    }
}