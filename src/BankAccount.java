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


public class BankAccount {
    private  double saldo;
    private double accountNumber;
    private static double numberUpdate = 1000000000;

    private int depositi_cont;

    //costruttore
    public BankAccount () {
        accountNumber = numberUpdate;
        numberUpdate++;
        saldo = 0;
    }
    public double getAccountNumber(){
        return accountNumber;
    }

    //metodo deposit

    public double deposit(double qt) {
        this.saldo = this.saldo+qt;
        depositi_cont++;
        return saldo;
    }
    public double getdepo(){
        return depositi_cont;
    }

    //metodo withdraw
    public double withdraw(int qt) {
        this.saldo = this.saldo-qt;
        return saldo;

    }


    //metodo getBalance
    public double getBalance() {
        return saldo;
    }

    public void setBalance(double coefficiente)
    {
        saldo = saldo * coefficiente;
    }


}
