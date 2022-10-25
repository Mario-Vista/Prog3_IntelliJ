public class DataSetTest {
    public static void main(String [] args){
        DataSet bancaDati = new DataSet();
        DataSet bancaDatiCoin = new DataSet();



        bancaDati.add(new BankAccount(100));
        bancaDati.add(new BankAccount(200));
        bancaDati.add(new BankAccount(300));
        bancaDati.add(new BankAccount(400));
        bancaDati.add(new BankAccount(500));


        // media della banca
        System.out.println("Bank Average: " + bancaDati.getAverage());

        // per il massimo abbiamo bisogno di instanziare un oggeto bankAccount di tipo Measurable assegnandoci
        // il valore di ritorno Measurable, ho bisogno di quest'operazione dato che il tipo di dato bankSet
        // è un DataSet, a differenza di banca che invece è measurable, quindi possi applicare direttamente il metodo
        Measurable maxBank = bancaDati.getMaximum();
        System.out.println("Max Bank: " + maxBank.getMeasure());

        bancaDatiCoin.add(new Coin (1));
        bancaDatiCoin.add(new Coin (2));
        bancaDatiCoin.add(new Coin (3));
        bancaDatiCoin.add(new Coin (4));
        bancaDatiCoin.add(new Coin (5));

        // media della banca
        System.out.println("Bank Average: " + bancaDatiCoin.getAverage());

        // per il massimo abbiamo bisogno di instanziare un oggeto bankAccount di tipo Measurable assegnandoci
        // il valore di ritorno Measurable, ho bisogno di quest'operazione dato che il tipo di dato bankSet
        // è un DataSet, a differenza di banca che invece è measurable, quindi possi applicare direttamente il metodo
        Measurable maxCoin = bancaDatiCoin.getMaximum();
        System.out.println("Max Coin: " + maxCoin.getMeasure());


    }


}
