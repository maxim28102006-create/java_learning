package week5;

public class AccountDemo {
    public static void main(String[] args) {
        Account max = new Account("Макс", 1000);
        Account anya = new Account("Аня", 500);

        try {
            max.transfer(anya, 5000);
        } catch (InsufficientFundsException e) {
            System.out.println("Отказ: " + e.getMessage());
        }
        System.out.println(max.getBalance() + " " + anya.getBalance());

        try {
            max.deposit(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}