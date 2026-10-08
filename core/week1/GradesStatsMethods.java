package week1;

public class GradesStatsMethods {
    static double average(int[] grades){
        int sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }

    static int countOf(int[] grades, int value){
        int count = 0;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] == value){
                count++;
            }
        }
        return count;
    }


    static boolean contains(int[] grades, int value){
        for (int i = 0; i < grades.length; i++){
            if (grades[i] == value){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args){
        int[] grades = {5, 4, 3, 5, 2, 4, 5};

        System.out.println("Средняя: " + average(grades));
        System.out.println("Пятёрок: " + countOf(grades, 5));
        System.out.println("Четвёрок: " + countOf(grades, 4));
        System.out.println("Есть двойка: " + contains(grades, 2));
        System.out.println("Есть единица: " + contains(grades, 1));

        int[] other = {5, 5, 4};
        System.out.println("Средняя другого: " + average(other));
    }
}
