package TWO_POINTER;

public class ShortedUnshortedArray {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int left = -1;
        int right = -1;

        for (int i = 0; i < n; i++) {

            // Left to Right
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                right = i;
            }

            // Right to Left
            int j = n - 1 - i;
            min = Math.min(min, nums[j]);
            if (nums[j] > min) {
                left = j;
            }
        }

        return right == -1 ? 0 : right - left + 1;
    }
}
