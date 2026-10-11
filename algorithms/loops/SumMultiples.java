package loops;

// LeetCode 2652. Sum Multiples
// https://leetcode.com/problems/sum-multiples/
// Идея: перебираем числа от 1 до n ВКЛЮЧИТЕЛЬНО (i <= n), прибавляем те,
//       что делятся на 3, 5 или 7 (||: хотя бы одно условие — число прибавится один раз).
// Время: O(n) — проверяем каждое число один раз; Память: O(1).
class SumMultiples {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumMultiples solution = new SumMultiples();
        System.out.println(solution.sumOfMultiples(7));  // 21
        System.out.println(solution.sumOfMultiples(10)); // 40
        System.out.println(solution.sumOfMultiples(9));  // 30
    }
}