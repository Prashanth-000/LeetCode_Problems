import java.util.*;
public class LC_64 {

    // Recursive function with memoization
    public int minValue(int[][] grid, int i, int j, int[][] memo) {
        int m = grid.length;
        int n = grid[0].length;

        // Out of bounds
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        // Base case: bottom-right cell
        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        // If already computed
        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        // Move down and right
        int moveDown = minValue(grid, i + 1, j, memo);
        int moveRight = minValue(grid, i, j + 1, memo);

        // Store the result in memo
        memo[i][j] = grid[i][j] + Math.min(moveDown, moveRight);
        return memo[i][j];
    }

    // Function to be called externally
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Initialize memo table
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }

        // Start recursion from top-left
        return minValue(grid, 0, 0, memo);
    }

    // Main method for testing
    public static void main(String[] args) {
        LC_64 solution = new LC_64();

        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        int result = solution.minPathSum(grid);
        System.out.println("Minimum path sum: " + result); // Output: 7
    }
}
