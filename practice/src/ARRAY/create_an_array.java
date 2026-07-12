package ARRAY;

import java.util.Scanner;

class create_an_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];

        System.out.print("Enter number of elements you want in the array. : ");
        int n = sc.nextInt();

        if (n > arr.length) {
            System.out.println("Array size should be less than or equal to " + arr.length);
            return;
        }

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println("Element " + i + " = " + arr[i]);
        }

        sc.close();
    }
}