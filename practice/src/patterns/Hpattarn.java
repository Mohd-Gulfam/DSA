package patterns;

public class Hpattarn {
    public static void main(String[] args) {

        int n = 5;

        for (int j = 0; j < n; j++) {

            for (int k = 0; k < n; k++) {

                // First column OR last column OR middle row
                if (k == 0 || k == n - 1 || j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}