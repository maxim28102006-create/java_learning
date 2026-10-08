package loops;

// LeetCode 1281. Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Идея: разбираем число по цифрам (n % 10, n / 10), копим сумму (старт 0) и произведение (старт 1).
// Время: O(log n) — один круг на каждую цифру; Память: O(1).
class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        SubtractProductAndSum solution = new SubtractProductAndSum();
        System.out.println(solution.subtractProductAndSum(234));  // 15
        System.out.println(solution.subtractProductAndSum(4421)); // 21
        System.out.println(solution.subtractProductAndSum(1));    // 0
    }
}
