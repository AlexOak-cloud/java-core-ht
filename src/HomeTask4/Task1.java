package HomeTask4;

import java.util.Arrays;
import java.util.Random;

//1Создатьмассивинтовдлинной10.
// Заполнитьрандомноот0до9(включительно).Удалить5йэлемент
public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9);
        }
        for (int local : array) {
            System.out.print(local + " | ");

            //Delete 5 element ->
            int[] newArray = new int[9];

            newArray = Arrays.copyOf(array, 3);
            newArray = Arrays.copyOfRange(array, 5, 9);

            for (int x : newArray) {
                System.out.print(local + " | ");
            }

        }
    }
}
