public class reverseNumber {
    public static void main(String[] args) {

        int n = 1234;
        int rev = 0;

        while (n > 0) {

            int lastdigit = n % 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10) {
                System.out.println("Overflow");
                return;
            }

            rev = rev * 10 + lastdigit;

            n = n / 10;
        }

        System.out.println(rev);
    }
}