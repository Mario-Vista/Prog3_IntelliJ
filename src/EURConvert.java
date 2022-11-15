public class EURConvert  implements CurrencyConverter{

    @Override
    public double convert(double qt){
        return qt * 0.97;
    }
}

