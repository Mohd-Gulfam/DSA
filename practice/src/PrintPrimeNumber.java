import java.util.*;
public class PrintPrimeNumber {
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int count = 0;
        for (int i = 2;  i <= n/2; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if(count == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        int nums = 50;
        for (int i = 2; i <= nums; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
