package strings;

// LeetCode 2011. Final Value of Variable After Performing Operations
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
// Идея: шаблон 1 (накопитель). Во всех четырёх операциях ("++X", "X++", "--X", "X--")
//       на позиции 1 стоит знак — по нему решаем: +1 или -1.
// Время: O(n) — по одной проверке на операцию; Память: O(1).
class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        FinalValueAfterOperations solution = new FinalValueAfterOperations();
        System.out.println(solution.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));        // 1
        System.out.println(solution.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));        // 3
        System.out.println(solution.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"})); // 0
    }
}