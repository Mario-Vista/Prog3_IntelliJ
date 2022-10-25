public class CheckingAccount extends BankAccount{

    private double transactionCount;
    private double fees;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;


    public CheckingAccount(int initBalance){
        super(initBalance);
        transactionCount = 0;

    }


    public  void deductFees(){
        if(transactionCount>FREE_TRANSACTIONS){

        fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);}

        super.withdraw(fees);

        transactionCount = 0;
    }



    @Override
    public void deposit(double amount){
        super.deposit(amount);
        transactionCount++;
    }


    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        transactionCount++;
    }
}
