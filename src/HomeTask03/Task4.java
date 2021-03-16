package HomeTask03;

//4 Дано трехзначное целое число (то есть целое числоот 100 до 999). Найдите сумму его цифр
public class Task4 {
    public static void main(String[] args) {
        int x = 492;
        int a, b, c;
        int sum;
        a = x / 100;
        b = (x - (a * 100)) / 10;
        c = x - ((a * 100) + (b * 10));
        sum = a + b + c;
        System.out.println(sum);


    }
}
