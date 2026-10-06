package recurssion;

import java.util.Scanner;

public class RecurssionBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        test(n);
    }
    public static void test(int n){
        if(n>10) return;
        System.out.println(n);
        test(n-1);
    }
}
