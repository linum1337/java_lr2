import java.util.Scanner;

public class SumScoresExample {
    public static void main(String[] args) {
        final int SENTINEL = -99;
        int sum, score;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите баллы за первый экзамен или "
                + SENTINEL + " для выхода: ");
        score = input.nextInt();
        sum = 0;
        while (score != SENTINEL) {
            sum += score;
            System.out.print("Введите баллы за следующий экзамен или "
                    + SENTINEL + " для выхода: ");
            score = input.nextInt();
        }
        System.out.println("Сумма баллов за все экзамены равна " + sum);
    }
}