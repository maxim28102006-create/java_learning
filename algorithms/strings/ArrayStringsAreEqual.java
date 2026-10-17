package strings;

// LeetCode 1662. Check If Two String Arrays are Equivalent
// Шаблон: сборка строки через StringBuilder + for-each, сравнение через equals
// Время: O(n), n — общее число букв; Память: O(n)
class ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String w : word1) {      // w — целый кусочек-строка
            sb1.append(w);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String w : word2) {      // новая w, прошлая уже умерла
            sb2.append(w);
        }

        return sb1.toString().equals(sb2.toString()); // строки — только через equals
    }

    public static void main(String[] args) {
        ArrayStringsAreEqual s = new ArrayStringsAreEqual();
        System.out.println(s.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"})); // true
        System.out.println(s.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"})); // false
    }
}