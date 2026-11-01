package arrays;

import java.util.Arrays;

// Пузырьковая сортировка: сравниваем соседей, больший «всплывает» в конец.
// i < n - 1 — потому что берём arr[i + 1]; - pass — хвост уже отсортирован.
// Время: O(n²); Память: O(1) — сортирует на месте
class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));   // [1, 2, 4, 5]
        int[] b = {3, 2, 1};
        bubbleSort(b);
        System.out.println(Arrays.toString(b));   // [1, 2, 3]
    }
}