public class SumIntgerValue {

    public static int sum(int nums) {
        int sum = 0;

        while (nums != 0) {
            int digit = nums % 10;
            sum = sum + digit;
            nums = nums / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int nums = 893478;

        int sum1 = sum(nums);

        while (sum1 > 9) {
            sum1 = sum(sum1);
        }

        System.out.println(sum1);
    }
}