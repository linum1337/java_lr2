import java.util.Scanner;

public class ComputeProductExample {
    public static void main(String[] args) {
        int n, product;
        Scanner input = new Scanner(System.in);
        product = 1;
        while (product < 10000) {
            System.out.println(product);
            System.out.print("Введите целое число: ");
            n = input.nextInt();
            product *= n;
        }
    }
}