/*
    74. Search a 2D Matrix
   
    You are given an m x n integer matrix matrix with the following two properties:

    Each row is sorted in non-decreasing order.
    The first integer of each row is greater than the last integer of the previous row.
    Given an integer target, return true if target is in matrix or false otherwise.

    You must write a solution in O(log(m * n)) time complexity.

    

    Example 1:


    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    Output: true
    Example 2:


    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
    Output: false
*/
import java.io.*;
import java.util.*;

public class LC_74 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read rows and columns
        String[] rc = br.readLine().trim().split(" ");
        int rows = Integer.parseInt(rc[0]);
        int cols = Integer.parseInt(rc[1]);

        // Read matrix
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] parts = br.readLine().trim().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        // Read target
        int target = Integer.parseInt(br.readLine().trim());

        Solution sol = new Solution();
        boolean result = sol.searchMatrix(matrix, target);

        System.out.println(result ? "true" : "false");
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0, mid = 0, high = rows - 1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target > matrix[mid][cols - 1]) {
                low = mid + 1;
            } else if (target < matrix[mid][0]) {
                high = mid - 1;
            } else {
                break;
            }
        }
        if (low > high) {
            return false;
        }

        low = 0;
        high = cols - 1;
        int row_mid = mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target > matrix[row_mid][mid]) {
                low = mid + 1;
            } else if (target < matrix[row_mid][mid]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
