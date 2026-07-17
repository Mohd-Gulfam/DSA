package ARRAY;

import java.util.HashMap;

public class subarraySum {

    public int subarraySumk(int[] arr, int k) {

        int n = arr.length;
        int count = 0;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        // Build Prefix Sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int j = 0; j < n; j++) {

            if (prefix[j] == k) {
                count++;
            }

            int val = prefix[j] - k;

            if (hm.containsKey(val)) {
                count += hm.get(val);
            }

            if (hm.containsKey(prefix[j])) {
                hm.put(prefix[j], hm.get(prefix[j]) + 1);
            } else {
                hm.put(prefix[j], 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 7, 9, 10};
        int k = 10;

        subarraySum obj = new subarraySum();

        int ans = obj.subarraySumk(arr, k);

        System.out.println(ans);
    }
}