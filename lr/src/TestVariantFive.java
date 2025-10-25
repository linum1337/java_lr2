import java.util.Scanner;

public class TestVariantFive {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("Тестовые задания. Выберите номер правильного ответа.\n");

        System.out.println("1. Система программного обеспечения, что управляет работой всех структурных узлов компьютера, называется:");
        System.out.println("    1) автоматизированная");
        System.out.println("    2) операционная");
        System.out.println("    3) интеллектуальная");
        System.out.print("Введите номер ответа: ");
        int answer = input.nextInt();
        if (answer == 2) totalScore += 2;

        System.out.println();

        System.out.println("2. Совокупность данных, что размещены на диске и имеют общее имя и назначение, это:");
        System.out.println("    1) файл");
        System.out.println("    2) процессор");
        System.out.println("    3) сектор");
        System.out.print("Введите номер ответа: ");
        answer = input.nextInt();
        if (answer == 1) totalScore += 2;

        System.out.println();

        System.out.println("3. Для изображения в блок-схеме алгоритма условия разветвления используются графические элементы:");
        System.out.println("    1) квадрат");
        System.out.println("    2) круг");
        System.out.println("    3) ромб");
        System.out.print("Введите номер ответа: ");
        answer = input.nextInt();
        if (answer == 3) totalScore += 1;

        System.out.println("\nТест завершен.");
        System.out.println("Ваш итоговый балл: " + totalScore);
    }
}
