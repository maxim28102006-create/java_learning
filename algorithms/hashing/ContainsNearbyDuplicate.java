package hashing;

import java.util.HashMap;
import java.util.Map;

// LeetCode 219. Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/
// HashMap<число, ПОСЛЕДНИЙ индекс> («книжка последних адресов»). Для nums[i]:
//       если число уже было и i − last.get(число) <= k → true.
//       put(nums[i], i) — ВСЕГДА и ПОСЛЕ проверки: и для нового числа, и для «далёкого» —
//       последний адрес ближе всего к следующим ([1,2,3,1,2,1], k=2: без обновления пропустим пару 3–5).
//       containsKey(...) && ... — порядок важен: иначе get вернёт null → i − null → NPE.
// В лоб: для каждого i смотреть k соседей справа — O(n·k), при k ≈ n это O(n²).
// Время: O(n); Память: O(n). Вариант с памятью O(k) — скользящее окно из HashSet (неделя 7).
class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (last.containsKey(nums[i]) && i - last.get(nums[i]) <= k) {
                return true;
            }
            last.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsNearbyDuplicate sol = new ContainsNearbyDuplicate();
        System.out.println(sol.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));        // true
        System.out.println(sol.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));        // true
        System.out.println(sol.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));  // false
        System.out.println(sol.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 1}, 2));  // true
    }
}