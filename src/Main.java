import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public int result;
    public int countCompleteComponents(int n, int[][] edges) {
        result = 0;
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1];
            graph[from].add(to);
            graph[to].add(from);
        }
        boolean[] visit = new boolean[n];

        for (int node = 0; node<n; node++) {
            if (!visit[node]) {
                int countEdges = graph[node].size();
                dfs (node,graph,visit,1, countEdges);

            }
        }
        return result;
        }
        public List<Integer> void dfs (int node, List<Integer>[] graph, boolean[] visit, int countNode, int countEdges){
                visit[node] = true;
                countNode++;
                for (int neighbour : graph[node]) {
                    if (!visit[neighbour]) {
                        dfs(neighbour, graph, visit, countNode,  countEdges);
                    }
                    System.out.println("second commit");
                    System.out.println("Third commit");
            }
        }

                //как обойти весь подграфф ( маркировать и обходить соседей ) добавить проверку что количество ребер для каждой вершины всего вершин-1
                // находим подграф в виде количество ребер и вершин/ как понять что это подграф?
                // if (количество ребер = N * (N - 1) / 2.) то это полный подграфф прибавляем резултату +1


    public static void main(String[] args) {

    }
}