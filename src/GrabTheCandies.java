import java.io.*;
import java.util.*;

public class GrabTheCandies {
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
            int n =Integer.parseInt(buf.readLine());
            int[]arr =getArray(new StringTokenizer(buf.readLine()),n);
            int even =0;
            int odd =0;
            for(int i:arr)
            {
                if((i&1)==0)even+=i;
                else odd+=i;
            }
            if(even>odd) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
