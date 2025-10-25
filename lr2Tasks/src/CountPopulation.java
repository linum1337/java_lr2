public class CountPopulation {
    public static void main(String[] args) {
        double population = 9870;
        int countYears = 0;
        while (population <= 30000) {
            System.out.println("Год: " + countYears + " Население: " + population);
            population *= 1.10;
            countYears++;
        }

        System.out.println("Население превысит 30 000 человек через: " + countYears);
    }
}
