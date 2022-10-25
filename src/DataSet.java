
public class DataSet {

    private Measurable maximum;

    private int count = 0;

    private double sum = 0;

    public Measurable getMaximum() { return maximum; }


    public void add(Measurable x) {
        sum = sum + x.getMeasure();

        if (count == 0 || x.getMeasure() > maximum.getMeasure()) {
            maximum = x;
        }
        count++;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }
}


