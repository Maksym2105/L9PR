package app;

public class ArrayValueCalculator {

    public int doCalc(String[][] matrix) throws ArraySizeException, ArrayDataException {
        if (matrix.length != 4) {
            throw new ArraySizeException("Array size must be 4");
        }
        for (String[] row : matrix) {
            if (row.length != 4) {
                throw new ArraySizeException("Each row must have 4 columns");
            }
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at cell [" + i + "][" + j + "]: " + matrix[i][j], e);
                }
            }
        }
        return sum;
    }
}