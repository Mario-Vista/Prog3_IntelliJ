public class Bank {


    private int numero_conti;
    private SavingsAccount[] bankAccounts;



    private double totale_d = 0;
    private double bilancio = 0;



    //costruttore
    public Bank(int numero_conti) {
        bankAccounts = new SavingsAccount[numero_conti];

        for (int i = 0; i < bankAccounts.length; i++) {
            bankAccounts[i] = new SavingsAccount(10);
        }
    }

    public SavingsAccount getBankAccount(int id){return bankAccounts[id];}

    //1 poin(TESTED)
    public double totBalance() {
        for (int i = 0; i < bankAccounts.length; i++) {
            bilancio = bilancio + bankAccounts[i].getBalance();
        }
        return bilancio;
    }

    //2 punto
    public double getTotDeposit() {
        for (int i = 0; i < bankAccounts.length; i++) {
            totale_d = bankAccounts[i].getdepo();
        }
        return totale_d;
    }

    //3 punto
    public double getcontocorrente(int id) {
        return bankAccounts[id].getAccountNumber();
    }

    //4 punto
    public void calcoloTasse() {
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i].getBalance() > 5000) {
                bankAccounts[i].setBalance(0.1);
            }

        }
    }


    //5 punto(euro-sterlina)
    public void cambioValuta(int id){
        bankAccounts[id].setBalance(0.88);
    }




}






