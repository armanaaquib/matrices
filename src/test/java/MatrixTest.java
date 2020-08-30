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
}