//interest = Balance * interestRate / 100

public class SavingsAccount extends BankAccount {
    private double interest;
    private double interestRate;

    public void addInterest(){
     this.deposit((this.getBalance()*interestRate/100));
    }
    public SavingsAccount(double interestRate){
        this.interestRate = interestRate;
    }
}
