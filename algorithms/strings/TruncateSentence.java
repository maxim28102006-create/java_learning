package strings;

// LeetCode 1816. Truncate Sentence
// Сборка строки + счётчик пробелов; на k-м пробеле — ранний return (сам пробел не дописываем)
// Время: O(n); Память: O(n)
class TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaces++;
                if (spaces == k) {
                    return sb.toString();         // проверка ДО append — лишний пробел не попадёт
                }
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();                     // пробелов меньше k — вся строка
    }

    public static void main(String[] args) {
        TruncateSentence t = new TruncateSentence();
        System.out.println(t.truncateSentence("Hello how are you Contestant", 4));  // Hello how are you
        System.out.println(t.truncateSentence("chopper is not a tanuki", 5));       // chopper is not a tanuki
    }
}