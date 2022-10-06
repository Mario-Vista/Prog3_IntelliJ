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
    private int accountNumber;
    private int numberUpdate;


    //costruttore
    public BankAccount (double initBalance) {
        numberUpdate++;
        accountNumber = numberUpdate;
        saldo = initBalance;
    }

    //metodo deposit

    public double deposit(int qt) {
        this.saldo = this.saldo+qt;
        return saldo;
    }

    //metodo withdraw
    public double withdraw(int qt) {
        this.saldo = this.saldo-qt;
        return saldo;

    }


    //metodo getBalance
    public void getBalance() {
        System.out.println(saldo);
    }


}
