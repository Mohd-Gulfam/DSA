package ARRAY;

public class LinearSearchArray {
    static void linearSearch(int arr[], int key){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println(key+" is present in the array index no"+i);
                return;
            }
        }
        System.out.println(key+" is not present in the array ");
    }
    public static void main(String[] args) {
        int arr[] = {5,8,10,6,7,0,45};
        int key = 10;
        linearSearch(arr,key);
    }
}
