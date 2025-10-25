public class ColumnOfNumbersFirst {
    public static void main(String[] args) {
        int columnValue = 1;
        for (int i = 0; i <= 6; i++) {
            columnValue = (int) Math.pow(2, i);
            System.out.println(i + " " + columnValue);
        }
    }
}
