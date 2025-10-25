import java.util.Scanner;

public class ConvertAmountExample {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        double roubles;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму денег в американских долларах: ");
        dollars = input.nextInt();
        roubles = ROUBLES_PER_DOLLAR * dollars;
        System.out.println("Она равна " + (int)(roubles * 100) / 100.0 + " российского рубля.");
    }
}
