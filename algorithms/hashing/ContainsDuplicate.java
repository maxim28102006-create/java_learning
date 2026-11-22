package hashing;

import java.util.HashSet;
import java.util.Set;

// LeetCode 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/
// Шаблон 7 «видели раньше?»: HashSet. Для каждого числа сначала спрашиваем contains,
//       потом add. Порядок важен: если сначала add, contains всегда найдёт только что добавленное.
//       «Да» (true) — сразу, как нашли повтор; «нет» (false) — только после проверки всех.
// Время: O(n) — один проход, contains/add по O(1); Память: O(n) — в худшем случае все числа в seen.
// Без HashSet: «каждый с каждым» — O(n²) по времени, O(1) по памяти (меняем память на скорость).
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (seen.contains(x)) {
                return true;
            }
            seen.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 1}));  // true
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 4}));  // false
    }
}