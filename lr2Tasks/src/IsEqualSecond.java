import java.util.Scanner;

public class IsEqualSecond {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение n: ");
        n = input.nextInt();
        int firstNQuery = 0;
        for (int i = 0; i <= n; i++) {
            firstNQuery += i;
        }
        int secondQuery = (n * (n + 1)) / 2;
        System.out.println(firstNQuery + " " + secondQuery);
        if (secondQuery == firstNQuery) {
            System.out.println("Выражения эквивалентны");
        }
        else System.out.println("Выражения не эквивалентны");

    }
}
