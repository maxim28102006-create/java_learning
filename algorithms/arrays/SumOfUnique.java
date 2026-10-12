package arrays;

// LeetCode 1748. Sum of Unique Elements
// https://leetcode.com/problems/sum-of-unique-elements/
// Идея: для каждого элемента считаем, сколько раз он встречается во ВСЁМ массиве (j с 0);
//       элемент находит и сам себя, поэтому «уникальный» = count == 1.
// Время: O(n²) — вложенный цикл; Память: O(1). На неделе 3 сделаем за O(n) через HashMap.
class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfUnique solution = new SumOfUnique();
        System.out.println(solution.sumOfUnique(new int[]{1, 2, 3, 2}));    // 4
        System.out.println(solution.sumOfUnique(new int[]{1, 1, 1, 1, 1})); // 0
        System.out.println(solution.sumOfUnique(new int[]{1, 2, 3, 4, 5})); // 15
    }
}