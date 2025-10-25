import java.util.Scanner;

public class ComputeAreaWithConsoleInputOnlyPositive {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Ошибка: радиус не может быть отрицательным.");
        } else {
            area = 3.14159 * radius * radius;
            System.out.println("Площадь круга для радиуса " +
                    radius + " равна " + area + ".");
        }
    }
}
