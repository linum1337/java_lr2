import java.util.Scanner;

public class IsPalindromeVariantFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите четырёхзначное число: ");
        int num = input.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("Ошибка: число должно быть четырёхзначным!");
            return;
        }
        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;
        if (d1 == d4 && d2 == d3) {
            System.out.println(num + " — палиндром.");
        } else {
            System.out.println(num + " — не палиндром.");
        }
    }
}
