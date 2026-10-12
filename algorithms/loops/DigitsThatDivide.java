package loops;

// LeetCode 2520. Count the Digits That Divide a Number
// https://leetcode.com/problems/count-the-digits-that-divide-a-number/
// Шаблон 2 (разбор по цифрам) + 1 (счётчик). Режем КОПИЮ n, делимость проверяем на целом num
// (иначе 121: на втором круге 12 % 2 == 0 — неверно засчитали бы двойку).
// Время: O(log n) — один круг на каждую цифру; Память: O(1).
class DigitsThatDivide {
    public int countDigits(int num) {
        int n = num;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (num % digit == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        DigitsThatDivide solution = new DigitsThatDivide();
        System.out.println(solution.countDigits(7));    // 1
        System.out.println(solution.countDigits(121));  // 2
        System.out.println(solution.countDigits(1248)); // 4
    }
}