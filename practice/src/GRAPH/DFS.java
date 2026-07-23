package GRAPH;
import java.util.*;

public class DFS {

    // Undirected Graph
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // DFS Method
    static void dfs(ArrayList<ArrayList<Integer>> graph, int curr, boolean[] visited) {
//        step 1 : visited neighbors true
        visited[curr] = true;
//        print currente element
        System.out.print(curr + " ");

//          get neighbors
        for(int neighbors : graph.get(curr)) {
            if(!visited[neighbors]) {
                dfs(graph, neighbors, visited);

            }
        }

    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Graph Create
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add Edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);

        boolean[] visited = new boolean[V];

        // DFS Start
        dfs(graph, 0, visited);
    }
}
