import java.util.Scanner;

public class CostTaxiExample {
    public static void main(String[] args) {
        int initialdata, finaldata, distance;
        double costoftravel;
        final double COST_T = 8.50;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите начальные показания одометра: ");
        initialdata = input.nextInt();
        System.out.print("Введите конечные показания одометра: ");
        finaldata = input.nextInt();
        distance = finaldata - initialdata;
        costoftravel = distance * COST_T;
        System.out.println("Вы проехали " + distance + " км." + " Из расчета 8 руб. 50 коп.за км, " +
                "стоимость проезда равна " + (int) costoftravel + " руб. " +
                        (int) ((costoftravel - (int) costoftravel) * 100) + " коп.");
    }
}