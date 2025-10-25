import java.util.Scanner;

public class RepeatAdditionQuizExample {
    public static void main(String[] args) {
        int number1, number2, answer;
        Scanner input = new Scanner(System.in);
        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);
        System.out.print(
                "Сколько будет " + number1 + " + " + number2 + "? ");
        answer = input.nextInt();
        while (number1 + number2 != answer) {
            System.out.println("Неправильный ответ. Попробуйте еще раз. ");
            System.out.print("Сколько будет " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("Вы угадали!");
    }
}