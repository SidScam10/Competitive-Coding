import java.util.*;

public class kruskal {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        List<Edge> allEdges = new ArrayList<>();

        Graph(int vertices) {
            this.vertices = vertices;
        }

        public void addEdge(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            allEdges.add(edge);
        }

        public int find(int[] parent, int vertex) {
            if (parent[vertex] != vertex)
                parent[vertex] = find(parent, parent[vertex]); // Path compression
            return parent[vertex];
        }

        public void union(int[] parent, int[] rank, int x, int y) {
            int rootX = find(parent, x);
            int rootY = find(parent, y);

            // Union by rank to keep the tree flat
            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    parent[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    parent[rootX] = rootY;
                } else {
                    parent[rootY] = rootX;
                    rank[rootX]++;
                }
            }
        }

        public void kruskalMST() {
            // Sort all edges by weight
            allEdges.sort(Comparator.comparingInt(e -> e.weight));

            int[] parent = new int[vertices];
            int[] rank = new int[vertices];
            for (int i = 0; i < vertices; i++) {
                parent[i] = i; // Initially, each vertex is its own parent
                rank[i] = 0;   // Rank for union-find
            }

            List<Edge> mst = new ArrayList<>();
            for (Edge edge : allEdges) {
                int x = find(parent, edge.source);
                int y = find(parent, edge.destination);

                // If including this edge doesn't cause a cycle
                if (x != y) {
                    mst.add(edge);
                    union(parent, rank, x, y);
                }
            }

            // Print the edges in the MST
            System.out.println("Edges in the Minimum Spanning Tree:");
            for (Edge edge : mst) {
                System.out.println("Source: " + edge.source + " Destination: " + edge.destination + " Weight: " + edge.weight);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);

        // Add edges (source, destination, weight)
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 5);
        graph.addEdge(2, 4, 10);
        graph.addEdge(3, 4, 7);
        graph.addEdge(3, 5, 9);
        graph.addEdge(4, 5, 3);

        // Find the MST using Kruskal's algorithm
        graph.kruskalMST();
    }
}