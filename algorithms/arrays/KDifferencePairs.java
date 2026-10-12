package arrays;

// LeetCode 2006. Count Number of Pairs With Absolute Difference K
// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
// Шаблон 4 (перебор пар): j = i + 1 — каждая пара один раз (с j = 0 (0,1) и (1,0) посчитались бы дважды).
// Math.abs — модуль числа (разница без знака).
// Время: O(n²) — вложенный цикл; Память: O(1).
class KDifferencePairs {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        KDifferencePairs solution = new KDifferencePairs();
        System.out.println(solution.countKDifference(new int[]{1, 2, 2, 1}, 1));    // 4
        System.out.println(solution.countKDifference(new int[]{1, 3}, 3));          // 0
        System.out.println(solution.countKDifference(new int[]{3, 2, 1, 5, 4}, 2)); // 3
    }
}
