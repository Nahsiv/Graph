import java.io.*;
import java.util.*;

public class Elections {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(buf.readLine());
        while (t-->0){
            int[]arr=getArray(new StringTokenizer(buf.readLine()),3);
            int max=Math.max(arr[0],Math.max(arr[1],arr[2]));
            StringBuilder ans = new StringBuilder();
            for(int i=0;i<3;i++){
                int temp=arr[i];
                for(int j=0;j<3;j++)
                {
                    if(j!=i){
                        if(temp<=arr[j])temp=arr[j]+1;
                    }
                }
                ans.append(temp-arr[i]).append(" ");
            }
            System.out.println(ans);
        }
    }
}
