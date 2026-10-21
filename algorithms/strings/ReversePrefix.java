package strings;

// LeetCode 2000. Reverse Prefix of Word
// indexOf → номер первого ch (или -1); разворот куска 0..idx двумя указателями прямо в массиве букв.
// Хвост не трогаем — он остаётся на месте, приклеивать не нужно.
// Время: O(n); Память: O(n) — массив букв
class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);           // номер первого ch, нет — -1
        if (idx == -1) {
            return word;                      // ch нет — возвращаем как есть
        }
        char[] arr = word.toCharArray();      // строку менять нельзя, массив — можно
        int left = 0;
        int right = idx;
        while (left < right) {
            char temp = arr[left];            // обмен через временную переменную
            arr[left] = arr[right];
            arr[right] = temp;
            left++;                           // навстречу друг другу:
            right--;                          // left вправо, right влево
        }
        return new String(arr);               // массив букв → строка
    }

    public static void main(String[] args) {
        ReversePrefix r = new ReversePrefix();
        System.out.println(r.reversePrefix("abcdefd", 'd'));  // dcbaefd
        System.out.println(r.reversePrefix("xyxzxe", 'z'));   // zxyxxe
        System.out.println(r.reversePrefix("abcd", 'z'));     // abcd
    }
}