package HomeTask5;

import java.util.Random;

public class Util {
    public static Random random = new Random();

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int[] initArray(int[] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = random.nextInt(9);
        }
        return arrayName;
    }

    public static int[][] createMatrix(int sizeX, int sizeY) {
        return new int[sizeX][sizeY];
    }

    public static void showArray(int[] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            System.out.print(arrayName[i] + " | ");
        }
    }

    public static void showMatrix(int[][] matrixName) {
        for (int i = 0; i < matrixName.length; i++) {
            for (int j = 0; j < matrixName.length; j++) {
                System.out.print(matrixName[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] initMAtrxi (int[][] matrixName){
        for (int i = 0; i < matrixName.length; i++) {
            for (int j = 0; j <matrixName.length ; j++) {
                matrixName[i][j] = random.nextInt(9);
            }
        }
        return matrixName;
    }
}

