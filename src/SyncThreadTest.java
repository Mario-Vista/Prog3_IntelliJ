public class SyncThreadTest {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(100);
        SyncThread t1 = new SyncThread(false, account, 10);
        SyncThread t2 = new SyncThread(true, account, 20);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(account.getBalance());

    }
}
