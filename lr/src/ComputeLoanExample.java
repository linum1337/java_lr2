import java.util.Scanner;

public class ComputeLoanExample {
    public static void main(String[] args) {
        final int MONTHS_PER_YEAR = 12;
        double annualInterestRate, monthlyInterestRate,
                loanAmount, monthlyPayment, totalPayment;
        int numberOfYears;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ежегодную ставку по кредиту в %, например, 8.25: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Введите срок кредита в годах, например, 5: ");
        numberOfYears = input.nextInt();
        System.out.print("Введите сумму кредита в рублях, например, 120000.95: ");
        loanAmount = input.nextDouble();
        monthlyInterestRate = annualInterestRate / 12 / 100;
        monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears *
                MONTHS_PER_YEAR));
        totalPayment = monthlyPayment * numberOfYears * MONTHS_PER_YEAR;
        System.out.println("Ежемесячный платеж равен " +
                (int) (monthlyPayment * 100) / 100.0 + " руб.");
        System.out.println("Стоимость кредита равна " +
                (int) (totalPayment * 100) / 100.0 + " руб.");
    }
}