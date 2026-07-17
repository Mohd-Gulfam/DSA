package ARRAY;

public class subArray {
    static void printSubArray(int[] arr){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i+1;j<arr.length;j++){
                int end = j;
                for(int k = start; k<= end; k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray length:"+ts);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,7,9,10};
        printSubArray(arr);
    }
}
