package TWO_POINTER;
import java.util.*;

public class TriplitCount {
    int countTriplets(int target, int arr[]) {

        int n = arr.length;
        int count = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum < target) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
