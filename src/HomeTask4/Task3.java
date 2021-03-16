package HomeTask4;

import java.util.Arrays;
import java.util.Random;

//3Создать массив интов длинной  10.
// Заполнить рандомно от 0 до 9(включительно).Заменить все четныена 0,
// нечетныена1

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                array[i] = 0;
            } else if (array[i] % 2 != 0) {
                array[i] = 1;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}


