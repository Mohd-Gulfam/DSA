package ARRAY;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAndReapeted {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();

        int a = -1;
        int b = -1;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                actualSum += grid[i][j];

                if (set.contains(grid[i][j])) {
                    a = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }

        int n2 = n * n;

        int expectedSum = n2 * (n2 + 1) / 2;

        b = expectedSum + a - actualSum;

        return new int[]{a, b};
    }
    public static void main(String[] args) {

        int[][] grid = {
                {1, 3},
                {2, 2}
        };

        MissingAndReapeted obj = new MissingAndReapeted();

        int[] ans = obj.findMissingAndRepeatedValues(grid);

        System.out.println(Arrays.toString(ans));
    }
}