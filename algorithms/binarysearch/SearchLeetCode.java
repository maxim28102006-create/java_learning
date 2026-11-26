package binarysearch;

// LeetCode 704. Binary Search
// https://leetcode.com/problems/binary-search/
// Шаблон 10. Зона поиска left..right — НОМЕРА. mid — номер середины, nums[mid] — число в ней.
//       Совпало → return mid. Число меньше target → ответ правее: left = mid + 1.
//       Больше → левее: right = mid - 1. ±1 — середину уже проверили, отбрасываем.
//       while (left <= right): зона из одного элемента тоже проверяется. Зона пуста → -1.
//       mid = left + (right - left) / 2 — без переполнения int при больших left и right.
// Словарь «число → индекс» не подходит: его построение уже O(n).
// Время: O(log n) — каждый шаг отбрасывает половину; Память: O(1).
class SearchLeetCode {
    public int search(int[] nums, int target) {
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
        return -1;
    }

    public static void main(String[] args) {
        SearchLeetCode sol = new SearchLeetCode();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(sol.search(nums, 9));    // 4
        System.out.println(sol.search(nums, 12));   // 5
        System.out.println(sol.search(nums, 0));    // 1
        System.out.println(sol.search(nums, 2));    // -1
    }
}