package IDZ;

import java.util.Scanner;

public class FirstTaskVariantFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите натуральное число n (n ≤ 1000): ");
        int n = input.nextInt();
        System.out.println("Делители числа " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
