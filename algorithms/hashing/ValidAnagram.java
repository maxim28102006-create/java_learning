package hashing;

import java.util.HashMap;
import java.util.Map;

// LeetCode 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/
// Шаблон 8 «подсчёт»: один HashMap<буква, счётчик>. Разная длина → сразу false.
//       По s прибавляем (+1), по t вычитаем (−1). Анаграмма ⇔ в конце все счётчики 0.
//       getOrDefault(c, 0) — чтобы для новой буквы не было null + 1 → NullPointerException.
// Время: O(n) — три цикла подряд (не вложены) складываются: O(n) + O(n) + O(26) = O(n);
// Память: O(1) — ключей не больше 26 (латинский алфавит), не растёт с n.
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) - 1);
        }
        for (int v : count.values()) {
            if (v != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();
        System.out.println(sol.isAnagram("anagram", "nagaram"));  // true
        System.out.println(sol.isAnagram("rat", "car"));          // false
    }
}