package arrays;

// LeetCode 1822. Sign of the Product of an Array
// https://leetcode.com/problems/sign-of-the-product-of-an-array/
// Идея: произведение не считаем (переполнение!). Есть ноль → сразу 0.
//       Иначе знак зависит от количества отрицательных: чётное → 1, нечётное → -1.
// Время: O(n) — один проход по массиву; Память: O(1).
class ArraySign {
    public int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                count = count + 1;
            }
        }
        if (count % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ArraySign solution = new ArraySign();
        System.out.println(solution.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1})); // 1
        System.out.println(solution.arraySign(new int[]{1, 5, 0, 2, -3}));          // 0
        System.out.println(solution.arraySign(new int[]{-1, 1, -1, 1, -1}));        // -1
    }
}
