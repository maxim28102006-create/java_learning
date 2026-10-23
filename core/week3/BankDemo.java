package week3;

public class BankDemo {
    public static void main(String[] args){
        BankAccount max = new BankAccount("Макс", 1000);
        System.out.println(max.getOwner() + ": " + max.getBalance());
        max.deposit(200);
        System.out.println(max.getBalance());
        max.deposit(-50);
        System.out.println(max.getBalance());
        System.out.println(max.withdraw(5000));
        System.out.println(max.withdraw(100));
        System.out.println(max.getBalance());
        BankAccount anya = new BankAccount("Аня", 500);
        System.out.println(max.transfer(anya, 300));
        System.out.println(max.transfer(max, 10000));
        System.out.println(max.getOwner() + ": " + max.getBalance());
        System.out.println(anya.getOwner() + ": " + max.getBalance());
        SavingsAccount s = new SavingsAccount("Лена", 1000, 5);
        s.addInterest();
        System.out.println(s.getOwner() + ": " + s.getBalance());   // Лена: 1050
        s.withdraw(50);                                             // унаследован!
        s.addInterest();
        System.out.println(s.getOwner() + ": " + s.getBalance());   // Лена: 1050

    }
}
