package arrays;

import java.util.Arrays;

// LeetCode 1920. Build Array from Permutation
// https://leetcode.com/problems/build-array-from-permutation/
// Идея: nums[i] — номер другой ячейки; берём значение оттуда: ans[i] = nums[nums[i]]
// Время: O(n) — один проход; Память: O(n) — новый массив ans
class BuildArray {

    // решение — то, что отправляешь на LeetCode
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];             // записка в шкафчике i → идём в шкафчик nums[i]
        }

        return ans;
    }

    // проверка у себя — на LeetCode не отправляется
    public static void main(String[] args) {
        BuildArray solution = new BuildArray();

        int[] test1 = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(solution.buildArray(test1)));   // ждём [0, 1, 2, 4, 5, 3]

        int[] test2 = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(solution.buildArray(test2)));   // ждём [4, 5, 0, 1, 2, 3]
    }
}
