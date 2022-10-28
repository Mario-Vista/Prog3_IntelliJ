public class CheckingAccount extends BankAccount{

    private double transactionCount;
    private double fees;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    //Nel costruttore passo il bilancio iniziale che c
    public CheckingAccount(int initBalance){
        super(initBalance);
        transactionCount = 0;

    }


    public  void deductFees(){
        if(transactionCount>FREE_TRANSACTIONS){

        //Detrazione delle tasse
        fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);}

        //tolgo le tasse dalla superclasse
        super.withdraw(fees);

        //conto le transazioni compiute
        transactionCount = 0;
    }

    //Ogni volta che viene effettuato un deposito o un prelievo viene incrementato il contatore delle transazioni

    //Override del metodo deposit della superclasse
    @Override
    public void deposit(double amount){
        super.deposit(amount);
        transactionCount++;
    }


    //Override del metodo withdraw(prelievo) della superclasse
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        transactionCount++;
    }
}
