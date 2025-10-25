package IDZ;

import java.util.Scanner;

public class SecondTaskVariantFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите начало интервала a: ");
        double a = input.nextDouble();
        System.out.print("Введите конец интервала b: ");
        double b = input.nextDouble();
        System.out.print("Введите количество точек n: ");
        int n = input.nextInt();
        if (n < 2 || a > b) {
            System.out.println("Ошибка: n должно быть >= 2, а a ≤ b.");
            return;
        }
        double step = (b - a) / (n - 1);
        System.out.println("\nТаблица значений функции y = 1 - sin²(t):");
        for (int i = 0; i < n; i++) {
            double t = a + i * step;
            double y = 1 - Math.pow(Math.sin(t), 2);
            System.out.println(t + " | " + y);
        }
    }
}
