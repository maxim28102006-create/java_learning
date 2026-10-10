package arrays;

// LeetCode 1512. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/
// Идея: перебираем все пары i < j (внутренний цикл с i + 1), считаем те, где значения равны.
// Время: O(n²) — около n²/2 пар; Память: O(1).
class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        GoodPairs solution = new GoodPairs();
        System.out.println(solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})); // 4
        System.out.println(solution.numIdenticalPairs(new int[]{1, 1, 1, 1}));       // 6
        System.out.println(solution.numIdenticalPairs(new int[]{1, 2, 3}));          // 0
    }
}