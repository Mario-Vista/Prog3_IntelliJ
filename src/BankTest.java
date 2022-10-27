public class BankTest {
    public static void main(String[] args) {

        //ESERCIZIO 2
        int num = 10;

        Bank Ing = new Bank(num);

        for (int i = 1; i < num; i++) {
            Ing.getBankAccount(i).deposit(60000);
        }

        Ing.getBankAccount(1).deposit(1000);
        Ing.getBankAccount(1).deposit(6000);
        Ing.getBankAccount(2).deposit(3000);
        Ing.getBankAccount(3).deposit(4000);
        Ing.getBankAccount(3).deposit(5000);
        Ing.getBankAccount(3).deposit(6000);
        Ing.getBankAccount(4).deposit(7000);
        Ing.getBankAccount(5).deposit(8000);
        Ing.getBankAccount(6).deposit(9000);






        System.out.println("Il bilancio totale è " + Ing.totBalance());

        System.out.println("Il numero totale di depositi è " + Ing.getTotDeposit());

        for(int i = 0; i<10; i++) {
            System.out.println("Il numero del " + i + "conto è "+ Ing.getContoCorrente(i));
        }

        for(int i = 1; i<num; i++) {
            System.out.println("Il saldo senza tasse dell' " + i + "-esimo conto è "+ Ing.getBankAccount(i).getBalance());
        }


        Ing.calcoloTasse();

        for(int i = 1; i<num; i++) {
            System.out.println("Il saldo con le tasse dell' " + i + "-esimo conto è "+ Ing.getBankAccount(i).getBalance());
        }


        for (int i = 0; i < num; i++) {
            System.out.println("Saldo in euro " + Ing.getBankAccount(i).getBalance());
            Ing.cambioValuta(i, 2);
        }

    }
}
