package GRAPH;

import java.util.*;

public class BFS {

    // Undirected Graph
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // BFS Traversal
    static void bfs(ArrayList<ArrayList<Integer>> graph, int V) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];

        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int curr = queue.poll();
            System.out.print(curr + " ");

            for (int neighbor : graph.get(curr)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);

        bfs(graph, V);
    }
}