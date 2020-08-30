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

    private boolean orderEquals(Matrix that) {
        return this.noOfRows() == that.noOfRows() && this.noOfColumns() == that.noOfColumns();
    }

    public Matrix add(Matrix that) {
        if (!this.orderEquals(that)) {
            return null;
        }

        int noOfRows = this.noOfRows();
        int noOfColumns = this.noOfColumns();

        double[][] newValues = new double[noOfRows][noOfColumns];

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                newValues[i][j] = this.values[i][j] + that.values[i][j];
            }
        }

        return new Matrix(newValues);
    }
}
