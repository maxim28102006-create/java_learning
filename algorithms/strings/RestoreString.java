package strings;

// LeetCode 1528. Shuffle String
// Буква номер i встаёт на место indices[i]: res[КУДА] = КОГО
// Собираем «вразброс» → не StringBuilder, а массив букв нужной длины
// Время: O(n); Память: O(n)
class RestoreString {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];      // пустые «парты»
        for (int i = 0; i < s.length(); i++) {
            res[indices[i]] = s.charAt(i);      // indices[i] — номер (куда), s.charAt(i) — значение (кого)
        }
        return new String(res);                 // массив букв → строка
    }

    public static void main(String[] args) {
        RestoreString r = new RestoreString();
        System.out.println(r.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3})); // leetcode
        System.out.println(r.restoreString("abc", new int[]{2, 0, 1}));                     // bca
    }
}