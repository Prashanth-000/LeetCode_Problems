import java.io.*;

public class buffer{
    public static void main(String args[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String [] arr= br.readLine().split(" ");

        for(int i =0;i<n;i++){
            int x=Integer.parseInt(arr[i]);
            System.out.println(x);
        }

    }
}

