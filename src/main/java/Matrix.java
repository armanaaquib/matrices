import java.util.Arrays;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Matrix)) return false;

        Matrix that = (Matrix) obj;
        return Arrays.deepEquals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(values);
    }
}
