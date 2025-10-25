import java.util.Scanner;

public class FindPositiveFourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCount, negativeCount, number;
        positiveCount = 0;
        negativeCount = 0;
        System.out.println("Введите числа (для завершения введите 0):");
        while (true) {
            System.out.print("Введите число: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.println("\nКоличество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
    }
}
