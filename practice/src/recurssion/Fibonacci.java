package recurssion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:   ");
        int a = sc.nextInt();
        System.out.println(fibo(a));
    }

    public static int fibo(int a) {
        if(a<=1) {
            return a;
        }
        return fibo(a-1)+fibo(a-2);


    }
}
