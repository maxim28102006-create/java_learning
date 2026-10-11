package arrays;

// LeetCode 485. Max Consecutive Ones
// https://leetcode.com/problems/max-consecutive-ones/
// Идея: current — длина текущей серии единиц (растёт на 1, сбрасывается на 0);
//       max — лучшая серия за всё время (обновляется, когда current его превышает).
// Время: O(n) — один проход; Память: O(1).
class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
            } else {
                current = 0;
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        System.out.println(solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})); // 3
        System.out.println(solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1})); // 2
        System.out.println(solution.findMaxConsecutiveOnes(new int[]{0, 0, 0}));          // 0
    }
}