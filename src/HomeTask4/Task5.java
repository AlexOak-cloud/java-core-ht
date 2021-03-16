package HomeTask4;


import java.util.Arrays;
import java.util.Random;

//5 Создать матрицу 5х5 . Заполнить рандомно от 1 до 9(включительно).
// Заполнить-1 строку 3 и колонку 2
public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j] = random.nextInt(9);
                if (i == 2) matrix[i][j] = -1;
                if (j == 1) matrix[i][j] = -1;
            }

        }

        Utils.showAnyMatrix(matrix);
    }
}
