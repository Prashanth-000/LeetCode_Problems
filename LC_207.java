import java.util.ArrayList;
import java.util.List;

public class LC_207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] states = new int[numCourses]; // 0 = unvisited, 1 = visiting, 2 = visited

        // Initialize adjacency list
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int[] course : prerequisites) {
            adj.get(course[0]).add(course[1]);
        }

        // Check for cycles using DFS
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, adj, states)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int node, List<List<Integer>> adj, int[] states) {
        if (states[node] == 2) return true;  // Already visited
        if (states[node] == 1) return false; // Cycle detected

        states[node] = 1; // Mark as visiting
        for (int nei : adj.get(node)) {
            if (!dfs(nei, adj, states)) {
                return false;
            }
        }
        states[node] = 2; // Mark as visited
        return true;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        LC_207 solution = new LC_207();

        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println("Can finish courses? " + solution.canFinish(numCourses1, prerequisites1)); // true

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println("Can finish courses? " + solution.canFinish(numCourses2, prerequisites2)); // false
    }
}
