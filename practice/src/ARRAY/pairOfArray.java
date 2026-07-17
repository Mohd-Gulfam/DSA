package ARRAY;

public class pairOfArray {
    static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+curr+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,9,10};
        pair(arr);
    }
}
