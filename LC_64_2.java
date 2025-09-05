import java.util.*;
public class LC_64_2 {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Create DP table
        int[][] dpTable = new int[m][n];

        // Starting point
        dpTable[0][0] = grid[0][0];

        // Fill first row (can only come from left)
        for (int i = 1; i < n; i++) {
            dpTable[0][i] = dpTable[0][i - 1] + grid[0][i];
        }

        // Fill first column (can only come from top)
        for (int j = 1; j < m; j++) {
            dpTable[j][0] = dpTable[j - 1][0] + grid[j][0];
        }

        // Fill remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dpTable[i][j] = grid[i][j] + Math.min(dpTable[i - 1][j], dpTable[i][j - 1]);
            }
        }

        // Bottom-right cell contains the minimum path sum
        return dpTable[m - 1][n - 1];
    }

    // Main method for testing
    public static void main(String[] args) {
        LC_64_2 solution = new LC_64_2();

        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        int result = solution.minPathSum(grid);
        System.out.println("Minimum path sum: " + result); // Output: 7
    }
}
