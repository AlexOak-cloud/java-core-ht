package HomeTask03;


//         5 В три переменные a,b и c явно записаны программистом три целых
//        попарно неравныхмежду собой числа.
//        Создать программу, которая перестави тчисла в переменных такимобразом,
//        чтобы при выводе на экран последовательность a,b и c оказалась строговозрастающей.


public class Task5 {
    public static void main(String[] args) {
        int a = 43;
        int b = 21;
        int c = 56;

        Comparison(a,b,c);
    }

    public static int returnDigital(int local) {
        int firstSymbol = local / 10;
        int secondSymbol = local - (firstSymbol * 10);
        if (firstSymbol < secondSymbol) {
            local = (firstSymbol * 10) + secondSymbol;
        } else if (secondSymbol < firstSymbol) {
            local = (secondSymbol * 10) + firstSymbol;
        }
        return local;
    }

    public static void Comparison(int a, int b, int c) {
        if (a < b && a < c) {
            if (b < c) {
                System.out.print(returnDigital(a));
                System.out.print(returnDigital(b));
                System.out.print(returnDigital(c));
            } else if (c < b) {
                System.out.print(returnDigital(a));
                System.out.print(returnDigital(c));
                System.out.print(returnDigital(b));
            }
        } else if (b < c && b < a) {
            if (a < c) {
                System.out.print(returnDigital(b));
                System.out.print(returnDigital(a));
                System.out.print(returnDigital(c));
            } else if (c < a) {
                System.out.print(returnDigital(b));
                System.out.print(returnDigital(c));
                System.out.print(returnDigital(a));
            }
        } else if (c < b && c < a) {
            if (b < a) {
                System.out.print(returnDigital(c));
                System.out.print(returnDigital(b));
                System.out.print(returnDigital(a));
            } else if (a < b) {
                System.out.print(returnDigital(c));
                System.out.print(returnDigital(a));
                System.out.print(returnDigital(b));
            }
        }
    }
}
