package loops;

// LeetCode 1342. Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
// Идея: пока число не ноль — чётное делим на 2, нечётное уменьшаем на 1, считаем шаги.
// Время: O(log n) — число уменьшается вдвое минимум каждые 2 шага; Память: O(1).
class NumberOfSteps {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        NumberOfSteps solution = new NumberOfSteps();
        System.out.println(solution.numberOfSteps(14));  // 6
        System.out.println(solution.numberOfSteps(8));   // 4
        System.out.println(solution.numberOfSteps(0));   // 0
        System.out.println(solution.numberOfSteps(123)); // 12
    }
}