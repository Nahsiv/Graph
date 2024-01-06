import java.io.*;
import java.util.*;

public class balancedRoad {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }

    static int getSmallInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t =getSmallInt(buf.readLine());
        while (t-->0){
            StringTokenizer st = new StringTokenizer(buf.readLine());
            int l=getInput(st);
            int k=getInput(st);
            int[]arr =getArray(new StringTokenizer(buf.readLine()),l);
            Arrays.sort(arr);
            int ans=1;
            int curr=1;
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]-arr[i-1]<=k){
                    curr++;
                    ans=Math.max(ans,curr);
                }
                else{
                    curr=1;
                }
            }
            System.out.println(arr.length-ans);
        }

    }
}
