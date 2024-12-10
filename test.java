import java.util.*;

class test {
    private int V;
    private LinkedList<Integer> adj[];

    test(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    void greedyColoring() {
        int[] result = new int[V];
        Arrays.fill(result, -1);
        result[0] = 0;
        boolean[] available = new boolean[V];
        Arrays.fill(available, true);

        for (int u = 1; u < V; u++) {
            Iterator<Integer> it = adj[u].iterator();
            while (it.hasNext()) {
                int i = it.next();
                if (result[i] != -1) available[result[i]] = false;
            }
            int cr;
            for (cr = 0; cr < V; cr++) {
                if (available[cr]) break;
            }
            result[u] = cr;
            Arrays.fill(available, true);
        }

        for (int u = 0; u < V; u++) {
            System.out.println("Vertex " + u + " ---> Color " + result[u]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        test g = new test(V);
        System.out.println("Enter the edges (vertex1 vertex2), type 'done' to finish:");
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("done")) break;
            int v1 = Integer.parseInt(input);
            int v2 = sc.nextInt();
            g.addEdge(v1, v2);
        }
        g.greedyColoring();
    }
}