package HomeTask4;

import java.util.Random;

public class Utils {

    private static Random random = new Random();

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static void showArray(int[] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            System.out.print(arrayName[i]+ ", ");
        }
        System.out.println();
    }

    public static void initAnyArray(int[] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = random.nextInt(10);
        }
    }
    public static void showAnyMatrix(int[][] matrixName){
        for (int i = 0; i < matrixName.length; i++) {
        for (int j = 0; j < matrixName.length; j++) {
            System.out.print(matrixName[i][j] + " | ");
        }
        System.out.println();
    }
}

}
