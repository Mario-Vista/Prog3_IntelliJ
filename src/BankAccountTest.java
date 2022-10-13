/*Implementare una classe BankAccountTest per il collaudo
        della classe BankAccount
        Inserimento denaro
        Prelievo
        Stampa Saldo
        Domanda: come associare automaticamente un numero di conto in
        base all’ultimo numero di conto associato*/

public class BankAccountTest {
    public static void main(String[] args) {
        /*BankAccount oggetto = new BankAccount(200);

        oggetto.getBalance();


        oggetto.deposit(30);

        oggetto.getBalance();

        oggetto.withdraw(50);

        oggetto.getBalance();*/

            /*
        SavingsAccount oggetto = new SavingsAccount(10);

        oggetto.deposit(30);
        System.out.println(oggetto.getBalance());

        oggetto.addInterest()

        System.out.println(oggetto.getBalance());

             */

        Bank Ing = new Bank(10);

        Ing.getBankAccount(1).deposit(1000);
        Ing.getBankAccount(1).deposit(2000);
        Ing.getBankAccount(2).deposit(3000);
        Ing.getBankAccount(3).deposit(4000);
        Ing.getBankAccount(3).deposit(5000);
        Ing.getBankAccount(3).deposit(6000);
        Ing.getBankAccount(4).deposit(7000);
        Ing.getBankAccount(5).deposit(8000);
        Ing.getBankAccount(6).deposit(9000);




        System.out.println("Il bilancio totale è " + Ing.totBalance());

        System.out.println("Il numero totale di depositi è " + Ing.getTotDeposit());
        //Ing.calcoloTasse()
        //Ing.getcontocorrente();
        //Ing.getTotDeposit();
        //Ing.cambioValuta();

    }
}
