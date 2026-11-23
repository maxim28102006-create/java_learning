package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LeetCode 1. Two Sum
// https://leetcode.com/problems/two-sum/
// Шаблон 9 «найди пару»: HashMap<число, его индекс>. Для x нужен партнёр target − x.
//       Вопрос «был ли партнёр среди уже просмотренных?» → containsKey. Да → [индекс партнёра, i].
//       ИЩЕМ партнёра, ЗАПИСЫВАЕМ себя (put(nums[i], i)) — и только ПОСЛЕ проверки,
//       иначе число станет парой само себе ([3,2,4], target 6 → [0,0] вместо [1,2]).
//       Ключ — число (по нему ищем), значение — индекс (его возвращаем).
// В лоб: двойной цикл O(n²). Внутренний цикл ИЩЕТ партнёра → поиск заменили на HashMap.
// Время: O(n) — один проход, операции map по O(1); быстрее нельзя: пара может быть в последнем элементе.
// Память: O(n) — в худшем случае в map почти все числа.
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        System.out.println(Arrays.toString(sol.twoSum(new int[]{2, 7, 11, 15}, 9)));  // [0, 1]
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3, 2, 4}, 6)));       // [1, 2]
        System.out.println(Arrays.toString(sol.twoSum(new int[]{1, 5, 3, 7}, 8)));    // [1, 2]
    }
}