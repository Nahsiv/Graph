import java.io.*;
import java.util.*;

public class FriendsAndCandies {
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
        int t = Integer.parseInt(buf.readLine());
        while (t-->0){
            int l = Integer.parseInt(buf.readLine());
            int[]arr = getArray(new StringTokenizer(buf.readLine()),l);
            long sum=0;
            for(int i:arr)sum+=i;
            if(sum%l!=0){
                System.out.println(-1);
                continue;
            }
            sum/=l;
            int ans=0;
            for(int i:arr)if(i>sum)ans++;
            System.out.println(ans);
        }


    }
}
