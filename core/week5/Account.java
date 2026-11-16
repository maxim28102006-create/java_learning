package week5;

public class Account {
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Имя владельца не может быть пустым");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным: " + balance);
        }
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() { return owner; }
    public int getBalance() { return balance; }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма пополнения должна быть больше 0: " + amount);
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {                       // 1. запрос осмысленный?
            throw new IllegalArgumentException("Сумма снятия должна быть больше 0: " + amount);
        }
        if (amount > balance) {                  // 2. денег хватает?
            throw new InsufficientFundsException("Недостаточно средств: нужно " + amount + ", есть " + balance);
        }
        balance -= amount;                       // 3. только теперь меняем поле
    }

    public void transfer(Account to, int amount) {
        withdraw(amount);      // если бросит — следующая строка не выполнится
        to.deposit(amount);
    }
}