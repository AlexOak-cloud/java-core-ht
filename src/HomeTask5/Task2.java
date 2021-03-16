package HomeTask5;

public class Task2 {
    public static void main(String[] args) {
        calculatable(5);
    }

    public static void calculatable(int a) {
        for (int i = 0; i < a + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
    }
}
