/**
 * Java 1. Homework 3
 *
 * @author Elizabeth Sukhoruchko
 * @version 24.01.2022
 */
import java.until.Arrays;
import java.until.Random;

class Lesson3Homework {

    static Random random = new Random();

    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        int[] arrOne = createAndFllArray(10, true, 1);
        System.out.println(Arrays.toString(arrOne));
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = 1 - arrOne[i];
        }
        System.out.println(Arrays.toString(arrOne));

        // 2. Задать пустой целочисленный массив длиной 100
        int[] arrTwo = createAndFllArray(100, false, 1);
        System.out.println(Arrays.toString(arrTwo));

        // 3. Задать массив
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrThree));
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *=2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        // 4.  Создать квадратный двумерный целочисленный массив
        int [][] matrix = new int [2][2];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // 5. Написать метод, принимающий на вход два аргумента
        int[] arrFive = createAndFllArray(10, 5);
        System.out.println(Arrays.toString(arrFive));

        // 6. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arrSix = createAndFllArray(10, true, 10);
        System.out.println(Arrays.toString(arrSix));
        int[] minMax = findMinMax(arrSix);
        System.out.println(Arrays.toString(minMax));
    }
}