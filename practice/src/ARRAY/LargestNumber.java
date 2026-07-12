package ARRAY;

public class LargestNumber {

    static int largerNumber(int[] arr) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int arr[] = {5, 8, 10, 6, 7, 0, 45};

        System.out.println("Largest Number = " + largerNumber(arr));
    }
}