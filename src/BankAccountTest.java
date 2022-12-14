/*Implementare una classe BankAccountTest per il collaudo
        della classe BankAccount
        Inserimento denaro
        Prelievo
        Stampa Saldo
        Domanda: come associare automaticamente un numero di conto in
        base all’ultimo numero di conto associato*/

public class BankAccountTest {
    public static void main(String[] args) {

        //ESERCIZIO 1
        BankAccount oggetto = new BankAccount(200);


        oggetto.getBalance();


        oggetto.deposit(30);

        oggetto.getBalance();

        oggetto.withdraw(230);

        oggetto.getBalance();

        //genera Eccezione
        oggetto.withdraw(10);

        oggetto.deposit(39);

        System.out.println(oggetto.getBalance());
        System.out.println(oggetto.getGBPConvert(30));
        System.out.println(oggetto.getJPYConvert(30));
        //BankAccount.Enum.Currency.EUR
        System.out.println(oggetto.convertTo(BankAccount.Currency.EUR, 10));




    }
}

