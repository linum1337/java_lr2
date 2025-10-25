public class InnerForTriangleSixth {
    public static void main(String[] args) {
        for (int j = 0; j <= 5; j++){
            for (int h = 0; h <= j; h++) {
                System.out.print(h + " ");
            }
            System.out.println();
        }
        for (int j = 4; j >= 0; j--) {
            for (int h = 0; h <= j; h++) {
                System.out.print(h + " ");
            }
            System.out.println();
        }
    }
}
