/*Implementare una classe BankAccount che permette di gestire
        un conto bancario contenente un saldo che può essere modificato
        da depositi e prelievi
        costruttore
        metodo deposit per versare denaro nel conto bancario
        metodo withdraw preleva denaro dal conto bancario
        metodo getBalance ritorna il saldo attuale
        Implementare una classe BankAccountTest per il collaudo
        della classe BankAccount
        Inserimento denaro
        Prelievo
        Stampa Saldo
        Domanda: come associare automaticamente un numero di conto in
        base all’ultimo numero di conto associato*/


public class BankAccount implements Measurable{
    private double saldo;
    private double accountNumber;
    private static double numberUpdate = 1000000000;

    private int depositi_cont;

    //costruttore
    public BankAccount(int initBalance) {
        saldo = initBalance;
        accountNumber = numberUpdate;
        numberUpdate++;
    }

    public BankAccount() {
        this(0);
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    //metodo deposit

    public synchronized void deposit(double qt) {
        this.saldo = this.saldo + qt;
        depositi_cont++;
    }

    public double getDepo() {
        return depositi_cont;
    }

    //metodo withdraw
    public synchronized void withdraw(double qt) {
        try {
            if (qt > this.saldo)
                throw new NoFundsException();
            this.saldo = this.saldo - qt;

        } catch (NoFundsException exc) {
            System.out.println(exc.toString());
        }
    }


    //metodo getBalance
    public double getBalance() {
        return saldo;
    }

    public void setBalance(double coefficiente) {
        saldo = coefficiente;
    }

    @Override
    public double getMeasure() {
        return this.saldo;
    }

    //Classe anonima
    CurrencyConverter JPYConvert = new CurrencyConverter() {
        @Override
        public double convert(double qt) {
            return qt * 139.96;
        }
    };


    CurrencyConverter GBPConvert = new CurrencyConverter() {
        @Override
        public double convert(double qt) {
            return qt * 0.85;
        }
    };

    public double getGBPConvert(double qt) {
        return GBPConvert.convert(qt);
    }

    public double getJPYConvert(double qt) {
        return JPYConvert.convert(qt);
    }


        public enum Currency {EUR, GBP, JPY};

        public double convertTo(Currency value, double qt) {
            switch (value) {

                case EUR:
                    EURConvert converti = new EURConvert();
                    converti.convert(qt);

                case GBP:
                    GBPConvert.convert(qt);

                case JPY:
                    JPYConvert.convert(qt);


            }
            return qt;

    }
}
