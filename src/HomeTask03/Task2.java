package HomeTask03;

//2 Дано натуральное число x, выведите вторую справацифру из числа.
// Если этой цифры нет,вывести ноль.Например: 123 -> вывод: 2, 345 -> 4, 7 -> 0.
public class Task2 {
    public static void main(String[] args) {
        int x = 128;

        int result = x % 100 / 10;

        System.out.println(result);
    }
}
