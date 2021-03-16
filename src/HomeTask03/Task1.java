package HomeTask03;

//   1 Вычисляет следующее выражение: 100 - (2 * (n + 3)∗ n - 7) ∗ n + 3 .n- натуральное число.

public class Task1 {
    public static void main(String[] args) {
        int n = 14;
        n = 100 - (2 * (n + 3) * n - 7) * n + 3;
        System.out.println(n);
    }
}