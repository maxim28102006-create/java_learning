package strings;

// LeetCode 1903. Largest Odd Number in String
// Число нечётное ⇔ последняя цифра нечётная.
// Идём с конца: первая нечётная цифра = правый конец самого длинного куска (ранний выход)
// Время: O(n); Память: O(1) без учёта ответа
class LargestOddNumber {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';         // символ '5' → число 5
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);      // номера 0..i; правая граница не включается → i + 1
            }
        }
        return "";                                   // нечётных цифр нет
    }

    public static void main(String[] args) {
        LargestOddNumber l = new LargestOddNumber();
        System.out.println(l.largestOddNumber("52"));          // 5
        System.out.println("[" + l.largestOddNumber("4206") + "]"); // []
        System.out.println(l.largestOddNumber("35427"));       // 35427
    }
}
