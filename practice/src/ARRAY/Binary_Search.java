package ARRAY;

public class Binary_Search {
    static int binarySearch(int arr[], int key){
        int left = 0;
        int  n = arr.length;
        int right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(key == arr[mid]){
                return mid;
            }else if(key < arr[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,9,10};
        int key = 18;
        System.out.println(binarySearch(arr,key));
    }
}
