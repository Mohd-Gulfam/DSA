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

    public static void maxSubArray1(int[] arr){//o(n3)
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            int start = i;
                for(int j=i+1;j<n;j++){
                    int end = j;
                    int currSum = 0;
                    for(int k = start; k<=end; k++){
                        currSum += arr[k];
                    }
                    System.out.println(currSum);
                    if(maxSum<currSum){
                        maxSum = currSum;
                    }
                }
        }
        System.out.println("max subarray sum:"+maxSum);

    }


    public static void main(String[] args) {
        int arr[] = {2,4,6,7,9,10};
//        printSubArray(arr);
           maxSubArray1(arr);
    }
}
