package arrays;

import java.util.Arrays;

// LeetCode 344. Reverse String
// https://leetcode.com/problems/reverse-string/
// Идея: два указателя с краёв, меняем символы местами и двигаем навстречу
// Время: O(n) — проходим половину массива (n/2 → константа отбрасывается)
// Память: O(1) — только переменные left, right, temp, без нового массива
class ReverseString {

    // решение — то, что отправляешь на LeetCode
    public void reverseString(char[] s) {
        int left = 0;                    // указатель на начало
        int right = s.length - 1;        // указатель на конец

        while (left < right) {           // пока указатели не встретились
            char temp = s[left];         // сохраняем левый символ
            s[left] = s[right];          // на место левого — правый
            s[right] = temp;             // на место правого — сохранённый левый

            left++;                      // левый шагает вправо
            right--;                     // правый шагает влево
        }
    }

    // проверка у себя — на LeetCode не отправляется
    public static void main(String[] args) {
        ReverseString solution = new ReverseString();

        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(test1);               // метод void: меняет сам массив
        System.out.println(Arrays.toString(test1));  // ждём [o, l, l, e, h]

        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(test2);
        System.out.println(Arrays.toString(test2));  // ждём [h, a, n, n, a, H]
    }
}