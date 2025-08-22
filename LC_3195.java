/*
 * 
    Find the Minimum Area to Cover All Ones I
   
    You are given a 2D binary array grid. Find a rectangle with horizontal and vertical sides with the smallest area, such that all the 1's in grid lie inside this rectangle.
    Return the minimum possible area of the rectangle.

    Example 1:
    Input: grid = [[0,1,0],[1,0,1]]
    Output: 6
    The smallest rectangle has a height of 2 and a width of 3, so it has an area of 2 * 3 = 6.

    Example 2:
    Input: grid = [[1,0],[0,0]]
    Output: 1
    The smallest rectangle has both height and width 1, so its area is 1 * 1 = 1.
 */

import java.io.*;

public class LC_3195 {
    static class Solution {
        public int minimumArea(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;

            int len_low = rows;
            int len_high = 0;
            int wid_low = cols;
            int wid_high = 0;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if (grid[i - 1][j - 1] == 1) {
                        len_low = Math.min(len_low, i);
                        len_high = Math.max(len_high, i);
                        wid_low = Math.min(wid_low, j);
                        wid_high = Math.max(wid_high, j);
                    }
                }
            }

            int len = len_high - len_low + 1;
            int wid = wid_high - wid_low + 1;
            int area = len * wid;
            return area;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read grid dimensions
        String[] dims = br.readLine().split(" ");
        int n = Integer.parseInt(dims[0]);
        int m = Integer.parseInt(dims[1]);

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(row[j]);
            }
        }

        Solution sol = new Solution();
        int result = sol.minimumArea(grid);
        System.out.println(result);
    }
}
