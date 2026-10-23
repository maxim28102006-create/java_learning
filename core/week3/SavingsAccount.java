package week3;

public class SavingsAccount extends BankAccount {
    private int rate;

    SavingsAccount(String owner, int balance, int rate){
        super(owner, balance);
        this.rate = rate;
    }

    public int getRate(){
        return rate;
    }

    public void  addInterest(){
        int interest = getBalance() * rate / 100;
        deposit(interest);

    }
}
