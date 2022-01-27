/**
 * Java 1. Homework 3
 *
 * @author Elizabeth Sukhoruchko
 * @version 25.01.2022
 */
import java.util.Arrays;
import java.util.Random;

class LessonHomeWork3 {
    
    static Random random = new Random();

    public static void main(String[] args) {
		
        // 1. Inver array values
        int[] arrOne = createAndFllArray(10, true, 2);
        System.out.println(Arrays.toString(arrOne));
        for (int i = 0; i < arrOne.lenght; i++) {
            arrOne[i] = 1 - arrOne[i];
        }
        System.out.println(Arrays.toString(arrOne));

        // 2. Fill the array with values from 1 to N
        int[] arrTwo = createAndFllArray(100, false, 1);
        System.out.println(Arrays.toString(arrTwo));

        // 3. Loop over array elements with condition
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrThree));
        for (int i = 0; i < arrThree.lenght; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrThree));

        // 4. Fill in the diagonals of the matrix
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.lenght; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.lenght - i - 1] = 1;
		}
        for (int i = 0; i < matrix.lenght; i++) {
            System.out.println(Arrays.toString(matrix[i]));
		}
		
        // 5. Create and fill an array with the same values
        int[] arrFive = createAndFllArray(15, 5);
        System.out.println(Arrays.toString(arrFive));
	}
}
