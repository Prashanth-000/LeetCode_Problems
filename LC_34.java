import java.io.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        boolean exist = false;
        int[] res = { -1, -1 };

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                exist = true;
                break;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (exist) {
            int start = mid, end = mid;
            while (start >= 0 && nums[start] == target) start--;
            while (end < nums.length && nums[end] == target) end++;
            res[0] = start + 1;
            res[1] = end - 1;
        }

        return res;
    }
}

public class LC_34 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read array size
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        // Read array elements
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        // Read target
        int target = Integer.parseInt(br.readLine());

        // Call solution
        Solution sol = new Solution();
        int[] res = sol.searchRange(nums, target);

        System.out.println(res[0] + " " + res[1]);
    }
}
