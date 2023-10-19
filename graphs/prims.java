import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
 * What is Prims's Algorithm?
 * - Prim's algorithm is a greedy algorithm used to find the Minimum Spanning Tree (MST) of a connected, undirected graph.
 * - It finds the most efficient way to connect all the vertices while keeping the total cost as low as possible.
 */

/*
 * How can we find MST?
 * - start with an arbitrary vertex
 * - adds the smallest-weight edge connecting it to the MST
 * - continues this process until all vertices are included
 * - the resulting MST consists of the added edges, minimizing total weight
 */

class Graph {
    private int V;
    private List<List<Edge>> adj;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
    }

    public void addEdge(int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
        adj.get(v).add(new Edge(u, w));
    }

    public void primMST() {
        boolean[] inMST = new boolean[V];
        int[] key = new int[V];
        int[] parent = new int[V];

        //It allows you to set all elements of an array to a specified value.
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        
        key[0] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>(V, Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(0, key[0]));

        while (!pq.isEmpty()) {
            int u = pq.poll().v;
            inMST[u] = true;
            for (Edge e : adj.get(u)) {
                int v = e.v, weight = e.weight;
                if (!inMST[v] && weight < key[v]) {
                    key[v] = weight;
                    parent[v] = u;
                    pq.add(new Edge(v, key[v]));
                }
            }
        }

        for (int i = 1; i < V; i++) System.out.println("Edge: " + parent[i] + " - " + i + " Weight: " + key[i]);
    }

    class Edge {
        int v, weight;
        Edge(int v, int weight) {
            this.v = v;
            this.weight = weight;
        }
    }
}

public class prims{
    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);
        graph.primMST();
    }
}