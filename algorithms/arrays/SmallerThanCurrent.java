package arrays;

import java.util.Arrays;

// LeetCode 1365. How Many Numbers Are Smaller Than the Current Number
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Идея: для каждого nums[i] проходим ВЕСЬ массив (j с 0) и считаем элементы меньше него;
//       счётчик свой для каждого i, результат пишем в result[i].
// Время: O(n²) — для каждого из n элементов n сравнений; Память: O(n) — массив результата.
class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        SmallerThanCurrent solution = new SmallerThanCurrent();
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}))); // [4, 0, 1, 1, 3]
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})));    // [2, 1, 0, 3]
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7})));    // [0, 0, 0, 0]
    }
}