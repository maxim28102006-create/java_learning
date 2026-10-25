package week3;

public class FeeAccount extends BankAccount{

    FeeAccount(String owner, int balance){
        super(owner, balance);
    }

    @Override
    public boolean withdraw(int amount){
        return super.withdraw(amount + 10);
    }
}
