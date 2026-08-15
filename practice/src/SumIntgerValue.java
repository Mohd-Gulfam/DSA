//public class SumIntgerValue {
//    public static int singleDigit(int n){
//        int m =  893478;
//        int c = 1+(n-1) %9;
//        System.out.println(c);
//    }
//
//    public static int sum(int nums) {
//        int sum = 0;
//
//        while (nums != 0) {
//            int digit = nums % 10;
//            sum = sum + digit;
//            nums = nums / 10;
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//        int nums = 893478;
//
//        int sum1 = sum(nums);
//
//        while (sum1 > 9) {
//            sum1 = sum(sum1);
//        }
//
//        System.out.println(sum1);
//    }
//}
public class SumIntgerValue {

    public static int singleDigit(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + (n - 1) % 9;
    }

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

        int result = singleDigit(nums);

        System.out.println(result);
    }
}

