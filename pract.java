import java.io.*;
public class pract{
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        String[] arr=br.readLine().split("\\.");
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(arr[i]);
        }
        Solution sol=new Solution();
        int ans=sol.sumOfArray(nums);
        System.out.println(ans);

    }
}
class Solution{
    public int sumOfArray(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
}