package HomeTask5;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(simpleCheck(2));
    }

    public static boolean simpleCheck(int x) {
        boolean check = true;

        if (x % x == 0 && x % 1 == 0 && x % 2 != 0 && x % 3 != 0 && x % 3 != 0)
            check = true;
        else check = false;
        return check;
    }
}
