package TWO_POINTER;

public class SquaringAShortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length-1;
        int[] result = new int[n+1];

        int left = 0;
        int right = n;
        int k = n;

        while(left <= right){
            int leftSqr = nums[left]*nums[left];
            int rightSqr = nums[right]*nums[right];

            if(leftSqr > rightSqr){
                result[k] = leftSqr;
                left++;
            }else{
                result[k] = rightSqr;
                right--;
            }
            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        SquaringAShortedArray sqsa = new SquaringAShortedArray();
        sqsa.sortedSquares(arr);
    }
}


