public class SyncThread extends Thread {

    private boolean check;
    private BankAccount account;
    private double qt;

    public SyncThread(boolean check, BankAccount account, double qt){
        this.check = check;
        this.account = account;
        this.qt = qt;
    }

    @Override
    public void run(){
        if(!check){
            account.withdraw(qt);
            System.out.println("Hai prelevato: " + qt);

        } else {
            account.deposit(qt);
            System.out.println("Hai depositato: " + qt);

        }
    }
}