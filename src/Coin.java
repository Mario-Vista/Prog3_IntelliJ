public class Coin implements Measurable{

    private double value;

    public Coin(double value){
        this.value = value;
    }


    @Override
    public double getMeasure(){
        return this.value;
    }
}
