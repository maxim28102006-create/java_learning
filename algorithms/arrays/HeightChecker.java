package arrays;

import java.util.Arrays;

// LeetCode 1051. Height Checker
// Копия (copyOf, а не b = a!) → сортируем копию → считаем несовпадения на одинаковых местах.
// Два массива на одном месте → нужен индекс i → обычный for.
// Время: O(n log n) — сортировка; Память: O(n) — копия
class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HeightChecker().heightChecker(new int[]{1, 1, 4, 2, 1, 3})); // 3
        System.out.println(new HeightChecker().heightChecker(new int[]{5, 1, 2, 3, 4}));    // 5
    }
}