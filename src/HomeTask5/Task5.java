package HomeTask5;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

    }

    //Task1 ->
    public static int[] delete5element(int[] arrayName) {
        int[] newArray = new int[9];
        newArray = Arrays.copyOf(arrayName, 3);
        newArray = Arrays.copyOfRange(arrayName, 5, 9);
        return newArray;
    }

    //Task2
    public static int[] sortedArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length / 2; j++) {
                if (array[i] < array[j]) {
                    int sort = array[i];
                    array[i] = array[j];
                    array[j] = sort;
                }
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int sort = array[i];
                    array[i] = array[j];
                    array[j] = sort;
                }
            }
        }
        return array;
    }

    public static int[] evenAndOdd(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                array[i] = 0;
            } else if (array[i] % 2 != 0) {
                array[i] = 1;
            }

        }
        return array;
    }

    //Task4
    public static int[] each3Element(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 2) array[i] = 3;
            if (i == 5) array[i] = 3;
            if (i == 8) array[i] = 3;
        }
        return array;
    }

    public static int[][] initmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                Util.initMAtrxi(matrix);
                if (i == 2) matrix[i][j] = -1;
                if (j == 1) matrix[i][j] = -1;
            }

        }
        return matrix;
    }
    public static int[][] initMatrix2(int[][] matrixName){
        for (int i = 0; i < matrixName.length; i++) {
            for (int j = 0; j < matrixName.length; j++) {
                Util.initMAtrxi(matrixName);
                matrixName[i][i] = 0;
                if (j > i) matrixName[i][j] = -1;
                if (j < i) matrixName[i][j] = 1;
            }
        }
        return matrixName;
    }
}
