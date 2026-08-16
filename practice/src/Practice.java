public class Practice {

//    second maximum number
    public static void secondMax(int n){
        int max = -1;
        int secondMax = -1;
        while(n!=0){
            int digit = n%10;
            if(digit>max){
                secondMax = max;
                max = digit;

            }else if(digit>secondMax && digit!=max){
                secondMax = digit;
            }
            n = n/10;

        }

        System.out.println("maximum value  : "  +max);
        System.out.println("second max value : "  +secondMax);

    }

    public static void lastDigit5(int n){
        int num = 0;
        for (int i = 0; i < n; i++) {

            num = i*i;
            int  digit = num%10;
            if(digit == 5){
                System.out.println(i);
                System.out.println(num);
            }
//            if ((num % 5) == 0 && (num % 10 != 0)) {
//                System.out.println(i);
//                System.out.println(num);
//            }

        }

    }

//    n = 45;
//    sqr = 2025  sum = 20+25 = 45 == n  return true
    public static boolean check(int a){
        int original = a;
        int sqr = a*a;
        int lastdigit = a%10;
         a = a/10;
         int sum = a*(a+1) + lastdigit*lastdigit;
         if(original==sum){
             return true;
         }
        System.out.println("number : " + original);
        System.out.println("sqr of number : "+ sqr);
        System.out.println("sum of number :"+sum);
         return false;

    }


    public static void main(String[] args) {
        int n = 25;

//        secondMax(n);
//        lastDigit5(n);
        boolean check = check(n);
        System.out.println(check);

    }

}
