import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void noOfRows() {
        double[][] values = {{1, 2, 3}, {4, 5, 6}};
        final Matrix matrix = new Matrix(values);

        assertEquals(2, matrix.noOfRows());
    }

    @Test
    public void noOfColumns() {
        double[][] values = {{1, 2, 3}, {4, 5, 6}};
        final Matrix matrix = new Matrix(values);

        assertEquals(3, matrix.noOfColumns());
    }

    @Test
    public void equals() {
        final double[][] values = {{1, 2, 3}, {4, 5, 6}};

        final Matrix matrix = new Matrix(values);
        final Matrix matrix1 = new Matrix(values);

        assertEquals(matrix, matrix1);

        final double[][] values1 = {{1, 2, 3}, {1, 2, 3}};
        final Matrix matrix2 = new Matrix(values1);

        assertNotEquals(matrix, matrix2);
    }

    @Test
    public void add() {
        final double[][] values = {{1, 2, 3}, {4, 5, 6}};
        final double[][] values1 = {{1, 2, 3}, {1, 2, 3}};

        final Matrix matrix = new Matrix(values);
        final Matrix matrix1 = new Matrix(values1);

        final double[][] values2 = {{2, 4, 6}, {5, 7, 9}};
        final Matrix matrix2 = new Matrix(values2);

        assertEquals(matrix2, matrix.add(matrix1));
    }
}