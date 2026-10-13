package arrays;

// LeetCode 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/
// Идея: для каждой строки (клиента) считаем сумму (sum = 0 внутри внешнего цикла),
//       после внутреннего цикла сравниваем с рекордом max.
// Время: O(m · n) — каждая ячейка один раз; Память: O(1).
class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RichestCustomerWealth solution = new RichestCustomerWealth();
        System.out.println(solution.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));          // 6
        System.out.println(solution.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));        // 10
        System.out.println(solution.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}})); // 17
    }
}