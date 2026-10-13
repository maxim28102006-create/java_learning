package arrays;

// LeetCode 1572. Matrix Diagonal Sum
// https://leetcode.com/problems/matrix-diagonal-sum/
// Идея: один цикл по строкам — в строке i главная диагональ mat[i][i],
//       побочная mat[i][n - 1 - i] (зеркальный индекс). При нечётном n центр
//       попал дважды — вычитаем его один раз.
// Время: O(n) — по одной клетке каждой диагонали на строку; Память: O(1).
class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 != 0) {
            int center = n / 2;
            sum -= mat[center][center];
        }
        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum solution = new MatrixDiagonalSum();
        System.out.println(solution.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));                     // 25
        System.out.println(solution.diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}})); // 8
        System.out.println(solution.diagonalSum(new int[][]{{5}}));                                                  // 5
    }
}