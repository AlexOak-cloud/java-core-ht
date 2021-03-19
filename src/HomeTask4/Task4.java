package HomeTask4;

import java.util.Arrays;
import java.util.Random;


// 4 Создать массив интов длинной 10.
// Заполнить рандомно от 0 до 9(включительно).
// Каждый 3й элемент заменить на 3

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(8);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i == 2) array[i] = 3;
            if (i == 5) array[i] = 3;
            if (i == 8) array[i] = 3;
        }
        System.out.println(Arrays.toString(array));
    }
}

