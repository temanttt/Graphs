import java.util.ArrayList;
import java.util.List;

class Solution {
    private static List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        stack.add(0);
        dfs(0, graph.length-1, graph, stack);
        return result;
    }

    private static void dfs(int node, int target, int[][] graph, List<Integer> stack) {
        if (node == target) {
            result.add(List.copyOf(stack));
            return;
        }

        for (int neighbour : graph[node]) {
            stack.add(neighbour);
            dfs(neighbour, target, graph, stack);
            stack.remove(stack.size()-1);
        }
    }
}
List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
        graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
        graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }