import java.io.*;

class Solution {
    public int maximum69Number(int num) {
        int length=(int) Math.log10(num)+1;
        int[] nums= new int[length];
        int res=0;

        while(num>0){
            int dig=num%10;
            num=num/10;
            nums[--length]=dig;
        }
        boolean first=true;
        for(int n:nums){
            if(n==6 && first==true){
                n=9;
                first=false;
            }
            res=res*10+n;
        }
        return res;      
    }
}

public class LC_1323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // read input

        Solution sol = new Solution();
        System.out.println(sol.maximum69Number(num)); // print output
    }
}
