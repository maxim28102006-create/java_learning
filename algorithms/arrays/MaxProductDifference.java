package arrays;

import java.util.Arrays;

// LeetCode 1913. Maximum Product Difference Between Two Pairs
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
// Идея: сортируем; самое большое произведение — два последних, самое маленькое — два первых.
// Время: O(n log n) — сортировка; Память: O(1) (сортируем на месте).
class MaxProductDifference {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }

    public static void main(String[] args) {
        MaxProductDifference solution = new MaxProductDifference();
        System.out.println(solution.maxProductDifference(new int[]{5, 6, 2, 7, 4}));       // 34
        System.out.println(solution.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8})); // 64
    }
}