package arrays;

// LeetCode 1979. Find Greatest Common Divisor of Array
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/
// Идея: этап 1 — найти min и max; этап 2 — перебирать делители от min вниз,
//       первый, на который делятся оба, и есть наибольший (ранний return).
// Время: O(n + min); Память: O(1).
class FindGcd {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = min; i >= 1; i--) {
            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }
        return 1; // недостижимо (на 1 делится всё), но нужно компилятору
    }

    public static void main(String[] args) {
        FindGcd solution = new FindGcd();
        System.out.println(solution.findGCD(new int[]{2, 5, 6, 9, 10})); // 2
        System.out.println(solution.findGCD(new int[]{7, 5, 6, 8, 3}));  // 1
        System.out.println(solution.findGCD(new int[]{3, 3}));           // 3
    }
}