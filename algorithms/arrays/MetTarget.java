package arrays;

// LeetCode 2798. Number of Employees Who Met the Target
// https://leetcode.com/problems/number-of-employees-who-met-the-target/
// Шаблон 1 (счётчик): считаем сотрудников, у которых hours[i] >= target.
// Время: O(n) — один проход; Память: O(1).
class MetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MetTarget solution = new MetTarget();
        System.out.println(solution.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2)); // 3
        System.out.println(solution.numberOfEmployeesWhoMetTarget(new int[]{5, 1, 4, 2, 2}, 6)); // 0
    }
}