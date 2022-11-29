public class SyncThreadTest {
    public static void main(String[] args){
        BankAccount account = new BankAccount(100);
        SyncThread t1 = new SyncThread(false, account, 10);
        SyncThread t2 = new SyncThread(true, account, 10);

        t1.start();
        t2.start();

    }
}
