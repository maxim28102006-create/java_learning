package arrays;

import java.util.Arrays;

// LeetCode 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/
// Идея: один проход по парам; x = nums[i] кладём в result[2i], y = nums[i+n] — в result[2i+1]
// Время: O(n) — n шагов; Память: O(n) — новый массив длины 2n
class Shuffle {

    // решение — то, что отправляешь на LeetCode
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];          // новый массив той же длины, что nums

        for (int i = 0; i < n; i++) {           // n шагов: за шаг обрабатываем пару (x, y)
            result[2 * i] = nums[i];            // x из первой половины → чётные места 0, 2, 4...
            result[2 * i + 1] = nums[i + n];    // y из второй половины → нечётные места 1, 3, 5...
        }

        return result;
    }

    // проверка у себя — на LeetCode не отправляется
    public static void main(String[] args) {
        Shuffle solution = new Shuffle();

        int[] test1 = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(solution.shuffle(test1, 3)));   // ждём [2, 3, 5, 4, 1, 7]

        int[] test2 = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(Arrays.toString(solution.shuffle(test2, 4)));   // ждём [1, 4, 2, 3, 3, 2, 4, 1]
    }
}