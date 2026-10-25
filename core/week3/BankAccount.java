package week3;

public class BankAccount implements Printable{
    private String owner;
    private int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }

    public void deposit(int amount){
        if (amount <= 0){
            System.out.println("Ошибка, сумма должна быть больше нуля");
            return;
        } else{
            balance = amount + balance;
        }
    }

    public boolean withdraw(int amount){
        if ((amount <= 0) || (amount > balance)){
            return false;
        }
        balance = balance - amount;
        return true;
    }

    public boolean transfer(BankAccount to, int amount){
        if (!withdraw(amount)){
            return false;
        }
        to.deposit(amount);
        return true;
    }


    @Override
    public void print(){
        System.out.println(owner + ": " + balance);

    }
}
