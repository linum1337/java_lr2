import java.util.Scanner;

public class ComputeFactorialExample {
    public static void main(String[] args) {
        int n, i, product;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        n = input.nextInt();
        product = 1;
        for (i = n; i > 1; --i)
            product *= i;
        System.out.println(n + "! равно " + product);
    }
}