package IDZ;

import java.util.Scanner;

public class ThirdTaskVariantFive {
    public static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Ошибка: N должно быть неотрицательным числом.");
            return;
        }
        System.out.println("F(" + n + ") = " + fib(n));
    }
}
