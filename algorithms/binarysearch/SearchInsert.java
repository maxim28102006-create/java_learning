package binarysearch;

// LeetCode 35. Search Insert Position
// https://leetcode.com/problems/search-insert-position/
// Тот же бинпоиск (704), меняется одна строка: не нашли → return left вместо -1.
//       Почему left: цикл держит правило «левее left всё меньше target, правее right всё больше».
//       Когда зона схлопнулась, left — первое место, где число больше target, туда он и встанет.
//       mid после цикла не существует (объявлена внутри while), да и ответ дала бы неверный.
// Время: O(log n); Память: O(1).
class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        SearchInsert sol = new SearchInsert();
        int[] nums = {1, 3, 5, 6};
        System.out.println(sol.searchInsert(nums, 5));   // 2
        System.out.println(sol.searchInsert(nums, 2));   // 1
        System.out.println(sol.searchInsert(nums, 7));   // 4
        System.out.println(sol.searchInsert(nums, 0));   // 0
    }
}