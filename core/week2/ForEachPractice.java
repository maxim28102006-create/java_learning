package week2;

public class ForEachPractice {

    // Сколько слов длиннее k букв. Шаблон 1 (счётчик), for-each по String[]
    static int countLong(String[] words, int k) {
        int count = 0;
        for (String w : words) {          // w по очереди = каждое слово
            if (w.length() > k) {         // длина строки — length() со скобками
                count++;
            }
        }
        return count;
    }

    // Сколько раз буква target встречается в s. Шаблон 1, for-each по буквам
    static int countChar(String s, char target) {
        int count = 0;
        for (char c : s.toCharArray()) {  // toCharArray(): строка → массив букв
            if (c == target) {            // char сравниваем через ==
                count++;
            }
        }
        return count;
    }

    // Номер самого большого элемента. Нужен номер → обычный for (в for-each нет i)
    static int indexOfMax(int[] arr) {
        int idx = 0;                              // номер рекорда (бумажка с номером шкафчика)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[idx]) {              // сравниваем СОДЕРЖИМОЕ шкафчиков
                idx = i;                          // запоминаем НОМЕР
            }
        }
        return idx;                               // возвращаем НОМЕР
    }

    public static void main(String[] args) {
        String[] words = {"кот", "собака", "ёж", "лошадь"};
        System.out.println(countLong(words, 3));                 // 2

        System.out.println(countChar("banana", 'a'));            // 3
        System.out.println(countChar("hello", 'l'));             // 2
        System.out.println(countChar("java", 'z'));              // 0

        System.out.println(indexOfMax(new int[]{5, 1, 8, 3}));   // 2
        System.out.println(indexOfMax(new int[]{9, 2, 4}));      // 0
    }
}