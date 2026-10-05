package arrays;

import java.util.Arrays;   // подключаем Arrays, чтобы печатать массивы

// LeetCode 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/
// Идея: каждый элемент = он сам + предыдущий (уже посчитанная сумма)
// Время: O(n) — один проход; Память: O(1) — меняем массив на месте
class RunningSum {

    // решение — то, что отправляешь на LeetCode
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {      // с 1: у первого элемента нет предыдущего
            nums[i] = nums[i] + nums[i - 1];         // текущий + сумма всех до него
        }
        return nums;                                 // возвращаем изменённый массив
    }

    // проверка у себя — на LeetCode не отправляется
    public static void main(String[] args) {
        RunningSum solution = new RunningSum();      // создаём объект, чтобы вызвать метод

        int[] test1 = {1, 2, 3, 4};                  // пример 1
        System.out.println(Arrays.toString(solution.runningSum(test1)));   // ждём [1, 3, 6, 10]

        int[] test2 = {1, 1, 1, 1, 1};               // пример 2
        System.out.println(Arrays.toString(solution.runningSum(test2)));   // ждём [1, 2, 3, 4, 5]
    }
}