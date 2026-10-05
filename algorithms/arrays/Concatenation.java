package arrays;

import java.util.Arrays;   // для печати массива

// LeetCode 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/
// Идея: новый массив длины 2n; каждый nums[i] кладём в ans[i] и в ans[i + n]
// Время: O(n) — один проход по nums; Память: O(n) — новый массив длины 2n
class Concatenation {

    // решение — то, что отправляешь на LeetCode
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;                 // длина исходного массива
        int[] ans = new int[2 * n];          // новый массив вдвое длиннее
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];                // первая копия: ячейки 0 .. n-1
            ans[i + n] = nums[i];            // вторая копия: ячейки n .. 2n-1
        }
        return ans;
    }

    // проверка у себя — на LeetCode не отправляется
    public static void main(String[] args) {
        Concatenation solution = new Concatenation();

        int[] test1 = {1, 2, 1};
        System.out.println(Arrays.toString(solution.getConcatenation(test1)));     // ждём [1, 2, 1, 1, 2, 1]

        int[] test2 = {1, 3, 2, 1};
        System.out.println(Arrays.toString(solution.getConcatenation(test2)));     // ждём [1, 3, 2, 1, 1, 3, 2, 1]
    }
}