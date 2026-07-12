package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class valid_path_1971 {
    private void bfs(int start, List<List<Integer>> adj , boolean visited[], int end) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int front = q.remove();
            for (int i : adj.get(front)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    if(i==end) return;
                }
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int start, int end) {
        if(start == end) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i= 0; i<edges.length;i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] visited = new boolean[n];
        visited[start] = true;
        bfs(start, adj, visited, end);
        return visited[end];

    }

    public static void main(String[] args) {

        valid_path_1971 obj = new valid_path_1971();

        int n = 4;

        int[][] edges = {
                {0, 1},
                {1, 2},
                {1, 3}
        };

        int source = 0;
        int destination = 2;

        boolean ans = obj.validPath(n, edges, source, destination);

        System.out.println(ans);
    }
}
