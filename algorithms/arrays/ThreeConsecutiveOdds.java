package arrays;

// LeetCode 1550. Three Consecutive Odds
// https://leetcode.com/problems/three-consecutive-odds/
// Шаблон 5 (серия со сбросом) + ранний выход: серия нечётных дошла до 3 → сразу true;
// весь массив просмотрен и не дошла → false (после цикла).
// Время: O(n); Память: O(1).
class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                current++;
            } else {
                current = 0;
            }
            if (current == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ThreeConsecutiveOdds solution = new ThreeConsecutiveOdds();
        System.out.println(solution.threeConsecutiveOdds(new int[]{2, 6, 4, 1}));                  // false
        System.out.println(solution.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12})); // true
    }
}

