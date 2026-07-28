package GRAPH.ShortestPathDj;

import java.util.*;

public class CheapestFlight {

    static class Triplet {
        int src;
        int cost;
        int stop;

        public Triplet(int src, int cost, int stop) {
            this.src = src;
            this.cost = cost;
            this.stop = stop;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        // Adjacency List
        List<List<Triplet>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build Graph
        for (int i = 0; i < flights.length; i++) {
            int from = flights[i][0];
            int to = flights[i][1];
            int price = flights[i][2];

            adj.get(from).add(new Triplet(to, price, 0));
        }

        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);

        ans[src] = 0;

        Queue<Triplet> q = new LinkedList<>();
        q.offer(new Triplet(src, 0, 0));

        while (!q.isEmpty()) {

            Triplet top = q.poll();

            int node = top.src;
            int cost = top.cost;
            int stop = top.stop;

            if (stop > k)
                continue;

            for (Triplet p : adj.get(node)) {

                int nextNode = p.src;
                int totalCost = cost + p.cost;

                if (totalCost < ans[nextNode]) {

                    ans[nextNode] = totalCost;

                    q.offer(new Triplet(nextNode, totalCost, stop + 1));
                }
            }
        }

        if (ans[dst] == Integer.MAX_VALUE)
            return -1;

        return ans[dst];
    }

    public static void main(String[] args) {

        CheapestFlight obj = new CheapestFlight();

        int n = 4;

        int[][] flights = {
                {0, 1, 100},
                {1, 2, 100},
                {2, 0, 100},
                {1, 3, 600},
                {2, 3, 200}
        };

        int src = 0;
        int dst = 3;
        int k = 1;

        int ans = obj.findCheapestPrice(n, flights, src, dst, k);

        System.out.println("Cheapest Flight Cost = " + ans);
    }
}