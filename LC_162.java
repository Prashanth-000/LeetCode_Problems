import java.io.*;

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;

        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

public class LC_162 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        Solution sol = new Solution();
        System.out.println(sol.findPeakElement(nums));
    }
}
