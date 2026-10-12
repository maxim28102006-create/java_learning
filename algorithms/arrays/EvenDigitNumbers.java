package arrays;

// LeetCode 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Идея: помощник countDigits считает цифры числа (делим на 10, пока не 0);
//       главный метод идёт по массиву и считает числа, у которых количество цифр чётное.
// Время: O(n · d) — n чисел, у каждого d цифр (d ≤ 6), то есть фактически O(n); Память: O(1).
class EvenDigitNumbers {

    public int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countDigits(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        EvenDigitNumbers solution = new EvenDigitNumbers();
        System.out.println(solution.findNumbers(new int[]{12, 345, 2, 6, 7896})); // 2
        System.out.println(solution.findNumbers(new int[]{555, 901, 482, 1771})); // 1
    }
}