package hashing;

import java.util.HashMap;
import java.util.Map;

// LeetCode 387. First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/
// Шаблон 8 «подсчёт» + второй проход. Проход 1: посчитать все буквы (буква → сколько раз).
//       Проход 2: снова по СТРОКЕ слева направо (не по values() — там нет порядка и индексов),
//       первая буква с количеством 1 → её индекс. Не нашли → -1.
//       Одним проходом нельзя: стоя на букве, ещё не знаем, повторится ли она дальше.
// В лоб: для каждой буквы пересчитывать по всей строке — O(n²) (сравнивать и с предыдущими!).
// Время: O(n) — два прохода подряд; Память: O(1) — не больше 26 букв.
// Вариант быстрее: int[26] вместо HashMap, индекс c - 'a' (по Constraints только a–z;
//       с заглавными — int[128] и индекс c; любые символы — HashMap).
class FirstUniqueChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    // тот же алгоритм на массиве из 26 счётчиков
    public int firstUniqCharArray(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueChar sol = new FirstUniqueChar();
        System.out.println(sol.firstUniqChar("leetcode"));            // 0
        System.out.println(sol.firstUniqChar("loveleetcode"));        // 2
        System.out.println(sol.firstUniqChar("aabb"));                // -1
        System.out.println(sol.firstUniqCharArray("loveleetcode"));   // 2
    }
}