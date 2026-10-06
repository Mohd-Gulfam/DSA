package recurssion;

import java.util.Scanner;

public class GCDof2N {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a");
        int a=sc.nextInt();
        System.out.println("Enter the number b");
        int b=sc.nextInt();
        System.out.println("gcd of a,b is " + gcdof2N(a,b));



    }
    public static int gcdof2N(int a,int b  ) {
        return helper(Math.min(a,b),Math.max(a,b) );

    }
    public static int helper(int a , int b ) {
        if(a==0 ) return b;
        return helper(b%a, a);
    }
}
