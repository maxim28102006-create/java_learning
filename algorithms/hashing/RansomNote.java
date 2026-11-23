package hashing;

import java.util.HashMap;
import java.util.Map;

// LeetCode 383. Ransom Note
// https://leetcode.com/problems/ransom-note/
// Шаблон 8 «подсчёт», один словарь как «склад букв» (похоже на 242, но не «поровну», а «хватает ли»).
//       Записка длиннее журнала → сразу false (здесь >, а не != как в 242: лишние буквы журнала не мешают).
//       По журналу +1 («пришло на склад»), по записке −1 («взяли»). Ушло в минус → не хватило → false.
//       Проверяем count.get(c) < 0 — КОЛИЧЕСТВО буквы, а не саму букву c (c — это код символа, он всегда > 0).
// Время: O(n + m) — два прохода подряд; Память: O(1) — не больше 26 букв (можно int[26]).
class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> count = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) - 1);
            if (count.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote sol = new RansomNote();
        System.out.println(sol.canConstruct("a", "b"));       // false
        System.out.println(sol.canConstruct("aa", "ab"));     // false
        System.out.println(sol.canConstruct("aa", "aab"));    // true
        System.out.println(sol.canConstruct("abc", "cbaxyz")); // true
    }
}