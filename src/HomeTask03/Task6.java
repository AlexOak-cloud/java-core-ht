package HomeTask03;

//6Создать программу, выводящую на экран ближайшеек 10 из двух чисел, записанных впеременныеmиn.
//        Например, среди чисел 8,5 и 11,45ближайшее к десяти 11,45

public class Task6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int x = returnInteger(a - 10);
        int y = returnInteger(b - 10);

        returnDigital(returnInteger(a), returnInteger(b));


    }

    public static void returnDigital(int a, int b) {
        if (a < b) {
            System.out.println("Переменная \"a\" ближе к 10");
        } else if (a > b) {
            System.out.println("Переменная \"b\" ближе к 10");
        }


    }

    public static int difference(int a) {
        a -= 10;
        return a;
    }

    public static int returnInteger(int local) {
        local = difference(local);
        if (local < 0) local = local * (-1);
        return local;
    }
}
