
    import java.util.Arrays;

    public class TwoPointer {

        public static void twoPointer(int[] arr, int target) {

            Arrays.sort(arr);

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Pair found: "
                            + arr[left] + " + " + arr[right]
                            + " = " + target);
                    return;
                }

                else if (sum < target) {
                    left++;
                }

                else {
                    right--;
                }
            }

            System.out.println("No pair found");
        }

        public static void main(String[] args) {

            int[] arr = {3, 2, 4, 7, 5, 8};
            int target = 9;

            twoPointer(arr, target);
        }
    }

