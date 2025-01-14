package app;

public class Solution {
    public static void main(String[] args) {

        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "X"} // Некоректний елемент
        };

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        try {
            int result = calculator.doCalc(matrix);
            System.out.println("Sum of elements: " + result);
        } catch (ArraySizeException ase) {
            System.err.println("Array size error: " + ase.getMessage());
        } catch (ArrayDataException ade) {
            System.err.println("Array data error: " + ade.getMessage());
        }
    }
}