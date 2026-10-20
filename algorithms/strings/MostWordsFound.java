package strings;

// LeetCode 2114. Maximum Number of Words Found in Sentences
// Шаблоны: счётчик (пробелы в предложении) + максимум (по предложениям)
// слов = пробелов + 1
// Время: O(N), N — всего букв во всех предложениях (каждую смотрим 1 раз); Память: O(1)
class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int spaces = 0;                          // между циклами: обнуляется для каждого предложения
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {     // char с char, а не всё предложение
                    spaces++;
                }
            }
            if (spaces + 1 > max) {
                max = spaces + 1;                    // максимум ЗАМЕНЯЕТ рекорд, а не копит (=, не +=)
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MostWordsFound m = new MostWordsFound();
        System.out.println(m.mostWordsFound(new String[]{
                "alice and bob love leetcode", "i think so too", "this is great thanks very much"})); // 6
    }
}