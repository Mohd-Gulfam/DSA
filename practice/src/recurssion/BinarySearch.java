package recurssion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,6,8,4,5,3};
        int target = 8;
        int n = arr.length;
        System.out.println(returnIndex(arr, target,0,n-1));
    }

    private static int returnIndex(int[] arr, int target, int lo, int hi) {
        if (lo > hi) {
            return   -1;
        }
        int mid = lo+(hi - lo)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return returnIndex(arr, target, lo, mid-1);
        }
        else {
            return returnIndex(arr, target, mid+1, hi);
        }
    }

}
