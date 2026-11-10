package control2;

public class evenDigits {
    public static int evenDigits(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            int temp = nums[i];

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
