package arrays;

// Бинарный поиск в ОТСОРТИРОВАННОМ массиве: каждый шаг отбрасывает половину.
// left/right — границы куска, где искомое ещё может быть; mid — номер середины.
// Время: O(log n); Память: O(1)
class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {                  // кусок не пустой
            int mid = (left + right) / 2;        // НОМЕР середины
            if (arr[mid] == target) {            // ЗНАЧЕНИЕ на этом месте
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;                  // mid уже проверили — правее него
            } else {
                right = mid - 1;                 // левее него
            }
        }
        return -1;                               // границы перешли — не нашли
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(arr, 9));   // 4
        System.out.println(binarySearch(arr, 3));   // 1
        System.out.println(binarySearch(arr, 4));   // -1
    }
}