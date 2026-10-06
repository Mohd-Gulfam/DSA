package recurssion;

import java.util.Scanner;



public class OneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(1,n);
        print1ToN(n);

    }
    public static void print(int x,int n){
        if(n<x) return;
        System.out.print(x);
        print(x+1,n);

    }
    public static void print1ToN(int n){
        if(n==0) return;
        print1ToN(n-1);
        System.out.print(" " +n);
    }

}
