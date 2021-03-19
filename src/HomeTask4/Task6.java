package HomeTask4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(9);
                matrix[i][i] = 0;
                if (j > i) matrix[i][j] = -1;
                if (j < i) matrix[i][j] = 1;
            }
        }
        Utils.showAnyMatrix(matrix);
    }
}
