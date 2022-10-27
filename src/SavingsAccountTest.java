public class SavingsAccountTest {
    public static void main(String [] args){
        SavingsAccount oggetto = new SavingsAccount(10);

        oggetto.deposit(30);
        System.out.println("Il saldo senza interessi è: " + oggetto.getBalance());

        oggetto.addInterest();

        System.out.println("Il saldo con gli interessi è: " + oggetto.getBalance());
    }
}
