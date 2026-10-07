package week1;
import java.util.Arrays;

public class GradesStats {
    public static void main(String[] args){
        int[] grades = {5, 4, 3, 5, 2, 4, 5};
        int sum = 0;
        int fives = 0;
        boolean hasTwo = false;

        for (int i = 0; i < grades.length; i++){
            sum = sum + grades[i];
            if (grades[i] == 5){
                fives = fives + 1;
            }
            if (grades[i] == 2){
                hasTwo = true;

            }
        }
        double avg = (double) sum / grades.length;
        System.out.println("Cредняя " + avg);
        System.out.println("Пятерок: " + fives);
        System.out.println("Eсть двойка: " + hasTwo);

    }
}
