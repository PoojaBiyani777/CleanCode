import java.util.Scanner;
import java.util.logging.Logger;

public class RowsColumnsZeroMatrix
{
    private static final Logger logger = Logger.getLogger(RowsColumnsZeroMatrix.class.getName());
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        int numberOfColumns = scanner.nextInt();

        logger.info("Number of Rows : " + numberOfRows);
        logger.info("Number of Columns : " + numberOfColumns);

        int[][] matrix = new int[numberOfRows][numberOfColumns];
        int[] rowsSet = new int[numberOfRows];
        int[] columnsSet = new int[numberOfColumns];

        for (int row = 0; row < numberOfRows; row++)
        {
            for (int column = 0; column < numberOfColumns; column++)
            {
                matrix[row][column] = scanner.nextInt();
                if (matrix[row][column] == 0)
                {
                    rowsSet[row] = 1;
                    columnsSet[column] = 1;
                }
            }
        }
        setRowsColumnsToZero(matrix, rowsSet, columnsSet);
        logger.info("Matrix after setting rows and columns to zero is : ");
        printMatrix(matrix, numberOfRows, numberOfColumns);
    }

    /*Prints the Matrix */
    public static void printMatrix(int[][] matrix, int numberOfRows, int numberOfColumns)
    {
        for (int row = 0; row < numberOfRows; row++)
        {
            for (int column = 0; column < numberOfColumns; column++)
            {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
    
    /* Sets the rows and columns to zero, which have atleast one element zero. */ 
    public static void setRowsColumnsToZero(int[][] matrix, int[] rowsSet, int[] columnsSet)
    {
        int numberOfRows = rowsSet.length;
        int numberOfColumns = columnsSet.length;

        for (int i = 0; i < numberOfRows; i++)
        {
            for (int j = 0; j < numberOfColumns; j++)
            {
                if (columnsSet[j] == 1 || rowsSet[i] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

