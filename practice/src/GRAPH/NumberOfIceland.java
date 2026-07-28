package GRAPH;

public class NumberOfIceland {

    private void dfs(int i, int j, char[][] grid, boolean[][] vis) {

        int m = grid.length;
        int n = grid[0].length;

        vis[i][j] = true;

        // Up
        if (i - 1 >= 0 && !vis[i - 1][j] && grid[i - 1][j] == '1') {
            dfs(i - 1, j, grid, vis);
        }

        // Left
        if (j - 1 >= 0 && !vis[i][j - 1] && grid[i][j - 1] == '1') {
            dfs(i, j - 1, grid, vis);
        }

        // Down
        if (i + 1 < m && !vis[i + 1][j] && grid[i + 1][j] == '1') {
            dfs(i + 1, j, grid, vis);
        }

        // Right
        if (j + 1 < n && !vis[i][j + 1] && grid[i][j + 1] == '1') {
            dfs(i, j + 1, grid, vis);
        }
    }

    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, grid, visited);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        NumberOfIceland obj = new NumberOfIceland();

        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int ans = obj.numIslands(grid);

        System.out.println("Number of Islands = " + ans);
    }
}