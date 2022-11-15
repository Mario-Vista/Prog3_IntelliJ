public class NoFundsException extends Exception{
    public NoFundsException(){super("Saldo non sufficiente");}

    @Override
    public String toString(){
        return getMessage() + "minore di 0";
    }

}
