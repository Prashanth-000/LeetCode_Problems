
/* 
    2348. Number of Zero-Filled Subarrays

    Given an integer array nums, return the number of subarrays filled with 0.

    A subarray is a contiguous non-empty sequence of elements within an array.

    

    Example 1:

    Input: nums = [1,3,0,0,2,0,0,4]
    Output: 6
    Explanation: 
    There are 4 occurrences of [0] as a subarray.
    There are 2 occurrences of [0,0] as a subarray.
    There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.
    Example 2:

    Input: nums = [0,0,0,2,0,0]
    Output: 9
    Explanation:
    There are 5 occurrences of [0] as a subarray.
    There are 3 occurrences of [0,0] as a subarray.
    There is 1 occurrence of [0,0,0] as a subarray.
    There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.
    Example 3:

    Input: nums = [2,10,2019]
    Output: 0
    Explanation: There is no subarray filled with 0. Therefore, we return 0.
    

    Constraints:

    1 <= nums.length <= 105
    -109 <= nums[i] <= 109

*/
import java.io.*;

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int streak = 0;
        long count = 0;
        for (int num : nums) {
            if (num != 0 && streak != 0) {
                count += (long) streak * (streak + 1) / 2;
                streak = 0;
            } else if (num == 0) {
                streak += 1;
            }
        }
        if (streak != 0) {
            count += (long) streak * (streak + 1) / 2;
        }
        return count;
    }
}

public class LC_2348 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().trim().split(" ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        Solution sol = new Solution();
        long ans = sol.zeroFilledSubarray(nums);
        System.out.println(ans);
    }
}
