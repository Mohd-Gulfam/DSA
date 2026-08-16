package TWO_POINTER;

//Example 1:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

import java.util.Arrays;

public class Two_Sum_2 {
    public static int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int i = 0, j = n-1;
        while(i<j){
            int sum =nums[i] + nums[j];
            if(sum == target){
                return new int[]{i+1 , j+1};
            }else if (sum > target){
                j--;
            }else{
                i++;
            }

        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }

}
