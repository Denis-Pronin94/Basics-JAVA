package quru.qa;

public class FirstApp {

    public static void main(String[] args) {

    int a = 6;
    int b = 3;

    System.out.println("a = " + a + "; b = " + b);
    System.out.println("Сложение " + (a + b));
    System.out.println("Вычитание " + (a - b));
    System.out.println("Деление " + (a / b));
    System.out.println("Умножение " + (a * b));
    System.out.println("Остатка от деления " + (a % b));
    System.out.println();

    if ( a > b ) {
        System.out.println("a больше b");
    }
    if ( a >= b ) {
            System.out.println("a больше b");
        }
    if ( a < b ) {
            System.out.println("a меньше b");
        }
    if ( a <= b ) {
            System.out.println("a меньше b");
        }
    if ( a == b) {
        System.out.println("а равно b");
    }
    if ( a != b) {
        System.out.println("а не равно b");
    }
    System.out.println();

    int num1 = Integer.MAX_VALUE + 1;
    System.out.println(num1);
    int num2 = Integer.MIN_VALUE - 1;
    System.out.println(num2);
    System.out.println();

    int num3 = Byte.MAX_VALUE + 1;
    System.out.println(num3);
    int num4 = Byte.MIN_VALUE - 1;
    System.out.println(num4);
    System.out.println();
    }
}