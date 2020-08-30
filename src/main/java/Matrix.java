public class Matrix {
    private final double[][] values;

    public Matrix(double[][] values) {
        this.values = values.clone();
    }

    public int noOfRows() {
        return this.values.length;
    }

    public int noOfColumns() {
        return this.values[0].length;
    }
}
