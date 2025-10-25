import java.util.Scanner;

public class FindEqualFifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первое целое число: ");
            int a = input.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = input.nextInt();
            if (a == 0 || b == 0) {
                System.out.println("Ноль нельзя использовать для проверки кратности. Попробуйте снова.\n");
                continue;
            }
            if (a % b == 0 || b % a == 0) {
                System.out.println("Одно из чисел кратно другому! Программа завершена.");
                break;
            } else {
                System.out.println("Ни одно из чисел не кратно другому. Попробуйте снова.\n");
            }
        }
    }
}
