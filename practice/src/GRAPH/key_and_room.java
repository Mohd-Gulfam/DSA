package GRAPH;
import java.util.*;
//leetcode841
public class key_and_room {
    public boolean canVisitAllRooms(List<List<Integer>>  adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        //bfs(0,adj, visited);
        dfs(0,adj,visited );
        for (boolean ele : visited) {
            if (!ele) {
                return false;
            }

        }
        return true;
    }


    //bfs
    public void bfs(int start, List<List<Integer>> adj, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int front = queue.remove();
            for (int i : adj.get(front)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    //dfs
    private  void dfs(int start, List<List<Integer>> adj, boolean[] visited) {
        visited[start] = true;
        for(int ele : adj.get(start)) {
            if (!visited[ele]) {
                dfs(ele, adj, visited);
            }
        }
    }

    public static void main(String[] args) {

        key_and_room obj = new key_and_room();

        List<List<Integer>> rooms = new ArrayList<>();

        rooms.add(Arrays.asList(1));      // Room 0 has key to Room 1
        rooms.add(Arrays.asList(2));      // Room 1 has key to Room 2
        rooms.add(Arrays.asList(3));      // Room 2 has key to Room 3
        rooms.add(new ArrayList<>());     // Room 3 has no keys

        boolean ans = obj.canVisitAllRooms(rooms);

        System.out.println(ans);
    }
}
